package com.nanosim.dao;

import com.nanosim.model.Budget;
import com.nanosim.util.ISqlHelper;

public class BudgetDAO {

	ISqlHelper sqlHelper = ISqlHelper.Factory.getInstance();

	public Budget insertBudget(Budget b) {
		return null;
//		Connection con = sqlHelper.get;
//		try {
//			con.setAutoCommit(false);
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
//
//		try {
//			PreparedStatement updateSales = con
//					.prepareStatement("INSERT Budgets SET time = ? AND credit = ?");
//			updateSales.setDate(1, (java.sql.Date) t);
//			updateSales.setDouble(2, c);
//			updateSales.executeUpdate();
//			con.commit();
//
//			con.setAutoCommit(true);
//
//		} catch (Exception e) {
//			System.out.println("Error: " + e.toString());
//		}
//		return new Budget(t, c);
	}
}