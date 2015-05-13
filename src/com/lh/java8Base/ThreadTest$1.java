/*    */ package com.lh.java8Base;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.time.Clock;
/*    */ import java.time.Instant;
/*    */ 
/*    */ class ThreadTest$1
/*    */   implements Runnable
/*    */ {
/*    */   public void run()
/*    */   {
/* 89 */     Instant t = Clock.systemDefaultZone().instant();
/*    */ 
/* 91 */     while (Clock.systemDefaultZone().instant().toEpochMilli() - 
/* 92 */       t.toEpochMilli() < 100L) {
/* 93 */       if (Thread.currentThread().isInterrupted()) {
/* 94 */         System.out.print("interrupted thread name:" + 
/* 95 */           Thread.currentThread().getName());
/* 96 */         return;
/*    */       }
/* 98 */       System.out.println("curr thread name:" + 
/* 99 */         Thread.currentThread().getName());
/*    */ 
/* 102 */       Thread.currentThread().interrupt();
/*    */       try
/*    */       {
/* 105 */         Thread.sleep(1000L);
/*    */       }
/*    */       catch (InterruptedException e) {
/* 108 */         System.out.println("interrupted thread exception:" + 
/* 109 */           Thread.currentThread().getName());
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.ThreadTest.1
 * JD-Core Version:    0.6.2
 */