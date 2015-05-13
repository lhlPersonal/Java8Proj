/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ 
/*     */ class ThreadTest$2
/*     */   implements Runnable
/*     */ {
/*     */   public void run()
/*     */   {
/* 124 */     System.out.println("runing thread name:" + 
/* 125 */       Thread.currentThread().getName());
/*     */ 
/* 127 */     long l = 100 / 0;
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.2
 * JD-Core Version:    0.6.2
 */