/*    */ package com.lh.java8Base;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ abstract interface A
/*    */ {
/*    */   public abstract void actionA();
/*    */ 
/*    */   public abstract void actionB();
/*    */ 
/*    */   public void actionC()
/*    */   {
/* 30 */     System.out.println("Default actionC");
/*    */   }
/*    */ 
/*    */   public static void actionD()
/*    */   {
/* 35 */     System.out.println("Static method actionD");
/*    */   }
/*    */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.A
 * JD-Core Version:    0.6.2
 */