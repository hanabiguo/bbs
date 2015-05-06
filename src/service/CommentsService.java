package service;

import java.sql.SQLException;
import java.util.List;

import domain.Comment;
import dao.CommentsDao;

public class CommentsService {

	CommentsDao dao = new CommentsDao();
	
	public void add(Comment comment) throws SQLException{
		dao.add(comment);
	}
	
	public List findall() throws SQLException{
		return dao.findall();
	}
}
