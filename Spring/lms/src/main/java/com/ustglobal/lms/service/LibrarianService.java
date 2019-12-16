package com.ustglobal.lms.service;

import java.util.List;

import com.ustglobal.lms.bean.BookBean;
import com.ustglobal.lms.bean.BookIssueBean;
import com.ustglobal.lms.bean.LibrarianBean;

public interface LibrarianService {
	public LibrarianBean login(String email,String password);
	public boolean addBook(BookBean bean);
	public boolean updateBook(BookBean bean);
	public boolean removeBook(int id);
	public List<BookIssueBean> requestedIssue();
	public List<BookIssueBean> requestedReturn();
	public boolean acceptBook(int sid,int bid);

	public boolean acceptReturn(int sid,int bid);
}
