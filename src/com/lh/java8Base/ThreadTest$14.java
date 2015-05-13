/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.util.concurrent.SynchronousQueue;
/*     */ import java.util.concurrent.ThreadLocalRandom;
/*     */ 
/*     */ class ThreadTest$14
/*     */   implements Runnable
/*     */ {
/*     */   ThreadTest$14(ThreadLocalRandom paramThreadLocalRandom, SynchronousQueue paramSynchronousQueue)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 559 */     int i = 0;
/* 560 */     while (i < 10)
/*     */       try {
/* 562 */     //    int num = this.val$threadLocalRandom.nextInt(++i * 1000);
/*     */ 
/* 565 */      //   this.val$q.put(Integer.valueOf(num));
/*     */       }
/*     */       catch (Exception e)
/*     */       {
/* 569 */         e.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.14
 * JD-Core Version:    0.6.2
 */