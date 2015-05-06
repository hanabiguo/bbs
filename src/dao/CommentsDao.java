package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import utils.C3p0;
import domain.Comment;

public class CommentsDao {

	private QueryRunner qr = new QueryRunner(C3p0.getDataSource());
	
	public void add(Comment comment) throws SQLException{
		String sql = "insert into comments (username,time,message) values (?,?,?);";
		Object[] params = {comment.getUsername(),comment.getTime(),comment.getMessage()};
		qr.update(sql, params);
	}
	
	public List findall() throws SQLException{
		String sql = "select * from comments order by id desc";
		return (List) qr.query(sql, new BeanListHandler(Comment.class));
		
	}
}
