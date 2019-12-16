package com.ustglobal.lms.dao;

import java.util.List;

import com.ustglobal.lms.bean.BookBean;
import com.ustglobal.lms.bean.BookIssueBean;
import com.ustglobal.lms.bean.StudentBean;

public interface StudentDAO {
	public StudentBean login(String USN,String password);
	public boolean returnBook(int sid,int bid);
	public BookBean search(String name);
	public BookBean searchById(int bid);
	public boolean request(int sid, int bid,String status);
	public List<BookIssueBean> myBooks(int sid);
	public List<BookBean> getAll();
}
