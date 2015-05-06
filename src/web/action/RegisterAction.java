package web.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import service.UserService;
import web.formbean.UserFormBean;

public class RegisterAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			 {
		if(!isTokenValid(request)) {
			request.setAttribute("message", "请勿重复提交");
			return mapping.findForward("failure");
		}

		try{
				
			UserService service = new UserService();
			UserFormBean formbean = (UserFormBean) form;
			if(service.existUser(formbean.getUser().getUsername())){
				request.setAttribute("username", "用户名已存在");
				return mapping.getInputForward();
			}
			resetToken(request);
			service.add(formbean.getUser());
			
			System.out.println("注册操作");
			return mapping.findForward("success");
			
		}catch (SQLException e){
			request.setAttribute("message", "注册失败");
			return mapping.findForward("failure");
		}
		
		
	}

}
