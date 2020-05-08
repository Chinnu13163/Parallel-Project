package com.capgemini.lms_hibernate.service;

import java.util.List;

import com.capgemini.lms_hibernate.dto.BorrowedBooksBean;

public interface StudentService {
	List<BorrowedBooksBean> borrowedBook(int uId);
	boolean request(int uId, int bId);
	boolean returnBook(int bId,int uId,String status);

}
