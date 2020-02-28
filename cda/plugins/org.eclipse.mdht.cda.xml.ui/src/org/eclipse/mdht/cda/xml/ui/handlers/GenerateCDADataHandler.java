/*******************************************************************************
 * Copyright (c) 2017, 2018 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *     seanmuir - add filtering by sections
 *
 *******************************************************************************/
package org.eclipse.mdht.cda.xml.ui.handlers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLEditorKit;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.cda.xml.ui.Activator;
import org.eclipse.mdht.cda.xml.ui.handlers.AnalyzeCDAHandler.CDAAnalaysisInput.CDAMetrics;
import org.eclipse.mdht.cda.xml.ui.handlers.CDAValueUtil.DocumentMetadata;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.DocumentRoot;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.InFulfillmentOf;
import org.eclipse.mdht.uml.cda.InformationRecipient;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.ui.editors.MDHTPreferences;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.ON;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;

import com.google.common.base.Stopwatch;

public class GenerateCDADataHandler extends GenerateCDABaseHandler {

	protected static class ExtractText extends HTMLEditorKit.ParserCallback {

		StringBuffer txt;

		public ExtractText() {
			super();
			txt = new StringBuffer();
		}

		String getText() {
			String result = txt.toString();
			if (StringUtils.isEmpty(result)) {
				return "";
			}
			if (result.length() < 50) {
				return result;
			}
			return result.substring(0, 49);
		}

		@Override
		public void handleText(char[] text, int pos) {
			txt.append(text);
		}
	}

	protected enum PorO {
		ORGANIZATION, PERSON

	}

	public class ResultsDialog extends TitleAreaDialog {

		org.eclipse.swt.widgets.Table table;

		public ResultsDialog(Shell shell) {
			super(shell);

		}

		@Override
		public void create() {
			super.create();
			setTitle("CDA Processing Results");
		}

