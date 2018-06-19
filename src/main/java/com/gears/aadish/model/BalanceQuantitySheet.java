package com.gears.aadish.model;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class BalanceQuantitySheet extends QuantitySheet {

	private static final String sheetType="BALANCE";
	
	public BalanceQuantitySheet(String jobId, String jobName, int quantity,
			Date actualInDate, Date expectedOutDate) {
		super(jobId, jobName, quantity, actualInDate, expectedOutDate,sheetType);
		// TODO Auto-generated constructor stub
	}
	

	public List<QuantitySheet> showBalalnceJobDetails(Date startDate , Date endDate){
		
		return null;		
	}


	@Override
	public List<QuantitySheet> getListOfSheets(String sheetType,
			Date startDate, Date endDate) {
		System.out.println("I am in Balanace");

		return null;
	}


	@Override
	public void addJobDetailsToInvardQuantity(String jobId, String jobName,
			int quantity, Date actualInDate, Date expectedOutDate)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
