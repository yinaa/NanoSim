package com.nanosim.dao;

import com.nanosim.model.Budget;
import com.nanosim.util.ISqlHelper;

public class BudgetDAO {

	ISqlHelper sqlHelper = ISqlHelper.Factory.getInstance();

	public Budget insertBudget(Budget b) {
		try {
			int retVal = sqlHelper
					.executeUpdate("INSERT Budgets SET time = ? AND credit = ?", b.getTime(), b.getCredit());
			return retVal == -1 ? null : b;
		} catch (Exception e) {
			return null;
		}
	}
}