		@Override
		protected void createButtonsForButtonBar(Composite parent) {

			Button okButton = createButton(parent, OK, "Ok", false);

			okButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setReturnCode(OK);
					close();
				}
			});
		}

		@Override
		protected Control createDialogArea(Composite parent) {

			Label label = new Label(parent, SWT.BORDER);

			label.setText("Total Files " + files.size());

			final ScrolledComposite composite = new ScrolledComposite(parent, SWT.V_SCROLL);
			composite.setLayout(new GridLayout());
			composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			table = new org.eclipse.swt.widgets.Table(composite, SWT.BORDER | SWT.MULTI);
			table.setHeaderVisible(true);

			table.setSize(100, 100);

			composite.setContent(table);
			composite.setExpandHorizontal(true);
			composite.setExpandVertical(true);
			composite.setAlwaysShowScrollBars(true);
			composite.setMinSize(table.computeSize(SWT.DEFAULT, SWT.DEFAULT));

			table.setLinesVisible(true);

			final GridData gridData = new GridData();
			gridData.widthHint = 500;
			table.setLayoutData(gridData);

			table.setHeaderVisible(true);
			final TableColumn column1 = new TableColumn(table, SWT.LEFT);

			final TableColumn column2 = new TableColumn(table, SWT.LEFT);

			column1.setText("File Name");
			column2.setText("Total Sections");

			column1.setWidth(250);
			column2.setWidth(250);

			for (IFile file : files) {
				final TableItem valueSetsUpdatedItem = new TableItem(table, SWT.NONE);
				if (errors.containsKey(file)) {
					valueSetsUpdatedItem.setText(new String[] { file.getName(), errors.get(file).getMessage() });
				} else {
					int sectionCount = getSectionCount(file);

					valueSetsUpdatedItem.setText(new String[] { file.getName(), String.valueOf(sectionCount) });
				}
			}

			return composite;
		}

	}

	static HashMap<String, String> authors = new HashMap<String, String>();

	private static final String CONSOLIDATED = "CONSOLIDATED";

	/**
	 * We'll use this pattern as divider to split the string into an array.
	 * Usage: myString.split(DIVIDER_PATTERN);
	 */
	private static final String DIVIDER_PATTERN = "(?<=[^\\p{Lu}])(?=\\p{Lu})" + "|(?<=[\\p{Ll}])(?=\\d)";

	static HashMap<Sheet, CellStyle> documentDateStyles = new HashMap<Sheet, CellStyle>();

	static ExtractText extractText = new ExtractText();

	private static final String FILTER = "org.eclipse.mdht.cda.xml.ui.filter";

	private static final String MDHTCONSOLE = "MDHTCONSOLE";

	static HashSet<String> names = new HashSet<String>();

	static boolean omitDOB = false;

	static boolean omitUnits = false;

	static boolean omitValidation = false;

	static HashMap<String, String> organizations = new HashMap<String, String>();

	static String preferenceFilters;

	static SigSwitch sigSwitch = new SigSwitch();

	static SigLocationSwitch sigLocationSwitch = new SigLocationSwitch();

	private static final String SPLITBYDOCUMENT = "org.eclipse.mdht.cda.xml.ui.splitbydocument";

	/**
	 * @param file
	 * @return
	 */

	public static String sheetName(EClass sectionEClass) {
		String name = sectionEClass.getName();
		String[] prettyName = name.split(DIVIDER_PATTERN); // "(?=\\p{Upper})");
		StringBuilder sb = new StringBuilder();
		for (String str : prettyName) {
			if (StringUtils.isNumeric(str)) {
				sb.append("(V").append(str).append(")");
			} else {
				sb.append(str).append(" ");
			}
		}
		if ("CONSOL".equalsIgnoreCase(sectionEClass.getEPackage().getNsPrefix())) {
			return sb.toString();
		} else {
			return sectionEClass.getEPackage().getNsPrefix().toUpperCase() + " " + sb.toString();
		}

	}

	static boolean shouldHandle(Diagnostic diagnostic) {
		// filter out diagnostics with no message or with root diagnostic message
		if (diagnostic.getMessage() == null || diagnostic.getMessage().startsWith("Diagnosis of")) {
			return false;
		}
		return true;
	}

	HashMap<Integer, EClass> documents = new HashMap<Integer, EClass>();

	HashMap<Integer, HashMap<IFile, DocumentMetadata>> documentsbyfile = new HashMap<Integer, HashMap<IFile, DocumentMetadata>>();

	protected HashMap<Integer, HashMap<String, ArrayList<IFile>>> documentsbysectionbyfile = new HashMap<Integer, HashMap<String, ArrayList<IFile>>>();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDABaseHandler#getSectionCount(org.eclipse.core.resources.IFile)
	 */

	protected HashMap<IFile, Exception> errors = new HashMap<IFile, Exception>();

	int fileCount = 0;

	protected ArrayList<IFile> files = new ArrayList<IFile>();

	long previousHeap = 0;

	protected HashMap<Integer, HashMap<String, ArrayList<IFile>>> sectionbyfileByDocumentxxx = new HashMap<Integer, HashMap<String, ArrayList<IFile>>>();

	HashMap<Integer, HashMap<String, String>> sheets = new HashMap<Integer, HashMap<String, String>>();

	HashMap<Integer, SXSSFWorkbook> workbooks = new HashMap<Integer, SXSSFWorkbook>();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		final String splitOption = event.getParameter(SPLITBYDOCUMENT);
		final String filterOption = event.getParameter(FILTER);

		// Omit DOB from generated Spreadsheets
		omitDOB = org.eclipse.mdht.uml.cda.ui.internal.Activator.getDefault().getPreferenceStore().getBoolean(
			MDHTPreferences.OMIT_DOB_STORE_VALUE);

		omitUnits = org.eclipse.mdht.uml.cda.ui.internal.Activator.getDefault().getPreferenceStore().getBoolean(
			MDHTPreferences.OMIT_UNITS_STORE_VALUE);

		preferenceFilters = org.eclipse.mdht.uml.cda.ui.internal.Activator.getDefault().getPreferenceStore().getString(
			MDHTPreferences.CDA_REPORT_DEFAULT_FILTER);

		omitValidation = org.eclipse.mdht.uml.cda.ui.internal.Activator.getDefault().getPreferenceStore().getBoolean(
			MDHTPreferences.OMIT_VALIDATION_STORE_VALUE);

		final HashSet<EClass> theSections = new HashSet<EClass>();

		final HashMap<EClass, HashSet<EClass>> theSectionCache = new HashMap<EClass, HashSet<EClass>>();

		if (filterOption != null) {

			IWorkbenchWindow window2 = HandlerUtil.getActiveWorkbenchWindowChecked(event);

			ILabelProvider lp = new ILabelProvider() {

				@Override
				public void addListener(ILabelProviderListener listener) {

				}

				@Override
				public void dispose() {

				}

				@Override
				public Image getImage(Object element) {

					return null;
				}

				@Override
				public String getText(Object element) {
					EClass ec = (EClass) element;
					String theElementName = ec.getName();

					if (Character.isDigit(theElementName.charAt(theElementName.length() - 1))) {
						theElementName = theElementName.substring(0, theElementName.length() - 1);
					}

					String[] nameArray = theElementName.split("(?=\\p{Upper})");
					StringBuffer sb = new StringBuffer();
					for (String seg : nameArray) {
						sb.append(seg).append(" ");
					}
					sb.append("(s)");

					return sb.toString();
				}

				@Override
				public boolean isLabelProperty(Object element, String property) {

					return false;
				}

				@Override
				public void removeListener(ILabelProviderListener listener) {

				}
			};

			ElementListSelectionDialog filterSelectionDialog = new ElementListSelectionDialog(window2.getShell(), lp);

			filterSelectionDialog.setTitle("Select Section");

			filterSelectionDialog.setMessage("Select a section(s):");

			filterSelectionDialog.setMultipleSelection(true);

			getFilterHash(theSectionCache);

			filterSelectionDialog.setElements(theSectionCache.keySet().toArray());

			;

			if (filterSelectionDialog.open() != Window.OK) {
				return null;
			}
			// return the selection

			for (Object object : filterSelectionDialog.getResult()) {
				theSections.add((EClass) object);
			}

		} else if (filterOption == null && !StringUtils.isEmpty(preferenceFilters)) {
			getFilterHash(theSectionCache);
			List<String> result = Arrays.asList(preferenceFilters.split("\\s*,\\s*"));
			for (String r : result) {
				if (theSectionCache.containsKey(ConsolPackage.eINSTANCE.getEClassifier(r))) {
					theSections.add((EClass) ConsolPackage.eINSTANCE.getEClassifier(r));
				}
			}
		}

		try {

			boolean completed = true;
			ProgressMonitorDialog pd = new ProgressMonitorDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());

			ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
			if (selection instanceof IStructuredSelection) {

				final IStructuredSelection iss = (IStructuredSelection) selection;

				try {
					pd.run(true, true, new IRunnableWithProgress() {

						public void run(IProgressMonitor monitor)
								throws InvocationTargetException, InterruptedException {
							try {
								@SuppressWarnings("unchecked")
								Iterator<Object> iter = iss.iterator();
								while (iter.hasNext() && !monitor.isCanceled()) {
									Object o = iter.next();
									if (o instanceof IFolder) {
										IFolder folder = (IFolder) o;
										codeMetricsFile = folder.getFile("codemetrics.cfg");
										monitor.beginTask("Generate Spreadsheet", folder.members().length);
										processFolder(folder, monitor, splitOption, theSections, theSectionCache);
									}
								}
							} catch (IOException e) {
								ILog log = Activator.getDefault().getLog();
								log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
								throw new InvocationTargetException(e);
							} catch (Exception e) {
								ILog log = Activator.getDefault().getLog();
								log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
							}
						}
					});
				} catch (InvocationTargetException e) {
					ILog log = Activator.getDefault().getLog();
					log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
					IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					MessageBox dialog = new MessageBox(window.getShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText("Error processing CDA");
					dialog.setMessage("Make sure Excel file is closed!" + e.getMessage());
					dialog.open();
					completed = false;
				} catch (InterruptedException e) {
					ILog log = Activator.getDefault().getLog();
					log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
				}

				if (completed) {
					for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
						project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
					}
					PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				}
			}

		} catch (

		Exception e) {
			ILog log = org.eclipse.mdht.cda.xml.ui.Activator.getDefault().getLog();
			log.log(
				new Status(
					IStatus.ERROR, org.eclipse.mdht.cda.xml.ui.Activator.PLUGIN_ID, "Error generating report", e));
		}

		return null;
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		org.eclipse.ui.console.IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())) {
				return (MessageConsole) existing[i];
			}
		}
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new org.eclipse.ui.console.IConsole[] { myConsole });
		return myConsole;
	}

	public IFile codeMetricsFile;

	private LinkedHashMap<String, String> getCodedMetrics() {

		LinkedHashMap<String, String> codedMetrics = new LinkedHashMap<String, String>();
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			if (codeMetricsFile != null) {
				br = new BufferedReader(new FileReader(codeMetricsFile.getLocation().toOSString()));
				while ((line = br.readLine()) != null) {

					// use comma as separator
					String[] s = line.split(cvsSplitBy);
					if (s.length == 2) {
						codedMetrics.put(s[0], s[1]);
					}

				}
			}

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		} catch (IOException e) {
			// e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// e.printStackTrace();
				}
			}
		}

		return codedMetrics;
	}

	public CDAMetrics applyMetrics(ClinicalDocument cd) {
		CDAMetrics cdaMetrics = new CDAMetrics();

		// cdaMetrics.file = file;
		// cdaMetrics.fileName = file.getName();
		try {

			// URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

			// Handler handler = new Handler();
			// ClinicalDocument cd = CDAUtil.load(cdaURI, handler);

			// cdaMetrics.totalErrors = handler.errorCount;
			// cdaMetrics.totalSections = cd.getSections().size();
			// for (Section section : cd.getAllSections()) {
			// cdaMetrics.totalEntries += section.getEntries().size();
			// }

			// cdaMetrics.totalCodedElements = getMetric(cd, "datatypes::CD.allInstances()");

			// cdaMetrics.totalClinicalStatements = getMetric(cd, "cda::ClinicalStatement.allInstances()");

			HashMap<String, String> codedMetrics = getCodedMetrics();

			cdaMetrics.codedMetricsCount = codedMetrics.size();
			for (String key : codedMetrics.keySet()) {
				String ocl = codedMetrics.get(key);
				Object o = CDAUtil.query(cd, ocl);
				if (o instanceof Collection && !((Collection) o).isEmpty()) {
					cdaMetrics.totalCodedMetrics++;
					cdaMetrics.codedMetrics.put(key, Boolean.TRUE);
				} else {
					cdaMetrics.codedMetrics.put(key, Boolean.FALSE);
				}
			}

			// cd.eResource().unload();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return cdaMetrics;
	}

	void format(String fileLocation, IProgressMonitor monitor) throws IOException {

		// FileInputStream fis = new FileInputStream(fileLocation);

		try (InputStream fis = Files.newInputStream(Paths.get(fileLocation))) {

			monitor.subTask(
				"ReOpening  " + CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" + fileLocation.toUpperCase() +
						"_SA.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			monitor.subTask(
				"Opened  " + CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" + fileLocation.toUpperCase() +
						"_SA.xlsx");
			CellStyle boldstyle = wb.createCellStyle();
			Font boldFont = wb.createFont();
			boldFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
			boldstyle.setFont(boldFont);

			for (int sheetCtr = 0; sheetCtr < wb.getNumberOfSheets(); sheetCtr++) {

				Sheet aSheet = wb.getSheetAt(sheetCtr);
				Row topRow = aSheet.getRow(0);
				if (topRow != null) {
					monitor.subTask("Formating Sheet  " + aSheet.getSheetName());
					int lastcell = topRow.getLastCellNum();
					for (int columnCtr = 0; columnCtr < lastcell; columnCtr++) {
						aSheet.autoSizeColumn(columnCtr);
						if (aSheet.getColumnWidth(columnCtr) > 9999) {
							aSheet.setColumnWidth(columnCtr, 9999);
						}
						// skip section sheet - different formatting
						if (sheetCtr != 1 && topRow.getCell(columnCtr) != null) {
							topRow.getCell(columnCtr).setCellStyle(boldstyle);
						}

					}

				}

			}

			try (OutputStream fileOut = Files.newOutputStream(Paths.get(fileLocation))) {
				wb.write(fileOut);
				fileOut.close();
				wb.close();
			}
		}
	}

	HashMap<IFile, DocumentMetadata> getDMHash(int document, String splitOption) {
		int documentIndex;

		if (CONSOLIDATED.equals(splitOption)) {
			documentIndex = 9909;
		} else {
			documentIndex = document; // .getClassifierID();
		}

		if (!documentsbyfile.containsKey(documentIndex)) {
			documentsbyfile.put(documentIndex, new HashMap<IFile, DocumentMetadata>());
		}
		return documentsbyfile.get(documentIndex);

	}

	String getFileName(Integer eclass, String splitOption) {

		if (CONSOLIDATED.equals(splitOption)) {
			return CONSOLIDATED;
		} else {
			return documents.get(eclass).getName();
		}

	}

	void getFilterHash(HashMap<EClass, HashSet<EClass>> theSections) {

		TreeIterator<EObject> packageContents = ConsolPackage.eINSTANCE.eAllContents();

		ArrayList<EClass> packageSections = new ArrayList<EClass>();

		ArrayList<EClass> rootSections = new ArrayList<EClass>();

		while (packageContents.hasNext()) {

			EObject packageObject = packageContents.next();

			if (packageObject instanceof EClass) {
				EClass eClass = (EClass) packageObject;
				boolean isSection = false;
				for (EClass eClass2 : eClass.getEAllSuperTypes()) {
					if ("Section".equals(eClass2.getName())) {
						isSection = true;
						break;
					}
				}

				if (isSection) {
					packageSections.add(eClass);
				}

			}

		}

		Set<EClass> sectionBaseClasses = new HashSet<EClass>();

		for (EClass section : packageSections) {
			for (EClass parentSection : section.getESuperTypes()) {
				sectionBaseClasses.add(parentSection);
			}
		}

		Comparator<? super EClass> compare = new Comparator<EClass>() {

			@Override
			public int compare(EClass o1, EClass o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(packageSections, compare);

		for (EClass section : packageSections) {
			if (!sectionBaseClasses.contains(section)) {

				boolean isRealRoot = true;
				for (EClass sectionAgain : packageSections) {
					if (sectionAgain.getName().startsWith(section.getName()) &&
							!sectionAgain.getName().equals(section.getName())) {
						isRealRoot = false;
					}
				}
				if (isRealRoot) {
					rootSections.add(section);
				}
			}
		}

		for (EClass ec3 : rootSections) {
			theSections.put(ec3, new HashSet<EClass>());
			theSections.get(ec3).addAll(ec3.getEAllSuperTypes());
			theSections.get(ec3).add(ec3);

			for (EClass sectionAgain : packageSections) {
				if (ec3.getName().startsWith(sectionAgain.getName()) && !ec3.getName().equals(sectionAgain.getName())) {
					theSections.get(ec3).add(sectionAgain);
				}
			}
		}
	}

	String getMemoryUssage() {
		// Map<String, String> memoryMap = new HashMap<>();
		StringBuffer sb = new StringBuffer();

		for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
			sb.append("gc count");
			sb.append(String.valueOf(gc.getCollectionCount()));
			sb.append(System.lineSeparator());
			sb.append("gc time");
			sb.append(String.valueOf(gc.getCollectionTime()));
			sb.append(System.lineSeparator());
		}
		MemoryMXBean memBean = ManagementFactory.getMemoryMXBean();
		MemoryUsage memHeapUsage = memBean.getHeapMemoryUsage();
		MemoryUsage nonHeapUsage = memBean.getNonHeapMemoryUsage();
		sb.append("heapInit = ");
		sb.append(String.valueOf(memHeapUsage.getInit()));
		sb.append(System.lineSeparator());
		sb.append("heapMax = ");
		sb.append(String.valueOf(memHeapUsage.getMax()));
		sb.append(System.lineSeparator());
		sb.append("heapCommit = ");
		sb.append(String.valueOf(memHeapUsage.getCommitted()));
		sb.append(System.lineSeparator());
		sb.append("heapUsed = ");
		sb.append(String.valueOf(memHeapUsage.getUsed()));
		sb.append(System.lineSeparator());
		sb.append("heapDelta = ");
		sb.append(String.valueOf(memHeapUsage.getUsed() - previousHeap));
		previousHeap = memHeapUsage.getUsed();
		sb.append(System.lineSeparator());
		sb.append("nonHeapInit = ");
		sb.append(String.valueOf(nonHeapUsage.getInit()));
		sb.append(System.lineSeparator());
		sb.append("nonHeapMax = ");
		sb.append(String.valueOf(nonHeapUsage.getMax()));
		sb.append(System.lineSeparator());
		sb.append("nonHeapCommit = ");
		sb.append(String.valueOf(nonHeapUsage.getCommitted()));
		sb.append(System.lineSeparator());
		sb.append("nonHeapUsed ");
		sb.append(String.valueOf(nonHeapUsage.getUsed()));
		sb.append(System.lineSeparator());

		return sb.toString();
	}

	public int getSectionCount(IFile file) {
		int count = 0;
		for (Integer i : documentsbysectionbyfile.keySet()) {
			for (String s : documentsbysectionbyfile.get(i).keySet()) {
				if (documentsbysectionbyfile.get(i).get(s).contains(file)) {
					count++;
				}
			}
		}
		return count;
	}

	ArrayList<IFile> getSectionHash(int document, String sheetIndex, String splitOption) {
		int documentIndex;

		if (CONSOLIDATED.equals(splitOption)) {
			documentIndex = 9909;
		} else {
			documentIndex = document; // .getClassifierID();
		}

		if (!documentsbysectionbyfile.containsKey(documentIndex)) {
			documentsbysectionbyfile.put(documentIndex, new HashMap<String, ArrayList<IFile>>(100));
		}
		if (!documentsbysectionbyfile.get(documentIndex).containsKey(sheetIndex)) {
			documentsbysectionbyfile.get(documentIndex).put(sheetIndex, new ArrayList<IFile>(fileCount));
		}
		ArrayList<IFile> result = documentsbysectionbyfile.get(documentIndex).get(sheetIndex);

		return result;

	}

	protected String getSheet(EClass document, String sectionIndex, String sheetName, String splitOption) {
		int documentIndex;
		// String sectionIndex = String.valueOf(sectionEClass.getClassifierID());

		if (CONSOLIDATED.equals(splitOption)) {
			documentIndex = 9909;
		} else {
			documentIndex = document.getClassifierID();
		}

		if (!sheets.containsKey(documentIndex)) {
			sheets.put(documentIndex, new HashMap<String, String>());
		}
		if (!sheets.get(documentIndex).containsKey(sectionIndex)) {

			// String sheetName = sheetName(sectionEClass);
			/*
			 * get and create appears to not use the same length of string
			 * So walk the collection and see if we have the previous version of section created first
			 *
			 *
			 */
			for (String akey : sheets.get(documentIndex).keySet()) {
				if (sheetName.startsWith(sheets.get(documentIndex).get(akey))) {
					sheets.get(documentIndex).put(sectionIndex, sheets.get(documentIndex).get(akey));
					return sheets.get(documentIndex).get(akey);
				}
			}

			SXSSFWorkbook wb = getWorkbook(document, splitOption);

			SXSSFSheet newSheet = wb.createSheet(sheetName);
			newSheet.setRandomAccessWindowSize(10);
			sheets.get(documentIndex).put(sectionIndex, newSheet.getSheetName());

		}
		return sheets.get(documentIndex).get(sectionIndex);

	}

	SXSSFWorkbook getWorkbook(EClass document, String splitOption) {

		int documentIndex;

		if (CONSOLIDATED.equals(splitOption)) {
			documentIndex = 9909;
		} else {
			documentIndex = document.getClassifierID();
		}

		if (!workbooks.containsKey(documentIndex)) {
			int offset = 0;

			SXSSFWorkbook wb = new SXSSFWorkbook(10);

			SXSSFSheet documentsSheet = wb.createSheet("Documents");
			documentsSheet.setRandomAccessWindowSize(10);

			SXSSFSheet sectionsSheet = wb.createSheet("Sections");
			sectionsSheet.setRandomAccessWindowSize(10);

			SXSSFSheet encountersSheet = wb.createSheet("Encounters");
			encountersSheet.setRandomAccessWindowSize(10);

			SXSSFSheet demographicsSheet = wb.createSheet("Demographics");
			demographicsSheet.setRandomAccessWindowSize(10);

			SXSSFSheet metricsSheet = wb.createSheet("Metrics");
			metricsSheet.setRandomAccessWindowSize(10);

			// sectionbyfileByDocument.put(documentIndex, new HashMap<String, ArrayList<IFile>>());

			SXSSFRow row1 = null;
			SXSSFRow row2 = documentsSheet.createRow(0);
			offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			SheetHeaderUtil.createPatientHeader2(row1, row2, offset);

			row1 = null;
			row2 = encountersSheet.createRow(0);

			offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			SheetHeaderUtil.createEncounterHeader(row1, row2, offset);

			row1 = null;
			row2 = demographicsSheet.createRow(0);

			offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createDemographicsHeader(row1, row2, offset);

			workbooks.put(documentIndex, wb);
			documents.put(documentIndex, document);
		}

		return workbooks.get(documentIndex);

	}

	void initAuthorReferences(List<Author> authors, PorO poro) {

		String result = "";
		String authorId = "";

		for (Author a : authors) {

			if (a.getAssignedAuthor() != null) {
				AssignedAuthor aa = a.getAssignedAuthor();

				if (PorO.ORGANIZATION.equals(poro)) {
					if (aa.getRepresentedOrganization() != null) {
						for (ON on : aa.getRepresentedOrganization().getNames()) {
							result = CDAValueUtil.getValues(on);
						}
					}
				}

				if (PorO.PERSON.equals(poro)) {
					if (aa.getAssignedPerson() != null) {
						for (PN pn : aa.getAssignedPerson().getNames()) {
							result = CDAValueUtil.getValues(pn);
						}
					}
				}
			}

			for (II ii : a.getAssignedAuthor().getIds()) {
				authorId = CDAValueUtil.getKey3(ii);
				if (!StringUtils.isEmpty(authorId) && !StringUtils.isEmpty(result)) {
					if (PorO.ORGANIZATION.equals(poro)) {
						organizations.put(authorId, result);
					} else {
						GenerateCDADataHandler.authors.put(authorId, result);
					}

				}
			}

		}
	}

	public static String formatSize(long v) {
		if (v < 1024)
			return v + " B";
		int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
		return String.format("%.1f %sB", (double) v / (1L << (z * 10)), " KMGTPE".charAt(z));
	}

	private static String getPath(EObject eObject) {
		String path = "";
		while (eObject != null && !(eObject instanceof DocumentRoot)) {
			EStructuralFeature feature = eObject.eContainingFeature();
			EObject container = eObject.eContainer();
			Object value = container.eGet(feature);
			if (feature.isMany()) {
				List<?> list = (List<?>) value;
				int index = list.indexOf(eObject) + 1;
				path = "/" + feature.getName() + "[" + index + "]" + path;
			} else {
				path = "/" + feature.getName() + "[1]" + path;
			}
			eObject = eObject.eContainer();
		}
		return path;
	}

	void processFolder(IFolder folder, IProgressMonitor monitor, String splitOption, HashSet<EClass> sectionFilter,
			HashMap<EClass, HashSet<EClass>> theSectionCache) throws Exception {

		MessageConsole mdhtConsole = findConsole(MDHTCONSOLE);
		mdhtConsole.setWaterMarks(1000, 8000);
		MessageConsoleStream console = mdhtConsole.newMessageStream();

		/*
		 * Set Ratio low as to prevent Zip Bomb Detection
		 */
		ZipSecureFile.setMinInflateRatio(0.000001);

		ConsolPackage.eINSTANCE.getContinuityOfCareDocument();
		HITSPPackage.eINSTANCE.getPatientSummary();

		/*
		 * There is a limitation on the number of cell styles you can create
		 * We create a global instance of the documentDateStyle for use in the getDocumentDateStyle()
		 * Set it to null on start up because it is bound to a particular workbook
		 *
		 * Not optimal but did not want to send the documentDateStyle as an argument to all the serialization methods
		 */
		// documentDateStyle = null;

		documentDateStyles.clear();
		sheets.clear();

		// sectionbyfileByDocument.clear();
		documentsbysectionbyfile.clear();
		documentsbyfile.clear();

		workbooks.clear();

		files.clear();

		errors.clear();

		documents.clear();

		int offset = 0;

		int filectr = 1;
		long currentProcessingTime = 1;
		Stopwatch stopwatch = Stopwatch.createUnstarted();

		Comparator<? super IFile> c = new Comparator<IFile>() {
			@Override
			public int compare(IFile file1, IFile file2) {
				try {
					IFileStore fs1 = org.eclipse.core.filesystem.EFS.getStore(file1.getLocationURI());
					IFileStore fs2 = org.eclipse.core.filesystem.EFS.getStore(file2.getLocationURI());
					if (fs1.fetchInfo().getLength() < fs2.fetchInfo().getLength()) {
						return 1;
					} else {
						return -1;
					}
				} catch (CoreException e) {
				}
				return 0;
			}
		};

		ArrayList<IFile> documents = new ArrayList<IFile>(folder.members().length + 50);

		for (IResource resource : folder.members()) {
			if (resource instanceof IFile) {
				documents.add((IFile) resource);
			}
		}

		fileCount = documents.size() + 50;

		Collections.sort(documents, c);

		String fileLocation2 = folder.getParent().getLocation().toOSString() + System.getProperty("file.separator") +
				CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "performance.log";

		String fileLocation3 = folder.getParent().getLocation().toOSString() + System.getProperty("file.separator") +
				CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() +
				"validatation.csv";

		BufferedWriter performance = Files.newBufferedWriter(Paths.get(fileLocation2));

		BufferedWriter validation = Files.newBufferedWriter(Paths.get(fileLocation3));

		validation.write("File,Rule,XPath");
		validation.newLine();

		int totalFiles = folder.members().length;
		for (IFile file : documents) {
			stopwatch.reset();
			stopwatch.start();
			if (monitor.isCanceled()) {
				monitor.done();
				break;
			}

			IFileStore fs1 = org.eclipse.core.filesystem.EFS.getStore(file.getLocationURI());
			long fileSize = fs1.fetchInfo().getLength();

			if ("XML".equalsIgnoreCase(file.getFileExtension())) {
				files.add(file);
				monitor.worked(1);
				double estimatedTimeLeft = ((folder.members().length - filectr) * (currentProcessingTime / filectr)) /
						1000.0;

				if (estimatedTimeLeft > 60) {
					monitor.setTaskName(
						"Processing " + file.getName() + ", " + StringUtils.leftPad(String.valueOf(filectr++), 5) +
								" of " + StringUtils.leftPad(String.valueOf(totalFiles), 5) +
								", Estimated Time to finish : " + ((int) estimatedTimeLeft / 60) + " Minutes ");
				} else {
					monitor.setTaskName(
						"Processing " + file.getName() + ", " + StringUtils.leftPad(String.valueOf(filectr++), 5) +
								" of " + StringUtils.leftPad(String.valueOf(totalFiles), 5) +
								", Estimated Time to finish : " + ((int) estimatedTimeLeft) + " Seconds ");
				}

				// monitor.subTask(
				// "Processing File " + StringUtils.leftPad(String.valueOf(filectr++), 5) + " of " +
				// StringUtils.leftPad(String.valueOf(totalFiles), 5) + " General Performance" +
				// fileSize / (currentProcessingTime / 1000.0) + " Bytes per Second ");
				try {

					console.println(getMemoryUssage());
					console.println("file : " + file.getName() + "  size : " + fileSize);

					URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

					console.println("Start Load " + cdaURI.toFileString());

					ClinicalDocument clinicalDocument = null;
					try (InputStream is = Files.newInputStream(Paths.get(cdaURI.toFileString()))) {

						ValidationResult vr = null;
						if (!omitValidation) {
							vr = new ValidationResult();
						}
						// ValidationResult result = new ValidationResult();
						// System.out.println("\n***** Sample validation results *****");

						clinicalDocument = CDAUtil.load(is, vr);
						console.println("End Load " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
						is.close();
						if (vr != null) {
							if (!vr.getErrorDiagnostics().isEmpty()) {
								for (Diagnostic diagnostic : vr.getErrorDiagnostics()) {
									validation.write(
										file.getName() + "," + StringEscapeUtils.escapeCsv(diagnostic.getMessage()));

									if (diagnostic.getData().size() > 0 &&
											diagnostic.getData().get(0) instanceof EObject) {
										validation.write("," + getPath((EObject) diagnostic.getData().get(0)));
									}

									validation.newLine();
								}
								validation.flush();

							}
						}
					}

					SXSSFWorkbook wb = this.getWorkbook(clinicalDocument.eClass(), splitOption);
					// sectionbyfileByDocument.get(clinicalDocument.eClass());

					SXSSFSheet documentsSheet = wb.getSheet("Documents");
					SXSSFSheet demographicsSheet = wb.getSheet("Demographics");
					SXSSFSheet encountersSheet = wb.getSheet("Encounters");
					SXSSFSheet metricsSheet = wb.getSheet("Metrics");

					Row row1 = null;
					Row row2 = metricsSheet.createRow(0);

					offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
					offset = SheetHeaderUtil.createDemographicsHeader(row1, row2, offset);

					HashMap<String, String> codedMetrics = getCodedMetrics();

					for (String key : codedMetrics.keySet()) {
						row2.createCell(offset++).setCellValue(key);
					}

					List<Encounter> encounters = new ArrayList<Encounter>();

					Query query = new Query(clinicalDocument);

					// Need to initialize author references because the order of the sections being return is not necessarily the physical order
					List<Author> authors = query.getEObjects(Author.class);
					initAuthorReferences(authors, PorO.ORGANIZATION);
					initAuthorReferences(authors, PorO.PERSON);

					PatientRole patientRole = query.getEObject(PatientRole.class);
					ServiceEvent serviceEvent = query.getEObject(ServiceEvent.class);
					InformationRecipient ir = query.getEObject(InformationRecipient.class);
					InFulfillmentOf iffo = query.getEObject(InFulfillmentOf.class);
					DocumentMetadata documentMetadata = SpreadsheetSerializer.appendToPatientSheet(
						query, documentsSheet, patientRole, ir, iffo, file.getName());

					SpreadsheetSerializer.appendToDemographicsSheet(
						query, demographicsSheet, documentMetadata, patientRole);

					getDMHash(clinicalDocument.eClass().getClassifierID(), splitOption).put(file, documentMetadata);

					if (clinicalDocument instanceof GeneralHeaderConstraints) {
						console.println("Start Processing ");

						CDAMetrics metrics = applyMetrics(clinicalDocument);

						SpreadsheetSerializer.appendToMetricsSheet(
							query, metricsSheet, documentMetadata, patientRole, metrics, file.getName());

						EncountersSectionEntriesOptional es = query.getEObject(EncountersSectionEntriesOptional.class);

						if (es != null) {
							encounters.addAll(es.getEncounterActivitiess());
						}

						SpreadsheetSerializer.appendToEncounterSheet(
							query, encountersSheet, documentMetadata, patientRole, encounters, file.getName());

						ProcessSectionSwitch pss = new ProcessSectionSwitch(
							splitOption, query, wb, documentMetadata, patientRole, serviceEvent, encounters, file,
							this);

						for (Section section : clinicalDocument.getSections()) {

							// EClass theSectionEClass = section.eClass();

							if (!sectionFilter.isEmpty() && !sectionFilter.contains(section.eClass())) {

								boolean found = false;
								for (EClass sectionClass : sectionFilter) {
									if (theSectionCache.get(sectionClass).contains(section.eClass())) {
										// theSectionEClass = sectionClass;
										found = true;
										break;
									}
								}
								if (!found) {
									continue;

								}
							}

							console.println("Start Section " + section.eClass().getName());
							pss.doSwitch(section);
							console.println("End Section " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

							// String sheetIndex = getSheet(
							// clinicalDocument.eClass(), String.valueOf(theSectionEClass.getClassifierID()),
							// sheetName(theSectionEClass), splitOption);
							// if (!(section instanceof EncountersSectionEntriesOptional)) {
							// SectionSwitch sectionSwitch = new SectionSwitch(
							// query, wb.getSheet(sheetIndex), documentMetadata, patientRole, serviceEvent,
							// encounters, file.getName());
							// sectionSwitch.doSwitch(section);
							// wb.getSheet(sheetIndex).flushRows();
							// }
							// if (shouldCountSection(section)) {
							// getSectionHash(
							// clinicalDocument.eClass().getClassifierID(), sheetIndex, splitOption).add(file);
							//
							// }

						}

						long t = stopwatch.elapsed(TimeUnit.MILLISECONDS);
						String s = file.getName() + " : " + formatSize(fileSize) + " took " + t / 1000.0 +
								" Second(s) at " +
								String.format("%.2f MB/S", (fileSize / (1024 * 1024)) / (t / 1000.0));
						monitor.subTask(s);

						performance.write(s);
						performance.newLine();
						performance.flush();

						console.println("End Processing " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
					} else {

						org.openhealthtools.mdht.uml.cda.ccd.EncountersSection es = query.getEObject(
							org.openhealthtools.mdht.uml.cda.ccd.EncountersSection.class);

						if (es != null) {
							encounters.addAll(es.getEncounters());
						}

						SpreadsheetSerializer.appendToEncounterSheet(
							query, encountersSheet, documentMetadata, patientRole, encounters, file.getName());

						for (Section section : clinicalDocument.getSections()) {

							String sheetIndex = getSheet(
								clinicalDocument.eClass(), String.valueOf(section.eClass().getClassifierID()),
								sheetName(section.eClass()), splitOption);
							// if (!(section instanceof org.openhealthtools.mdht.uml.cda.ccd.EncountersSection)) {
							C32SectionSwitch sectionSwitch = new C32SectionSwitch(
								query, wb.getSheet(sheetIndex), documentMetadata, patientRole, serviceEvent, encounters,
								file.getName());
							Boolean result = sectionSwitch.doSwitch(section);
							if (!result) {
								IHESectionSwitch iheSectionSwitch = new IHESectionSwitch(
									query, wb.getSheet(sheetIndex), documentMetadata, patientRole, serviceEvent,
									encounters, file.getName());
								result = iheSectionSwitch.doSwitch(section);
							}
							if (!result) {
								CCDSectionSwitch ccdSectionSwitch = new CCDSectionSwitch(
									query, wb.getSheet(sheetIndex), documentMetadata, patientRole, serviceEvent,
									encounters, file.getName());
								result = ccdSectionSwitch.doSwitch(section);
							}
							wb.getSheet(sheetIndex).flushRows();
							// }
							if (shouldCountSection(section)) {
								getSectionHash(
									clinicalDocument.eClass().getClassifierID(), sheetIndex, splitOption).add(file);
							}
						}

					}
					clinicalDocument.eResource().unload();
					currentProcessingTime += stopwatch.elapsed(TimeUnit.MILLISECONDS);
					/*
					 * Setting to null to encourage GC
					 */
					clinicalDocument = null;
				} catch (Exception exception) {
					exception.printStackTrace();
					errors.put(file, exception);
				}

			}
			stopwatch.stop();
		}

		monitor.beginTask("Generate Spreadsheet", folder.members().length);

		for (

		Integer eClass : workbooks.keySet()) {

			HashMap<String, ArrayList<IFile>> sectionbyfile = documentsbysectionbyfile.get(eClass);

			if (sectionbyfile == null) {
				sectionbyfile = new HashMap<String, ArrayList<IFile>>();
			}

			SXSSFWorkbook wb = workbooks.get(eClass);
			SXSSFSheet sectionsSheet = wb.getSheet("Sections");

			List<String> sortedKeys = new ArrayList<String>(sectionbyfile.keySet());
			Collections.sort(sortedKeys);

			Font boldFont = wb.createFont();
			boldFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
			CellStyle sectionstyle = null;
			if (sectionsSheet.getWorkbook().getNumCellStyles() < 100) {
				sectionstyle = sectionsSheet.getWorkbook().createCellStyle();
				sectionstyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
				sectionstyle.setRotation((short) -90);
				sectionstyle.setFont(boldFont);
			}

			SXSSFRow row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());

			offset = 0;
			// row1.createCell(offset++).setCellValue("File Name");
			// row1.createCell(offset++).setCellValue("Document");
			offset = SheetHeaderUtil.createDocumentMedadataHeadder(row1, offset++);
			int metadataoffset = offset;

			// undo to go back to two rows for headers row1.createCell(offset++).setCellValue("Document Type");
			for (String sectionclass : sortedKeys) {
				Cell cell = row1.createCell(offset++);
				cell.setCellValue(sectionclass);
				if (sectionstyle != null) {
					cell.setCellStyle(sectionstyle);
				}
			}

			row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
			// offset = 2;
			for (@SuppressWarnings("unused")
			String sectionclass : sortedKeys) {
				Cell cell = row1.createCell(metadataoffset++);
				String columnLetter = CellReference.convertNumToColString(cell.getColumnIndex());
				String strFormula = "COUNTIF(" + columnLetter + "3:" + columnLetter + (files.size() + 2) + ",\"X\")";
				cell.setCellType(Cell.CELL_TYPE_FORMULA);
				cell.setCellFormula(strFormula);
			}

			CellStyle style = null;
			if (sectionsSheet.getWorkbook().getNumCellStyles() < 100) {
				style = sectionsSheet.getWorkbook().createCellStyle();
				style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				style.setAlignment(CellStyle.ALIGN_CENTER);
			}

			// style.setFont(font);

			// CellStyle boldstyle = wb.createCellStyle();

			for (IFile file : files) {
				if (getDMHash(eClass, splitOption).containsKey(file)) {
					offset = 0;
					row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
					// row1.createCell(offset++).setCellValue(file.getName());
					DocumentMetadata documentMetadata = getDMHash(eClass, splitOption).get(file);
					offset = SpreadsheetSerializer.serializeDocumentMetadata(row1, offset, documentMetadata);
					row1.getRowNum();
					for (String sectionclass : sortedKeys) {
						if (sectionbyfile.get(sectionclass).contains(file)) {
							Cell cell = row1.createCell(offset++);
							cell.setCellValue("X");
							if (style != null) {
								cell.setCellStyle(style);
							}
						} else {
							row1.createCell(offset++).setCellValue("");
						}
					}
				}
			}

			// row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
			// // offset = 2;
			// for (@SuppressWarnings("unused")
			// String sectionclass : sortedKeys) {
			// Cell cell = row1.createCell(metadataoffset++);
			// String columnLetter = CellReference.convertNumToColString(cell.getColumnIndex());
			// String strFormula = "COUNTIF(" + columnLetter + "2:" + columnLetter + (lastRow + 1) + ",\"X\")";
			// cell.setCellType(Cell.CELL_TYPE_FORMULA);
			// cell.setCellFormula(strFormula);
			// }

			String fileLocation = folder.getParent().getLocation().toOSString() + System.getProperty("file.separator") +
					CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() +
					getFileName(eClass, splitOption) + "_SA.xlsx";
			File theFile = new File(fileLocation);

			// If the file exists, check to see if we can open it
			// this is the excel
			if (theFile.exists()) {
				org.apache.commons.io.FileUtils.touch(theFile);
			}

			monitor.subTask(
				"Serializing  " + CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() +
						"_SA.xlsx");

			console.println("Start Saving " + currentProcessingTime);

			try (OutputStream fileOut = Files.newOutputStream(Paths.get(fileLocation))) {
				wb.write(fileOut);
				fileOut.close();
				wb.close();
				wb.dispose();
			}

			// FileOutputStream = new FileOutputStream();

			console.println("End Saving " + currentProcessingTime);

			monitor.subTask(
				"Flushing Memory  " + CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" +
						folder.getName().toUpperCase() + "_SA.xlsx");

			monitor.subTask(
				"Reloading  " + CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() +
						"_SA.xlsx");

			/**
			 * @TODO Add preference for formatting
			 */
			if (false && folder.members().length < 50) {
				format(fileLocation, monitor);
			}
			monitor.subTask(
				"Completed Saving  " + CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" +
						folder.getName().toUpperCase() + "_SA.xlsx");

		}

		if (performance != null) {
			performance.close();
		}

		if (validation != null) {
			validation.close();
		}

	}

	//

	/**
	 * If there is no null flavor and there is a entries or large narrative return true
	 * else
	 * return
	 * false
	 *
	 * @param section
	 * @return boolean
	 */
	boolean shouldCountSection(Section section) {
		if (section.isNullFlavorUndefined()) {
			if (!section.getEntries().isEmpty()) {
				return true;
			}
			if (section.getText() != null && section.getText().getText() != null) {
				if (section.getText().getText().length() > 50) {
					return true;
				}
			}
		}
		return false;
	}
}
