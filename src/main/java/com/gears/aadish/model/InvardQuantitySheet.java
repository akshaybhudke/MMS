package com.gears.aadish.model;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.gears.aadish.service.QuantitySheetService;

public class InvardQuantitySheet extends QuantitySheet {

	private static final String sheetType="INVARD";
	
	public  InvardQuantitySheet()  {
		super();		
	}
	
	public InvardQuantitySheet(String jobId, String jobName, int quantity,Date actualInDate, Date expectedOutDate) {
		super(jobId, jobName, quantity, actualInDate, expectedOutDate ,sheetType);		
	}

	@Override
	public List<QuantitySheet> getListOfSheets(String sheetType,Date startDate, Date endDate) {
		System.out.println("I am in Invard");
		return null;
	}
	
	
	public void addJobDetailsToInvardQuantity(String jobId, String jobName, int quantity,Date actualInDate, Date expectedOutDate) throws SQLException{
		QuantitySheetService.addDetails(jobId,jobName,quantity,actualInDate, expectedOutDate);		
	}
	
}
