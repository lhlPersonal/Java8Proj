/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.text.MessageFormat;
/*     */ 
/*     */ class ThreadExceptionHandler
/*     */   implements Thread.UncaughtExceptionHandler
/*     */ {
/*     */   public void uncaughtException(Thread t, Throwable e)
/*     */   {
/* 695 */     System.err.println(MessageFormat.format(
/* 696 */       "Thread error happens,thread name:{0},error message:{1}", new Object[] { 
/* 697 */       t.getName(), e.getLocalizedMessage() }));
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadExceptionHandler
 * JD-Core Version:    0.6.2
 */