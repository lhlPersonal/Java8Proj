/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.text.MessageFormat;
/*     */ import java.util.concurrent.BrokenBarrierException;
/*     */ import java.util.concurrent.CyclicBarrier;
/*     */ import java.util.concurrent.ThreadLocalRandom;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ class ThreadTest$16
/*     */   implements Runnable
/*     */ {
/*     */   ThreadTest$16(ThreadLocalRandom paramThreadLocalRandom, int paramInt, CyclicBarrier paramCyclicBarrier)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/*     */     try
/*     */     {
/* 607 */     //  Thread.sleep(this.val$threadLocalRandom.nextInt(10 * this.val$t) * 1000);
/*     */ 
/* 609 */     //  ThreadTest.logger.info(
///* 610 */         MessageFormat.format("CyclicBarrier thread name:{0},number of waiting:{1},number of part:{2}", new Object[] { 
///* 611 */         Thread.currentThread().getName(), 
///* 612 */         Integer.valueOf(this.val$cyclicBarrier.getNumberWaiting()), 
///* 613 */         Integer.valueOf(this.val$cyclicBarrier.getParties()) }));
/*     */ 
///* 615 */       this.val$cyclicBarrier.await();
/*     */     }
/*     */     catch (Exception e) {
/* 618 */       e.printStackTrace();
/*     */     }
/*     */     
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.16
 * JD-Core Version:    0.6.2
 */