package com.nanosim.model;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class PMFactory {
	private static final PersistenceManagerFactory pmfInstance = JDOHelper
			.getPersistenceManagerFactory("transactions-optional");

	private PMFactory() {
	}

	public static PersistenceManagerFactory get() {
		return pmfInstance;
	}
}