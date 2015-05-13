/*    */ package com.lh.java8Base;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class JavaBasicTest
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  7 */     staticFieldTest();
/*    */   }
/*    */ 
/*    */   public static void staticFieldTest()
/*    */   {
/* 12 */     System.out.println("Starting Main");
/* 13 */     System.out.println("After echo");
/* 14 */     System.out.println("After field access");
/* 15 */     System.out.println(B.y + A1.x);
/*    */   }
/*    */ 
/*    */   public static int f(String s) {
/* 19 */     System.out.println(s);
/* 20 */     return 1;
/*    */   }
/*    */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.JavaBasicTest
 * JD-Core Version:    0.6.2
 */