/*     */ package com.lh.java8Base;
/*     */ 
/*     */ import java.util.logging.Formatter;
/*     */ 
/*     */ class MyFormatter extends Formatter
/*     */ {
/* 750 */   private final String lineSeparator = System.getProperty("line.separator");
/*     */ 
/*     */   // ERROR //
/*     */   public String format(java.util.logging.LogRecord record)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: new 28	java/lang/StringBuffer
/*     */     //   3: dup
/*     */     //   4: invokespecial 30	java/lang/StringBuffer:<init>	()V
/*     */     //   7: astore_2
/*     */     //   8: aload_0
/*     */     //   9: aload_1
/*     */     //   10: invokevirtual 31	com/lh/java8Base/MyFormatter:formatMessage	(Ljava/util/logging/LogRecord;)Ljava/lang/String;
/*     */     //   13: astore_3
/*     */     //   14: aload_2
/*     */     //   15: ldc 34
/*     */     //   17: iconst_3
/*     */     //   18: anewarray 36	java/lang/Object
/*     */     //   21: dup
/*     */     //   22: iconst_0
/*     */     //   23: invokestatic 38	java/time/LocalDateTime:now	()Ljava/time/LocalDateTime;
/*     */     //   26: ldc 44
/*     */     //   28: invokestatic 46	java/time/format/DateTimeFormatter:ofPattern	(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
/*     */     //   31: invokevirtual 52	java/time/LocalDateTime:format	(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
/*     */     //   34: aastore
/*     */     //   35: dup
/*     */     //   36: iconst_1
/*     */     //   37: aload_3
/*     */     //   38: aastore
/*     */     //   39: dup
/*     */     //   40: iconst_2
/*     */     //   41: aload_0
/*     */     //   42: getfield 20	com/lh/java8Base/MyFormatter:lineSeparator	Ljava/lang/String;
/*     */     //   45: aastore
/*     */     //   46: invokestatic 55	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   49: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   52: pop
/*     */     //   53: aload_1
/*     */     //   54: invokevirtual 64	java/util/logging/LogRecord:getThrown	()Ljava/lang/Throwable;
/*     */     //   57: ifnull +168 -> 225
/*     */     //   60: aconst_null
/*     */     //   61: astore 4
/*     */     //   63: aconst_null
/*     */     //   64: astore 5
/*     */     //   66: new 70	java/io/StringWriter
/*     */     //   69: dup
/*     */     //   70: invokespecial 72	java/io/StringWriter:<init>	()V
/*     */     //   73: astore 6
/*     */     //   75: new 73	java/io/PrintWriter
/*     */     //   78: dup
/*     */     //   79: aload 6
/*     */     //   81: invokespecial 75	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
/*     */     //   84: astore 7
/*     */     //   86: aload_1
/*     */     //   87: invokevirtual 64	java/util/logging/LogRecord:getThrown	()Ljava/lang/Throwable;
/*     */     //   90: aload 7
/*     */     //   92: invokevirtual 78	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
/*     */     //   95: aload_2
/*     */     //   96: aload 6
/*     */     //   98: invokevirtual 84	java/io/StringWriter:toString	()Ljava/lang/String;
/*     */     //   101: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   104: pop
/*     */     //   105: aload 7
/*     */     //   107: ifnull +26 -> 133
/*     */     //   110: aload 7
/*     */     //   112: invokevirtual 88	java/io/PrintWriter:close	()V
/*     */     //   115: goto +18 -> 133
/*     */     //   118: astore 4
/*     */     //   120: aload 7
/*     */     //   122: ifnull +8 -> 130
/*     */     //   125: aload 7
/*     */     //   127: invokevirtual 88	java/io/PrintWriter:close	()V
/*     */     //   130: aload 4
/*     */     //   132: athrow
/*     */     //   133: aload 6
/*     */     //   135: ifnull +90 -> 225
/*     */     //   138: aload 6
/*     */     //   140: invokevirtual 91	java/io/StringWriter:close	()V
/*     */     //   143: goto +82 -> 225
/*     */     //   146: astore 5
/*     */     //   148: aload 4
/*     */     //   150: ifnonnull +10 -> 160
/*     */     //   153: aload 5
/*     */     //   155: astore 4
/*     */     //   157: goto +17 -> 174
/*     */     //   160: aload 4
/*     */     //   162: aload 5
/*     */     //   164: if_acmpeq +10 -> 174
/*     */     //   167: aload 4
/*     */     //   169: aload 5
/*     */     //   171: invokevirtual 92	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
/*     */     //   174: aload 6
/*     */     //   176: ifnull +8 -> 184
/*     */     //   179: aload 6
/*     */     //   181: invokevirtual 91	java/io/StringWriter:close	()V
/*     */     //   184: aload 4
/*     */     //   186: athrow
/*     */     //   187: astore 5
/*     */     //   189: aload 4
/*     */     //   191: ifnonnull +10 -> 201
/*     */     //   194: aload 5
/*     */     //   196: astore 4
/*     */     //   198: goto +17 -> 215
/*     */     //   201: aload 4
/*     */     //   203: aload 5
/*     */     //   205: if_acmpeq +10 -> 215
/*     */     //   208: aload 4
/*     */     //   210: aload 5
/*     */     //   212: invokevirtual 92	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
/*     */     //   215: aload 4
/*     */     //   217: athrow
/*     */     //   218: astore 4
/*     */     //   220: aload 4
/*     */     //   222: invokevirtual 96	java/io/IOException:printStackTrace	()V
/*     */     //   225: aload_2
/*     */     //   226: invokevirtual 100	java/lang/StringBuffer:toString	()Ljava/lang/String;
/*     */     //   229: areturn
/*     */     //
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   86	105	118	finally
/*     */     //   75	133	146	finally
/*     */     //   66	187	187	finally
/*     */     //   60	218	218	java/io/IOException
/*     */   }
/*     */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.MyFormatter
 * JD-Core Version:    0.6.2
 */