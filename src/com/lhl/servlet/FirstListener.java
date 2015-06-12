package com.lhl.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class FirstListener implements HttpSessionListener,
		ServletContextListener, HttpSessionAttributeListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context Destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context Initialized");
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("session Id:" + se.getSession().getId());
		System.out.println("session Created:"
				+ se.getSession().getAttribute("session1"));
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("session Destroyed");
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("session Created:"
				+ event.getSession().getAttribute("session1"));
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
	}
}
