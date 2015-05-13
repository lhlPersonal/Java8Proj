/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.text.MessageFormat;
/*     */ import java.util.concurrent.CountDownLatch;
/*     */ import java.util.concurrent.ThreadLocalRandom;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ class ThreadTest$17
/*     */   implements Runnable
/*     */ {
/*     */   ThreadTest$17(CountDownLatch paramCountDownLatch1, CountDownLatch paramCountDownLatch2, ThreadLocalRandom paramThreadLocalRandom)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/*     */     try
/*     */     {
/* 635 */      // this.val$begin.await();
/*     */ 
/* 637 */      // Thread.sleep(this.val$threadLocalRandom.nextInt(5) * 1000);
///* 638 */       ThreadTest.logger.info(MessageFormat.format(
///* 639 */         "Count down thread {0} was finished!", new Object[] { 
///* 640 */         Thread.currentThread().getName() }));
/*     */     }
/*     */     catch (Exception e) {
/* 643 */       e.printStackTrace();
/*     */     } finally {
/* 645 */      // this.val$end.countDown();
/*     */     }
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.17
 * JD-Core Version:    0.6.2
 */