package com.ustglobal.phoneinfoapp.dto;

import java.util.ArrayList;

import com.ustglobal.phoneinfoapp.dao.PhoneInfoBean;

public interface PhoneInfoDAO {
	public ArrayList<PhoneInfoBean> getContactInfo();
	public int insertContactInfo(String name, double number, String group);
	public int updateContactInfo(double number, String group, String name);
	public PhoneInfoBean serachContactinfo(String name);
	public int deleteContactInfo(String name);
}
