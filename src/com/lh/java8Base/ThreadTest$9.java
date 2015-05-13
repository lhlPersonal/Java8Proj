/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.util.concurrent.CopyOnWriteArrayList;
/*     */ 
/*     */ class ThreadTest$9
/*     */   implements Runnable
/*     */ {
/*     */   ThreadTest$9(CopyOnWriteArrayList paramCopyOnWriteArrayList)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/*     */     try
/*     */     {
/* 376 */       Thread.sleep(1000L);
/*     */     }
/*     */     catch (InterruptedException e) {
/* 379 */       e.printStackTrace();
/*     */     }
/*     */ 
///* 382 */     for (int j = 12; j < 40000; j++)
///* 383 */       this.val$arrayList.addIfAbsent(Integer.valueOf(j));
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.9
 * JD-Core Version:    0.6.2
 */