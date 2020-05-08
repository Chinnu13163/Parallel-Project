package com.capgemini.lms_hibernate.dao;

import java.util.List;

import com.capgemini.lms_hibernate.dto.BookBean;
import com.capgemini.lms_hibernate.dto.BookIssueBean;
import com.capgemini.lms_hibernate.dto.RequestDetailsBean;
import com.capgemini.lms_hibernate.dto.UsersBean;

public interface AdminDAO {
	boolean addBook(BookBean book);
	boolean removeBook(int bId);
	boolean updateBook(BookBean book);
	boolean issueBook(int bId,int uId);
	List<Integer> bookHistoryDetails(int uId);
	List<RequestDetailsBean> showRequests();
	List<BookIssueBean> showIssuedBooks();
	List<UsersBean> showUsers();
}
