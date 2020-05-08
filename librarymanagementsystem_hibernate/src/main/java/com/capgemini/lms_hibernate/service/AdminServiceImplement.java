package com.capgemini.lms_hibernate.service;

import java.util.List;

import com.capgemini.lms_hibernate.dao.AdminDAO;
import com.capgemini.lms_hibernate.dto.BookBean;
import com.capgemini.lms_hibernate.dto.BookIssueBean;
import com.capgemini.lms_hibernate.dto.RequestDetailsBean;
import com.capgemini.lms_hibernate.dto.UsersBean;
import com.capgemini.lms_hibernate.factory.LibraryFactory;

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
	public List<Integer> bookHistoryDetails(int uId) {
		// TODO Auto-generated method stub
		return dao.bookHistoryDetails(uId);
	}

	@Override
	public List<RequestDetailsBean> showRequests() {
		// TODO Auto-generated method stub
		return dao.showRequests();
	}

	@Override
	public List<BookIssueBean> showIssuedBooks() {
		// TODO Auto-generated method stub
		return dao.showIssuedBooks();
	}

	@Override
	public List<UsersBean> showUsers() {
		// TODO Auto-generated method stub
		return dao.showUsers();
	}

}
