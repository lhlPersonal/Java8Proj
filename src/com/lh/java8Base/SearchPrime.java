/*    */ package com.lh.java8Base;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.time.Clock;
/*    */ import java.time.Instant;
/*    */ import java.util.BitSet;
/*    */ import java.util.LinkedList;
/*    */ 
/*    */ public class SearchPrime
/*    */ {
/* 10 */   static boolean isPrime = true;
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 14 */     searchPrime();
/*    */   }
/*    */ 
/*    */   public static void searchPrime()
/*    */   {
/* 19 */     LinkedList list = new LinkedList();
/*    */ 
/* 21 */     Instant clock1 = Clock.systemDefaultZone().instant();
/*    */ 
/* 39 */     int num = 1000;
/*    */ 
/* 41 */     BitSet set = new BitSet();
/*    */ 
/* 43 */     for (int k = 2; k <= num; k++)
/*    */     {
/* 45 */       set.set(k);
/*    */     }
/*    */ 
/* 49 */     for (int j = 0; j <= num; j++) {
/* 50 */       if (!set.get(j))
/*    */       {
/* 53 */         set.clear(j + 100);
/* 54 */         System.out.println("index:" + j);
/*    */       }
/*    */     }
/*    */ 
/* 58 */     Instant clock2 = Clock.systemDefaultZone().instant();
/*    */ 
/* 60 */     long time = clock2.toEpochMilli() - clock1.toEpochMilli();
/*    */   }
/*    */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.SearchPrime
 * JD-Core Version:    0.6.2
 */