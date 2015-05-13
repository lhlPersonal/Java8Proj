/*    */ package com.lhl.websocket;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.text.MessageFormat;
/*    */ import java.util.HashMap;
/*    */ import java.util.Random;
/*    */ import javax.websocket.EndpointConfig;
/*    */ import javax.websocket.OnClose;
/*    */ import javax.websocket.OnMessage;
/*    */ import javax.websocket.OnOpen;
/*    */ import javax.websocket.RemoteEndpoint.Basic;
/*    */ import javax.websocket.Session;
/*    */ import javax.websocket.server.ServerEndpoint;
/*    */ 
/*    */ @ServerEndpoint("/Websocket2")
/*    */ public class WebSocketSvr
/*    */ {
/* 19 */   private static HashMap<String, Session> sessionMap = new HashMap();
/* 20 */   boolean closed = false;
/* 21 */   Random r = new Random();
/* 22 */   String sessionId = null;
/*    */ 
/*    */   @OnOpen
/*    */   public void open(Session session, EndpointConfig config)
/*    */   {
/* 29 */     this.sessionId = session.getId();
/* 30 */     this.closed = false;
/*    */ 
/* 32 */     sessionMap.put(this.sessionId, session);
/* 33 */     System.out.println(MessageFormat.format(
/* 34 */       "Websocket session {0} has been builded.", new Object[] { this.sessionId }));
/*    */   }
/*    */ 
/*    */   @OnMessage
/*    */   public void inMessage(Session session, String message)
/*    */   {
/*    */     try
/*    */     {
/* 42 */       System.out
/* 43 */         .println(
/* 44 */         MessageFormat.format("Receive message {0} from client {1} and start to send nubmer.", new Object[] { 
/* 45 */         message, this.sessionId }));
/* 46 */       while (!this.closed) {
/* 47 */         session.getBasicRemote().sendText(
/* 48 */           MessageFormat.format("{0}", new Object[] { Integer.valueOf(this.r.nextInt(10000)) }));
/*    */ 
/* 50 */         Thread.sleep(2000L);
/*    */       }
/*    */     } catch (Exception e) {
/* 53 */       end(session);
/* 54 */       System.out
/* 55 */         .println(
/* 56 */         MessageFormat.format("Some error happens and the connection of session {0} is closed.Error msg:{1}", new Object[] { 
/* 57 */         this.sessionId, e.getMessage() }));
/*    */     }
/*    */   }
/*    */ 
/*    */   @OnClose
/*    */   public void end(Session session)
/*    */   {
/* 64 */     if (sessionMap.containsKey(session.getId())) {
/* 65 */       sessionMap.remove(this.sessionId);
/*    */ 
/* 67 */       System.out.println(MessageFormat.format(
/* 68 */         "Websocket session {0} has been closed.", new Object[] { this.sessionId }));
/*    */     }
/*    */   }
/*    */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lhl.websocket.WebSocketSvr
 * JD-Core Version:    0.6.2
 */