package com.gears.aadish.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.gears.aadish.model.*; 
import com.gears.aadish.repo.QuantitySheetRepo;


public class QuantitySheetService {

	static QuantitySheetRepo quantitySheetRepo = new QuantitySheetRepo();
	
	public static void addDetails(String jobId, String jobName, int quantity,Date actualInDate, Date expectedOutDate) throws SQLException {
		quantitySheetRepo.saveJobDetails();
		
		
	}
	
	
}
