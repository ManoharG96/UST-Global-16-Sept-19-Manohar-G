package com.ustglobal.lms.dao;

import com.ustglobal.lms.bean.AdminBean;
import com.ustglobal.lms.bean.LibrarianBean;
import com.ustglobal.lms.bean.StudentBean;

public interface AdminDAO {
	public AdminBean login(int id, String password);
	public boolean registerStudent(StudentBean bean);
	public boolean registerLibrarian(LibrarianBean bean);
	public boolean deleteStudent(int id);
	public boolean deleteLibrarian(int id);
	public boolean registerAdmin(AdminBean bean);
}
