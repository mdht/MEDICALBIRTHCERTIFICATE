/*******************************************************************************
 * Copyright (c) 2020 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.hl7.datatypes.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author seanmuir
 *
 */
public class DatatypesUtil {

	/**
	 * @param context
	 * @param string
	 * @param string2
	 */
	public static void increment(Map<Object, Object> context, String key, String level) {
		if (context.containsKey(ValidationStatistics.class.getCanonicalName())) {
			ValidationStatistics counter = ((ValidationStatistics) context.get(
				ValidationStatistics.class.getCanonicalName()));

			switch (level) {
				case "ERROR":
					counter.shallCount++;
					counter.countShallUnique.add(key);
					break;
				case "WARNING":
					counter.shouldCount++;
					counter.countShouldUnique.add(key);
					break;
				case "INFO":
					counter.mayCount++;
					counter.countMayUnique.add(key);
					break;
			}

			if (!counter.counterPer.containsKey(key)) {
				counter.counterPer.put(key, new ValidationStatistics.CounterPer());
			}
			counter.counterPer.get(key).count++;

		}

	}

	public static class ValidationStatistics {

		public long shallCount = 0;

		public long shouldCount = 0;

		public long mayCount = 0;

		public static class CounterPer {
			public long count = 0;
		}

		public HashMap<String, CounterPer> counterPer = new HashMap<String, CounterPer>();

		public HashSet<String> countShallUnique = new HashSet<String>();

		public HashSet<String> countShouldUnique = new HashSet<String>();

		public HashSet<String> countMayUnique = new HashSet<String>();
	}

}
