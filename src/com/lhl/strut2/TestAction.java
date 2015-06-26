package com.lhl.strut2;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class TestAction {

	public String execute() throws Exception {

	//	String par =ActionContext.getContext().get("para").toString();
		
	//	if (par.equals("success")) {
			return "success";
	//	}

	//	return "expired";
	}

}
