package com.capgemini.lms_collections.factory;

import com.capgemini.lms_collections.dao.AdminDAO;
import com.capgemini.lms_collections.dao.AdminDAOImplementation;
import com.capgemini.lms_collections.dao.UserDAO;
import com.capgemini.lms_collections.dao.UserDAOImplementation;
import com.capgemini.lms_collections.service.AdminService;
import com.capgemini.lms_collections.service.AdminServiceImplementation;
import com.capgemini.lms_collections.service.UserService;
import com.capgemini.lms_collections.service.UserServiceImplementation;

public class LibraryFactory {
	public static AdminDAO getAdminDao() {
		return new AdminDAOImplementation();
	}
	public static AdminService getAdminService() {
		return new AdminServiceImplementation();
	}
	public static UserDAO getUserDao() {
		return new UserDAOImplementation();
	}
	public static UserService getUserService() {
		return new UserServiceImplementation();
	}
}
