/*    */ package com.lh.java8Base;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.PrintStream;
/*    */ import java.text.DecimalFormat;
/*    */ import java.text.NumberFormat;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Calendar;
/*    */ 
/*    */ public class Test2
/*    */ {
/*    */   private static final String LL = "Decompiling this copyrighted software is a violation of both your license agreement and the Digital Millenium Copyright Act of 1998 (http://www.loc.gov/copyright/legislation/dmca.pdf). Under section 1204 of the DMCA, penalties range up to a $500,000 fine or up to five years imprisonment for a first offense. Think about it; pay for a license, avoid prosecution, and feel better about yourself.";
/*    */ 
/*    */   public String getSerial(String userId, String licenseNum)
/*    */   {
/* 11 */     Calendar cal = Calendar.getInstance();
/* 12 */     cal.add(1, 3);
/* 13 */     cal.add(6, -1);
/* 14 */     NumberFormat nf = new DecimalFormat("000");
/* 15 */     licenseNum = nf.format(Integer.valueOf(licenseNum));
/* 16 */     String verTime = "-" + 
/* 17 */       new SimpleDateFormat("yyMMdd").format(cal
/* 18 */       .getTime()) + "0";
/* 19 */     String type = "YE3MP-";
/* 20 */     String need = userId.substring(0, 1) + type + 
/* 21 */       "300" + licenseNum + verTime;
/* 22 */     String dx = need + "Decompiling this copyrighted software is a violation of both your license agreement and the Digital Millenium Copyright Act of 1998 (http://www.loc.gov/copyright/legislation/dmca.pdf). Under section 1204 of the DMCA, penalties range up to a $500,000 fine or up to five years imprisonment for a first offense. Think about it; pay for a license, avoid prosecution, and feel better about yourself." + userId;
/*    */ 
/* 24 */     int suf = decode(dx);
/* 25 */     String code = need + String.valueOf(suf);
/*    */ 
/* 27 */     return change(code);
/*    */   }
/*    */ 
/*    */   private int decode(String s)
/*    */   {
/* 36 */     int i = 0;
/* 37 */     char[] ac = s.toCharArray();
/* 38 */     int j = 0;
/* 39 */     int k = ac.length;
/* 40 */     while (j < k) {
/* 41 */       i = 31 * i + ac[j];
/* 42 */       j++;
/*    */     }
/* 44 */     return Math.abs(i);
/*    */   }
/*    */ 
/*    */   private String change(String s)
/*    */   {
/* 53 */     byte[] abyte0 = s.getBytes();
/* 54 */     char[] ac = new char[s.length()];
/* 55 */     int i = 0;
/* 56 */     int k = abyte0.length;
/* 57 */     while (i < k) {
/* 58 */       int j = abyte0[i];
/* 59 */       if ((j >= 48) && (j <= 57))
/* 60 */         j = (j - 48 + 5) % 10 + 48;
/* 61 */       else if ((j >= 65) && (j <= 90))
/* 62 */         j = (j - 65 + 13) % 26 + 65;
/* 63 */       else if ((j >= 97) && (j <= 122)) {
/* 64 */         j = (j - 97 + 13) % 26 + 97;
/*    */       }
/* 66 */       ac[i] = ((char)j);
/* 67 */       i++;
/*    */     }
/* 69 */     return String.valueOf(ac);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/*    */     try
/*    */     {
/* 78 */       System.out.println("please input register name:");
/* 79 */       BufferedReader reader = new BufferedReader(new InputStreamReader(
/* 80 */         System.in));
/* 81 */       String userId = null;
/* 82 */       userId = reader.readLine();
/* 83 */       Test2 Test2 = new Test2();
/* 84 */       String res = Test2.getSerial(userId, "5");
/* 85 */       System.out.println("Serial:" + res);
/* 86 */       reader.readLine();
/*    */     }
/*    */     catch (IOException localIOException)
/*    */     {
/*    */     }
/*    */   }
/*    */ }

/* Location:           E:\Java\Java8Proj\WebRoot\WEB-INF\classes\
 * Qualified Name:     com.lh.java8Base.Test2
 * JD-Core Version:    0.6.2
 */