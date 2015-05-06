package web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import domain.User;

import service.UserService;

import web.formbean.UserFormBean;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		UserFormBean formbean = (UserFormBean) form;
		User user = formbean.getUser();
		
		UserService service = new UserService();
		user = service.find(user.getUsername(), user.getPassword());
		
		if(user==null){
			request.setAttribute("errors", "用户名或密码错误");
			return mapping.getInputForward();
		}
		
		request.getSession().setAttribute("user", user);
		return mapping.findForward("index");
	}

}
