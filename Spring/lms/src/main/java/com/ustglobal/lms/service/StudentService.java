package com.ustglobal.lms.service;

import java.util.List;

import com.ustglobal.lms.bean.BookBean;
import com.ustglobal.lms.bean.BookIssueBean;
import com.ustglobal.lms.bean.StudentBean;

public interface StudentService {
	public StudentBean login(String USN,String password);
	public BookBean search(String name);

	public boolean returnBook(int sid,int bid);
	public BookBean searchById(int bid);
	public List<BookIssueBean> myBooks(int sid);
	public boolean request(int sid, int bid,String status);
	public List<BookBean> getAll();
}
