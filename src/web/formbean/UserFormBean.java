package web.formbean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import domain.User;

public class UserFormBean extends ActionForm{
	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
			
		String username = user.getUsername();
		String password = user.getPassword();
		String email = user.getEmail();

		ActionErrors errors = new ActionErrors();
		if(username==null||username.trim().equals("")){
			errors.add("username", new ActionMessage("errors.username.required"));
			return errors;
		}
		else{
			if(!username.matches("[A-Za-z]{3,8}")){
				errors.add("username", new ActionMessage("errors.username.illegal"));
				return errors;}
			}
		
		if(password==null || password.trim().equals("")){
			errors.add("password", new ActionMessage("errors.password.required"));
			return errors;
		}
		else{
		if(!password.matches("\\d{6,9}")){
			errors.add("password", new ActionMessage("errors.password.illegal"));
			return errors;
			}
		}
		
		if(email==null || email.trim().equals("")){
			errors.add("email", new ActionMessage("errors.email.required"));
			return errors;
		}
		else{
		if(!email.matches("\\w+@\\w+(\\.\\w+)+")){
			errors.add("email", new ActionMessage("errors.email.illegal"));
			return errors;
			}}

		return errors;
	}
}
