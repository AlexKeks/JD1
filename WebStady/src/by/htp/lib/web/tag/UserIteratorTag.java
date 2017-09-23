package by.htp.lib.web.tag;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import by.htp.lib.service.User;

public class UserIteratorTag extends TagSupport{

	private static final long serialVersionUID = 2171687807942308476L;
	
	private HashSet <User> users;
	
	@Override
	public int doStartTag() throws JspException {
		if(users != null){
			
			JspWriter writer = pageContext.getOut();
			
			Iterator<User> it = users.iterator();
			while( it.hasNext()){
				try {
					writer.println(it.next());
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
		}
		return SKIP_BODY;
		
	}

	public HashSet<User> getUsers() {
		return users;
	}

	public void setUsers(HashSet<User> users) {
		this.users = users;
	}
	
	

}
