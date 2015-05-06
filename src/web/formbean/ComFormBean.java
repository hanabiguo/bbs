package web.formbean;

import org.apache.struts.action.ActionForm;

import domain.Comment;

public class ComFormBean extends ActionForm {

	Comment comment = new Comment();

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
	
}
