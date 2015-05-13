/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.text.MessageFormat;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ class ThreadTest$12
/*     */   implements Runnable
/*     */ {
/*     */   public void run()
/*     */   {
/* 463 */     int j = 0;
/* 464 */     while (j < 20000) {
/*     */       try {
/* 466 */         j += 3000;
/* 467 */         Thread.sleep(1000L);
/*     */       }
/*     */       catch (InterruptedException e) {
/* 470 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */ 
/* 474 */     ThreadTest.logger.info(MessageFormat.format("Thread {0} has finished", new Object[] { 
/* 475 */       Thread.currentThread().getName() }));
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.12
 * JD-Core Version:    0.6.2
 */