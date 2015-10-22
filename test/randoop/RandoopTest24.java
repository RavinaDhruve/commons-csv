package randoop;

import junit.framework.*;

public class RandoopTest24 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test1");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = var6.withNullString("");
    java.lang.String var10 = var9.toString();
    org.apache.commons.csv.CSVFormat var11 = var9.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var13 = var9.withEscape(' ');
    org.apache.commons.csv.CSVFormat var15 = var9.withDelimiter('a');
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator("Delimiter=<#> Escape=< > RecordSeparator=<4> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var19 = var15.withIgnoreSurroundingSpaces(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '4'+ "'", var7.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var10.equals("Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test2");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var14 = var12.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var16 = var14.withQuote('a');
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var19 = var18.getHeader();
    boolean var20 = var18.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var22.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var24 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var25 = var22.withHeaderComments((java.lang.Object[])var24);
    org.apache.commons.csv.CSVFormat var26 = var18.withHeaderComments((java.lang.Object[])var24);
    java.lang.String var27 = var14.format((java.lang.Object[])var24);
    org.apache.commons.csv.CSVFormat var29 = var14.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var31 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var32 = var31.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var34 = var32.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var36 = var34.withQuote((java.lang.Character)'4');
    java.lang.String[] var37 = var34.getHeaderComments();
    org.apache.commons.csv.CSVFormat var39 = var34.withEscape((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var41 = var39.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var43.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var46 = var44.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var48 = var46.withEscape(' ');
    boolean var49 = var46.getIgnoreSurroundingSpaces();
    boolean var50 = var46.isEscapeCharacterSet();
    java.lang.String var51 = var46.getNullString();
    org.apache.commons.csv.CSVFormat var53 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var54 = var53.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var56 = var54.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var58 = var56.withEscape(' ');
    org.apache.commons.csv.CSVFormat var60 = var56.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var61 = var56.getQuoteMode();
    org.apache.commons.csv.CSVFormat var63 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var64 = var63.getHeader();
    boolean var65 = var63.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var67 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var68 = var67.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var69 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var70 = var67.withHeaderComments((java.lang.Object[])var69);
    org.apache.commons.csv.CSVFormat var71 = var63.withHeaderComments((java.lang.Object[])var69);
    java.lang.String var72 = var56.format((java.lang.Object[])var69);
    java.lang.String var73 = var46.format((java.lang.Object[])var69);
    org.apache.commons.csv.CSVFormat var74 = var41.withHeaderComments((java.lang.Object[])var69);
    java.lang.String var75 = var14.format((java.lang.Object[])var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONE4"+ "'", var27.equals("ALL#MINIMAL#NON_NUMERIC#NONE4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var72.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var73.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONE4"+ "'", var75.equals("ALL#MINIMAL#NON_NUMERIC#NONE4"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test3");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.String var10 = var4.toString();
    boolean var11 = var4.getIgnoreHeaderCase();
    boolean var12 = var4.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var14 = var4.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var16 = var4.withIgnoreSurroundingSpaces(false);
    boolean var17 = var4.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var18.withSkipHeaderRecord();
    java.lang.String[] var20 = var18.getHeaderComments();
    org.apache.commons.csv.CSVFormat var22 = var18.withAllowMissingColumnNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var10.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test4");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    boolean var4 = var2.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var6 = var2.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.QuoteMode var7 = var2.getQuoteMode();
    org.apache.commons.csv.CSVFormat var8 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse(" ", var8);
    long var12 = var11.getCurrentLineNumber();
    java.util.Spliterator var13 = var11.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test5");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    boolean var12 = var10.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var14 = var10.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var16 = var10.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var20 = var18.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var21 = var18.getHeaderComments();
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var24 = var23.withIgnoreEmptyLines();
    java.lang.String var25 = var23.toString();
    java.lang.Object[] var26 = new java.lang.Object[] { var23};
    java.lang.String var27 = var18.format(var26);
    org.apache.commons.csv.CSVFormat var28 = var16.withHeaderComments(var26);
    org.apache.commons.csv.CSVFormat var29 = var4.withHeaderComments(var26);
    org.apache.commons.csv.CSVFormat var31 = var4.withRecordSeparator("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var32 = var4.withAllowMissingColumnNames();
    java.lang.String var33 = var32.getRecordSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var25.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var27.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "a"+ "'", var33.equals("a"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test6");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var5 = var2.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var2.withRecordSeparator("a");
    org.apache.commons.csv.CSVFormat var9 = var7.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var11 = var9.withIgnoreSurroundingSpaces(true);
    boolean var12 = var11.isEscapeCharacterSet();
    boolean var13 = var11.getAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<#> CommentStart=<4> NullString=<Delimiter=<#> SkipHeaderRecord:true> SkipHeaderRecord:false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test8");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var4.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator("");
    boolean var14 = var11.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var15 = var11.withSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test9");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withEscape('a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false", var5);
    java.util.Map var7 = var6.getHeaderMap();
    java.util.List var8 = var6.getRecords();
    java.util.Spliterator var9 = var6.spliterator();
    boolean var10 = var6.isClosed();
    java.util.List var11 = var6.getRecords();
    long var12 = var6.getRecordNumber();
    java.util.Map var13 = var6.getHeaderMap();
    java.util.Spliterator var14 = var6.spliterator();
    long var15 = var6.getRecordNumber();
    long var16 = var6.getCurrentLineNumber();
    long var17 = var6.getRecordNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1L);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test10");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    boolean var12 = var10.equals((java.lang.Object)(-1.0f));
    org.apache.commons.csv.CSVFormat var14 = var10.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var16 = var14.withEscape('a');
    java.lang.String[] var17 = var14.getHeader();
    org.apache.commons.csv.CSVFormat var19 = var14.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var21 = var14.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var23 = var14.withQuote('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test11");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var8 = var1.withNullString("Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true");
    boolean var9 = var8.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var11 = var8.withAllowMissingColumnNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test12");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var11 = var9.withEscape(' ');
    java.lang.String[] var13 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var14 = var9.withHeader(var13);
    org.apache.commons.csv.CSVFormat var15 = var2.withHeader(var13);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var18 = var17.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var20 = var18.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var22.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var25 = var23.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var27 = var25.withEscape(' ');
    java.lang.String[] var29 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var30 = var25.withHeader(var29);
    org.apache.commons.csv.CSVFormat var31 = var18.withHeader(var29);
    org.apache.commons.csv.CSVFormat var32 = var2.withHeader(var29);
    org.apache.commons.csv.CSVFormat var34 = var32.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.QuoteMode var35 = var34.getQuoteMode();
    org.apache.commons.csv.CSVFormat var37 = var34.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var39 = var34.withEscape(' ');
    org.apache.commons.csv.CSVFormat var41 = var34.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var43 = var41.withQuote((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var45 = var41.withQuote('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test13");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    java.lang.Character var8 = var7.getQuoteCharacter();
    boolean var9 = var7.getSkipHeaderRecord();
    boolean var11 = var7.equals((java.lang.Object)(byte)(-1));
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var7);
    java.util.Iterator var13 = var12.iterator();
    var12.close();
    long var15 = var12.getCurrentLineNumber();
    java.util.Iterator var16 = var12.iterator();
    java.util.Iterator var17 = var12.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '4'+ "'", var8.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test14");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    org.apache.commons.csv.CSVFormat var3 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var4 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withSkipHeaderRecord();
    boolean var8 = var6.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var6.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var14 = var13.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var16 = var14.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var18 = var16.withEscape(' ');
    java.lang.String[] var20 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var21 = var16.withHeader(var20);
    java.lang.Character var22 = var16.getCommentMarker();
    org.apache.commons.csv.CSVFormat var23 = var16.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var24 = org.apache.commons.csv.CSVParser.parse("", var16);
    java.util.Spliterator var25 = var24.spliterator();
    java.util.Map var26 = var24.getHeaderMap();
    java.util.Spliterator var27 = var24.spliterator();
    boolean var28 = var10.equals((java.lang.Object)var24);
    long var29 = var24.getRecordNumber();
    java.util.Iterator var30 = var24.iterator();
    long var31 = var24.getRecordNumber();
    boolean var32 = var4.equals((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test15");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces();
    java.lang.String var6 = var5.getRecordSeparator();
    boolean var7 = var5.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var11 = var9.withNullString("ALL#MINIMAL#NON_NUMERIC#NONE");
    boolean var12 = var11.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var14 = var11.withNullString("4Delimiter=<#> SkipHeaderRecord:true4");
    boolean var15 = var14.isNullStringSet();
    org.apache.commons.csv.CSVFormat var17 = var14.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var18 = var14.withIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test16");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.String var10 = var4.toString();
    boolean var11 = var4.getIgnoreHeaderCase();
    boolean var12 = var4.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var14 = var4.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var16 = var4.withIgnoreSurroundingSpaces(false);
    java.lang.String[] var17 = var16.getHeader();
    org.apache.commons.csv.CSVFormat var18 = var16.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var20 = var16.withCommentMarker((java.lang.Character)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var10.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test17");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var4.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var10 = var9.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var12 = var9.withAllowMissingColumnNames(true);
    boolean var13 = var9.isNullStringSet();
    org.apache.commons.csv.CSVFormat var14 = var9.withAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test18");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withEscape('a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false", var5);
    org.apache.commons.csv.CSVFormat var8 = var5.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var10 = var8.withRecordSeparator(' ');
    org.apache.commons.csv.CSVFormat var12 = var10.withQuote('4');
    boolean var13 = var10.isNullStringSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test19");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    boolean var13 = var10.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var15 = var10.withEscape(' ');
    org.apache.commons.csv.CSVFormat var17 = var10.withRecordSeparator(' ');
    org.apache.commons.csv.CSVFormat var19 = var10.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var21 = var19.withNullString("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var23 = var21.withNullString("Delimiter=<#>  RecordSeparator=<a>  SkipHeaderRecord:true Delimiter=< #>  SkipHeaderRecord:truea");
    java.lang.Character var24 = var23.getQuoteCharacter();
    boolean var25 = var23.isCommentMarkerSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test20");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker('a');
    boolean var6 = var5.getIgnoreEmptyLines();
    boolean var7 = var5.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var9 = var5.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var11 = var9.withCommentMarker('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test21");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var15 = var13.withQuote((java.lang.Character)'4');
    java.lang.Character var16 = var15.getQuoteCharacter();
    boolean var17 = var15.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var15.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var21.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var24 = var22.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var26 = var24.withEscape(' ');
    java.lang.String[] var28 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var29 = var24.withHeader(var28);
    boolean var30 = var29.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var32 = var29.withSkipHeaderRecord(true);
    java.lang.String[] var33 = var32.getHeader();
    org.apache.commons.csv.CSVFormat var34 = var15.withHeader(var33);
    org.apache.commons.csv.CSVFormat var35 = var4.withHeaderComments((java.lang.Object[])var33);
    java.lang.Character var36 = var35.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var38 = var35.withRecordSeparator("Delimiter=<#> CommentStart=<4> NullString=<Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true> EmptyLines:ignored SkipHeaderRecord:false");
    java.lang.String[] var39 = var35.getHeader();
    org.apache.commons.csv.QuoteMode var40 = var35.getQuoteMode();
    java.lang.Character var41 = var35.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var43 = var35.withDelimiter(' ');
    boolean var44 = var43.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.QuoteMode var45 = var43.getQuoteMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '4'+ "'", var16.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test22");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var6 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var10 = var8.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var11 = var10.getQuoteMode();
    java.lang.Character var12 = var10.getCommentMarker();
    java.lang.Object[] var13 = new java.lang.Object[] { var10};
    java.lang.String var14 = var6.format(var13);
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var21 = var19.withEscape(' ');
    java.lang.String[] var23 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var24 = var19.withHeader(var23);
    org.apache.commons.csv.CSVFormat var26 = var19.withCommentMarker((java.lang.Character)'4');
    boolean var27 = var6.equals((java.lang.Object)var19);
    org.apache.commons.csv.CSVFormat var29 = var6.withDelimiter('a');
    org.apache.commons.csv.CSVFormat var31 = var6.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:truea");
    org.apache.commons.csv.CSVFormat var33 = var31.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var35 = var33.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var36 = var35.withAllowMissingColumnNames();
    boolean var37 = var36.getIgnoreEmptyLines();
    java.lang.String[] var38 = var36.getHeader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '4'+ "'", var12.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var14.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test23");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var9.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var13 = var9.withEscape(' ');
    boolean var14 = var13.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var16 = var13.withQuote((java.lang.Character)'4');
    java.lang.Character var17 = var16.getCommentMarker();
    java.lang.Character var18 = var16.getCommentMarker();
    org.apache.commons.csv.CSVFormat var20 = var16.withQuote(' ');
    org.apache.commons.csv.CSVFormat var22 = var20.withRecordSeparator("aDelimiter=<#> SkipHeaaderRecord:trueaDelimiter=<#> Escape=<a> RecordSeparator=<a> SkipHeaderRecord:true");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest24.test24");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    boolean var9 = var8.isNullStringSet();
    org.apache.commons.csv.CSVFormat.Predefined[] var10 = org.apache.commons.csv.CSVFormat.Predefined.values();
    boolean var11 = var8.equals((java.lang.Object)var10);
    org.apache.commons.csv.CSVFormat var13 = var8.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var15 = var13.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var19 = var17.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var20 = var19.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var22 = var20.withDelimiter('#');
    java.lang.String var23 = var22.toString();
    org.apache.commons.csv.CSVFormat var25 = var22.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var28 = var27.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var30 = var28.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var33 = var32.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var35 = var33.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var37 = var35.withEscape(' ');
    java.lang.String[] var39 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var40 = var35.withHeader(var39);
    org.apache.commons.csv.CSVFormat var41 = var28.withHeader(var39);
    java.lang.String var42 = var22.format((java.lang.Object[])var39);
    java.lang.String var43 = var13.format((java.lang.Object[])var39);
    org.apache.commons.csv.CSVFormat var44 = var13.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var46 = var44.withQuote(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var23.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var42.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var43.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

}
