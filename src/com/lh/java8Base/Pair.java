/*     */ package com.lh.java8Base;
/*     */ 
/*     */ class Pair<T>
/*     */ {
/*     */   private T first;
/*     */   private T second;
/*     */ 
/*     */   public Pair()
/*     */   {
/*  93 */     this.first = null;
/*  94 */     this.second = null;
/*     */   }
/*     */ 
/*     */   public Pair(T first, T second) {
/*  98 */     this.first = first;
/*  99 */     this.second = second;
/*     */   }
/*     */ 
/*     */   public T getFirst() {
/* 103 */     return this.first;
/*     */   }
/*     */ 
/*     */   public void setFirst(T first) {
/* 107 */     this.first = first;
/*     */   }
/*     */ 
/*     */   public T getSecond() {
/* 111 */     return this.second;
/*     */   }
/*     */ 
/*     */   public void setSecond(T second) {
/* 115 */     this.second = second;
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.Pair
 * JD-Core Version:    0.6.2
 */