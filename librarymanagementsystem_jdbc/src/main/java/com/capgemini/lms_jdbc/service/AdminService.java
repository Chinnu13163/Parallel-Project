package com.capgemini.lms_jdbc.service;

import java.util.List;

import com.capgemini.lms_jdbc.dto.BookBean;
import com.capgemini.lms_jdbc.dto.BookIssueDetails;
import com.capgemini.lms_jdbc.dto.RequestDetails;
import com.capgemini.lms_jdbc.dto.UsersBean;

public interface AdminService {
	boolean addBook(BookBean book);
	boolean removeBook(int bId);
	boolean updateBook(BookBean book);
	boolean issueBook(int bId,int uId);
	List<BookIssueDetails> bookHistoryDetails(int uId);
	List<RequestDetails> showRequests();
	List<BookIssueDetails> showIssuedBooks();
	List<UsersBean> showUsers();

}
