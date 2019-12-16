package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.bean.BookBean;
import com.ustglobal.lms.bean.BookIssueBean;
import com.ustglobal.lms.bean.LibrarianBean;
import com.ustglobal.lms.dao.LibrarianDAO;
@Service
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	private LibrarianDAO dao;
	
	@Override
	public LibrarianBean login(String email, String password) {
		return dao.login(email, password);
	}
	
	@Override
	public boolean addBook(BookBean bean) {
		return dao.addBook(bean);
	}

	@Override
	public boolean updateBook(BookBean bean) {
		return dao.updateBook(bean);
	}

	@Override
	public boolean removeBook(int id) {
		return dao.removeBook(id);
	}

	@Override
	public List<BookIssueBean> requestedIssue() {
		return dao.requestedIssue();
	}

	@Override
	public List<BookIssueBean> requestedReturn() {
		return dao.requestedReturn();
	}

	@Override
	public boolean acceptBook(int sid,int bid) {
		return dao.acceptBook(sid,bid);
	}
	@Override
	public boolean acceptReturn(int sid, int bid) {
		return dao.acceptReturn(sid, bid);
	}
}
