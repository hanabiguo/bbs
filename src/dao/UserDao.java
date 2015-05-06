package dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import domain.User;

import utils.C3p0;

public class UserDao {

	private QueryRunner qr = new QueryRunner(C3p0.getDataSource());
	
	public void add(User user) throws SQLException {
	
		String sql = "insert into user (username,password,email) values (?,?,?);";
		Object[] params = {user.getUsername(),user.getPassword(),user.getEmail()};
		qr.update(sql, params);
	}
	
	public boolean existUser(String username) throws SQLException{
		
		String sql = "select username from user where username=?";
		Object[] params = {username};
		if(qr.query(sql, new ArrayHandler(), params)!=null) return true;
		
		return false;
	}
	
	public User find(String username, String password) throws SQLException{
		
		String sql = "select * from user where username=? and password=?";
		Object[] params = {username, password};
		
		return (User) qr.query(sql, new BeanHandler(User.class), params);
	}

}
