package com.lhl.strut2;
import org.apache.struts2.ServletActionContext;

public class TestAction {

	public String execute() throws Exception {

		String par =ServletActionContext.getRequest().getAttribute("para").toString();
		
		if (par.equals("success")) {
			return "success";
		}

		return "expired";
	}
}
