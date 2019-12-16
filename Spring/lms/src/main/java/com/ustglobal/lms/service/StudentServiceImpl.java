package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.bean.BookBean;
import com.ustglobal.lms.bean.BookIssueBean;
import com.ustglobal.lms.bean.StudentBean;
import com.ustglobal.lms.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO dao;
	
	@Override
	public boolean returnBook(int sid, int bid) {
		return dao.returnBook(sid, bid);
	}
	
	@Override
	public List<BookIssueBean> myBooks(int sid) {
		return dao.myBooks(sid);
	}
@Override
	public BookBean searchById(int bid) {
		return dao.searchById(bid);
	}
	@Override
	public StudentBean login(String USN, String password) {
		return dao.login(USN, password);
	}

	@Override
	public BookBean search(String name) {
		return dao.search(name);
	}

	@Override
	public boolean request(int sid, int bid, String status) {
		return dao.request(sid,bid, status);
	}

	@Override
	public List<BookBean> getAll() {
		return dao.getAll();
	}
}
