/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.text.MessageFormat;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ class ThreadTest$4
/*     */   implements Runnable
/*     */ {
/*     */   ThreadTest$4(ThreadLocal paramThreadLocal)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 207 */     int i = 0;
/*     */ 
/* 209 */     while (i < 20) {
/* 210 */       ((ArrayList)this.val$t.get()).add(MessageFormat.format("str{0}", new Object[] { Integer.valueOf(i) }));
/* 211 */       System.out.println("add str:" + i);
/* 212 */       i++;
/*     */       try {
/* 214 */         Thread.sleep(1000L);
/*     */       }
/*     */       catch (InterruptedException e) {
/* 217 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.4
 * JD-Core Version:    0.6.2
 */