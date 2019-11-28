package com.ustglobal.phoneinfoapp.util;

import com.ustglobal.phoneinfoapp.dto.PhoneInfoDAO;
import com.ustglobal.phoneinfoapp.dto.PhoneInfoDAOImpl;

public class PhoneInfoManager {

	private PhoneInfoManager() {	
	}
	
	public static PhoneInfoDAO getEmployeeDAO() {
		return new PhoneInfoDAOImpl();	
	}
	
}
