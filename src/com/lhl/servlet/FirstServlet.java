/*    */ package com.lhl.servlet;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import javax.servlet.Servlet;
/*    */ import javax.servlet.ServletConfig;
/*    */ import javax.servlet.ServletContext;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletOutputStream;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class FirstServlet extends HttpServlet
/*    */   implements Servlet
/*    */ {
/*    */   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
/*    */     throws ServletException, IOException
/*    */   {
/* 19 */     resp.getOutputStream().print(
/* 20 */       "<script>alert('" + req.getParameter("p") + "');</script>");
/*    */   }
/*    */ 
/*    */   protected void doPost(HttpServletRequest req, HttpServletResponse resp)
/*    */     throws ServletException, IOException
/*    */   {
/*    */   }
/*    */ 
/*    */   public void init(ServletConfig config)
/*    */     throws ServletException
/*    */   {
/* 31 */     config.getServletContext().setAttribute("a1", "a1");
/*    */   }
/*    */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lhl.servlet.FirstServlet
 * JD-Core Version:    0.6.2
 */