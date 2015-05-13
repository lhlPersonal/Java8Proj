/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.util.concurrent.CopyOnWriteArrayList;
/*     */ 
/*     */ class ThreadTest$6
/*     */   implements Runnable
/*     */ {
/*     */   ThreadTest$6(CopyOnWriteArrayList paramCopyOnWriteArrayList)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/*     */     try
/*     */     {
/* 325 */       Thread.sleep(1000L);
/*     */     }
/*     */     catch (InterruptedException e) {
/* 328 */       e.printStackTrace();
/*     */     }
/*     */ 
/* 331 */     for (int j = 0; j < 10000; j++)
/* 332 */       this.val$arrayList.addIfAbsent(Integer.valueOf(j));
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.6
 * JD-Core Version:    0.6.2
 */