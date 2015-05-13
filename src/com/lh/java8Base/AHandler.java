/*    */ package com.lh.java8Base;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.lang.reflect.InvocationHandler;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ class AHandler
/*    */   implements InvocationHandler
/*    */ {
/*    */   private Object tObject;
/*    */ 
/*    */   public AHandler(Object t)
/*    */   {
/* 58 */     this.tObject = t;
/*    */   }
/*    */ 
/*    */   public Object invoke(Object proxy, Method method, Object[] args)
/*    */     throws Throwable
/*    */   {
/* 65 */     System.out.println("Before Action");
/* 66 */     method.invoke(this.tObject, args);
/* 67 */     System.out.println("After Action");
/* 68 */     return null;
/*    */   }
/*    */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.AHandler
 * JD-Core Version:    0.6.2
 */