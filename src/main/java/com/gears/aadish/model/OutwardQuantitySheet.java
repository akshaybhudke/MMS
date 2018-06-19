package com.gears.aadish.model;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class OutwardQuantitySheet extends QuantitySheet {
	
	private static final String sheetType="OUTVARD";

	public OutwardQuantitySheet(String jobId, String jobName, int quantity,
			Date actualInDate, Date expectedOutDate) {
		super(jobId, jobName, quantity, actualInDate, expectedOutDate,sheetType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<QuantitySheet> getListOfSheets(String sheetType,
			Date startDate, Date endDate) {
		System.out.println("I am in Outvard");
		return null;
	}

	@Override
	public void addJobDetailsToInvardQuantity(String jobId, String jobName,
			int quantity, Date actualInDate, Date expectedOutDate)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}
	

}
