package randoop;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test1");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String[] var5 = var2.getHeaderComments();
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var8 = var7.withSkipHeaderRecord();
    boolean var9 = var7.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var11 = var7.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var13 = var7.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var15.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var18 = var15.getHeaderComments();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var21 = var20.withIgnoreEmptyLines();
    java.lang.String var22 = var20.toString();
    java.lang.Object[] var23 = new java.lang.Object[] { var20};
    java.lang.String var24 = var15.format(var23);
    org.apache.commons.csv.CSVFormat var25 = var13.withHeaderComments(var23);
    org.apache.commons.csv.CSVFormat var26 = var2.withHeaderComments(var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var28 = var2.withCommentMarker('#');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var22.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var24.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test2");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    java.lang.String var6 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var7 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = var7.withAllowMissingColumnNames();
    boolean var9 = var7.getSkipHeaderRecord();
    
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test3");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces();
    java.lang.String var6 = var5.getRecordSeparator();
    boolean var7 = var5.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreEmptyLines(false);
    java.lang.Character var12 = var5.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var14 = var5.withRecordSeparator('4');
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test4");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var5 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var6 = var5.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withRecordSeparator('a');
    java.lang.Object[] var9 = new java.lang.Object[] { var6};
    org.apache.commons.csv.CSVFormat var10 = var1.withHeaderComments(var9);
    org.apache.commons.csv.CSVFormat var12 = var1.withSkipHeaderRecord(false);
    boolean var13 = var12.isQuoteCharacterSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test5");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    java.lang.String var9 = var4.getNullString();
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var12 = var11.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var14 = var12.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var16 = var14.withEscape(' ');
    org.apache.commons.csv.CSVFormat var18 = var14.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var19 = var14.getQuoteMode();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var22 = var21.getHeader();
    boolean var23 = var21.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var27 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var28 = var25.withHeaderComments((java.lang.Object[])var27);
    org.apache.commons.csv.CSVFormat var29 = var21.withHeaderComments((java.lang.Object[])var27);
    java.lang.String var30 = var14.format((java.lang.Object[])var27);
    java.lang.String var31 = var4.format((java.lang.Object[])var27);
    org.apache.commons.csv.QuoteMode var32 = var4.getQuoteMode();
    boolean var33 = var4.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var35 = var4.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var36 = var35.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var38 = var35.withAllowMissingColumnNames(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var40 = var35.withCommentMarker((java.lang.Character)'4');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var30.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var31.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test6");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var5 = var2.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var2.withRecordSeparator("a");
    java.lang.Character var8 = var2.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var10 = var2.withRecordSeparator("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    java.lang.Character var11 = var2.getEscapeCharacter();
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test7");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    org.apache.commons.csv.QuoteMode var13 = var12.getQuoteMode();
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var16 = var15.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var18 = var16.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var20 = var18.withQuote((java.lang.Character)'4');
    java.lang.Character var21 = var20.getQuoteCharacter();
    boolean var22 = var20.getSkipHeaderRecord();
    java.lang.Character var23 = var20.getEscapeCharacter();
    char var24 = var20.getDelimiter();
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var27 = var26.getHeader();
    boolean var28 = var26.isCommentMarkerSet();
    boolean var29 = var26.getIgnoreSurroundingSpaces();
    boolean var30 = var26.isNullStringSet();
    org.apache.commons.csv.CSVFormat var32 = var26.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var33 = var26.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var35 = var26.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var37 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var38 = var37.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var39 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var40 = var37.withHeaderComments((java.lang.Object[])var39);
    boolean var41 = var26.equals((java.lang.Object)var40);
    java.lang.String[] var42 = var26.getHeader();
    org.apache.commons.csv.CSVFormat var43 = var26.withAllowMissingColumnNames();
    boolean var44 = var43.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var46 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var47 = var46.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var49 = var47.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var51 = var49.withEscape(' ');
    java.lang.String[] var53 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var54 = var49.withHeader(var53);
    org.apache.commons.csv.CSVFormat var55 = var43.withHeader(var53);
    org.apache.commons.csv.CSVFormat var56 = var20.withHeader(var53);
    boolean var57 = var12.equals((java.lang.Object)var20);
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '4'+ "'", var21.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test8");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    java.lang.String var11 = var5.toString();
    boolean var12 = var5.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var14 = var5.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var16 = var14.withCommentMarker('a');
    org.apache.commons.csv.CSVParser var17 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false HeaderComments:[ALL, MINIMAL, NON_NUMERIC, NONE]", var14);
    java.util.Spliterator var18 = var17.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var11.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test9");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    boolean var12 = var10.equals((java.lang.Object)(-1.0f));
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreSurroundingSpaces();
    java.lang.String var14 = var13.getNullString();
    org.apache.commons.csv.CSVFormat var16 = var13.withDelimiter('a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var18 = var13.withQuote((java.lang.Character)'#');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test10");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var1.withRecordSeparator('#');
    char var11 = var10.getDelimiter();
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreSurroundingSpaces();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test11");


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
    org.apache.commons.csv.CSVFormat var17 = var2.withRecordSeparator("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var20 = var17.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var22 = var20.withNullString("ALL#MINIMAL#NON_NUMERIC#NONEa");
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test12");


    org.apache.commons.csv.CSVFormat var3 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var8 = var6.withEscape(' ');
    java.lang.String[] var10 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var11 = var6.withHeader(var10);
    org.apache.commons.csv.CSVFormat var13 = var11.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true", var11);
    org.apache.commons.csv.CSVParser var15 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:true", var11);
    long var16 = var15.getRecordNumber();
    java.util.List var17 = var15.getRecords();
    long var18 = var15.getCurrentLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test13");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var13 = var9.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var15 = var13.withIgnoreEmptyLines(false);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test14");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var4.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var10 = var9.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var12 = var10.withEscape((java.lang.Character)'4');
    boolean var13 = var12.getSkipHeaderRecord();
    
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
    assertTrue(var13 == true);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test15");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var5 = var2.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var2.withRecordSeparator("a");
    java.lang.Character var8 = var2.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var10 = var2.withEscape((java.lang.Character)' ');
    char var11 = var10.getDelimiter();
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '#');

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test16");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var13 = var11.withEscape(' ');
    java.lang.String[] var15 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var16 = var11.withHeader(var15);
    java.lang.Character var17 = var11.getCommentMarker();
    org.apache.commons.csv.CSVFormat var18 = var11.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var19 = org.apache.commons.csv.CSVParser.parse("", var11);
    java.util.Spliterator var20 = var19.spliterator();
    java.util.Map var21 = var19.getHeaderMap();
    java.util.Spliterator var22 = var19.spliterator();
    boolean var23 = var5.equals((java.lang.Object)var19);
    java.util.Spliterator var24 = var19.spliterator();
    java.util.Spliterator var25 = var19.spliterator();
    java.util.List var26 = var19.getRecords();
    var19.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test17");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    java.lang.String[] var11 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var15 = var13.withNullString("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var17 = var15.withCommentMarker(' ');
    boolean var18 = var15.getIgnoreSurroundingSpaces();
    java.lang.Character var19 = var15.getCommentMarker();
    org.apache.commons.csv.QuoteMode var20 = var15.getQuoteMode();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test18");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    boolean var12 = var10.equals((java.lang.Object)(-1.0f));
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreSurroundingSpaces();
    java.lang.Character var14 = var13.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var16 = var13.withRecordSeparator("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false");
    boolean var17 = var16.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.QuoteMode var18 = var16.getQuoteMode();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test19");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var5 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var7 = var5.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withNullString("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var11 = var9.withEscape('a');
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:false HeaderComments:[ALL, MINIMAL, NON_NUMERIC, NONE]", var9);
    
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
    assertNotNull(var12);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test20");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var2.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var2.withRecordSeparator('4');
    boolean var9 = var8.getIgnoreHeaderCase();
    
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
    assertTrue(var9 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test21");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withQuote(' ');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var2);
    java.util.List var7 = var6.getRecords();
    long var8 = var6.getCurrentLineNumber();
    var6.close();
    java.util.Iterator var10 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test22");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    java.lang.Character var8 = var7.getQuoteCharacter();
    boolean var9 = var7.getSkipHeaderRecord();
    boolean var11 = var7.equals((java.lang.Object)(byte)(-1));
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var7);
    boolean var13 = var12.isClosed();
    long var14 = var12.getCurrentLineNumber();
    java.util.List var15 = var12.getRecords();
    long var16 = var12.getRecordNumber();
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1L);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test23");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    org.apache.commons.csv.CSVFormat var3 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var5 = var1.withAllowMissingColumnNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test24");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator('a');
    java.lang.Character var14 = var11.getCommentMarker();
    java.lang.Character var15 = var11.getCommentMarker();
    char var16 = var11.getDelimiter();
    java.lang.String var17 = var11.getNullString();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test25");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var4.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var9 = var4.withAllowMissingColumnNames();
    boolean var10 = var9.getSkipHeaderRecord();
    char var11 = var9.getDelimiter();
    org.apache.commons.csv.CSVFormat var12 = var9.withSkipHeaderRecord();
    
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
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test26");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var8.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var12 = var8.withEscape((java.lang.Character)' ');
    boolean var13 = var12.getSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
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

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test27");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    boolean var5 = var4.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var6 = var4.withSkipHeaderRecord();
    boolean var7 = var4.isEscapeCharacterSet();
    char var8 = var4.getDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '#');

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test28");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    java.lang.Character var11 = var5.getCommentMarker();
    org.apache.commons.csv.CSVFormat var12 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("", var5);
    java.util.Spliterator var14 = var13.spliterator();
    java.util.Map var15 = var13.getHeaderMap();
    long var16 = var13.getRecordNumber();
    long var17 = var13.getRecordNumber();
    java.util.Iterator var18 = var13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test29");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var12 = var6.withRecordSeparator("hi!");
    org.apache.commons.csv.CSVFormat var14 = var6.withDelimiter(' ');
    boolean var15 = var6.isCommentMarkerSet();
    
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
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test30");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var1.toString();
    boolean var4 = var1.isEscapeCharacterSet();
    boolean var5 = var1.getAllowMissingColumnNames();
    boolean var6 = var1.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var13 = var11.withEscape(' ');
    org.apache.commons.csv.CSVFormat var15 = var11.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var18 = var17.withSkipHeaderRecord();
    boolean var19 = var17.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var21 = var17.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var23 = var17.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var27 = var25.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var28 = var25.getHeaderComments();
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var31 = var30.withIgnoreEmptyLines();
    java.lang.String var32 = var30.toString();
    java.lang.Object[] var33 = new java.lang.Object[] { var30};
    java.lang.String var34 = var25.format(var33);
    org.apache.commons.csv.CSVFormat var35 = var23.withHeaderComments(var33);
    org.apache.commons.csv.CSVFormat var36 = var11.withHeaderComments(var33);
    org.apache.commons.csv.CSVFormat var37 = var1.withHeaderComments(var33);
    boolean var38 = var37.isCommentMarkerSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var3.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var32.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var34.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test31");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = var6.withQuote((java.lang.Character)'a');
    boolean var10 = var9.isNullStringSet();
    
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
    assertTrue(var10 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test32");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var13 = var11.withEscape(' ');
    java.lang.String[] var15 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var16 = var11.withHeader(var15);
    java.lang.Character var17 = var11.getCommentMarker();
    org.apache.commons.csv.CSVFormat var18 = var11.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var19 = org.apache.commons.csv.CSVParser.parse("", var11);
    java.util.Spliterator var20 = var19.spliterator();
    java.util.Map var21 = var19.getHeaderMap();
    java.util.Spliterator var22 = var19.spliterator();
    boolean var23 = var5.equals((java.lang.Object)var19);
    java.util.Spliterator var24 = var19.spliterator();
    java.util.Spliterator var25 = var19.spliterator();
    java.util.Iterator var26 = var19.iterator();
    java.util.Map var27 = var19.getHeaderMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test33");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var12 = var11.getHeader();
    boolean var13 = var11.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var16 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var17 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var18 = var15.withHeaderComments((java.lang.Object[])var17);
    org.apache.commons.csv.CSVFormat var19 = var11.withHeaderComments((java.lang.Object[])var17);
    java.lang.String var20 = var4.format((java.lang.Object[])var17);
    org.apache.commons.csv.CSVFormat var22 = var4.withIgnoreSurroundingSpaces(false);
    java.lang.String[] var23 = var4.getHeaderComments();
    boolean var24 = var4.getIgnoreSurroundingSpaces();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var20.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test34");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var11 = var7.withSkipHeaderRecord(true);
    boolean var12 = var11.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    boolean var16 = var14.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var18 = var14.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var19 = var18.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var21 = var18.withRecordSeparator('4');
    java.lang.Character var22 = var18.getQuoteCharacter();
    java.lang.String var23 = var18.toString();
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var27 = var25.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var28 = var27.getQuoteMode();
    org.apache.commons.csv.CSVFormat var30 = var27.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var32 = var27.withSkipHeaderRecord(false);
    java.lang.String[] var34 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var35 = var32.withHeader(var34);
    org.apache.commons.csv.CSVFormat var36 = var18.withHeader(var34);
    org.apache.commons.csv.CSVFormat var37 = var11.withHeader(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Delimiter=<#> CommentStart=< > SkipHeaderRecord:false"+ "'", var23.equals("Delimiter=<#> CommentStart=< > SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test35");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var13 = var9.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:falsea");
    org.apache.commons.csv.CSVFormat var17 = var13.withNullString("ALL#MINIMAL#NON_NUMERIC#NONEDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var20 = var19.getHeader();
    boolean var21 = var19.isCommentMarkerSet();
    boolean var22 = var19.getIgnoreSurroundingSpaces();
    boolean var23 = var19.isNullStringSet();
    org.apache.commons.csv.CSVFormat var25 = var19.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var26 = var19.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var29 = var28.getHeader();
    boolean var30 = var28.isCommentMarkerSet();
    boolean var31 = var28.getIgnoreSurroundingSpaces();
    boolean var32 = var28.isNullStringSet();
    org.apache.commons.csv.CSVFormat var34 = var28.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var35 = var28.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var36 = var35.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var37 = var36.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var39 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var40 = var39.getHeader();
    boolean var41 = var39.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var43.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var46 = var44.withRecordSeparator('a');
    java.lang.Object[] var47 = new java.lang.Object[] { var44};
    org.apache.commons.csv.CSVFormat var48 = var39.withHeaderComments(var47);
    java.lang.String[] var49 = var48.getHeaderComments();
    org.apache.commons.csv.CSVFormat var50 = var37.withHeader(var49);
    java.lang.String var51 = var19.format((java.lang.Object[])var49);
    org.apache.commons.csv.CSVFormat var52 = var13.withHeader(var49);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var51.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test36");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker((java.lang.Character)'4');
    boolean var10 = var1.equals((java.lang.Object)var7);
    org.apache.commons.csv.CSVFormat var12 = var7.withCommentMarker('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test37");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var10 = var9.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var12 = var10.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var14 = var12.withEscape(' ');
    java.lang.String[] var16 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var17 = var12.withHeader(var16);
    boolean var18 = var17.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var20 = var17.withSkipHeaderRecord(true);
    java.lang.String[] var21 = var20.getHeader();
    boolean var22 = var20.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var25 = var24.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var27 = var25.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var30 = var29.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var32 = var30.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var35 = var34.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var37 = var35.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var39 = var37.withEscape(' ');
    java.lang.String[] var41 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var42 = var37.withHeader(var41);
    org.apache.commons.csv.CSVFormat var43 = var30.withHeader(var41);
    org.apache.commons.csv.CSVFormat var44 = var27.withHeaderComments((java.lang.Object[])var41);
    org.apache.commons.csv.CSVFormat var45 = var20.withHeader(var41);
    org.apache.commons.csv.CSVFormat var46 = var7.withHeaderComments((java.lang.Object[])var41);
    org.apache.commons.csv.CSVFormat var48 = var7.withEscape(' ');
    boolean var49 = var7.getIgnoreHeaderCase();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test38");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    org.apache.commons.csv.CSVFormat var9 = var5.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var10 = var5.getQuoteMode();
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var13 = var11.withCommentMarker('4');
    boolean var14 = var11.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var16 = var11.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var17 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=< > SkipHeaderRecord:false", var11);
    java.util.Spliterator var18 = var17.spliterator();
    java.util.List var19 = var17.getRecords();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test39");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withEscape('a');
    org.apache.commons.csv.CSVFormat var7 = var2.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var10 = var9.getHeader();
    boolean var11 = var9.isCommentMarkerSet();
    boolean var12 = var9.getIgnoreSurroundingSpaces();
    boolean var13 = var9.isNullStringSet();
    org.apache.commons.csv.CSVFormat var15 = var9.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var16 = var9.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var18 = var9.withRecordSeparator('#');
    java.lang.Character var19 = var18.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var21.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var24 = var22.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var26 = var24.withEscape(' ');
    boolean var27 = var24.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var28 = var24.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var31 = var30.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var33 = var31.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var35 = var33.withQuote((java.lang.Character)'4');
    java.lang.Character var36 = var35.getQuoteCharacter();
    boolean var37 = var35.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var39 = var35.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var41 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var42 = var41.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var44 = var42.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var46 = var44.withEscape(' ');
    java.lang.String[] var48 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var49 = var44.withHeader(var48);
    boolean var50 = var49.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var52 = var49.withSkipHeaderRecord(true);
    java.lang.String[] var53 = var52.getHeader();
    org.apache.commons.csv.CSVFormat var54 = var35.withHeader(var53);
    org.apache.commons.csv.CSVFormat var55 = var24.withHeaderComments((java.lang.Object[])var53);
    org.apache.commons.csv.CSVFormat var56 = var18.withHeader(var53);
    org.apache.commons.csv.CSVFormat var57 = var7.withHeader(var53);
    boolean var58 = var7.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVParser var59 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false HeaderComments:[Delimiter=<#> SkipHeaderRecord:true]", var7);
    boolean var60 = var59.isClosed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '4'+ "'", var36.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test40");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var5 = var2.getHeaderComments();
    org.apache.commons.csv.CSVFormat var7 = var2.withCommentMarker('4');
    char var8 = var7.getDelimiter();
    org.apache.commons.csv.CSVFormat var10 = var7.withDelimiter('#');
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse("Default#Excel#MySQL#RFC4180#TDFa", var10);
    java.util.List var12 = var11.getRecords();
    boolean var13 = var11.isClosed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test41");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    java.lang.String var9 = var8.getRecordSeparator();
    
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
    assertTrue("'" + var9 + "' != '" + "a"+ "'", var9.equals("a"));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test42");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    java.lang.Character var11 = var5.getCommentMarker();
    org.apache.commons.csv.CSVFormat var12 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("", var5);
    java.util.Map var14 = var13.getHeaderMap();
    java.util.Iterator var15 = var13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test43");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('a');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var4 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var5 = var4.getHeader();
    boolean var6 = var4.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator('a');
    java.lang.Object[] var12 = new java.lang.Object[] { var9};
    org.apache.commons.csv.CSVFormat var13 = var4.withHeaderComments(var12);
    java.lang.String[] var14 = var13.getHeaderComments();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var21 = var19.withEscape(' ');
    java.lang.String[] var23 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var24 = var19.withHeader(var23);
    org.apache.commons.csv.CSVFormat var26 = var24.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var28 = var24.withEscape(' ');
    boolean var29 = var13.equals((java.lang.Object)' ');
    org.apache.commons.csv.CSVFormat var30 = var13.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var31 = var13.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var34 = var33.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var36 = var34.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var38 = var36.withEscape(' ');
    java.lang.String[] var40 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var41 = var36.withHeader(var40);
    org.apache.commons.csv.CSVFormat var43 = var41.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var45 = var41.withEscape(' ');
    org.apache.commons.csv.CSVFormat var47 = var45.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var49 = var45.withCommentMarker('4');
    boolean var50 = var45.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var52 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var53 = var52.getHeader();
    boolean var54 = var52.isCommentMarkerSet();
    boolean var55 = var52.getIgnoreSurroundingSpaces();
    boolean var56 = var52.isNullStringSet();
    org.apache.commons.csv.CSVFormat var58 = var52.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var59 = var52.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var60 = var59.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var61 = var60.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var63 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var64 = var63.getHeader();
    boolean var65 = var63.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var67 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var68 = var67.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var70 = var68.withRecordSeparator('a');
    java.lang.Object[] var71 = new java.lang.Object[] { var68};
    org.apache.commons.csv.CSVFormat var72 = var63.withHeaderComments(var71);
    java.lang.String[] var73 = var72.getHeaderComments();
    org.apache.commons.csv.CSVFormat var74 = var61.withHeader(var73);
    org.apache.commons.csv.CSVFormat var75 = var45.withHeader(var73);
    org.apache.commons.csv.CSVFormat var76 = var31.withHeaderComments((java.lang.Object[])var73);
    org.apache.commons.csv.CSVFormat var77 = var2.withHeaderComments((java.lang.Object[])var73);
    char var78 = var2.getDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
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
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 'a');

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test44");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var5 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var4);
    java.util.Spliterator var10 = var9.spliterator();
    long var11 = var9.getCurrentLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test45");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker((java.lang.Character)'4');
    boolean var10 = var1.equals((java.lang.Object)var7);
    org.apache.commons.csv.CSVFormat var11 = var1.withIgnoreEmptyLines();
    java.lang.Character var12 = var11.getQuoteCharacter();
    boolean var13 = var11.isCommentMarkerSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test46");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    java.lang.String[] var5 = var1.getHeader();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var9 = var7.withNullString("a");
    char var10 = var9.getDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '#');

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test47");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withRecordSeparator("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var8 = var6.withSkipHeaderRecord(false);
    java.lang.String var9 = var8.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var11 = var8.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var13 = var8.withIgnoreEmptyLines(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var9.equals("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test48");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    boolean var11 = var10.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var13 = var10.withCommentMarker((java.lang.Character)' ');
    
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
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test49");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var13 = var11.withEscape(' ');
    java.lang.String[] var15 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var16 = var11.withHeader(var15);
    java.lang.Character var17 = var11.getCommentMarker();
    org.apache.commons.csv.CSVFormat var18 = var11.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var19 = org.apache.commons.csv.CSVParser.parse("", var11);
    java.util.Spliterator var20 = var19.spliterator();
    java.util.Map var21 = var19.getHeaderMap();
    java.util.Spliterator var22 = var19.spliterator();
    boolean var23 = var5.equals((java.lang.Object)var19);
    long var24 = var19.getRecordNumber();
    java.util.List var25 = var19.getRecords();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test50");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var11 = var7.withNullString("a");
    org.apache.commons.csv.CSVFormat var13 = var11.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    java.lang.Character var14 = var11.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var21 = var19.withEscape(' ');
    boolean var22 = var19.getIgnoreSurroundingSpaces();
    java.lang.Character var23 = var19.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var24 = var19.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var26 = var19.withIgnoreEmptyLines(false);
    java.lang.Character var27 = var26.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var29 = var26.withEscape('a');
    boolean var30 = var11.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test51");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var5 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var7 = var5.withDelimiter('#');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var5);
    boolean var10 = var5.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var5.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var20 = var19.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var22 = var20.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var24 = var22.withEscape(' ');
    java.lang.String[] var26 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var27 = var22.withHeader(var26);
    org.apache.commons.csv.CSVFormat var28 = var15.withHeader(var26);
    org.apache.commons.csv.CSVFormat var29 = var5.withHeader(var26);
    boolean var30 = var29.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var32 = var29.withRecordSeparator("ALL#MINIMAL#NON_NUMERIC#NONEDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test52");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    boolean var12 = var10.equals((java.lang.Object)(-1.0f));
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreSurroundingSpaces();
    boolean var14 = var13.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var16 = var13.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var18 = var13.withQuote(' ');
    java.lang.Character var19 = var13.getEscapeCharacter();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test53");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var5 = var2.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var2.withRecordSeparator("a");
    java.lang.Character var8 = var2.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var10 = var2.withEscape((java.lang.Character)' ');
    java.lang.String var11 = var10.toString();
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Delimiter=<#> Escape=< > SkipHeaderRecord:true"+ "'", var11.equals("Delimiter=<#> Escape=< > SkipHeaderRecord:true"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test54");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var8.withAllowMissingColumnNames(true);
    boolean var11 = var10.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var14 = var10.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.toString();
    java.lang.Character var17 = var14.getQuoteCharacter();
    boolean var18 = var14.isNullStringSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Delimiter=<#> CommentStart=<4> NullString=<Delimiter=<#> SkipHeaderRecord:false> RecordSeparator=<Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true> EmptyLines:ignored SkipHeaderRecord:false"+ "'", var15.equals("Delimiter=<#> CommentStart=<4> NullString=<Delimiter=<#> SkipHeaderRecord:false> RecordSeparator=<Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true> EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=<#> CommentStart=<4> NullString=<Delimiter=<#> SkipHeaderRecord:false> RecordSeparator=<Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true> EmptyLines:ignored SkipHeaderRecord:false"+ "'", var16.equals("Delimiter=<#> CommentStart=<4> NullString=<Delimiter=<#> SkipHeaderRecord:false> RecordSeparator=<Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true> EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test55");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator('a');
    java.lang.String var14 = var13.toString();
    org.apache.commons.csv.CSVFormat var16 = var13.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.QuoteMode var17 = var16.getQuoteMode();
    org.apache.commons.csv.CSVFormat var19 = var16.withQuote((java.lang.Character)' ');
    boolean var20 = var19.getIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode var21 = var19.getQuoteMode();
    java.lang.Character var22 = var19.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var25 = var24.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var27 = var25.withRecordSeparator('a');
    java.lang.String var28 = var27.toString();
    boolean var29 = var27.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var31 = var27.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var35 = var33.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var36 = var35.getQuoteMode();
    boolean var37 = var35.isCommentMarkerSet();
    boolean var38 = var35.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var41 = var40.getHeader();
    boolean var42 = var40.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var44 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var45 = var44.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var47 = var45.withRecordSeparator('a');
    java.lang.Object[] var48 = new java.lang.Object[] { var45};
    org.apache.commons.csv.CSVFormat var49 = var40.withHeaderComments(var48);
    java.lang.String[] var50 = var49.getHeaderComments();
    org.apache.commons.csv.CSVFormat var51 = var35.withHeaderComments((java.lang.Object[])var50);
    org.apache.commons.csv.CSVFormat var52 = var31.withHeader(var50);
    org.apache.commons.csv.CSVFormat var53 = var19.withHeaderComments((java.lang.Object[])var50);
    java.lang.String var54 = var4.format((java.lang.Object[])var50);
    org.apache.commons.csv.CSVFormat var56 = var4.withIgnoreEmptyLines(true);
    boolean var57 = var56.getSkipHeaderRecord();
    
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
    assertTrue("'" + var14 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var14.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var28.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "Delimiter=<#> SkipHeaderRecord:truea"+ "'", var54.equals("Delimiter=<#> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test56");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String var5 = var4.toString();
    org.apache.commons.csv.CSVFormat var7 = var4.withCommentMarker(' ');
    java.lang.String var8 = var7.getRecordSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var5.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "a"+ "'", var8.equals("a"));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test57");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var12 = var11.getHeader();
    boolean var13 = var11.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var16 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var17 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var18 = var15.withHeaderComments((java.lang.Object[])var17);
    org.apache.commons.csv.CSVFormat var19 = var11.withHeaderComments((java.lang.Object[])var17);
    java.lang.String var20 = var4.format((java.lang.Object[])var17);
    boolean var21 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var23 = var4.withEscape('a');
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var20.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test58");


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
    org.apache.commons.csv.CSVFormat var16 = var6.withSkipHeaderRecord(false);
    boolean var17 = var16.isEscapeCharacterSet();
    
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
    assertTrue(var17 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test59");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var9.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var12 = var9.withIgnoreEmptyLines(true);
    boolean var13 = var9.getAllowMissingColumnNames();
    java.lang.String var14 = var9.toString();
    org.apache.commons.csv.CSVFormat var16 = var9.withEscape(' ');
    org.apache.commons.csv.CSVFormat var17 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var21 = var20.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var23 = var21.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var25 = var23.withEscape(' ');
    org.apache.commons.csv.CSVFormat var27 = var23.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var28 = var23.getQuoteMode();
    org.apache.commons.csv.CSVFormat var29 = var23.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var31 = var29.withCommentMarker('4');
    boolean var32 = var29.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var34 = var29.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var35 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=< > SkipHeaderRecord:false", var29);
    java.util.Spliterator var36 = var35.spliterator();
    boolean var37 = var9.equals((java.lang.Object)var35);
    boolean var38 = var9.getIgnoreHeaderCase();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"+ "'", var14.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test60");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var12 = var6.withRecordSeparator("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var14 = var12.withCommentMarker((java.lang.Character)'#');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test61");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var4.withDelimiter(' ');
    boolean var10 = var8.equals((java.lang.Object)'4');
    org.apache.commons.csv.CSVFormat var12 = var8.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var13 = var8.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var16 = var15.withSkipHeaderRecord();
    boolean var17 = var15.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var19 = var15.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var21 = var15.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var25 = var23.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var26 = var23.getHeaderComments();
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var29 = var28.withIgnoreEmptyLines();
    java.lang.String var30 = var28.toString();
    java.lang.Object[] var31 = new java.lang.Object[] { var28};
    java.lang.String var32 = var23.format(var31);
    org.apache.commons.csv.CSVFormat var33 = var21.withHeaderComments(var31);
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var36 = var35.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var38 = var36.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var41 = var40.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var43 = var41.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var45 = var43.withEscape(' ');
    java.lang.String[] var47 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var48 = var43.withHeader(var47);
    org.apache.commons.csv.CSVFormat var49 = var36.withHeader(var47);
    org.apache.commons.csv.CSVFormat var51 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var52 = var51.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var54 = var52.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var56 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var57 = var56.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var59 = var57.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var61 = var59.withEscape(' ');
    java.lang.String[] var63 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var64 = var59.withHeader(var63);
    org.apache.commons.csv.CSVFormat var65 = var52.withHeader(var63);
    org.apache.commons.csv.CSVFormat var66 = var36.withHeader(var63);
    java.lang.String var67 = var21.format((java.lang.Object[])var63);
    java.lang.String var68 = var13.format((java.lang.Object[])var63);
    boolean var69 = var13.isCommentMarkerSet();
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var30.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var32.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var67.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"+ "'", var68.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test62");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    char var12 = var11.getDelimiter();
    org.apache.commons.csv.CSVFormat var14 = var11.withNullString("hi!");
    org.apache.commons.csv.CSVFormat var16 = var14.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var18 = var14.withIgnoreEmptyLines(false);
    java.lang.String[] var19 = var14.getHeaderComments();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test63");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    boolean var12 = var10.equals((java.lang.Object)(-1.0f));
    org.apache.commons.csv.CSVFormat var14 = var10.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var16 = var10.withRecordSeparator("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var18 = var10.withQuote('a');
    org.apache.commons.csv.CSVFormat var20 = var10.withIgnoreEmptyLines(true);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test64");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    boolean var9 = var5.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreHeaderCase(false);
    java.lang.Character var12 = var11.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var15 = var14.getHeader();
    boolean var16 = var14.isCommentMarkerSet();
    boolean var17 = var14.getIgnoreSurroundingSpaces();
    boolean var18 = var14.isNullStringSet();
    org.apache.commons.csv.CSVFormat var20 = var14.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var21 = var14.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var23 = var14.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var27 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var28 = var25.withHeaderComments((java.lang.Object[])var27);
    boolean var29 = var14.equals((java.lang.Object)var28);
    org.apache.commons.csv.CSVFormat var31 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var32 = var31.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var33 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var34 = var31.withHeaderComments((java.lang.Object[])var33);
    org.apache.commons.csv.CSVFormat var36 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var37 = var36.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var39 = var37.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var41 = var39.withQuote((java.lang.Character)'4');
    java.lang.Character var42 = var41.getQuoteCharacter();
    boolean var43 = var41.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var45 = var41.withIgnoreSurroundingSpaces(true);
    boolean var46 = var45.getSkipHeaderRecord();
    java.lang.String[] var47 = var45.getHeaderComments();
    org.apache.commons.csv.CSVFormat var49 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var50 = var49.withSkipHeaderRecord();
    boolean var51 = var49.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var53 = var49.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var54 = var53.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var56 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var58 = var56.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var59 = var58.getQuoteMode();
    java.lang.Character var60 = var58.getCommentMarker();
    java.lang.Object[] var61 = new java.lang.Object[] { var58};
    java.lang.String var62 = var54.format(var61);
    org.apache.commons.csv.CSVFormat var63 = var45.withHeaderComments(var61);
    org.apache.commons.csv.CSVFormat var65 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var66 = var65.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var68 = var66.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var70 = var68.withQuote((java.lang.Character)'4');
    java.lang.Character var71 = var70.getQuoteCharacter();
    boolean var72 = var70.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var74 = var70.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var76 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var77 = var76.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var79 = var77.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var81 = var79.withEscape(' ');
    java.lang.String[] var83 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var84 = var79.withHeader(var83);
    boolean var85 = var84.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var87 = var84.withSkipHeaderRecord(true);
    java.lang.String[] var88 = var87.getHeader();
    org.apache.commons.csv.CSVFormat var89 = var70.withHeader(var88);
    org.apache.commons.csv.CSVFormat var90 = var45.withHeader(var88);
    java.lang.String var91 = var34.format((java.lang.Object[])var88);
    org.apache.commons.csv.CSVFormat var92 = var28.withHeader(var88);
    java.lang.String var93 = var11.format((java.lang.Object[])var88);
    org.apache.commons.csv.CSVParser var94 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:false HeaderComments:[ALL, MINIMAL, NON_NUMERIC, NONE]", var11);
    long var95 = var94.getRecordNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + '4'+ "'", var42.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + '4'+ "'", var60.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var62.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + '4'+ "'", var71.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var91.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"+ "'", var93.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0L);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test65");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var13 = var11.withEscape(' ');
    java.lang.String[] var15 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var16 = var11.withHeader(var15);
    java.lang.Character var17 = var11.getCommentMarker();
    org.apache.commons.csv.CSVFormat var18 = var11.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var19 = org.apache.commons.csv.CSVParser.parse("", var11);
    java.util.Spliterator var20 = var19.spliterator();
    java.util.Map var21 = var19.getHeaderMap();
    java.util.Spliterator var22 = var19.spliterator();
    boolean var23 = var5.equals((java.lang.Object)var19);
    java.util.Spliterator var24 = var19.spliterator();
    java.util.Spliterator var25 = var19.spliterator();
    long var26 = var19.getCurrentLineNumber();
    java.util.Iterator var27 = var19.iterator();
    long var28 = var19.getCurrentLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test66");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withQuote('4');
    org.apache.commons.csv.CSVFormat var10 = var4.withRecordSeparator('a');
    boolean var11 = var10.getSkipHeaderRecord();
    
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
    assertTrue(var11 == true);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test67");


    org.apache.commons.csv.CSVFormat var4 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var5 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var7 = var5.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var9 = var7.withEscape(' ');
    java.lang.String[] var11 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var12 = var7.withHeader(var11);
    org.apache.commons.csv.CSVFormat var14 = var12.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVParser var15 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true", var12);
    org.apache.commons.csv.CSVParser var16 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:true", var12);
    org.apache.commons.csv.CSVParser var17 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true", var12);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test68");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    org.apache.commons.csv.CSVFormat var12 = var5.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var14 = var12.withNullString("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVParser var15 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=< > SkipHeaderRecord:false", var12);
    org.apache.commons.csv.CSVFormat var17 = var12.withDelimiter('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test69");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    java.lang.String[] var11 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreHeaderCase(false);
    java.lang.String var14 = var13.toString();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:false"+ "'", var14.equals("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:false"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test70");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    boolean var5 = var4.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var4.withDelimiter('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test71");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var11 = var9.withDelimiter(' ');
    org.apache.commons.csv.CSVFormat var13 = var11.withQuote('4');
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var16 = var15.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var18 = var16.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var20 = var18.withEscape(' ');
    java.lang.String[] var22 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var23 = var18.withHeader(var22);
    java.lang.String var24 = var18.toString();
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var27 = var26.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var29 = var27.withRecordSeparator('a');
    java.lang.String var30 = var29.toString();
    boolean var31 = var29.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var33 = var29.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var37 = var35.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var38 = var37.getQuoteMode();
    boolean var39 = var37.isCommentMarkerSet();
    boolean var40 = var37.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var42 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var43 = var42.getHeader();
    boolean var44 = var42.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var46 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var47 = var46.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var49 = var47.withRecordSeparator('a');
    java.lang.Object[] var50 = new java.lang.Object[] { var47};
    org.apache.commons.csv.CSVFormat var51 = var42.withHeaderComments(var50);
    java.lang.String[] var52 = var51.getHeaderComments();
    org.apache.commons.csv.CSVFormat var53 = var37.withHeaderComments((java.lang.Object[])var52);
    org.apache.commons.csv.CSVFormat var54 = var33.withHeader(var52);
    org.apache.commons.csv.CSVFormat var55 = var18.withHeader(var52);
    org.apache.commons.csv.CSVFormat var56 = var13.withHeader(var52);
    boolean var57 = var56.isNullStringSet();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var24.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var30.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test72");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var5 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var7 = var4.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var9 = var4.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator("Delimiter=<#> Escape=< > CommentStart=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var11);
    java.util.Spliterator var13 = var12.spliterator();
    java.util.Iterator var14 = var12.iterator();
    java.util.List var15 = var12.getRecords();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test73");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var5 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var7 = var4.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var9 = var7.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var11 = var7.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var13 = var11.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:falsea", var11);
    long var15 = var14.getRecordNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
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
    assertTrue(var15 == 0L);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test74");


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
    org.apache.commons.csv.CSVFormat var36 = var35.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var38 = var36.withIgnoreSurroundingSpaces(true);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test75");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var4.getCommentMarker();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var17 = var15.withEscape(' ');
    org.apache.commons.csv.CSVFormat var19 = var15.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var20 = var15.getQuoteMode();
    org.apache.commons.csv.CSVFormat var21 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var23 = var21.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var25 = var21.withNullString("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var27 = var21.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var30 = var29.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var32 = var30.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var34 = var32.withEscape(' ');
    java.lang.String[] var36 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var37 = var32.withHeader(var36);
    org.apache.commons.csv.CSVFormat var39 = var37.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var41 = var37.withEscape(' ');
    org.apache.commons.csv.CSVFormat var43 = var41.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var45 = var41.withCommentMarker('4');
    boolean var46 = var41.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var49 = var48.getHeader();
    boolean var50 = var48.isCommentMarkerSet();
    boolean var51 = var48.getIgnoreSurroundingSpaces();
    boolean var52 = var48.isNullStringSet();
    org.apache.commons.csv.CSVFormat var54 = var48.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var55 = var48.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var56 = var55.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var57 = var56.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var59 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var60 = var59.getHeader();
    boolean var61 = var59.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var63 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var64 = var63.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var66 = var64.withRecordSeparator('a');
    java.lang.Object[] var67 = new java.lang.Object[] { var64};
    org.apache.commons.csv.CSVFormat var68 = var59.withHeaderComments(var67);
    java.lang.String[] var69 = var68.getHeaderComments();
    org.apache.commons.csv.CSVFormat var70 = var57.withHeader(var69);
    org.apache.commons.csv.CSVFormat var71 = var41.withHeader(var69);
    java.lang.String var72 = var21.format((java.lang.Object[])var69);
    org.apache.commons.csv.CSVFormat var73 = var4.withHeader(var69);
    org.apache.commons.csv.CSVFormat var75 = var4.withNullString("Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true");
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
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
    assertTrue("'" + var72 + "' != '" + "Delimiter=<#> SkipHeaderRecord:truea"+ "'", var72.equals("Delimiter=<#> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test76");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.QuoteMode var1 = org.apache.commons.csv.QuoteMode.valueOf("Delimiter=<#> QuoteChar=<4> RecordSeparator=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test77");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    char var6 = var5.getDelimiter();
    org.apache.commons.csv.CSVFormat var8 = var5.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var9 = var5.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var5.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true HeaderComments:[Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false]", var5);
    long var13 = var12.getCurrentLineNumber();
    long var14 = var12.getCurrentLineNumber();
    java.util.Spliterator var15 = var12.spliterator();
    java.util.List var16 = var12.getRecords();
    var12.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test78");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var1.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var14 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var15 = var12.withHeaderComments((java.lang.Object[])var14);
    boolean var16 = var1.equals((java.lang.Object)var15);
    org.apache.commons.csv.CSVFormat var18 = var15.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var21 = var20.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var23 = var21.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var25 = var23.withQuote((java.lang.Character)'4');
    java.lang.Character var26 = var25.getQuoteCharacter();
    boolean var27 = var25.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var29 = var25.withIgnoreSurroundingSpaces(true);
    boolean var30 = var29.getSkipHeaderRecord();
    java.lang.String[] var31 = var29.getHeaderComments();
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var34 = var33.withSkipHeaderRecord();
    boolean var35 = var33.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var37 = var33.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var38 = var37.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var42 = var40.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var43 = var42.getQuoteMode();
    java.lang.Character var44 = var42.getCommentMarker();
    java.lang.Object[] var45 = new java.lang.Object[] { var42};
    java.lang.String var46 = var38.format(var45);
    org.apache.commons.csv.CSVFormat var47 = var29.withHeaderComments(var45);
    org.apache.commons.csv.CSVFormat var49 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var50 = var49.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var52 = var50.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var54 = var52.withQuote((java.lang.Character)'4');
    java.lang.Character var55 = var54.getQuoteCharacter();
    boolean var56 = var54.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var58 = var54.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var60 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var61 = var60.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var63 = var61.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var65 = var63.withEscape(' ');
    java.lang.String[] var67 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var68 = var63.withHeader(var67);
    boolean var69 = var68.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var71 = var68.withSkipHeaderRecord(true);
    java.lang.String[] var72 = var71.getHeader();
    org.apache.commons.csv.CSVFormat var73 = var54.withHeader(var72);
    org.apache.commons.csv.CSVFormat var74 = var29.withHeader(var72);
    org.apache.commons.csv.CSVFormat var75 = var18.withHeaderComments((java.lang.Object[])var72);
    org.apache.commons.csv.CSVFormat var76 = var18.withIgnoreEmptyLines();
    java.lang.String var77 = var76.getRecordSeparator();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + '4'+ "'", var26.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + '4'+ "'", var44.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var46.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + '4'+ "'", var55.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test79");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker((java.lang.Character)'4');
    boolean var10 = var1.equals((java.lang.Object)var7);
    org.apache.commons.csv.CSVFormat var12 = var7.withIgnoreEmptyLines(false);
    java.lang.Character var13 = var12.getCommentMarker();
    org.apache.commons.csv.CSVFormat var15 = var12.withIgnoreHeaderCase(false);
    char var16 = var12.getDelimiter();
    org.apache.commons.csv.CSVFormat var18 = var12.withQuote(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test80");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var4.getCommentMarker();
    org.apache.commons.csv.CSVFormat var12 = var4.withEscape('a');
    org.apache.commons.csv.CSVFormat var13 = var12.withSkipHeaderRecord();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test81");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var13 = var12.withIgnoreEmptyLines();
    java.lang.Character var14 = var13.getCommentMarker();
    org.apache.commons.csv.CSVFormat var16 = var13.withIgnoreSurroundingSpaces(true);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '4'+ "'", var14.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test82");


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
    org.apache.commons.csv.CSVFormat var17 = var13.withSkipHeaderRecord();
    
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
    assertNotNull(var17);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test83");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    boolean var9 = var1.getIgnoreSurroundingSpaces();
    java.lang.Character var10 = var1.getEscapeCharacter();
    boolean var11 = var1.getIgnoreSurroundingSpaces();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test84");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String[] var5 = var2.getHeaderComments();
    org.apache.commons.csv.CSVFormat var7 = var2.withQuote(' ');
    org.apache.commons.csv.CSVFormat var9 = var7.withEscape('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test85");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    boolean var10 = var4.isNullStringSet();
    org.apache.commons.csv.CSVFormat var12 = var4.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var13 = var4.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var15 = var13.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator(' ');
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test86");


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
    java.lang.Character var36 = var35.getCommentMarker();
    
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
    assertTrue("'" + var36 + "' != '" + '4'+ "'", var36.equals('4'));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test87");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var4.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var13 = var4.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var15.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var18 = var17.getQuoteMode();
    org.apache.commons.csv.CSVFormat var20 = var17.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var22 = var17.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var24 = var22.withRecordSeparator("Delimiter=<#> Escape=< > CommentStart=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var27 = var26.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var29 = var27.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var31 = var29.withQuote((java.lang.Character)'4');
    java.lang.Character var32 = var31.getQuoteCharacter();
    boolean var33 = var31.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var35 = var31.withIgnoreSurroundingSpaces(true);
    boolean var36 = var35.getSkipHeaderRecord();
    java.lang.String[] var37 = var35.getHeaderComments();
    org.apache.commons.csv.CSVFormat var39 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var40 = var39.withSkipHeaderRecord();
    boolean var41 = var39.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var43 = var39.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var44 = var43.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var46 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var48 = var46.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var49 = var48.getQuoteMode();
    java.lang.Character var50 = var48.getCommentMarker();
    java.lang.Object[] var51 = new java.lang.Object[] { var48};
    java.lang.String var52 = var44.format(var51);
    org.apache.commons.csv.CSVFormat var53 = var35.withHeaderComments(var51);
    org.apache.commons.csv.CSVFormat var55 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var56 = var55.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var58 = var56.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var60 = var58.withQuote((java.lang.Character)'4');
    java.lang.Character var61 = var60.getQuoteCharacter();
    boolean var62 = var60.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var64 = var60.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var66 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var67 = var66.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var69 = var67.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var71 = var69.withEscape(' ');
    java.lang.String[] var73 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var74 = var69.withHeader(var73);
    boolean var75 = var74.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var77 = var74.withSkipHeaderRecord(true);
    java.lang.String[] var78 = var77.getHeader();
    org.apache.commons.csv.CSVFormat var79 = var60.withHeader(var78);
    org.apache.commons.csv.CSVFormat var80 = var35.withHeader(var78);
    org.apache.commons.csv.CSVFormat var81 = var22.withHeader(var78);
    org.apache.commons.csv.CSVFormat var83 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var84 = var83.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var86 = var84.withRecordSeparator('a');
    java.lang.String var87 = var86.toString();
    org.apache.commons.csv.CSVFormat var89 = var86.withRecordSeparator("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var91 = var89.withQuote(' ');
    boolean var92 = var81.equals((java.lang.Object)var91);
    org.apache.commons.csv.CSVFormat var93 = var91.withSkipHeaderRecord();
    boolean var94 = var13.equals((java.lang.Object)var91);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + '4'+ "'", var32.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + '4'+ "'", var50.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var52.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + '4'+ "'", var61.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var87.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test88");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    boolean var7 = var6.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var9.withQuote((java.lang.Character)' ');
    java.lang.Character var12 = var11.getEscapeCharacter();
    
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test89");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withEscape('a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false", var5);
    java.util.Map var7 = var6.getHeaderMap();
    java.util.List var8 = var6.getRecords();
    java.util.Spliterator var9 = var6.spliterator();
    boolean var10 = var6.isClosed();
    long var11 = var6.getRecordNumber();
    java.util.Spliterator var12 = var6.spliterator();
    
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
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test90");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var9.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var12 = var9.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var14 = var9.withEscape('4');
    java.lang.String[] var15 = var9.getHeaderComments();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test91");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    java.lang.String var9 = var4.getNullString();
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var12 = var11.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var14 = var12.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var16 = var14.withEscape(' ');
    org.apache.commons.csv.CSVFormat var18 = var14.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var19 = var14.getQuoteMode();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var22 = var21.getHeader();
    boolean var23 = var21.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var27 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var28 = var25.withHeaderComments((java.lang.Object[])var27);
    org.apache.commons.csv.CSVFormat var29 = var21.withHeaderComments((java.lang.Object[])var27);
    java.lang.String var30 = var14.format((java.lang.Object[])var27);
    java.lang.String var31 = var4.format((java.lang.Object[])var27);
    org.apache.commons.csv.QuoteMode var32 = var4.getQuoteMode();
    boolean var33 = var4.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var35 = var4.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var36 = var35.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var38 = var35.withAllowMissingColumnNames(true);
    boolean var39 = var38.isNullStringSet();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var30.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var31.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test92");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String var5 = var4.toString();
    org.apache.commons.csv.CSVFormat var7 = var4.withCommentMarker(' ');
    boolean var8 = var7.isNullStringSet();
    char var9 = var7.getDelimiter();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var11 = var7.withEscape(' ');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var5.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == '#');

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test93");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var6 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var9 = var5.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreEmptyLines(false);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test94");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var12 = var11.getHeader();
    boolean var13 = var11.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var16 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var17 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var18 = var15.withHeaderComments((java.lang.Object[])var17);
    org.apache.commons.csv.CSVFormat var19 = var11.withHeaderComments((java.lang.Object[])var17);
    java.lang.String var20 = var4.format((java.lang.Object[])var17);
    boolean var21 = var4.isEscapeCharacterSet();
    boolean var22 = var4.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var24 = var4.withRecordSeparator(' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var26 = var4.withEscape('#');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var20.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test95");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var8 = var6.withEscape(' ');
    java.lang.String[] var10 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var11 = var6.withHeader(var10);
    org.apache.commons.csv.CSVFormat var13 = var6.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var17 = var13.withQuote((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var19 = var17.withEscape((java.lang.Character)'a');
    boolean var20 = var1.equals((java.lang.Object)var19);
    org.apache.commons.csv.CSVFormat var22 = var1.withQuote('4');
    org.apache.commons.csv.CSVFormat var23 = var1.withAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test96");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    boolean var13 = var12.isNullStringSet();
    boolean var14 = var12.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    boolean var18 = var16.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var20 = var16.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var22 = var16.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var24.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var27 = var24.getHeaderComments();
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var30 = var29.withIgnoreEmptyLines();
    java.lang.String var31 = var29.toString();
    java.lang.Object[] var32 = new java.lang.Object[] { var29};
    java.lang.String var33 = var24.format(var32);
    org.apache.commons.csv.CSVFormat var34 = var22.withHeaderComments(var32);
    boolean var35 = var12.equals((java.lang.Object)var22);
    java.lang.String[] var36 = var12.getHeader();
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var31.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var33.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test97");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var4.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var15 = var11.withQuote((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var16 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var18 = var15.withSkipHeaderRecord(true);
    boolean var19 = var18.getSkipHeaderRecord();
    boolean var20 = var18.getIgnoreSurroundingSpaces();
    java.lang.String[] var21 = var18.getHeader();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test98");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    boolean var5 = var3.isCommentMarkerSet();
    boolean var6 = var3.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var10 = var3.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false");
    java.lang.Character var11 = var3.getQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test99");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.String[] var7 = var4.getHeaderComments();
    org.apache.commons.csv.QuoteMode var8 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withCommentMarker((java.lang.Character)'a');
    char var11 = var10.getDelimiter();
    boolean var12 = var10.getIgnoreEmptyLines();
    boolean var13 = var10.getIgnoreHeaderCase();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test100");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var4.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var13 = var4.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var14 = var4.withAllowMissingColumnNames();
    char var15 = var4.getDelimiter();
    org.apache.commons.csv.CSVFormat var17 = var4.withRecordSeparator("a");
    org.apache.commons.csv.CSVFormat var19 = var4.withQuote('4');
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test101");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var11 = var7.withNullString("a");
    org.apache.commons.csv.CSVFormat var13 = var11.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    java.lang.Character var14 = var11.getQuoteCharacter();
    boolean var15 = var11.getAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test102");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    org.apache.commons.csv.CSVFormat var12 = var5.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var14 = var12.withRecordSeparator("");
    java.lang.Character var15 = var12.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var17 = var12.withEscape(' ');
    org.apache.commons.csv.CSVParser var18 = org.apache.commons.csv.CSVParser.parse("", var12);
    java.lang.String var19 = var12.getNullString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test103");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var1.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var12 = var1.withIgnoreSurroundingSpaces(false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test104");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.QuoteMode var1 = org.apache.commons.csv.QuoteMode.valueOf("Delimiter=<a> SkipHeaderRecord:true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test105");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test106");


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

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test107");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var2.withQuote((java.lang.Character)'4');
    boolean var7 = var6.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    boolean var10 = var6.getSkipHeaderRecord();
    boolean var11 = var6.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var13 = var6.withQuote((java.lang.Character)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test108");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var12 = var11.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var14 = var12.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var16 = var14.withEscape(' ');
    java.lang.String[] var18 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var19 = var14.withHeader(var18);
    org.apache.commons.csv.CSVFormat var20 = var7.withHeader(var18);
    org.apache.commons.csv.CSVFormat var21 = var4.withHeaderComments((java.lang.Object[])var18);
    org.apache.commons.csv.CSVFormat var22 = var21.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var23 = var21.withIgnoreEmptyLines();
    boolean var24 = var23.getAllowMissingColumnNames();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test109");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var10 = var9.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var12 = var10.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var14 = var12.withEscape(' ');
    java.lang.String[] var16 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var17 = var12.withHeader(var16);
    boolean var18 = var17.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var20 = var17.withSkipHeaderRecord(true);
    java.lang.String[] var21 = var20.getHeader();
    boolean var22 = var20.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var25 = var24.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var27 = var25.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var30 = var29.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var32 = var30.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var35 = var34.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var37 = var35.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var39 = var37.withEscape(' ');
    java.lang.String[] var41 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var42 = var37.withHeader(var41);
    org.apache.commons.csv.CSVFormat var43 = var30.withHeader(var41);
    org.apache.commons.csv.CSVFormat var44 = var27.withHeaderComments((java.lang.Object[])var41);
    org.apache.commons.csv.CSVFormat var45 = var20.withHeader(var41);
    org.apache.commons.csv.CSVFormat var46 = var7.withHeaderComments((java.lang.Object[])var41);
    org.apache.commons.csv.CSVFormat var48 = var46.withRecordSeparator(' ');
    org.apache.commons.csv.CSVFormat var49 = var46.withAllowMissingColumnNames();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test110");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var5 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var7 = var5.withDelimiter('#');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var5);
    boolean var10 = var5.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var5.withRecordSeparator('#');
    boolean var13 = var12.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var16 = var15.getHeader();
    org.apache.commons.csv.CSVFormat var18 = var15.withEscape('a');
    org.apache.commons.csv.CSVFormat var20 = var15.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var23 = var22.getHeader();
    boolean var24 = var22.isCommentMarkerSet();
    boolean var25 = var22.getIgnoreSurroundingSpaces();
    boolean var26 = var22.isNullStringSet();
    org.apache.commons.csv.CSVFormat var28 = var22.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var29 = var22.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var31 = var22.withRecordSeparator('#');
    java.lang.Character var32 = var31.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var35 = var34.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var37 = var35.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var39 = var37.withEscape(' ');
    boolean var40 = var37.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var41 = var37.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var43.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var46 = var44.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var48 = var46.withQuote((java.lang.Character)'4');
    java.lang.Character var49 = var48.getQuoteCharacter();
    boolean var50 = var48.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var52 = var48.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var54 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var55 = var54.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var57 = var55.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var59 = var57.withEscape(' ');
    java.lang.String[] var61 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var62 = var57.withHeader(var61);
    boolean var63 = var62.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var65 = var62.withSkipHeaderRecord(true);
    java.lang.String[] var66 = var65.getHeader();
    org.apache.commons.csv.CSVFormat var67 = var48.withHeader(var66);
    org.apache.commons.csv.CSVFormat var68 = var37.withHeaderComments((java.lang.Object[])var66);
    org.apache.commons.csv.CSVFormat var69 = var31.withHeader(var66);
    org.apache.commons.csv.CSVFormat var70 = var20.withHeader(var66);
    org.apache.commons.csv.CSVFormat var71 = var12.withHeader(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
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
    assertTrue("'" + var49 + "' != '" + '4'+ "'", var49.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
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

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test111");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var4.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var15 = var11.withQuote((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var16 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var18 = var15.withSkipHeaderRecord(true);
    java.lang.String var19 = var15.getNullString();
    boolean var20 = var15.getIgnoreHeaderCase();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test112");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var4.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var10 = var4.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames();
    
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
    assertNotNull(var12);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test113");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var9.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var14 = var9.withQuote((java.lang.Character)'a');
    
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

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test114");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    java.lang.Character var11 = var5.getCommentMarker();
    org.apache.commons.csv.CSVFormat var12 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("", var5);
    java.util.Spliterator var14 = var13.spliterator();
    java.util.Map var15 = var13.getHeaderMap();
    var13.close();
    boolean var17 = var13.isClosed();
    java.util.Iterator var18 = var13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test115");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var6.withCommentMarker(' ');
    boolean var11 = var10.isEscapeCharacterSet();
    boolean var12 = var10.isNullStringSet();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var15 = var10.withIgnoreSurroundingSpaces(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test116");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withEscape('a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false", var5);
    java.util.Map var7 = var6.getHeaderMap();
    java.util.List var8 = var6.getRecords();
    java.util.Map var9 = var6.getHeaderMap();
    var6.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var6.getRecords();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
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
    assertNull(var9);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test117");


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
    org.apache.commons.csv.CSVFormat var14 = var12.withNullString("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var16 = var12.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var17 = var12.withIgnoreEmptyLines();
    
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
    assertNotNull(var17);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test118");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.String[] var7 = var4.getHeaderComments();
    org.apache.commons.csv.QuoteMode var8 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withCommentMarker((java.lang.Character)'a');
    char var11 = var10.getDelimiter();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var13.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var16 = var15.getQuoteMode();
    boolean var17 = var15.isCommentMarkerSet();
    boolean var18 = var15.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var21 = var20.getHeader();
    boolean var22 = var20.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var25 = var24.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var27 = var25.withRecordSeparator('a');
    java.lang.Object[] var28 = new java.lang.Object[] { var25};
    org.apache.commons.csv.CSVFormat var29 = var20.withHeaderComments(var28);
    java.lang.String[] var30 = var29.getHeaderComments();
    org.apache.commons.csv.CSVFormat var31 = var15.withHeaderComments((java.lang.Object[])var30);
    org.apache.commons.csv.CSVFormat var32 = var10.withHeader(var30);
    org.apache.commons.csv.CSVFormat var34 = var32.withRecordSeparator('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
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

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test119");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    org.apache.commons.csv.CSVFormat var9 = var5.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var10 = var5.getQuoteMode();
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var13 = var11.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var15 = var13.withEscape(' ');
    java.lang.String var16 = var15.toString();
    org.apache.commons.csv.CSVParser var17 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:falsea", var15);
    boolean var18 = var17.isClosed();
    java.util.List var19 = var17.getRecords();
    boolean var20 = var17.isClosed();
    java.util.Spliterator var21 = var17.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=<#> Escape=< > CommentStart=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true"+ "'", var16.equals("Delimiter=<#> Escape=< > CommentStart=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test120");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var8.withDelimiter(' ');
    java.lang.String[] var11 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var10.withAllowMissingColumnNames(true);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test121");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    char var6 = var5.getDelimiter();
    org.apache.commons.csv.CSVFormat var8 = var5.withDelimiter('4');
    boolean var9 = var5.isCommentMarkerSet();
    org.apache.commons.csv.CSVParser var10 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> RecordSeparator=<a> SkipHeaderRecord:true", var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test122");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var5 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var7 = var5.withDelimiter('#');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var5);
    boolean var10 = var5.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var5.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var20 = var19.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var22 = var20.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var24 = var22.withEscape(' ');
    java.lang.String[] var26 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var27 = var22.withHeader(var26);
    org.apache.commons.csv.CSVFormat var28 = var15.withHeader(var26);
    org.apache.commons.csv.CSVFormat var29 = var5.withHeader(var26);
    org.apache.commons.csv.CSVFormat var31 = var5.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var32 = var31.withSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test123");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    java.lang.String[] var4 = var1.getHeaderComments();
    java.lang.String[] var5 = var1.getHeader();
    java.lang.String[] var6 = var1.getHeader();
    org.apache.commons.csv.CSVFormat var8 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var11 = var10.getHeader();
    boolean var12 = var10.isCommentMarkerSet();
    boolean var13 = var10.getIgnoreSurroundingSpaces();
    boolean var14 = var10.isNullStringSet();
    org.apache.commons.csv.CSVFormat var16 = var10.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var17 = var10.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var19 = var10.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var21.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var23 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var24 = var21.withHeaderComments((java.lang.Object[])var23);
    boolean var25 = var10.equals((java.lang.Object)var24);
    java.lang.String[] var26 = var10.getHeader();
    java.lang.Character var27 = var10.getCommentMarker();
    org.apache.commons.csv.CSVFormat var31 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var32 = var31.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var34 = var32.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var36 = var34.withEscape(' ');
    java.lang.String[] var38 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var39 = var34.withHeader(var38);
    org.apache.commons.csv.CSVFormat var41 = var39.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVParser var42 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true", var39);
    org.apache.commons.csv.CSVParser var43 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:true", var39);
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var46 = var45.withIgnoreEmptyLines();
    java.lang.String var47 = var45.toString();
    boolean var48 = var45.isEscapeCharacterSet();
    boolean var49 = var45.getIgnoreSurroundingSpaces();
    boolean var50 = var39.equals((java.lang.Object)var45);
    java.lang.String[] var51 = var39.getHeader();
    org.apache.commons.csv.CSVFormat var52 = var10.withHeader(var51);
    org.apache.commons.csv.CSVFormat var53 = var1.withHeaderComments((java.lang.Object[])var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var47.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test124");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    boolean var5 = var4.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var6 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Default#Excel#MySQL#RFC4180#TDF");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test125");


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
    org.apache.commons.csv.CSVFormat var14 = var12.withNullString("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var16 = var12.withNullString("Default4Excel4MySQL4RFC41804TDFa");
    org.apache.commons.csv.CSVFormat var18 = var12.withRecordSeparator('a');
    
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

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test126");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreEmptyLines();
    java.lang.String var8 = var6.toString();
    java.lang.Object[] var9 = new java.lang.Object[] { var6};
    java.lang.String var10 = var1.format(var9);
    org.apache.commons.csv.CSVFormat var12 = var1.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var14 = var1.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var16 = var14.withQuote((java.lang.Character)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var8.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var10.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test127");


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
    org.apache.commons.csv.CSVFormat var33 = var6.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var35 = var6.withQuote((java.lang.Character)'a');
    boolean var36 = var6.getIgnoreHeaderCase();
    
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
    assertTrue(var36 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test128");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    boolean var5 = var3.isCommentMarkerSet();
    boolean var6 = var3.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var9 = var8.getHeader();
    boolean var10 = var8.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator('a');
    java.lang.Object[] var16 = new java.lang.Object[] { var13};
    org.apache.commons.csv.CSVFormat var17 = var8.withHeaderComments(var16);
    java.lang.String[] var18 = var17.getHeaderComments();
    org.apache.commons.csv.CSVFormat var19 = var3.withHeaderComments((java.lang.Object[])var18);
    java.lang.String var20 = var19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false HeaderComments:[Delimiter=<#> SkipHeaderRecord:true]"+ "'", var20.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false HeaderComments:[Delimiter=<#> SkipHeaderRecord:true]"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test129");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var4.getCommentMarker();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var17 = var15.withEscape(' ');
    org.apache.commons.csv.CSVFormat var19 = var15.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var20 = var15.getQuoteMode();
    org.apache.commons.csv.CSVFormat var21 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var23 = var21.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var25 = var21.withNullString("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var27 = var21.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var30 = var29.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var32 = var30.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var34 = var32.withEscape(' ');
    java.lang.String[] var36 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var37 = var32.withHeader(var36);
    org.apache.commons.csv.CSVFormat var39 = var37.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var41 = var37.withEscape(' ');
    org.apache.commons.csv.CSVFormat var43 = var41.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var45 = var41.withCommentMarker('4');
    boolean var46 = var41.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var49 = var48.getHeader();
    boolean var50 = var48.isCommentMarkerSet();
    boolean var51 = var48.getIgnoreSurroundingSpaces();
    boolean var52 = var48.isNullStringSet();
    org.apache.commons.csv.CSVFormat var54 = var48.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var55 = var48.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var56 = var55.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var57 = var56.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var59 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var60 = var59.getHeader();
    boolean var61 = var59.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var63 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var64 = var63.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var66 = var64.withRecordSeparator('a');
    java.lang.Object[] var67 = new java.lang.Object[] { var64};
    org.apache.commons.csv.CSVFormat var68 = var59.withHeaderComments(var67);
    java.lang.String[] var69 = var68.getHeaderComments();
    org.apache.commons.csv.CSVFormat var70 = var57.withHeader(var69);
    org.apache.commons.csv.CSVFormat var71 = var41.withHeader(var69);
    java.lang.String var72 = var21.format((java.lang.Object[])var69);
    org.apache.commons.csv.CSVFormat var73 = var4.withHeader(var69);
    boolean var74 = var73.getAllowMissingColumnNames();
    boolean var75 = var73.getIgnoreSurroundingSpaces();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
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
    assertTrue("'" + var72 + "' != '" + "Delimiter=<#> SkipHeaderRecord:truea"+ "'", var72.equals("Delimiter=<#> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test130");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var6 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord(true);
    
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

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test131");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    java.lang.String[] var11 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreHeaderCase(false);
    java.lang.Character var14 = var13.getCommentMarker();
    boolean var15 = var13.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var17 = var13.withDelimiter('#');
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test132");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.QuoteMode var6 = var5.getQuoteMode();
    boolean var7 = var5.isEscapeCharacterSet();
    java.lang.Character var8 = var5.getEscapeCharacter();
    boolean var9 = var5.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreSurroundingSpaces(true);
    char var12 = var11.getDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == '#');

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test133");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    java.lang.Character var11 = var5.getCommentMarker();
    org.apache.commons.csv.CSVFormat var12 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("", var5);
    java.util.Map var14 = var13.getHeaderMap();
    long var15 = var13.getCurrentLineNumber();
    java.util.Map var16 = var13.getHeaderMap();
    long var17 = var13.getRecordNumber();
    long var18 = var13.getRecordNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test134");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var2.withQuote((java.lang.Character)'4');
    boolean var7 = var6.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var6.withEscape('a');
    org.apache.commons.csv.CSVFormat var11 = var9.withQuote(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test135");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat.Predefined var1 = org.apache.commons.csv.CSVFormat.Predefined.valueOf("Default#Excel#MySQL#RFC4180#TDF");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test136");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String var5 = var4.toString();
    org.apache.commons.csv.CSVFormat var7 = var4.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.QuoteMode var8 = var7.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var7.withQuote((java.lang.Character)' ');
    boolean var11 = var10.getIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode var12 = var10.getQuoteMode();
    org.apache.commons.csv.CSVFormat var14 = var10.withNullString("Delimiter=< > SkipHeaderRecord:false");
    boolean var15 = var10.getIgnoreEmptyLines();
    boolean var16 = var10.isEscapeCharacterSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var5.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test137");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var15 = var11.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var16 = var11.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var18 = var16.withCommentMarker((java.lang.Character)'a');
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test138");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var14 = var10.withNullString("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var15 = var14.withIgnoreEmptyLines();
    boolean var16 = var14.isQuoteCharacterSet();
    java.lang.String var17 = var14.getRecordSeparator();
    char var18 = var14.getDelimiter();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "a"+ "'", var17.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == '#');

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test139");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var9.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator('a');
    char var18 = var17.getDelimiter();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var20.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var23 = var22.getQuoteMode();
    org.apache.commons.csv.CSVFormat var25 = var22.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var27 = var22.withSkipHeaderRecord(false);
    java.lang.String[] var29 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var30 = var27.withHeader(var29);
    java.lang.String var31 = var17.format((java.lang.Object[])var29);
    org.apache.commons.csv.CSVFormat var32 = var12.withHeaderComments((java.lang.Object[])var29);
    boolean var33 = var32.getAllowMissingColumnNames();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Delimiter=<#> SkipHeaderRecord:falsea"+ "'", var31.equals("Delimiter=<#> SkipHeaderRecord:falsea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test140");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var9 = var5.withDelimiter(' ');
    boolean var11 = var9.equals((java.lang.Object)'4');
    org.apache.commons.csv.CSVFormat var13 = var9.withNullString("hi!");
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("", var9);
    boolean var15 = var9.isNullStringSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test141");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    java.lang.String var6 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var7 = var1.withAllowMissingColumnNames();
    boolean var8 = var7.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var7.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var12 = var7.withRecordSeparator("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test142");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var1.toString();
    boolean var4 = var1.isEscapeCharacterSet();
    boolean var5 = var1.getIgnoreSurroundingSpaces();
    boolean var6 = var1.isCommentMarkerSet();
    boolean var7 = var1.getAllowMissingColumnNames();
    boolean var8 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var10 = var1.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var11 = var1.withIgnoreEmptyLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var3.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test143");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var1.toString();
    boolean var4 = var1.isEscapeCharacterSet();
    boolean var5 = var1.getIgnoreSurroundingSpaces();
    boolean var6 = var1.isCommentMarkerSet();
    boolean var7 = var1.getAllowMissingColumnNames();
    boolean var8 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var10 = var1.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var11 = var10.withAllowMissingColumnNames();
    java.lang.String[] var12 = var11.getHeader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var3.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test144");


    org.apache.commons.csv.CSVFormat var3 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var8 = var6.withEscape(' ');
    java.lang.String[] var10 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var11 = var6.withHeader(var10);
    org.apache.commons.csv.CSVFormat var13 = var11.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true", var11);
    org.apache.commons.csv.CSVParser var15 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:true", var11);
    long var16 = var15.getRecordNumber();
    java.util.List var17 = var15.getRecords();
    java.util.List var18 = var15.getRecords();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test145");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var8 = var6.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var10 = var6.withRecordSeparator("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var11 = var10.withIgnoreSurroundingSpaces();
    boolean var12 = var10.getIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
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

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test146");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.QuoteMode var11 = var8.getQuoteMode();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var14 = var13.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var16 = var14.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var18 = var14.withQuote((java.lang.Character)'4');
    boolean var19 = var18.isQuoteCharacterSet();
    boolean var20 = var8.equals((java.lang.Object)var18);
    java.lang.String var21 = var18.getNullString();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test147");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    org.apache.commons.csv.CSVFormat var9 = var5.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var10 = var5.getQuoteMode();
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreEmptyLines();
    boolean var13 = var11.equals((java.lang.Object)(-1.0f));
    org.apache.commons.csv.CSVFormat var15 = var11.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var17 = var15.withEscape('a');
    org.apache.commons.csv.CSVParser var18 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true", var15);
    org.apache.commons.csv.CSVFormat var20 = var15.withCommentMarker('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test148");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var2.toString();
    boolean var4 = var2.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var6 = var2.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var8 = var6.withRecordSeparator("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:false");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false"+ "'", var3.equals("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test149");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var9.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var13 = var9.withEscape(' ');
    org.apache.commons.csv.CSVFormat var15 = var13.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var17 = var13.withCommentMarker('4');
    boolean var18 = var13.isCommentMarkerSet();
    java.lang.String var19 = var13.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var21.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var24 = var22.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var26 = var24.withQuote((java.lang.Character)'4');
    java.lang.String[] var27 = var24.getHeaderComments();
    org.apache.commons.csv.CSVFormat var28 = var24.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var31 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var33 = var31.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var34 = var33.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var36 = var34.withDelimiter('#');
    boolean var37 = var34.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var38 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var34);
    boolean var39 = var34.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var41 = var34.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var43.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var46 = var44.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var49 = var48.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var51 = var49.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var53 = var51.withEscape(' ');
    java.lang.String[] var55 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var56 = var51.withHeader(var55);
    org.apache.commons.csv.CSVFormat var57 = var44.withHeader(var55);
    org.apache.commons.csv.CSVFormat var58 = var34.withHeader(var55);
    org.apache.commons.csv.CSVFormat var59 = var28.withHeader(var55);
    boolean var60 = var13.equals((java.lang.Object)var28);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "a"+ "'", var19.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
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
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test150");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var13 = var11.withEscape(' ');
    java.lang.String[] var15 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var16 = var11.withHeader(var15);
    java.lang.Character var17 = var11.getCommentMarker();
    org.apache.commons.csv.CSVFormat var18 = var11.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var19 = org.apache.commons.csv.CSVParser.parse("", var11);
    java.util.Spliterator var20 = var19.spliterator();
    java.util.Map var21 = var19.getHeaderMap();
    java.util.Spliterator var22 = var19.spliterator();
    boolean var23 = var5.equals((java.lang.Object)var19);
    java.lang.Character var24 = var5.getCommentMarker();
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var27 = var26.withSkipHeaderRecord();
    boolean var28 = var26.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var30 = var26.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var31 = var30.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var33 = var30.withRecordSeparator('4');
    java.lang.Character var34 = var30.getQuoteCharacter();
    java.lang.String var35 = var30.toString();
    org.apache.commons.csv.CSVFormat var37 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var39 = var37.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var40 = var39.getQuoteMode();
    org.apache.commons.csv.CSVFormat var42 = var39.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var44 = var39.withSkipHeaderRecord(false);
    java.lang.String[] var46 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var47 = var44.withHeader(var46);
    org.apache.commons.csv.CSVFormat var48 = var30.withHeader(var46);
    org.apache.commons.csv.CSVFormat var49 = var5.withHeader(var46);
    java.lang.String[] var50 = var49.getHeaderComments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ' '+ "'", var24.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Delimiter=<#> CommentStart=< > SkipHeaderRecord:false"+ "'", var35.equals("Delimiter=<#> CommentStart=< > SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test151");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    java.lang.Character var11 = var5.getCommentMarker();
    org.apache.commons.csv.CSVFormat var12 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("", var5);
    java.util.Spliterator var14 = var13.spliterator();
    java.util.Map var15 = var13.getHeaderMap();
    var13.close();
    boolean var17 = var13.isClosed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var13.getRecords();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test152");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker('a');
    boolean var6 = var5.getIgnoreEmptyLines();
    boolean var7 = var5.getIgnoreHeaderCase();
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    java.lang.String var9 = var5.getNullString();
    java.lang.String var10 = var5.toString();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=<#> CommentStart=<a> SkipHeaderRecord:false"+ "'", var10.equals("Delimiter=<#> CommentStart=<a> SkipHeaderRecord:false"));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test153");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    boolean var5 = var3.isCommentMarkerSet();
    boolean var6 = var3.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var10 = var3.withSkipHeaderRecord(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test154");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.String[] var7 = var4.getHeaderComments();
    org.apache.commons.csv.QuoteMode var8 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withAllowMissingColumnNames(true);
    java.lang.String var11 = var10.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var15 = var10.withAllowMissingColumnNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "a"+ "'", var11.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test155");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withRecordSeparator("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    boolean var7 = var6.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var8 = var6.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var15 = var13.withEscape(' ');
    java.lang.String[] var17 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var18 = var13.withHeader(var17);
    java.lang.String var19 = var13.toString();
    boolean var20 = var13.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var22 = var13.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var24 = var22.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var27 = var26.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var29 = var27.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var31 = var29.withEscape(' ');
    java.lang.String[] var33 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var34 = var29.withHeader(var33);
    org.apache.commons.csv.CSVFormat var36 = var34.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var38 = var34.withEscape(' ');
    org.apache.commons.csv.CSVFormat var40 = var38.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var42 = var38.withCommentMarker('4');
    boolean var43 = var38.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var46 = var45.getHeader();
    boolean var47 = var45.isCommentMarkerSet();
    boolean var48 = var45.getIgnoreSurroundingSpaces();
    boolean var49 = var45.isNullStringSet();
    org.apache.commons.csv.CSVFormat var51 = var45.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var52 = var45.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var53 = var52.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var54 = var53.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var56 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var57 = var56.getHeader();
    boolean var58 = var56.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var60 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var61 = var60.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var63 = var61.withRecordSeparator('a');
    java.lang.Object[] var64 = new java.lang.Object[] { var61};
    org.apache.commons.csv.CSVFormat var65 = var56.withHeaderComments(var64);
    java.lang.String[] var66 = var65.getHeaderComments();
    org.apache.commons.csv.CSVFormat var67 = var54.withHeader(var66);
    org.apache.commons.csv.CSVFormat var68 = var38.withHeader(var66);
    java.lang.String var69 = var22.format((java.lang.Object[])var66);
    java.lang.String var70 = var8.format((java.lang.Object[])var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var19.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "Delimiter=<#> SkipHeaderRecord:truea"+ "'", var69.equals("Delimiter=<#> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Delimiter=<#> SkipHeaderRecord:trueDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var70.equals("Delimiter=<#> SkipHeaderRecord:trueDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test156");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var12 = var10.withSkipHeaderRecord(true);
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test157");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    char var6 = var5.getDelimiter();
    org.apache.commons.csv.CSVFormat var8 = var5.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var9 = var5.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var5.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true HeaderComments:[Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false]", var5);
    long var13 = var12.getCurrentLineNumber();
    long var14 = var12.getCurrentLineNumber();
    java.util.Spliterator var15 = var12.spliterator();
    java.util.List var16 = var12.getRecords();
    java.util.Iterator var17 = var12.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test158");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var4.withCommentMarker((java.lang.Character)'4');
    java.lang.Character var12 = var11.getCommentMarker();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var19 = var15.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var21 = var15.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var24.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var27 = var26.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var29 = var27.withDelimiter('#');
    boolean var30 = var27.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var31 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var27);
    boolean var32 = var27.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var34 = var27.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var36 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var37 = var36.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var39 = var37.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var41 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var42 = var41.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var44 = var42.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var46 = var44.withEscape(' ');
    java.lang.String[] var48 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var49 = var44.withHeader(var48);
    org.apache.commons.csv.CSVFormat var50 = var37.withHeader(var48);
    org.apache.commons.csv.CSVFormat var51 = var27.withHeader(var48);
    org.apache.commons.csv.CSVFormat var52 = var15.withHeaderComments((java.lang.Object[])var48);
    java.lang.String var53 = var11.format((java.lang.Object[])var48);
    
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
    assertTrue("'" + var12 + "' != '" + '4'+ "'", var12.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"+ "'", var53.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test159");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    boolean var4 = var2.isCommentMarkerSet();
    boolean var5 = var2.getIgnoreSurroundingSpaces();
    boolean var6 = var2.isNullStringSet();
    org.apache.commons.csv.CSVFormat var8 = var2.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var9 = var2.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    boolean var11 = var9.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var13 = var9.withRecordSeparator("Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("Default#Excel#MySQL#RFC4180#TDF", var9);
    java.util.Iterator var15 = var14.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test160");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isNullStringSet();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var11 = var10.getHeader();
    boolean var12 = var10.isCommentMarkerSet();
    boolean var13 = var10.getIgnoreSurroundingSpaces();
    boolean var14 = var10.isNullStringSet();
    org.apache.commons.csv.CSVFormat var16 = var10.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var17 = var10.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var19 = var10.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var21.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var23 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var24 = var21.withHeaderComments((java.lang.Object[])var23);
    boolean var25 = var10.equals((java.lang.Object)var24);
    java.lang.String[] var26 = var10.getHeader();
    java.lang.Character var27 = var10.getCommentMarker();
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var31 = var29.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var32 = var29.getHeaderComments();
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var35 = var34.withIgnoreEmptyLines();
    java.lang.String var36 = var34.toString();
    java.lang.Object[] var37 = new java.lang.Object[] { var34};
    java.lang.String var38 = var29.format(var37);
    org.apache.commons.csv.CSVFormat var40 = var29.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat.Predefined[] var41 = org.apache.commons.csv.CSVFormat.Predefined.values();
    java.lang.String var42 = var29.format((java.lang.Object[])var41);
    java.lang.String var43 = var10.format((java.lang.Object[])var41);
    java.lang.String var44 = var4.format((java.lang.Object[])var41);
    java.lang.Character var45 = var4.getQuoteCharacter();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var36.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var38.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Default#Excel#MySQL#RFC4180#TDF"+ "'", var42.equals("Default#Excel#MySQL#RFC4180#TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Default#Excel#MySQL#RFC4180#TDF"+ "'", var43.equals("Default#Excel#MySQL#RFC4180#TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Default#Excel#MySQL#RFC4180#TDFa"+ "'", var44.equals("Default#Excel#MySQL#RFC4180#TDFa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test161");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat.Predefined var1 = org.apache.commons.csv.CSVFormat.Predefined.valueOf("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false HeaderComments:[Delimiter=<#> SkipHeaderRecord:true]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test162");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    java.lang.String[] var5 = var1.getHeaderComments();
    java.lang.Character var6 = var1.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var7 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.QuoteMode var8 = var7.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var12 = var10.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var13.withDelimiter('#');
    java.lang.String var16 = var15.toString();
    org.apache.commons.csv.CSVFormat var18 = var15.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var21 = var20.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var23 = var21.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var28 = var26.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var30 = var28.withEscape(' ');
    java.lang.String[] var32 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var33 = var28.withHeader(var32);
    org.apache.commons.csv.CSVFormat var34 = var21.withHeader(var32);
    java.lang.String var35 = var15.format((java.lang.Object[])var32);
    org.apache.commons.csv.CSVFormat var36 = var7.withHeader(var32);
    org.apache.commons.csv.CSVFormat var38 = var7.withQuote('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var16.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var35.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test163");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var4.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var15 = var11.withQuote((java.lang.Character)' ');
    org.apache.commons.csv.QuoteMode var16 = var11.getQuoteMode();
    org.apache.commons.csv.CSVFormat var17 = var11.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var19 = var11.withRecordSeparator("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false HeaderComments:[Delimiter=<#> SkipHeaderRecord:true]");
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test164");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    org.apache.commons.csv.CSVFormat var9 = var5.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var10 = var5.getQuoteMode();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var13 = var12.getHeader();
    boolean var14 = var12.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var18 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var19 = var16.withHeaderComments((java.lang.Object[])var18);
    org.apache.commons.csv.CSVFormat var20 = var12.withHeaderComments((java.lang.Object[])var18);
    java.lang.String var21 = var5.format((java.lang.Object[])var18);
    boolean var22 = var5.isCommentMarkerSet();
    java.lang.String var23 = var5.getRecordSeparator();
    boolean var24 = var5.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var26 = var5.withQuote((java.lang.Character)' ');
    char var27 = var26.getDelimiter();
    org.apache.commons.csv.CSVParser var28 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> Escape=<a> RecordSeparator=<a> SkipHeaderRecord:true", var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var21.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "a"+ "'", var23.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test165");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var5 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var5.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var8 = var7.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var7.withIgnoreEmptyLines(true);
    boolean var11 = var3.equals((java.lang.Object)var10);
    org.apache.commons.csv.CSVFormat var13 = var10.withRecordSeparator("Default4Excel4MySQL4RFC41804TDFa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test166");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.Character var7 = var6.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var10 = var9.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var12 = var10.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var14 = var12.withEscape(' ');
    java.lang.String[] var16 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var17 = var12.withHeader(var16);
    org.apache.commons.csv.CSVFormat var19 = var17.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var21 = var17.withEscape(' ');
    org.apache.commons.csv.CSVFormat var23 = var21.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var25 = var21.withCommentMarker('4');
    boolean var26 = var21.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var29 = var28.getHeader();
    boolean var30 = var28.isCommentMarkerSet();
    boolean var31 = var28.getIgnoreSurroundingSpaces();
    boolean var32 = var28.isNullStringSet();
    org.apache.commons.csv.CSVFormat var34 = var28.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var35 = var28.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var36 = var35.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var37 = var36.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var39 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var40 = var39.getHeader();
    boolean var41 = var39.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var43.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var46 = var44.withRecordSeparator('a');
    java.lang.Object[] var47 = new java.lang.Object[] { var44};
    org.apache.commons.csv.CSVFormat var48 = var39.withHeaderComments(var47);
    java.lang.String[] var49 = var48.getHeaderComments();
    org.apache.commons.csv.CSVFormat var50 = var37.withHeader(var49);
    org.apache.commons.csv.CSVFormat var51 = var21.withHeader(var49);
    org.apache.commons.csv.CSVFormat var52 = var6.withHeaderComments((java.lang.Object[])var49);
    java.lang.String var53 = var52.getRecordSeparator();
    org.apache.commons.csv.QuoteMode[] var54 = org.apache.commons.csv.QuoteMode.values();
    java.lang.String var55 = var52.format((java.lang.Object[])var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "a"+ "'", var53.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var55.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test167");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.String var10 = var4.toString();
    boolean var11 = var4.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var13 = var4.withIgnoreHeaderCase(false);
    boolean var14 = var4.isEscapeCharacterSet();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test168");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    boolean var7 = var6.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var6.withIgnoreSurroundingSpaces(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var13 = var6.withQuote((java.lang.Character)'#');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test169");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    org.apache.commons.csv.CSVFormat var9 = var5.withAllowMissingColumnNames(false);
    boolean var10 = var9.getIgnoreSurroundingSpaces();
    boolean var12 = var9.equals((java.lang.Object)1);
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("a", var9);
    org.apache.commons.csv.CSVFormat var14 = var9.withAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test170");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var6 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var10 = var5.withDelimiter('#');
    java.lang.String[] var11 = var5.getHeader();
    
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

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test171");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withQuote('4');
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreSurroundingSpaces(true);
    java.lang.String var11 = var10.toString();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var15.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var18 = var15.getHeaderComments();
    boolean var19 = var15.isCommentMarkerSet();
    java.lang.String var20 = var15.toString();
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var23 = var22.getHeader();
    boolean var24 = var22.isCommentMarkerSet();
    boolean var25 = var22.getIgnoreSurroundingSpaces();
    boolean var26 = var22.isNullStringSet();
    org.apache.commons.csv.CSVFormat var28 = var22.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var29 = var22.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var30 = var29.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var31 = var30.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var34 = var33.getHeader();
    boolean var35 = var33.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var37 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var38 = var37.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var40 = var38.withRecordSeparator('a');
    java.lang.Object[] var41 = new java.lang.Object[] { var38};
    org.apache.commons.csv.CSVFormat var42 = var33.withHeaderComments(var41);
    java.lang.String[] var43 = var42.getHeaderComments();
    org.apache.commons.csv.CSVFormat var44 = var31.withHeader(var43);
    org.apache.commons.csv.CSVFormat var45 = var15.withHeader(var43);
    org.apache.commons.csv.CSVFormat var46 = var10.withHeader(var43);
    org.apache.commons.csv.CSVFormat var48 = var10.withAllowMissingColumnNames(true);
    boolean var49 = var48.isCommentMarkerSet();
    
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
    assertTrue("'" + var11 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var11.equals("Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var20.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test172");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    java.lang.Character var11 = var5.getCommentMarker();
    org.apache.commons.csv.CSVFormat var12 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("", var5);
    java.util.Spliterator var14 = var13.spliterator();
    java.util.Map var15 = var13.getHeaderMap();
    boolean var16 = var13.isClosed();
    long var17 = var13.getRecordNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test173");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withDelimiter('#');
    java.lang.String var7 = var6.toString();
    org.apache.commons.csv.CSVFormat var9 = var6.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var11 = var6.withRecordSeparator('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var7.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test174");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var4.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var10 = var4.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var17 = var15.withEscape(' ');
    java.lang.String[] var19 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var20 = var15.withHeader(var19);
    java.lang.Character var21 = var20.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var22 = var20.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var25 = var24.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var27 = var25.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var29 = var27.withEscape(' ');
    java.lang.String[] var31 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var32 = var27.withHeader(var31);
    org.apache.commons.csv.CSVFormat var33 = var22.withHeader(var31);
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var36 = var35.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var38 = var36.withRecordSeparator('a');
    java.lang.String var39 = var38.toString();
    boolean var40 = var38.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var42 = var38.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var44 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var46 = var44.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var47 = var46.getQuoteMode();
    boolean var48 = var46.isCommentMarkerSet();
    boolean var49 = var46.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var51 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var52 = var51.getHeader();
    boolean var53 = var51.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var55 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var56 = var55.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var58 = var56.withRecordSeparator('a');
    java.lang.Object[] var59 = new java.lang.Object[] { var56};
    org.apache.commons.csv.CSVFormat var60 = var51.withHeaderComments(var59);
    java.lang.String[] var61 = var60.getHeaderComments();
    org.apache.commons.csv.CSVFormat var62 = var46.withHeaderComments((java.lang.Object[])var61);
    org.apache.commons.csv.CSVFormat var63 = var42.withHeader(var61);
    org.apache.commons.csv.CSVFormat var64 = var33.withHeader(var61);
    java.lang.String var65 = var10.format((java.lang.Object[])var61);
    org.apache.commons.csv.CSVFormat var67 = var10.withEscape((java.lang.Character)'a');
    
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
    assertNotNull(var12);
    
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var39.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "Delimiter=<#> SkipHeaderRecord:truea"+ "'", var65.equals("Delimiter=<#> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test175");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var12 = var11.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var13 = var12.withIgnoreSurroundingSpaces();
    boolean var14 = var13.isNullStringSet();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test176");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker('4');
    java.lang.String[] var7 = var6.getHeader();
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var10 = var9.getHeader();
    boolean var11 = var9.isCommentMarkerSet();
    boolean var12 = var9.getIgnoreSurroundingSpaces();
    boolean var13 = var9.isNullStringSet();
    org.apache.commons.csv.CSVFormat var15 = var9.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var17 = var15.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var20 = var19.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var22 = var20.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var24 = var22.withEscape(' ');
    java.lang.Character var25 = var24.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var28 = var27.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var30 = var28.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var32 = var30.withEscape(' ');
    java.lang.String[] var34 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var35 = var30.withHeader(var34);
    org.apache.commons.csv.CSVFormat var37 = var35.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var39 = var35.withEscape(' ');
    org.apache.commons.csv.CSVFormat var41 = var39.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var43 = var39.withCommentMarker('4');
    boolean var44 = var39.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var46 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var47 = var46.getHeader();
    boolean var48 = var46.isCommentMarkerSet();
    boolean var49 = var46.getIgnoreSurroundingSpaces();
    boolean var50 = var46.isNullStringSet();
    org.apache.commons.csv.CSVFormat var52 = var46.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var53 = var46.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var54 = var53.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var55 = var54.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var57 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var58 = var57.getHeader();
    boolean var59 = var57.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var61 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var62 = var61.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var64 = var62.withRecordSeparator('a');
    java.lang.Object[] var65 = new java.lang.Object[] { var62};
    org.apache.commons.csv.CSVFormat var66 = var57.withHeaderComments(var65);
    java.lang.String[] var67 = var66.getHeaderComments();
    org.apache.commons.csv.CSVFormat var68 = var55.withHeader(var67);
    org.apache.commons.csv.CSVFormat var69 = var39.withHeader(var67);
    org.apache.commons.csv.CSVFormat var70 = var24.withHeaderComments((java.lang.Object[])var67);
    java.lang.String var71 = var15.format((java.lang.Object[])var67);
    java.lang.String var72 = var6.format((java.lang.Object[])var67);
    org.apache.commons.csv.CSVFormat var74 = var6.withSkipHeaderRecord(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var71.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var72.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test177");


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
    boolean var17 = var14.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var19 = var14.withIgnoreSurroundingSpaces(true);
    
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
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test178");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withQuote('a');
    org.apache.commons.csv.CSVFormat var8 = var6.withIgnoreEmptyLines(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test179");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('a');
    org.apache.commons.csv.CSVFormat var3 = var1.withQuote((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var7 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var8 = var7.withIgnoreEmptyLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test180");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var13 = var11.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var15 = var13.withNullString("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false");
    java.lang.String[] var16 = var13.getHeader();
    org.apache.commons.csv.CSVFormat var18 = var13.withCommentMarker('a');
    boolean var19 = var13.isCommentMarkerSet();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test181");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var8 = var6.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var10 = var6.withRecordSeparator("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var12 = var6.withRecordSeparator(' ');
    boolean var13 = var12.isEscapeCharacterSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
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

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test182");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var4.getCommentMarker();
    org.apache.commons.csv.CSVFormat var11 = var4.withIgnoreSurroundingSpaces();
    boolean var12 = var11.isQuoteCharacterSet();
    java.lang.Character var13 = var11.getCommentMarker();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test183");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    boolean var4 = var2.isCommentMarkerSet();
    boolean var5 = var2.getIgnoreSurroundingSpaces();
    boolean var6 = var2.isNullStringSet();
    org.apache.commons.csv.CSVFormat var8 = var2.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var9 = var2.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var11 = var2.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var14 = var13.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var15 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var16 = var13.withHeaderComments((java.lang.Object[])var15);
    boolean var17 = var2.equals((java.lang.Object)var16);
    java.lang.String[] var18 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var19 = var2.withAllowMissingColumnNames();
    boolean var20 = var19.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var22.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var25 = var23.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var27 = var25.withEscape(' ');
    java.lang.String[] var29 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var30 = var25.withHeader(var29);
    org.apache.commons.csv.CSVFormat var31 = var19.withHeader(var29);
    boolean var32 = var31.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var34 = var31.withCommentMarker('4');
    org.apache.commons.csv.CSVParser var35 = org.apache.commons.csv.CSVParser.parse("ALL#MINIMAL#NON_NUMERIC#NONEa", var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test184");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var1.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var14 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var15 = var12.withHeaderComments((java.lang.Object[])var14);
    boolean var16 = var1.equals((java.lang.Object)var15);
    org.apache.commons.csv.CSVFormat var17 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat.Predefined[] var18 = org.apache.commons.csv.CSVFormat.Predefined.values();
    java.lang.String var19 = var1.format((java.lang.Object[])var18);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Default#Excel#MySQL#RFC4180#TDF"+ "'", var19.equals("Default#Excel#MySQL#RFC4180#TDF"));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test185");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.String var10 = var4.toString();
    java.lang.String[] var11 = var4.getHeader();
    org.apache.commons.csv.CSVFormat var12 = var4.withSkipHeaderRecord();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test186");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var19 = var17.withEscape(' ');
    boolean var20 = var17.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var21 = org.apache.commons.csv.CSVParser.parse("hi!", var17);
    java.util.Spliterator var22 = var21.spliterator();
    java.util.Map var23 = var21.getHeaderMap();
    boolean var24 = var21.isClosed();
    java.util.List var25 = var21.getRecords();
    boolean var26 = var11.equals((java.lang.Object)var25);
    org.apache.commons.csv.CSVFormat var28 = var11.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var30 = var28.withRecordSeparator("Default#Excel#MySQL#RFC4180#TDFa");
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var34 = var33.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var36 = var34.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var38 = var36.withQuote((java.lang.Character)'4');
    java.lang.Character var39 = var38.getQuoteCharacter();
    boolean var40 = var38.getSkipHeaderRecord();
    boolean var42 = var38.equals((java.lang.Object)(byte)(-1));
    org.apache.commons.csv.CSVParser var43 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var38);
    java.util.Iterator var44 = var43.iterator();
    var43.close();
    long var46 = var43.getRecordNumber();
    boolean var47 = var28.equals((java.lang.Object)var43);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + '4'+ "'", var39.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test187");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = var6.withNullString("");
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var12 = var11.getHeader();
    boolean var13 = var11.isCommentMarkerSet();
    boolean var14 = var11.getIgnoreSurroundingSpaces();
    boolean var15 = var11.isNullStringSet();
    org.apache.commons.csv.CSVFormat var17 = var11.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var18 = var11.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var20 = var11.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var22.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var24 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var25 = var22.withHeaderComments((java.lang.Object[])var24);
    boolean var26 = var11.equals((java.lang.Object)var25);
    java.lang.String[] var27 = var11.getHeader();
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var30 = var29.getHeader();
    boolean var31 = var29.isCommentMarkerSet();
    boolean var32 = var29.getIgnoreSurroundingSpaces();
    boolean var33 = var29.isNullStringSet();
    org.apache.commons.csv.CSVFormat var35 = var29.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat.Predefined[] var36 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var37 = var29.withHeaderComments((java.lang.Object[])var36);
    java.lang.String var38 = var11.format((java.lang.Object[])var36);
    org.apache.commons.csv.CSVFormat var39 = var9.withHeaderComments((java.lang.Object[])var36);
    boolean var40 = var39.isNullStringSet();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Default#Excel#MySQL#RFC4180#TDF"+ "'", var38.equals("Default#Excel#MySQL#RFC4180#TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test188");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreEmptyLines();
    boolean var9 = var1.isEscapeCharacterSet();
    
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

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test189");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    java.lang.String var9 = var4.getNullString();
    org.apache.commons.csv.CSVFormat var11 = var4.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var13 = var4.withNullString("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    java.lang.String var14 = var13.toString();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Delimiter=<#> NullString=<Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var14.equals("Delimiter=<#> NullString=<Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true> RecordSeparator=<a> SkipHeaderRecord:true"));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test190");


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
    org.apache.commons.csv.CSVFormat var40 = var38.withAllowMissingColumnNames(false);
    
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
    assertNotNull(var40);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test191");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var9.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var13 = var9.withEscape(' ');
    org.apache.commons.csv.CSVFormat var15 = var13.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var17 = var13.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var19 = var13.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var21 = var13.withRecordSeparator("Delimiter=<#> CommentStart=<4> NullString=<Delimiter=<#> SkipHeaderRecord:false> RecordSeparator=<Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var22 = var13.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var24 = var13.withDelimiter('#');
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test192");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    boolean var13 = var10.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var15 = var10.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var17 = var15.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var18 = var15.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var21 = var20.getHeader();
    boolean var22 = var20.isCommentMarkerSet();
    boolean var23 = var20.getIgnoreSurroundingSpaces();
    boolean var24 = var20.isNullStringSet();
    org.apache.commons.csv.CSVFormat var26 = var20.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var27 = var20.withIgnoreSurroundingSpaces();
    boolean var28 = var27.isNullStringSet();
    org.apache.commons.csv.CSVFormat.Predefined[] var29 = org.apache.commons.csv.CSVFormat.Predefined.values();
    boolean var30 = var27.equals((java.lang.Object)var29);
    java.lang.String var31 = var15.format((java.lang.Object[])var29);
    org.apache.commons.csv.QuoteMode var32 = var15.getQuoteMode();
    org.apache.commons.csv.CSVFormat var34 = var15.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var35 = var34.withIgnoreEmptyLines();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Default4Excel4MySQL4RFC41804TDFa"+ "'", var31.equals("Default4Excel4MySQL4RFC41804TDFa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test193");


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
    org.apache.commons.csv.CSVFormat var17 = var2.withRecordSeparator("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var19 = var17.withEscape((java.lang.Character)'a');
    boolean var20 = var17.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var22 = var17.withQuote((java.lang.Character)'4');
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test194");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var9.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var11 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var13 = var11.withQuote((java.lang.Character)' ');
    boolean var14 = var11.getSkipHeaderRecord();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test195");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    boolean var5 = var3.isNullStringSet();
    org.apache.commons.csv.CSVFormat var6 = var3.withSkipHeaderRecord();
    boolean var7 = var3.isEscapeCharacterSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test196");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var13 = var9.withIgnoreHeaderCase(false);
    org.apache.commons.csv.QuoteMode var14 = var13.getQuoteMode();
    boolean var15 = var13.getIgnoreHeaderCase();
    boolean var16 = var13.getIgnoreEmptyLines();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test197");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    java.lang.String[] var5 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var7 = var1.withDelimiter(' ');
    java.lang.String var8 = var1.getNullString();
    org.apache.commons.csv.CSVFormat var10 = var1.withNullString("4");
    char var11 = var10.getDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '#');

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test198");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    boolean var5 = var4.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreEmptyLines();
    boolean var7 = var6.getIgnoreEmptyLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test199");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreHeaderCase(false);
    java.lang.Character var11 = var10.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var13 = var10.withRecordSeparator(' ');
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test200");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    java.lang.Character var8 = var7.getQuoteCharacter();
    boolean var9 = var7.getSkipHeaderRecord();
    java.lang.Character var10 = var7.getEscapeCharacter();
    char var11 = var7.getDelimiter();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var14 = var13.getHeader();
    boolean var15 = var13.isCommentMarkerSet();
    boolean var16 = var13.getIgnoreSurroundingSpaces();
    boolean var17 = var13.isNullStringSet();
    org.apache.commons.csv.CSVFormat var19 = var13.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var20 = var13.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var22 = var13.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var25 = var24.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var26 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var27 = var24.withHeaderComments((java.lang.Object[])var26);
    boolean var28 = var13.equals((java.lang.Object)var27);
    java.lang.String[] var29 = var13.getHeader();
    org.apache.commons.csv.CSVFormat var30 = var13.withAllowMissingColumnNames();
    boolean var31 = var30.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var34 = var33.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var36 = var34.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var38 = var36.withEscape(' ');
    java.lang.String[] var40 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var41 = var36.withHeader(var40);
    org.apache.commons.csv.CSVFormat var42 = var30.withHeader(var40);
    org.apache.commons.csv.CSVFormat var43 = var7.withHeader(var40);
    org.apache.commons.csv.CSVFormat var44 = var7.withSkipHeaderRecord();
    org.apache.commons.csv.CSVParser var45 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#>  RecordSeparator=<a>  SkipHeaderRecord:true Delimiter=< #>  SkipHeaderRecord:truea", var7);
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test201");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    java.lang.Character var8 = var7.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var10 = var7.withNullString("");
    java.lang.String var11 = var10.toString();
    org.apache.commons.csv.CSVFormat var13 = var10.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var13);
    java.util.Spliterator var15 = var14.spliterator();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var11.equals("Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test202");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    boolean var13 = var10.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var15 = var10.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var17 = var15.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var18 = var15.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var21 = var20.getHeader();
    boolean var22 = var20.isCommentMarkerSet();
    boolean var23 = var20.getIgnoreSurroundingSpaces();
    boolean var24 = var20.isNullStringSet();
    org.apache.commons.csv.CSVFormat var26 = var20.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var27 = var20.withIgnoreSurroundingSpaces();
    boolean var28 = var27.isNullStringSet();
    org.apache.commons.csv.CSVFormat.Predefined[] var29 = org.apache.commons.csv.CSVFormat.Predefined.values();
    boolean var30 = var27.equals((java.lang.Object)var29);
    java.lang.String var31 = var15.format((java.lang.Object[])var29);
    org.apache.commons.csv.QuoteMode var32 = var15.getQuoteMode();
    org.apache.commons.csv.CSVFormat var33 = var15.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var35 = var15.withNullString("Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true");
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Default4Excel4MySQL4RFC41804TDFa"+ "'", var31.equals("Default4Excel4MySQL4RFC41804TDFa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test203");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    char var5 = var4.getDelimiter();
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var10 = var9.getQuoteMode();
    org.apache.commons.csv.CSVFormat var12 = var9.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var14 = var9.withSkipHeaderRecord(false);
    java.lang.String[] var16 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var17 = var14.withHeader(var16);
    java.lang.String var18 = var4.format((java.lang.Object[])var16);
    org.apache.commons.csv.CSVFormat var20 = var4.withNullString("");
    boolean var21 = var20.getIgnoreHeaderCase();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Delimiter=<#> SkipHeaderRecord:falsea"+ "'", var18.equals("Delimiter=<#> SkipHeaderRecord:falsea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test204");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker('4');
    char var7 = var6.getDelimiter();
    boolean var8 = var6.getAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test205");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    org.apache.commons.csv.CSVFormat var4 = var1.withQuote(' ');
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var11 = var9.withEscape(' ');
    java.lang.String[] var13 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var14 = var9.withHeader(var13);
    org.apache.commons.csv.CSVFormat var16 = var14.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var18 = var14.withEscape(' ');
    org.apache.commons.csv.CSVFormat var20 = var18.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var22 = var18.withCommentMarker('4');
    boolean var23 = var18.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var25 = var18.withCommentMarker((java.lang.Character)'4');
    boolean var26 = var1.equals((java.lang.Object)var18);
    boolean var27 = var18.getAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test206");


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
    java.util.Iterator var15 = var12.iterator();
    long var16 = var12.getRecordNumber();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test207");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    boolean var13 = var10.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var15 = var10.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var18 = var17.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var20 = var18.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var22 = var20.withEscape(' ');
    java.lang.String[] var24 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var25 = var20.withHeader(var24);
    java.lang.String var26 = var20.toString();
    boolean var27 = var20.getIgnoreHeaderCase();
    boolean var28 = var20.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var31 = var30.getHeader();
    boolean var32 = var30.isCommentMarkerSet();
    boolean var33 = var30.getIgnoreSurroundingSpaces();
    boolean var34 = var30.isNullStringSet();
    org.apache.commons.csv.CSVFormat var36 = var30.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var38 = var36.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var41 = var40.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var43 = var41.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var45 = var43.withEscape(' ');
    java.lang.Character var46 = var45.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var49 = var48.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var51 = var49.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var53 = var51.withEscape(' ');
    java.lang.String[] var55 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var56 = var51.withHeader(var55);
    org.apache.commons.csv.CSVFormat var58 = var56.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var60 = var56.withEscape(' ');
    org.apache.commons.csv.CSVFormat var62 = var60.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var64 = var60.withCommentMarker('4');
    boolean var65 = var60.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var67 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var68 = var67.getHeader();
    boolean var69 = var67.isCommentMarkerSet();
    boolean var70 = var67.getIgnoreSurroundingSpaces();
    boolean var71 = var67.isNullStringSet();
    org.apache.commons.csv.CSVFormat var73 = var67.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var74 = var67.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var75 = var74.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var76 = var75.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var78 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var79 = var78.getHeader();
    boolean var80 = var78.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var82 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var83 = var82.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var85 = var83.withRecordSeparator('a');
    java.lang.Object[] var86 = new java.lang.Object[] { var83};
    org.apache.commons.csv.CSVFormat var87 = var78.withHeaderComments(var86);
    java.lang.String[] var88 = var87.getHeaderComments();
    org.apache.commons.csv.CSVFormat var89 = var76.withHeader(var88);
    org.apache.commons.csv.CSVFormat var90 = var60.withHeader(var88);
    org.apache.commons.csv.CSVFormat var91 = var45.withHeaderComments((java.lang.Object[])var88);
    java.lang.String var92 = var36.format((java.lang.Object[])var88);
    org.apache.commons.csv.CSVFormat var93 = var20.withHeader(var88);
    org.apache.commons.csv.CSVFormat var94 = var10.withHeader(var88);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var26.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var92.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test208");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    boolean var5 = var3.isCommentMarkerSet();
    boolean var6 = var3.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var9 = var8.getHeader();
    boolean var10 = var8.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator('a');
    java.lang.Object[] var16 = new java.lang.Object[] { var13};
    org.apache.commons.csv.CSVFormat var17 = var8.withHeaderComments(var16);
    java.lang.String[] var18 = var17.getHeaderComments();
    org.apache.commons.csv.CSVFormat var19 = var3.withHeaderComments((java.lang.Object[])var18);
    char var20 = var3.getDelimiter();
    boolean var21 = var3.isCommentMarkerSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test209");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String var5 = var4.toString();
    org.apache.commons.csv.CSVFormat var7 = var4.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var8 = var7.withIgnoreEmptyLines();
    boolean var9 = var8.isNullStringSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var5.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test210");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var2.toString();
    boolean var4 = var2.isQuoteCharacterSet();
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
    java.util.Spliterator var29 = var24.spliterator();
    java.util.Spliterator var30 = var24.spliterator();
    var24.close();
    boolean var32 = var2.equals((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false"+ "'", var3.equals("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test211");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<#> CommentStart=<4> SurroundingSpaces:ignored SkipHeaderRecord:false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test212");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var2.withQuote((java.lang.Character)'4');
    boolean var7 = var6.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var6.withQuote((java.lang.Character)' ');
    boolean var10 = var9.isNullStringSet();
    org.apache.commons.csv.QuoteMode var11 = var9.getQuoteMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test213");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    boolean var10 = var4.isNullStringSet();
    org.apache.commons.csv.CSVFormat var11 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var13 = var4.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var14 = var4.withIgnoreSurroundingSpaces();
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test214");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    boolean var13 = var10.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var15 = var10.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var17 = var15.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var18 = var15.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var21 = var20.getHeader();
    boolean var22 = var20.isCommentMarkerSet();
    boolean var23 = var20.getIgnoreSurroundingSpaces();
    boolean var24 = var20.isNullStringSet();
    org.apache.commons.csv.CSVFormat var26 = var20.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var27 = var20.withIgnoreSurroundingSpaces();
    boolean var28 = var27.isNullStringSet();
    org.apache.commons.csv.CSVFormat.Predefined[] var29 = org.apache.commons.csv.CSVFormat.Predefined.values();
    boolean var30 = var27.equals((java.lang.Object)var29);
    java.lang.String var31 = var15.format((java.lang.Object[])var29);
    org.apache.commons.csv.QuoteMode var32 = var15.getQuoteMode();
    java.lang.String[] var33 = var15.getHeaderComments();
    org.apache.commons.csv.CSVFormat var35 = var15.withCommentMarker('#');
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Default4Excel4MySQL4RFC41804TDFa"+ "'", var31.equals("Default4Excel4MySQL4RFC41804TDFa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test215");


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
    org.apache.commons.csv.CSVFormat var17 = var2.withRecordSeparator("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:true");
    boolean var20 = var17.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var22.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var25 = var23.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var27 = var25.withEscape(' ');
    org.apache.commons.csv.CSVFormat var29 = var25.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var30 = var25.getQuoteMode();
    org.apache.commons.csv.CSVFormat var31 = var25.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var33 = var31.withCommentMarker('4');
    boolean var34 = var31.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var36 = var31.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var38 = var36.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var39 = var36.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var41 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var42 = var41.getHeader();
    boolean var43 = var41.isCommentMarkerSet();
    boolean var44 = var41.getIgnoreSurroundingSpaces();
    boolean var45 = var41.isNullStringSet();
    org.apache.commons.csv.CSVFormat var47 = var41.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var48 = var41.withIgnoreSurroundingSpaces();
    boolean var49 = var48.isNullStringSet();
    org.apache.commons.csv.CSVFormat.Predefined[] var50 = org.apache.commons.csv.CSVFormat.Predefined.values();
    boolean var51 = var48.equals((java.lang.Object)var50);
    java.lang.String var52 = var36.format((java.lang.Object[])var50);
    org.apache.commons.csv.CSVFormat var53 = var17.withHeaderComments((java.lang.Object[])var50);
    org.apache.commons.csv.CSVFormat var55 = var17.withCommentMarker((java.lang.Character)' ');
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
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
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Default4Excel4MySQL4RFC41804TDFa"+ "'", var52.equals("Default4Excel4MySQL4RFC41804TDFa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test216");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var6.withNullString("Delimiter=<#> Escape=<a> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var14 = var10.withAllowMissingColumnNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test217");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var5 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var6 = var5.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withRecordSeparator('a');
    java.lang.Object[] var9 = new java.lang.Object[] { var6};
    org.apache.commons.csv.CSVFormat var10 = var1.withHeaderComments(var9);
    org.apache.commons.csv.CSVFormat var12 = var10.withEscape('4');
    org.apache.commons.csv.CSVFormat var13 = var12.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var14 = var12.withSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test218");


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
    java.lang.Character var38 = var37.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var40 = var37.withIgnoreHeaderCase(false);
    
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
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test219");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var9.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var11 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var13 = var11.withQuote((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var15 = var11.withNullString("Delimiter=<#> QuoteChar=<4> RecordSeparator=<hi!> SkipHeaderRecord:true");
    java.lang.String[] var16 = var11.getHeaderComments();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test220");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var5 = var1.withEscape((java.lang.Character)'#');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var3.equals("Delimiter=<#> SkipHeaderRecord:false"));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test221");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var9 = var8.withIgnoreSurroundingSpaces();
    boolean var10 = var9.isNullStringSet();
    
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
    assertTrue(var10 == false);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test222");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var13 = var12.getHeader();
    boolean var14 = var12.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('a');
    java.lang.Object[] var20 = new java.lang.Object[] { var17};
    org.apache.commons.csv.CSVFormat var21 = var12.withHeaderComments(var20);
    java.lang.String[] var22 = var21.getHeaderComments();
    org.apache.commons.csv.CSVFormat var23 = var10.withHeader(var22);
    org.apache.commons.csv.CSVFormat var24 = var23.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var26 = var24.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false HeaderComments:[ALL, MINIMAL, NON_NUMERIC, NONE]");
    org.apache.commons.csv.CSVFormat var27 = var24.withIgnoreEmptyLines();
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test223");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var7 = var4.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var10 = var9.withSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test224");


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
    java.util.Spliterator var15 = var12.spliterator();
    var12.close();
    
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
    assertNotNull(var15);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test225");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var14 = var10.withNullString("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var16 = var10.withEscape((java.lang.Character)'4');
    java.lang.String var17 = var10.getRecordSeparator();
    boolean var18 = var10.isNullStringSet();
    org.apache.commons.csv.CSVFormat var20 = var10.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var22 = var20.withQuote((java.lang.Character)'4');
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "a"+ "'", var17.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test226");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var9 = var5.withDelimiter(' ');
    boolean var11 = var9.equals((java.lang.Object)'4');
    org.apache.commons.csv.CSVFormat var13 = var9.withNullString("hi!");
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("", var9);
    long var15 = var14.getCurrentLineNumber();
    long var16 = var14.getRecordNumber();
    java.util.Iterator var17 = var14.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test227");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    boolean var5 = var3.isCommentMarkerSet();
    boolean var6 = var3.isQuoteCharacterSet();
    boolean var7 = var3.getAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test228");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var1.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var14 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var15 = var12.withHeaderComments((java.lang.Object[])var14);
    boolean var16 = var1.equals((java.lang.Object)var15);
    java.lang.String[] var17 = var1.getHeader();
    java.lang.Character var18 = var1.getCommentMarker();
    org.apache.commons.csv.CSVFormat var19 = var1.withIgnoreSurroundingSpaces();
    boolean var20 = var1.isEscapeCharacterSet();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test229");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    java.lang.String var9 = var4.getNullString();
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var12 = var11.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var14 = var12.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var16 = var14.withEscape(' ');
    org.apache.commons.csv.CSVFormat var18 = var14.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var19 = var14.getQuoteMode();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var22 = var21.getHeader();
    boolean var23 = var21.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var27 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var28 = var25.withHeaderComments((java.lang.Object[])var27);
    org.apache.commons.csv.CSVFormat var29 = var21.withHeaderComments((java.lang.Object[])var27);
    java.lang.String var30 = var14.format((java.lang.Object[])var27);
    java.lang.String var31 = var4.format((java.lang.Object[])var27);
    org.apache.commons.csv.QuoteMode var32 = var4.getQuoteMode();
    boolean var33 = var4.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var35 = var4.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var36 = var35.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var38 = var35.withAllowMissingColumnNames(true);
    char var39 = var38.getDelimiter();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var30.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var31.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == '#');

  }

}
