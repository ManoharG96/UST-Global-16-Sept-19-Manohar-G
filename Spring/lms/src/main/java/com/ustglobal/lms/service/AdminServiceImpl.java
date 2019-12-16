package com.ustglobal.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.bean.AdminBean;
import com.ustglobal.lms.bean.LibrarianBean;
import com.ustglobal.lms.bean.StudentBean;
import com.ustglobal.lms.dao.AdminDAO;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;
	
	@Override
	public AdminBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
	
		return dao.registerStudent(bean);
	}

	@Override
	public boolean registerLibrarian(LibrarianBean bean) {
		return dao.registerLibrarian(bean);
	}

	@Override
	public boolean deleteStudent(int id) {
		return dao.deleteStudent(id);
	}

	@Override
	public boolean deleteLibrarian(int id) {
		return dao.deleteLibrarian(id);
	}

	@Override
	public boolean registerAdmin(AdminBean bean) {
		return dao.registerAdmin(bean);
	}

}
