/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.logging.Formatter;
/*     */ import java.util.logging.Handler;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.LogRecord;
/*     */ 
/*     */ class MyHandler extends Handler
/*     */ {
/* 702 */   private boolean doneHeader = false;
/*     */ 
/*     */   public MyHandler() {
/* 705 */     setLevel(Level.INFO);
/* 706 */     setFilter(null);
/* 707 */     setFormatter(new MyFormatter());
/*     */   }
/*     */ 
/*     */   public void close() throws SecurityException
/*     */   {
/* 712 */     if (!this.doneHeader) {
/* 713 */       output(getFormatter().getHead(this));
/* 714 */       this.doneHeader = true;
/*     */     }
/* 716 */     output(getFormatter().getTail(this));
/* 717 */     flush();
/*     */   }
/*     */ 
/*     */   public void flush()
/*     */   {
/*     */   }
/*     */ 
/*     */   public void publish(LogRecord record)
/*     */   {
/* 727 */     if (!isLoggable(record)) {
/* 728 */       return;
/*     */     }
/* 730 */     String msg = getFormatter().format(record);
/*     */     try
/*     */     {
/* 733 */       if (!this.doneHeader) {
/* 734 */         output(getFormatter().getHead(this));
/* 735 */         this.doneHeader = true;
/*     */       }
/* 737 */       output(msg);
/*     */     } catch (Exception ex) {
/* 739 */       reportError(null, ex, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void output(String message)
/*     */   {
/* 745 */     System.out.println(message);
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.MyHandler
 * JD-Core Version:    0.6.2
 */