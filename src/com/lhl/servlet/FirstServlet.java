package com.lhl.servlet;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

public class FirstServlet extends HttpServlet implements Servlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// req.getSession().setAttribute("session1", "first session value");
		// resp.getWriter().print(req.getParameter("p"));

		if (req.getParameter("p") == "cookie") {
			String tval = "中文";
			tval = URLEncoder.encode(tval, "UTF-8");
			Cookie cookie = new Cookie("my_test_cookies", tval);
			cookie.setPath("/");
			cookie.setMaxAge(1000);
			resp.addCookie(cookie);
		}
		// 读取cookie
		Cookie[] cookies = req.getCookies();

		Arrays.asList(cookies).forEach(c -> {
			String c_name = c.getName();
			String c_value = c.getValue();

			if (c_name.indexOf("my_test_cookies") != -1) {
				System.out.println("1===" + c_value);

				try {
					c_value = URLDecoder.decode(c_value, "utf-8");
					System.out.println("2===" + c_value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		resp.getWriter().print(req.getParameter("p"));
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	public void init(ServletConfig config) throws ServletException {
		config.getServletContext().setAttribute("a1", "a1");
	}
}
