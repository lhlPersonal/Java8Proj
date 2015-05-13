/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.PrintStream;
/*     */ import java.text.MessageFormat;
/*     */ import java.time.LocalDateTime;
/*     */ import java.time.format.DateTimeFormatter;
/*     */ 
/*     */ public class TalkingClock$TimePrinter
/*     */   implements ActionListener
/*     */ {
/*     */   public TalkingClock$TimePrinter(TalkingClock paramTalkingClock)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 171 */     LocalDateTime time = LocalDateTime.now();
/* 172 */     System.out.println(MessageFormat.format(
/* 173 */       "At the tone,the time is {0}", new Object[] { time
/* 174 */       .format(
/* 175 */       DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) }));
/*     */ 
/* 178 */     if (TalkingClock.access$0(this.this$0))
/* 179 */       Toolkit.getDefaultToolkit().beep();
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.TalkingClock.TimePrinter
 * JD-Core Version:    0.6.2
 */