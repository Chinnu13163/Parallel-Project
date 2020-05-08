package com.capgemini.lms_collections.factory;

import com.capgemini.lms_collections.dao.AdminDAO;
import com.capgemini.lms_collections.dao.AdminDAOImplement;
import com.capgemini.lms_collections.dao.UserDAO;
import com.capgemini.lms_collections.dao.UserDAOImplement;
import com.capgemini.lms_collections.service.AdminService;
import com.capgemini.lms_collections.service.AdminServiceImplement;
import com.capgemini.lms_collections.service.UserService;
import com.capgemini.lms_collections.service.UserServiceImplement;

public class LibraryFactory {
	public static AdminDAO getAdminDao() {
		return new AdminDAOImplement();
	}
	public static AdminService getAdminService() {
		return new AdminServiceImplement();
	}
	public static UserDAO getUserDao() {
		return new UserDAOImplement();
	}
	public static UserService getUserService() {
		return new UserServiceImplement();
	}
}
