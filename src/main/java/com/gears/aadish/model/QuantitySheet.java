package com.gears.aadish.model;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public abstract class QuantitySheet {
	
	private String sheetType;
	protected String jobId;
	protected String jobName;
	protected int quantity;
	protected Date actualInDate;
	protected Date expectedOutDate;
	
	public QuantitySheet(){}
	public QuantitySheet(String jobId, String jobName, int quantity,
			Date actualInDate, Date expectedOutDate,String sheetType) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.quantity = quantity;
		this.actualInDate = actualInDate;
		this.expectedOutDate = expectedOutDate;
		this.sheetType= sheetType;
	}

	public abstract void addJobDetailsToInvardQuantity(String jobId, String jobName, int quantity,Date actualInDate, Date expectedOutDate) throws SQLException;
	public abstract List<QuantitySheet> getListOfSheets(String sheetType,Date startDate , Date endDate );
		
		
		
}
