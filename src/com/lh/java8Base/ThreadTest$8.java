/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.util.concurrent.CopyOnWriteArrayList;
/*     */ 
/*     */ class ThreadTest$8
/*     */   implements Runnable
/*     */ {
/*     */   ThreadTest$8(CopyOnWriteArrayList paramCopyOnWriteArrayList)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/*     */     try
/*     */     {
/* 359 */       Thread.sleep(1000L);
/*     */     }
/*     */     catch (InterruptedException e) {
/* 362 */       e.printStackTrace();
/*     */     }
/*     */ 
/* 365 */     for (int j = 10; j < 27000; j++)
/* 366 */       this.val$arrayList.addIfAbsent(Integer.valueOf(j));
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.8
 * JD-Core Version:    0.6.2
 */