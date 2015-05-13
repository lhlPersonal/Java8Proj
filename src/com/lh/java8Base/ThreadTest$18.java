/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.text.MessageFormat;
/*     */ import java.util.concurrent.Semaphore;
/*     */ import java.util.concurrent.ThreadLocalRandom;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ class ThreadTest$18
/*     */   implements Runnable
/*     */ {
/*     */   ThreadTest$18(Semaphore paramSemaphore, ThreadLocalRandom paramThreadLocalRandom, int paramInt)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/*     */     try
/*     */     {
///* 659 */       this.val$s.acquire();
///* 660 */       ThreadTest.logger.info(MessageFormat.format(
///* 661 */         "Semaphore thread {0} was assigned!", new Object[] { 
///* 662 */         Thread.currentThread().getName() }));
///* 663 */       Thread.sleep(this.val$threadLocalRandom.nextInt(this.val$t) * 1000);
///* 664 */       this.val$s.release();
///*     */ 
///* 666 */       ThreadTest.logger.info(MessageFormat.format(
///* 667 */         "Available permits number:{0}", new Object[] { 
///* 668 */         Integer.valueOf(this.val$s.availablePermits()) }));
/*     */     }
/*     */     catch (Exception e) {
/* 671 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.18
 * JD-Core Version:    0.6.2
 */