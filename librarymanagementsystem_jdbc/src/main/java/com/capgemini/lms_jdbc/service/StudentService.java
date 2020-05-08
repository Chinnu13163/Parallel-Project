package com.capgemini.lms_jdbc.service;

import java.util.List;

import com.capgemini.lms_jdbc.dto.BorrowedBooks;

public interface StudentService {
	boolean request(int uId, int bId);
	List<BorrowedBooks> borrowedBook(int uId);
	boolean returnBook(int bId,int uId,String status);

}
