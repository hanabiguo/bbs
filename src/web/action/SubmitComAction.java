package web.action;

import java.sql.SQLException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import service.CommentsService;

import domain.Comment;
import domain.User;

import web.formbean.ComFormBean;

public class SubmitComAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception
		{

		ComFormBean formbean = (ComFormBean) form;
		User user = (User) request.getSession().getAttribute("user");
		Comment comment = formbean.getComment();
		comment.setUsername(user.getUsername());
		comment.setTime(new Date());
		
		CommentsService service = new CommentsService();
		service.add(comment);
		
		return mapping.findForward("index");
	}

}
