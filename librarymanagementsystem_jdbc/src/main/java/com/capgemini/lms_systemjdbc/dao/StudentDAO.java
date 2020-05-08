package com.capgemini.lms_systemjdbc.dao;

import java.util.List;

import com.capgemini.lms_jdbc.dto.BorrowedBooks;

public interface StudentDAO {
	boolean request(int uId, int bId);
	List<BorrowedBooks> borrowedBook(int uId);
	boolean returnBook(int bId,int uId,String status);

}
