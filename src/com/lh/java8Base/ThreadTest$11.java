/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.text.MessageFormat;
/*     */ import java.util.concurrent.Callable;
/*     */ import java.util.concurrent.ThreadLocalRandom;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ class ThreadTest$11
/*     */   implements Callable<Integer>
/*     */ {
/*     */   public Integer call()
/*     */     throws Exception
/*     */   {
/* 421 */     ThreadTest.logger.info(MessageFormat.format("Curr thread:{0}", new Object[] { 
/* 422 */       Thread.currentThread().getName() }));
/* 423 */     Thread.sleep(5000L);
/*     */ 
/* 425 */     return Integer.valueOf(ThreadLocalRandom.current().nextInt(
/* 426 */       10000));
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.11
 * JD-Core Version:    0.6.2
 */