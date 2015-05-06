package junit;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import dao.CommentsDao;
import dao.UserDao;
import domain.Comment;
import domain.User;

public class TestDao {
	
	UserDao dao = new UserDao();
	CommentsDao cdao = new CommentsDao();

	public void testexist() throws Exception{
		System.out.println(dao.existUser("aaa"));
	}
	
	
	public void testfind() throws SQLException{

		User user1 = dao.find("aaa","456654");
		System.out.println(user1);
	}
	
	
	public void testadd() throws SQLException{
		Comment c = new Comment();
		c.setUsername("aaa");
		c.setTime(new Date());
		c.setMessage("ÕâÊÇºº×Ö");
		cdao.add(c);
	}
	
	@Test
	public void testfindall() throws SQLException{
		List list = cdao.findall();
		System.out.println(list);
	}
}
