package service;

import java.sql.SQLException;

import dao.UserDao;
import domain.User;
import web.formbean.UserFormBean;

public class UserService {

	UserDao dao = new UserDao();
	public void add(User user) throws SQLException{
		dao.add(user);
	}
	
	public boolean existUser(String username) throws SQLException{
		return dao.existUser(username);
	}
	
	public User find(String username, String password) throws SQLException{
		return dao.find(username, password);
	}
}
