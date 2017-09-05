/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base64Binary;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UnsignedInt;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl#getCreation <em>Creation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttachmentImpl extends DataTypeImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code language;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary data;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt size;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary hash;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getCreation() <em>Creation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected DateTime creation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContentType() {
		if (contentType != null && contentType.eIsProxy()) {
			InternalEObject oldContentType = (InternalEObject)contentType;
			contentType = (Code)eResolveProxy(oldContentType);
			if (contentType != oldContentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ATTACHMENT__CONTENT_TYPE, oldContentType, contentType));
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(Code newContentType) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject)language;
			language = (Code)eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ATTACHMENT__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Code newLanguage) {
		Code oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Base64Binary)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ATTACHMENT__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Base64Binary newData) {
		Base64Binary oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (Uri)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ATTACHMENT__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getSize() {
		if (size != null && size.eIsProxy()) {
			InternalEObject oldSize = (InternalEObject)size;
			size = (UnsignedInt)eResolveProxy(oldSize);
			if (size != oldSize) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ATTACHMENT__SIZE, oldSize, size));
			}
		}
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt basicGetSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(UnsignedInt newSize) {
		UnsignedInt oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getHash() {
		if (hash != null && hash.eIsProxy()) {
			InternalEObject oldHash = (InternalEObject)hash;
			hash = (Base64Binary)eResolveProxy(oldHash);
			if (hash != oldHash) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ATTACHMENT__HASH, oldHash, hash));
			}
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary basicGetHash() {
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(Base64Binary newHash) {
		Base64Binary oldHash = hash;
		hash = newHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__HASH, oldHash, hash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ATTACHMENT__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.eclipse.mdht.uml.fhir.core.dataTypes.String newTitle) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreation() {
		if (creation != null && creation.eIsProxy()) {
			InternalEObject oldCreation = (InternalEObject)creation;
			creation = (DateTime)eResolveProxy(oldCreation);
			if (creation != oldCreation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ATTACHMENT__CREATION, oldCreation, creation));
			}
		}
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetCreation() {
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreation(DateTime newCreation) {
		DateTime oldCreation = creation;
		creation = newCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ATTACHMENT__CREATION, oldCreation, creation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.ATTACHMENT__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
			case DataTypesPackage.ATTACHMENT__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case DataTypesPackage.ATTACHMENT__DATA:
				if (resolve) return getData();
				return basicGetData();
			case DataTypesPackage.ATTACHMENT__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case DataTypesPackage.ATTACHMENT__SIZE:
				if (resolve) return getSize();
				return basicGetSize();
			case DataTypesPackage.ATTACHMENT__HASH:
				if (resolve) return getHash();
				return basicGetHash();
			case DataTypesPackage.ATTACHMENT__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case DataTypesPackage.ATTACHMENT__CREATION:
				if (resolve) return getCreation();
				return basicGetCreation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataTypesPackage.ATTACHMENT__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__LANGUAGE:
				setLanguage((Code)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__DATA:
				setData((Base64Binary)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__URL:
				setUrl((Uri)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__SIZE:
				setSize((UnsignedInt)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__HASH:
				setHash((Base64Binary)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ATTACHMENT__CREATION:
				setCreation((DateTime)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataTypesPackage.ATTACHMENT__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case DataTypesPackage.ATTACHMENT__LANGUAGE:
				setLanguage((Code)null);
				return;
			case DataTypesPackage.ATTACHMENT__DATA:
				setData((Base64Binary)null);
				return;
			case DataTypesPackage.ATTACHMENT__URL:
				setUrl((Uri)null);
				return;
			case DataTypesPackage.ATTACHMENT__SIZE:
				setSize((UnsignedInt)null);
				return;
			case DataTypesPackage.ATTACHMENT__HASH:
				setHash((Base64Binary)null);
				return;
			case DataTypesPackage.ATTACHMENT__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case DataTypesPackage.ATTACHMENT__CREATION:
				setCreation((DateTime)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataTypesPackage.ATTACHMENT__CONTENT_TYPE:
				return contentType != null;
			case DataTypesPackage.ATTACHMENT__LANGUAGE:
				return language != null;
			case DataTypesPackage.ATTACHMENT__DATA:
				return data != null;
			case DataTypesPackage.ATTACHMENT__URL:
				return url != null;
			case DataTypesPackage.ATTACHMENT__SIZE:
				return size != null;
			case DataTypesPackage.ATTACHMENT__HASH:
				return hash != null;
			case DataTypesPackage.ATTACHMENT__TITLE:
				return title != null;
			case DataTypesPackage.ATTACHMENT__CREATION:
				return creation != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentImpl
