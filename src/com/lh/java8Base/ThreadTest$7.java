/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.util.concurrent.CopyOnWriteArrayList;
/*     */ 
/*     */ class ThreadTest$7
/*     */   implements Runnable
/*     */ {
/*     */   ThreadTest$7(CopyOnWriteArrayList paramCopyOnWriteArrayList)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/*     */     try
/*     */     {
/* 342 */       Thread.sleep(1000L);
/*     */     }
/*     */     catch (InterruptedException e) {
/* 345 */       e.printStackTrace();
/*     */     }
/*     */ 
/* 348 */   //  for (int j = 7; j < 20000; j++)
/* 349 */   //    this.val$arrayList.addIfAbsent(Integer.valueOf(j));
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.7
 * JD-Core Version:    0.6.2
 */