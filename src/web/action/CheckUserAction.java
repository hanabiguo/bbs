package web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import service.UserService;

public class CheckUserAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String username = request.getParameter("username");
		UserService service = new UserService();
		if(service.existUser(username)){
			response.getWriter().print("用户名已存在");
		}else{
			response.getWriter().print("用户名可用");
		}
		return null;
	}

}
