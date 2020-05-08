package com.capgemini.lms_jdbc.service;

import java.util.List;

import com.capgemini.lms_jdbc.dto.BookBean;
import com.capgemini.lms_jdbc.dto.BookIssueDetails;
import com.capgemini.lms_jdbc.dto.RequestDetails;
import com.capgemini.lms_jdbc.dto.UsersBean;
import com.capgemini.lms_jdbc.factory.LibraryFactory;
import com.capgemini.lms_systemjdbc.dao.AdminDAO;

public class AdminServiceImplement implements AdminService{
	
	private AdminDAO dao = LibraryFactory.getAdminDao();

	@Override
	public boolean addBook(BookBean book) {
		// TODO Auto-generated method stub
		return dao.addBook(book);
	}

	@Override
	public boolean removeBook(int bId) {
		// TODO Auto-generated method stub
		return dao.removeBook(bId);
	}

	@Override
	public boolean updateBook(BookBean book) {
		// TODO Auto-generated method stub
		return dao.updateBook(book);
	}

	@Override
	public boolean issueBook(int bId, int uId) {
		// TODO Auto-generated method stub
		return dao.issueBook(bId, uId);
	}

	@Override
	public List<BookIssueDetails> bookHistoryDetails(int uId) {
		// TODO Auto-generated method stub
		return dao.bookHistoryDetails(uId);
	}

	@Override
	public List<RequestDetails> showRequests() {
		// TODO Auto-generated method stub
		return dao.showRequests();
	}

	@Override
	public List<BookIssueDetails> showIssuedBooks() {
		// TODO Auto-generated method stub
		return dao.showIssuedBooks();
	}

	@Override
	public List<UsersBean> showUsers() {
		// TODO Auto-generated method stub
		return dao.showUsers();
	}

}
