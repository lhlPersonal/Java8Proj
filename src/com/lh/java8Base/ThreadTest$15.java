/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.text.MessageFormat;
/*     */ import java.util.concurrent.SynchronousQueue;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ class ThreadTest$15
/*     */   implements Runnable
/*     */ {
/*     */   ThreadTest$15(SynchronousQueue paramSynchronousQueue)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 580 */     int i = 0;
/* 581 */     while (i < 10)
/*     */       try {
/* 583 */         ThreadTest.logger.info(MessageFormat.format("Take number:{0}", new Object[] { 
/* 584 */           this.val$q.take() }));
/* 585 */         i++;
/*     */       }
/*     */       catch (InterruptedException e) {
/* 588 */         e.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.15
 * JD-Core Version:    0.6.2
 */