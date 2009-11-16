package com.nanosim.server;

import com.nanosim.client.rpc.TransferService;
import com.nanosim.dao.BudgetDAO;
import com.nanosim.model.Budget;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class TransferServiceImpl extends RemoteServiceServlet implements
		TransferService {

	private static final long serialVersionUID = 164797187055616290L;

	@Override
	public Budget insertBudget(Budget b) {
		try {
			BudgetDAO budgetDao = new BudgetDAO();
			return budgetDao.insertBudget(b);
		} catch (Exception e) {
			return null;
		}
	}
}