/*    */ package com.lh.java8Base;
/*    */ 
/*    */ import java.lang.reflect.Proxy;
/*    */ 
/*    */ public class DynamicInvokeClass
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 12 */     proxyFactory().actionA();
/* 13 */     proxyFactory().actionC();
/*    */   }
/*    */ 
/*    */   public static A proxyFactory()
/*    */   {
/* 18 */     return (A)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
/* 19 */       new Class[] { A.class }, new AHandler(new SubA()));
/*    */   }
/*    */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.DynamicInvokeClass
 * JD-Core Version:    0.6.2
 */