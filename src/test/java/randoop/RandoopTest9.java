package randoop;

import junit.framework.*;

public class RandoopTest9 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test1");


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
    org.apache.commons.csv.CSVFormat var13 = var10.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var15 = var13.withAllowMissingColumnNames(false);
    java.lang.String var16 = var13.getRecordSeparator();
    
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
    assertNull(var16);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test2");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withRecordSeparator("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var8 = var6.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var10 = var6.withAllowMissingColumnNames(false);
    java.lang.String var11 = var6.getNullString();
    java.lang.String[] var12 = var6.getHeaderComments();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test3");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    java.lang.String var11 = var5.toString();
    boolean var12 = var5.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var13 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var15 = var5.withEscape('4');
    org.apache.commons.csv.CSVParser var16 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> RecordSeparator=<a> SkipHeaderRecord:true", var15);
    java.util.Iterator var17 = var16.iterator();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test4");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var9 = var5.withDelimiter(' ');
    boolean var11 = var9.equals((java.lang.Object)'4');
    org.apache.commons.csv.CSVFormat var13 = var9.withNullString("hi!");
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("", var9);
    long var15 = var14.getCurrentLineNumber();
    long var16 = var14.getCurrentLineNumber();
    java.util.List var17 = var14.getRecords();
    java.util.Map var18 = var14.getHeaderMap();
    java.util.Iterator var19 = var14.iterator();
    java.util.List var20 = var14.getRecords();
    java.util.Spliterator var21 = var14.spliterator();
    long var22 = var14.getRecordNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test5");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var80 = var2.withQuote((java.lang.Character)'a');
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

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test6");


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
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    boolean var18 = var16.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var20 = var16.withQuote('a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var22 = var16.withQuote((java.lang.Character)'#');
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test7");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    boolean var5 = var4.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var6 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var4.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var10 = var8.withRecordSeparator('4');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test8");


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
    org.apache.commons.csv.CSVFormat var19 = var13.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var21.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var24 = var22.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var26 = var24.withEscape(' ');
    org.apache.commons.csv.CSVFormat var28 = var24.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var29 = var24.getQuoteMode();
    org.apache.commons.csv.CSVFormat var30 = var24.withIgnoreEmptyLines();
    boolean var32 = var30.equals((java.lang.Object)(-1.0f));
    org.apache.commons.csv.CSVFormat var34 = var30.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var36 = var34.withEscape('a');
    org.apache.commons.csv.CSVFormat var37 = var36.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var39 = var36.withSkipHeaderRecord(true);
    boolean var40 = var36.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var42 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var42.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var45 = var44.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var47 = var45.withDelimiter('#');
    java.lang.String var48 = var47.toString();
    org.apache.commons.csv.CSVFormat var50 = var47.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var52 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var53 = var52.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var55 = var53.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var57 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var58 = var57.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var60 = var58.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var62 = var60.withEscape(' ');
    java.lang.String[] var64 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var65 = var60.withHeader(var64);
    org.apache.commons.csv.CSVFormat var66 = var53.withHeader(var64);
    java.lang.String var67 = var47.format((java.lang.Object[])var64);
    org.apache.commons.csv.CSVFormat var68 = var36.withHeader(var64);
    java.lang.String var69 = var13.format((java.lang.Object[])var64);
    
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
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
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
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var48.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var67.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "Delimiter=< #>  RecordSeparator=<a>  SkipHeaderRecord:truea"+ "'", var69.equals("Delimiter=< #>  RecordSeparator=<a>  SkipHeaderRecord:truea"));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test9");


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
    org.apache.commons.csv.CSVFormat var14 = var12.withQuote('4');
    org.apache.commons.csv.CSVFormat var15 = var14.withAllowMissingColumnNames();
    boolean var16 = var14.isQuoteCharacterSet();
    java.lang.String var17 = var14.toString();
    java.lang.String var18 = var14.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var20 = var14.withRecordSeparator("ALL#MINIMAL#NON_NUMERIC#NONEDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var22 = var20.withIgnoreEmptyLines(true);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Delimiter=<#> QuoteChar=<4> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var17.equals("Delimiter=<#> QuoteChar=<4> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test10");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.String var10 = var4.toString();
    boolean var11 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var13 = var4.withQuote(' ');
    org.apache.commons.csv.QuoteMode var14 = var13.getQuoteMode();
    
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
    assertNull(var14);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test11");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withQuote(' ');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var2);
    java.util.Iterator var7 = var6.iterator();
    long var8 = var6.getRecordNumber();
    long var9 = var6.getCurrentLineNumber();
    java.util.Iterator var10 = var6.iterator();
    long var11 = var6.getRecordNumber();
    var6.close();
    boolean var13 = var6.isClosed();
    
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
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test12");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var6 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var5.withRecordSeparator('4');
    java.lang.String var9 = var5.getRecordSeparator();
    boolean var10 = var5.isQuoteCharacterSet();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test13");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var3 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var4 = var1.withHeaderComments((java.lang.Object[])var3);
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces(false);
    java.lang.String[] var7 = var4.getHeader();
    org.apache.commons.csv.CSVFormat var9 = var4.withRecordSeparator("Delimiter=<#> Escape=< > CommentStart=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var11 = var4.withRecordSeparator("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false HeaderComments:[Delimiter=<#> SkipHeaderRecord:true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test14");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var4.getCommentMarker();
    boolean var11 = var4.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var13 = var4.withEscape('a');
    
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test15");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    boolean var5 = var1.isCommentMarkerSet();
    java.lang.String var6 = var1.toString();
    org.apache.commons.csv.CSVFormat var8 = var1.withEscape((java.lang.Character)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var6.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test16");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.QuoteMode var6 = var5.getQuoteMode();
    boolean var7 = var5.isEscapeCharacterSet();
    java.lang.Character var8 = var5.getEscapeCharacter();
    boolean var9 = var5.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreSurroundingSpaces(true);
    boolean var12 = var5.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var14 = var5.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var16 = var14.withIgnoreHeaderCase(false);
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test17");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var6 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var5.withRecordSeparator('4');
    java.lang.Character var9 = var5.getQuoteCharacter();
    java.lang.String var10 = var5.toString();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var14 = var12.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var15 = var14.getQuoteMode();
    org.apache.commons.csv.CSVFormat var17 = var14.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var19 = var14.withSkipHeaderRecord(false);
    java.lang.String[] var21 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var22 = var19.withHeader(var21);
    org.apache.commons.csv.CSVFormat var23 = var5.withHeader(var21);
    org.apache.commons.csv.CSVFormat var24 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var25 = var24.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var27 = var24.withDelimiter('#');
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=<#> CommentStart=< > SkipHeaderRecord:false"+ "'", var10.equals("Delimiter=<#> CommentStart=< > SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test18");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    boolean var11 = var10.getSkipHeaderRecord();
    java.lang.String[] var12 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    boolean var16 = var14.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var18 = var14.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var19 = var18.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var21.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var24 = var23.getQuoteMode();
    java.lang.Character var25 = var23.getCommentMarker();
    java.lang.Object[] var26 = new java.lang.Object[] { var23};
    java.lang.String var27 = var19.format(var26);
    org.apache.commons.csv.CSVFormat var28 = var10.withHeaderComments(var26);
    java.lang.String var29 = var28.toString();
    org.apache.commons.csv.CSVFormat var31 = var28.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var34 = var33.getHeader();
    org.apache.commons.csv.CSVFormat var35 = var33.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var36 = var33.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var39 = var38.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var41 = var39.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var43 = var41.withEscape(' ');
    java.lang.String[] var45 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var46 = var41.withHeader(var45);
    boolean var47 = var46.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var49 = var46.withSkipHeaderRecord(true);
    java.lang.String[] var50 = var49.getHeader();
    boolean var51 = var49.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var53 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var54 = var53.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var56 = var54.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var58 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var59 = var58.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var61 = var59.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var63 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var64 = var63.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var66 = var64.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var68 = var66.withEscape(' ');
    java.lang.String[] var70 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var71 = var66.withHeader(var70);
    org.apache.commons.csv.CSVFormat var72 = var59.withHeader(var70);
    org.apache.commons.csv.CSVFormat var73 = var56.withHeaderComments((java.lang.Object[])var70);
    org.apache.commons.csv.CSVFormat var74 = var49.withHeader(var70);
    org.apache.commons.csv.CSVFormat var75 = var36.withHeaderComments((java.lang.Object[])var70);
    org.apache.commons.csv.CSVFormat var76 = var31.withHeader(var70);
    org.apache.commons.csv.CSVFormat var78 = var31.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var79 = var78.withIgnoreEmptyLines();
    char var80 = var78.getDelimiter();
    
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
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '4'+ "'", var25.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var27.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true HeaderComments:[Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false]"+ "'", var29.equals("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true HeaderComments:[Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
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
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
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
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == '4');

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test19");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String var5 = var4.toString();
    org.apache.commons.csv.CSVFormat var7 = var4.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var9 = var7.withQuote(' ');
    boolean var10 = var9.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var12 = var9.withRecordSeparator("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false");
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test20");


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
    org.apache.commons.csv.CSVFormat var21 = var19.withRecordSeparator(' ');
    boolean var22 = var19.getIgnoreEmptyLines();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test21");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var1.withEscape((java.lang.Character)' ');
    boolean var11 = var10.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var13 = var10.withQuote('a');
    
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
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test22");


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
    org.apache.commons.csv.CSVFormat var18 = var10.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var20 = var18.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var22 = var20.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var24 = var22.withIgnoreEmptyLines(false);
    java.lang.String[] var25 = var24.getHeader();
    boolean var26 = var24.getAllowMissingColumnNames();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test23");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    boolean var11 = var10.getSkipHeaderRecord();
    java.lang.String[] var12 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    boolean var16 = var14.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var18 = var14.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var19 = var18.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var21.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var24 = var23.getQuoteMode();
    java.lang.Character var25 = var23.getCommentMarker();
    java.lang.Object[] var26 = new java.lang.Object[] { var23};
    java.lang.String var27 = var19.format(var26);
    org.apache.commons.csv.CSVFormat var28 = var10.withHeaderComments(var26);
    java.lang.String var29 = var28.toString();
    org.apache.commons.csv.CSVFormat var31 = var28.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var34 = var33.getHeader();
    org.apache.commons.csv.CSVFormat var35 = var33.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var36 = var33.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var39 = var38.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var41 = var39.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var43 = var41.withEscape(' ');
    java.lang.String[] var45 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var46 = var41.withHeader(var45);
    boolean var47 = var46.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var49 = var46.withSkipHeaderRecord(true);
    java.lang.String[] var50 = var49.getHeader();
    boolean var51 = var49.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var53 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var54 = var53.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var56 = var54.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var58 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var59 = var58.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var61 = var59.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var63 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var64 = var63.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var66 = var64.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var68 = var66.withEscape(' ');
    java.lang.String[] var70 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var71 = var66.withHeader(var70);
    org.apache.commons.csv.CSVFormat var72 = var59.withHeader(var70);
    org.apache.commons.csv.CSVFormat var73 = var56.withHeaderComments((java.lang.Object[])var70);
    org.apache.commons.csv.CSVFormat var74 = var49.withHeader(var70);
    org.apache.commons.csv.CSVFormat var75 = var36.withHeaderComments((java.lang.Object[])var70);
    org.apache.commons.csv.CSVFormat var76 = var31.withHeader(var70);
    org.apache.commons.csv.CSVFormat var78 = var76.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var80 = var78.withIgnoreHeaderCase(false);
    boolean var81 = var78.getIgnoreHeaderCase();
    
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
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '4'+ "'", var25.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var27.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true HeaderComments:[Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false]"+ "'", var29.equals("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true HeaderComments:[Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
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
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
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
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test24");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    boolean var10 = var9.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var9.withSkipHeaderRecord(true);
    java.lang.String[] var13 = var12.getHeader();
    boolean var14 = var12.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var16 = var12.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var18 = var12.withDelimiter(' ');
    org.apache.commons.csv.CSVFormat var20 = var12.withNullString("Delimiter=<#> CommentStart=<4> SurroundingSpaces:ignored SkipHeaderRecord:false");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test25");


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
    org.apache.commons.csv.QuoteMode var18 = var15.getQuoteMode();
    org.apache.commons.csv.CSVFormat var20 = var15.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var22 = var15.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var24 = var15.withRecordSeparator("4Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true4a");
    org.apache.commons.csv.CSVFormat var26 = var15.withIgnoreSurroundingSpaces(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var28 = var15.withQuote((java.lang.Character)'4');
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
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

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test26");


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
    org.apache.commons.csv.CSVFormat var16 = var14.withIgnoreSurroundingSpaces(false);
    java.lang.String var17 = var14.getRecordSeparator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test27");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat.Predefined var1 = org.apache.commons.csv.CSVFormat.Predefined.valueOf("Delimiter=<#> SkipHeaderRecord:trueDefault#Excel#MySQL#RFC4180#TDF");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test28");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withQuote('a');
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreEmptyLines(true);
    java.lang.String var9 = var3.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var10 = var3.withIgnoreEmptyLines();
    java.lang.String[] var11 = var10.getHeaderComments();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test29");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var11 = var7.withNullString("a");
    org.apache.commons.csv.CSVFormat var13 = var11.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var15 = var11.withNullString("Delimiter=<a> SkipHeaderRecord:false");
    java.lang.String var16 = var15.toString();
    boolean var17 = var15.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var18 = var15.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var20 = var15.withCommentMarker((java.lang.Character)' ');
    java.lang.String var21 = var15.getRecordSeparator();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=<#> NullString=<Delimiter=<a> SkipHeaderRecord:false> RecordSeparator=<> SkipHeaderRecord:false"+ "'", var16.equals("Delimiter=<#> NullString=<Delimiter=<a> SkipHeaderRecord:false> RecordSeparator=<> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test30");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withQuote('a');
    boolean var7 = var3.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var9 = var3.withRecordSeparator('a');
    
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
    assertNotNull(var9);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test31");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var9 = var5.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var11 = var5.withRecordSeparator("Default#Excel#MySQL#RFC4180#TDFa");
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:true", var5);
    java.util.Iterator var13 = var12.iterator();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test32");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    java.lang.Character var8 = var4.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var11 = var4.withIgnoreEmptyLines(false);
    java.lang.Character var12 = var11.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var14 = var11.withEscape('a');
    org.apache.commons.csv.CSVFormat var16 = var11.withAllowMissingColumnNames(false);
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test33");


    org.apache.commons.csv.CSVFormat var3 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var8 = var6.withEscape(' ');
    java.lang.String[] var10 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var11 = var6.withHeader(var10);
    org.apache.commons.csv.CSVFormat var13 = var11.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true", var11);
    org.apache.commons.csv.CSVParser var15 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:true", var11);
    long var16 = var15.getCurrentLineNumber();
    
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

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test34");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var6 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord(true);
    java.lang.String[] var11 = var10.getHeaderComments();
    
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

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test35");


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
    boolean var13 = var10.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var14 = var10.withIgnoreEmptyLines();
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test36");


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
    boolean var21 = var8.getAllowMissingColumnNames();
    
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
    assertTrue(var21 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test37");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var5 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var7 = var4.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var9 = var7.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var11 = var7.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var13 = var11.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:falsea", var11);
    long var15 = var14.getRecordNumber();
    java.util.List var16 = var14.getRecords();
    java.util.Iterator var17 = var14.iterator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test38");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var10 = var8.withRecordSeparator("Default4Excel4MySQL4RFC41804TDFa");
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var13 = var10.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var14 = var13.withAllowMissingColumnNames();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test39");


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
    java.lang.String var21 = var20.getRecordSeparator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "a"+ "'", var21.equals("a"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test40");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    boolean var9 = var8.isNullStringSet();
    org.apache.commons.csv.CSVFormat var11 = var8.withSkipHeaderRecord(false);
    java.lang.String[] var12 = var11.getHeader();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test41");


    org.apache.commons.csv.CSVFormat var3 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var4 = var3.getHeader();
    boolean var5 = var3.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var8 = var7.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var8.withRecordSeparator('a');
    java.lang.Object[] var11 = new java.lang.Object[] { var8};
    org.apache.commons.csv.CSVFormat var12 = var3.withHeaderComments(var11);
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("ALL#MINIMAL#NON_NUMERIC#NONEa", var3);
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false", var3);
    boolean var15 = var3.getIgnoreEmptyLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test42");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var4.withCommentMarker((java.lang.Character)'4');
    java.lang.Character var12 = var11.getCommentMarker();
    org.apache.commons.csv.CSVFormat var14 = var11.withRecordSeparator('a');
    java.lang.String var15 = var14.getNullString();
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var19 = var18.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var23 = var21.withEscape(' ');
    java.lang.String[] var25 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var26 = var21.withHeader(var25);
    org.apache.commons.csv.CSVFormat var28 = var21.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var30 = var28.withNullString("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVParser var31 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=< > SkipHeaderRecord:false", var28);
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var34 = var33.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var36 = var34.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var38 = var36.withQuote((java.lang.Character)'4');
    java.lang.Character var39 = var38.getQuoteCharacter();
    boolean var40 = var38.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var42 = var38.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var44 = var38.withRecordSeparator(' ');
    java.lang.Character var45 = var44.getCommentMarker();
    org.apache.commons.csv.CSVFormat var47 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var48 = var47.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var50 = var48.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var52 = var50.withEscape(' ');
    java.lang.String[] var54 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var55 = var50.withHeader(var54);
    boolean var56 = var55.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var58 = var55.withSkipHeaderRecord(true);
    java.lang.String[] var59 = var58.getHeader();
    boolean var60 = var58.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var62 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var63 = var62.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var65 = var63.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var67 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var68 = var67.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var70 = var68.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var72 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var73 = var72.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var75 = var73.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var77 = var75.withEscape(' ');
    java.lang.String[] var79 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var80 = var75.withHeader(var79);
    org.apache.commons.csv.CSVFormat var81 = var68.withHeader(var79);
    org.apache.commons.csv.CSVFormat var82 = var65.withHeaderComments((java.lang.Object[])var79);
    org.apache.commons.csv.CSVFormat var83 = var58.withHeader(var79);
    org.apache.commons.csv.CSVFormat var84 = var44.withHeaderComments((java.lang.Object[])var79);
    org.apache.commons.csv.CSVFormat var85 = var28.withHeaderComments((java.lang.Object[])var79);
    org.apache.commons.csv.CSVFormat var86 = var14.withHeader(var79);
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertTrue("'" + var39 + "' != '" + '4'+ "'", var39.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test43");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var8.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var14 = var10.withAllowMissingColumnNames(true);
    
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
    assertNotNull(var14);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test44");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    boolean var5 = var1.isCommentMarkerSet();
    java.lang.String var6 = var1.toString();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var9 = var8.getHeader();
    boolean var10 = var8.isCommentMarkerSet();
    boolean var11 = var8.getIgnoreSurroundingSpaces();
    boolean var12 = var8.isNullStringSet();
    org.apache.commons.csv.CSVFormat var14 = var8.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var15 = var8.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var16 = var15.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var17 = var16.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var20 = var19.getHeader();
    boolean var21 = var19.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var24 = var23.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var26 = var24.withRecordSeparator('a');
    java.lang.Object[] var27 = new java.lang.Object[] { var24};
    org.apache.commons.csv.CSVFormat var28 = var19.withHeaderComments(var27);
    java.lang.String[] var29 = var28.getHeaderComments();
    org.apache.commons.csv.CSVFormat var30 = var17.withHeader(var29);
    org.apache.commons.csv.CSVFormat var31 = var1.withHeader(var29);
    org.apache.commons.csv.CSVFormat var33 = var1.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var34 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var35 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var37 = var35.withEscape('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var6.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test45");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var5 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var7 = var5.withDelimiter('#');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var5);
    java.util.Spliterator var10 = var9.spliterator();
    long var11 = var9.getCurrentLineNumber();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test46");


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
    org.apache.commons.csv.CSVFormat var16 = var11.withAllowMissingColumnNames(true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test47");


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
    org.apache.commons.csv.CSVFormat var14 = var12.withQuote('4');
    boolean var15 = var14.getSkipHeaderRecord();
    boolean var16 = var14.isNullStringSet();
    java.lang.String[] var17 = var14.getHeaderComments();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test48");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var2.withQuote((java.lang.Character)'4');
    boolean var7 = var6.isQuoteCharacterSet();
    char var8 = var6.getDelimiter();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var15 = var13.withQuote((java.lang.Character)'4');
    java.lang.Character var16 = var15.getQuoteCharacter();
    boolean var17 = var15.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var15.withIgnoreSurroundingSpaces(true);
    boolean var20 = var19.getSkipHeaderRecord();
    java.lang.String[] var21 = var19.getHeaderComments();
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var24 = var23.withSkipHeaderRecord();
    boolean var25 = var23.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var27 = var23.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var28 = var27.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var32 = var30.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var33 = var32.getQuoteMode();
    java.lang.Character var34 = var32.getCommentMarker();
    java.lang.Object[] var35 = new java.lang.Object[] { var32};
    java.lang.String var36 = var28.format(var35);
    org.apache.commons.csv.CSVFormat var37 = var19.withHeaderComments(var35);
    boolean var38 = var37.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var41 = var40.getHeader();
    boolean var42 = var40.isCommentMarkerSet();
    boolean var43 = var40.getIgnoreSurroundingSpaces();
    boolean var44 = var40.isNullStringSet();
    org.apache.commons.csv.CSVFormat var46 = var40.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var47 = var40.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var49 = var40.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var51 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var52 = var51.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var53 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var54 = var51.withHeaderComments((java.lang.Object[])var53);
    boolean var55 = var40.equals((java.lang.Object)var54);
    java.lang.String[] var56 = var40.getHeader();
    java.lang.Character var57 = var40.getCommentMarker();
    org.apache.commons.csv.CSVFormat var59 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var61 = var59.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var62 = var59.getHeaderComments();
    org.apache.commons.csv.CSVFormat var64 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var65 = var64.withIgnoreEmptyLines();
    java.lang.String var66 = var64.toString();
    java.lang.Object[] var67 = new java.lang.Object[] { var64};
    java.lang.String var68 = var59.format(var67);
    org.apache.commons.csv.CSVFormat var70 = var59.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat.Predefined[] var71 = org.apache.commons.csv.CSVFormat.Predefined.values();
    java.lang.String var72 = var59.format((java.lang.Object[])var71);
    java.lang.String var73 = var40.format((java.lang.Object[])var71);
    java.lang.String var74 = var37.format((java.lang.Object[])var71);
    org.apache.commons.csv.CSVFormat var75 = var6.withHeaderComments((java.lang.Object[])var71);
    boolean var76 = var6.isEscapeCharacterSet();
    
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
    assertTrue(var8 == '#');
    
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
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + '4'+ "'", var34.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var36.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var66.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var68.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "Default#Excel#MySQL#RFC4180#TDF"+ "'", var72.equals("Default#Excel#MySQL#RFC4180#TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "Default#Excel#MySQL#RFC4180#TDF"+ "'", var73.equals("Default#Excel#MySQL#RFC4180#TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "Default#Excel#MySQL#4RFC441804#TDFa"+ "'", var74.equals("Default#Excel#MySQL#4RFC441804#TDFa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test49");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    char var6 = var5.getDelimiter();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var10 = var8.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var11 = var10.getQuoteMode();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var15 = var10.withSkipHeaderRecord(false);
    java.lang.String[] var17 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var18 = var15.withHeader(var17);
    java.lang.String var19 = var5.format((java.lang.Object[])var17);
    org.apache.commons.csv.CSVFormat var21 = var5.withNullString("");
    org.apache.commons.csv.CSVFormat var23 = var5.withEscape((java.lang.Character)'a');
    boolean var24 = var23.isCommentMarkerSet();
    boolean var25 = var23.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVParser var26 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:falseDelimiter=<#> SkipHeaderRecord:true", var23);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Delimiter=<#> SkipHeaderRecord:falsea"+ "'", var19.equals("Delimiter=<#> SkipHeaderRecord:falsea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test50");


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
    org.apache.commons.csv.CSVFormat var20 = var4.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var22 = var20.withIgnoreEmptyLines(true);
    
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
    assertNotNull(var22);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test51");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withDelimiter('#');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    java.lang.String var8 = var4.getNullString();
    org.apache.commons.csv.CSVFormat var9 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var11 = var9.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var13 = var9.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var15 = var13.withNullString("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:trueDelimiter=<#>  RecordSeparator=<a>  SkipHeaderRecord:true a");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test52");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var2.withQuote((java.lang.Character)'4');
    boolean var7 = var6.isQuoteCharacterSet();
    java.lang.String var8 = var6.getNullString();
    org.apache.commons.csv.CSVFormat var10 = var6.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreEmptyLines(false);
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test53");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var5 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var7 = var4.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var9 = var7.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var11 = var9.withNullString("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    boolean var12 = var11.getSkipHeaderRecord();
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true HeaderComments:[Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false]", var11);
    java.util.Map var14 = var13.getHeaderMap();
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test54");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    java.lang.Character var8 = var7.getQuoteCharacter();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("a", var7);
    org.apache.commons.csv.CSVFormat var11 = var7.withEscape((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var14 = var13.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var16 = var14.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var18 = var16.withEscape(' ');
    java.lang.String[] var20 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var21 = var16.withHeader(var20);
    org.apache.commons.csv.CSVFormat var23 = var16.withCommentMarker((java.lang.Character)'4');
    java.lang.Character var24 = var23.getCommentMarker();
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var27 = var26.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var29 = var27.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var31 = var27.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var33 = var27.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var36 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var38 = var36.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var39 = var38.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var41 = var39.withDelimiter('#');
    boolean var42 = var39.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var43 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var39);
    boolean var44 = var39.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var46 = var39.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var49 = var48.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var51 = var49.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var53 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var54 = var53.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var56 = var54.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var58 = var56.withEscape(' ');
    java.lang.String[] var60 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var61 = var56.withHeader(var60);
    org.apache.commons.csv.CSVFormat var62 = var49.withHeader(var60);
    org.apache.commons.csv.CSVFormat var63 = var39.withHeader(var60);
    org.apache.commons.csv.CSVFormat var64 = var27.withHeaderComments((java.lang.Object[])var60);
    java.lang.String var65 = var23.format((java.lang.Object[])var60);
    org.apache.commons.csv.CSVFormat var66 = var7.withHeader(var60);
    org.apache.commons.csv.CSVFormat var68 = var66.withRecordSeparator("hi!");
    org.apache.commons.csv.CSVFormat var70 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var72 = var70.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var73 = var72.getQuoteMode();
    org.apache.commons.csv.CSVFormat var75 = var72.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var77 = var75.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var79 = var77.withAllowMissingColumnNames(true);
    boolean var80 = var79.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var81 = var79.withAllowMissingColumnNames();
    java.lang.String var82 = var79.getNullString();
    boolean var83 = var68.equals((java.lang.Object)var82);
    boolean var84 = var68.getIgnoreHeaderCase();
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '4'+ "'", var24.equals('4'));
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
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
    assertTrue("'" + var65 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"+ "'", var65.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var82.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test55");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    java.lang.Character var8 = var7.getQuoteCharacter();
    boolean var9 = var7.getSkipHeaderRecord();
    boolean var11 = var7.equals((java.lang.Object)(byte)(-1));
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var7);
    java.util.Iterator var13 = var12.iterator();
    long var14 = var12.getCurrentLineNumber();
    long var15 = var12.getRecordNumber();
    java.util.Map var16 = var12.getHeaderMap();
    java.util.Map var17 = var12.getHeaderMap();
    
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
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test56");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    org.apache.commons.csv.CSVFormat var9 = var5.withAllowMissingColumnNames(false);
    boolean var10 = var9.getIgnoreSurroundingSpaces();
    boolean var12 = var9.equals((java.lang.Object)1);
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("a", var9);
    java.util.List var14 = var13.getRecords();
    
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

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test57");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    boolean var5 = var4.getIgnoreHeaderCase();
    boolean var6 = var4.getAllowMissingColumnNames();
    boolean var7 = var4.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var9 = var4.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test58");


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
    java.util.List var19 = var15.getRecords();
    long var20 = var15.getCurrentLineNumber();
    long var21 = var15.getRecordNumber();
    java.util.Spliterator var22 = var15.spliterator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test59");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    boolean var10 = var4.isNullStringSet();
    java.lang.String[] var11 = var4.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var4.withEscape(' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var15 = var13.withDelimiter(' ');
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test60");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreHeaderCase(false);
    java.lang.Character var11 = var10.getQuoteCharacter();
    char var12 = var10.getDelimiter();
    org.apache.commons.csv.CSVFormat var14 = var10.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var16 = var14.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var18 = var16.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var20 = var18.withEscape(' ');
    
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
    assertTrue(var12 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test61");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withQuote(' ');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var2);
    java.util.List var7 = var6.getRecords();
    java.util.List var8 = var6.getRecords();
    java.util.Spliterator var9 = var6.spliterator();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test62");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    java.lang.Character var9 = var5.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var10 = var5.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var10);
    java.util.List var12 = var11.getRecords();
    boolean var13 = var11.isClosed();
    java.util.List var14 = var11.getRecords();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test63");


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
    org.apache.commons.csv.CSVFormat var14 = var12.withQuote('4');
    org.apache.commons.csv.CSVFormat var15 = var14.withAllowMissingColumnNames();
    boolean var16 = var14.isQuoteCharacterSet();
    java.lang.String var17 = var14.toString();
    java.lang.String var18 = var14.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var21 = var20.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var23 = var21.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var25 = var23.withEscape(' ');
    boolean var26 = var23.getIgnoreSurroundingSpaces();
    boolean var27 = var23.isEscapeCharacterSet();
    java.lang.String var28 = var23.getNullString();
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var31 = var30.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var33 = var31.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var35 = var33.withEscape(' ');
    org.apache.commons.csv.CSVFormat var37 = var33.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var38 = var33.getQuoteMode();
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var41 = var40.getHeader();
    boolean var42 = var40.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var44 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var45 = var44.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var46 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var47 = var44.withHeaderComments((java.lang.Object[])var46);
    org.apache.commons.csv.CSVFormat var48 = var40.withHeaderComments((java.lang.Object[])var46);
    java.lang.String var49 = var33.format((java.lang.Object[])var46);
    java.lang.String var50 = var23.format((java.lang.Object[])var46);
    java.lang.String var51 = var14.format((java.lang.Object[])var46);
    org.apache.commons.csv.CSVFormat var53 = var14.withAllowMissingColumnNames(true);
    boolean var54 = var14.getIgnoreEmptyLines();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Delimiter=<#> QuoteChar=<4> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var17.equals("Delimiter=<#> QuoteChar=<4> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var49.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var50.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONE"+ "'", var51.equals("ALL#MINIMAL#NON_NUMERIC#NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test64");


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
    org.apache.commons.csv.CSVFormat var18 = var1.withAllowMissingColumnNames();
    java.lang.Character var19 = var18.getEscapeCharacter();
    java.lang.String[] var20 = var18.getHeader();
    org.apache.commons.csv.CSVFormat var22 = var18.withQuote('4');
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test65");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    boolean var5 = var4.isCommentMarkerSet();
    java.lang.String[] var6 = var4.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var4.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var11 = var10.getHeader();
    boolean var12 = var10.isCommentMarkerSet();
    boolean var13 = var10.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var15 = var10.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var17 = var10.withNullString("Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var19 = var17.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var21.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var24 = var22.withRecordSeparator('a');
    char var25 = var24.getDelimiter();
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var29 = var27.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var30 = var29.getQuoteMode();
    org.apache.commons.csv.CSVFormat var32 = var29.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var34 = var29.withSkipHeaderRecord(false);
    java.lang.String[] var36 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var37 = var34.withHeader(var36);
    java.lang.String var38 = var24.format((java.lang.Object[])var36);
    java.lang.String var39 = var17.format((java.lang.Object[])var36);
    java.lang.String var40 = var4.format((java.lang.Object[])var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Delimiter=<#> SkipHeaderRecord:falsea"+ "'", var38.equals("Delimiter=<#> SkipHeaderRecord:falsea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var39.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var40.equals("Delimiter=<#> SkipHeaderRecord:false"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test66");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.QuoteMode var6 = var5.getQuoteMode();
    boolean var7 = var5.isEscapeCharacterSet();
    boolean var8 = var5.getIgnoreHeaderCase();
    boolean var9 = var5.getAllowMissingColumnNames();
    org.apache.commons.csv.QuoteMode var10 = var5.getQuoteMode();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test67");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    java.lang.Character var8 = var7.getQuoteCharacter();
    boolean var9 = var7.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var7.withIgnoreSurroundingSpaces(true);
    boolean var12 = var11.isCommentMarkerSet();
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:falsea", var11);
    java.util.List var14 = var13.getRecords();
    java.util.List var15 = var13.getRecords();
    boolean var16 = var13.isClosed();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test68");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    boolean var7 = var6.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var9.withQuote((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var12 = var9.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var19 = var17.withEscape(' ');
    java.lang.String[] var21 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var22 = var17.withHeader(var21);
    org.apache.commons.csv.CSVFormat var24 = var17.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var26 = var24.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var29 = var28.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var31 = var29.withRecordSeparator('a');
    java.lang.String var32 = var31.toString();
    boolean var33 = var31.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var35 = var31.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var37 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var39 = var37.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var40 = var39.getQuoteMode();
    boolean var41 = var39.isCommentMarkerSet();
    boolean var42 = var39.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var44 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var45 = var44.getHeader();
    boolean var46 = var44.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var49 = var48.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var51 = var49.withRecordSeparator('a');
    java.lang.Object[] var52 = new java.lang.Object[] { var49};
    org.apache.commons.csv.CSVFormat var53 = var44.withHeaderComments(var52);
    java.lang.String[] var54 = var53.getHeaderComments();
    org.apache.commons.csv.CSVFormat var55 = var39.withHeaderComments((java.lang.Object[])var54);
    org.apache.commons.csv.CSVFormat var56 = var35.withHeader(var54);
    org.apache.commons.csv.CSVFormat var57 = var24.withHeader(var54);
    org.apache.commons.csv.CSVFormat var58 = var9.withHeader(var54);
    boolean var59 = var58.isQuoteCharacterSet();
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var32.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
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
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test69");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    java.lang.Character var9 = var6.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var14 = var13.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var16 = var14.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var18 = var16.withEscape(' ');
    java.lang.String[] var20 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var21 = var16.withHeader(var20);
    org.apache.commons.csv.CSVFormat var23 = var21.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVParser var24 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true", var21);
    org.apache.commons.csv.CSVParser var25 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:true", var21);
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var28 = var27.withIgnoreEmptyLines();
    java.lang.String var29 = var27.toString();
    boolean var30 = var27.isEscapeCharacterSet();
    boolean var31 = var27.getIgnoreSurroundingSpaces();
    boolean var32 = var21.equals((java.lang.Object)var27);
    java.lang.String[] var33 = var21.getHeader();
    org.apache.commons.csv.CSVFormat var34 = var6.withHeader(var33);
    org.apache.commons.csv.CSVFormat var36 = var34.withSkipHeaderRecord(true);
    java.lang.String var37 = var36.toString();
    
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
    assertNull(var9);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var29.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"+ "'", var37.equals("Delimiter=<#> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test70");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    org.apache.commons.csv.CSVFormat var9 = var5.withAllowMissingColumnNames(false);
    boolean var10 = var9.getIgnoreSurroundingSpaces();
    boolean var12 = var9.equals((java.lang.Object)1);
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("a", var9);
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var21 = var19.withQuote((java.lang.Character)'4');
    java.lang.Character var22 = var21.getQuoteCharacter();
    boolean var23 = var21.getSkipHeaderRecord();
    boolean var25 = var21.equals((java.lang.Object)(byte)(-1));
    org.apache.commons.csv.CSVParser var26 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var21);
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var29 = var28.getHeader();
    boolean var30 = var28.isCommentMarkerSet();
    boolean var31 = var28.getIgnoreSurroundingSpaces();
    boolean var32 = var28.isNullStringSet();
    org.apache.commons.csv.CSVFormat var34 = var28.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var36 = var34.withSkipHeaderRecord(true);
    boolean var37 = var21.equals((java.lang.Object)var34);
    org.apache.commons.csv.CSVFormat var39 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var40 = var39.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var42 = var40.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var44 = var42.withEscape(' ');
    boolean var45 = var42.getIgnoreSurroundingSpaces();
    boolean var46 = var42.isEscapeCharacterSet();
    java.lang.String var47 = var42.getNullString();
    org.apache.commons.csv.CSVFormat var49 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var50 = var49.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var52 = var50.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var54 = var52.withEscape(' ');
    org.apache.commons.csv.CSVFormat var56 = var52.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var57 = var52.getQuoteMode();
    org.apache.commons.csv.CSVFormat var59 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var60 = var59.getHeader();
    boolean var61 = var59.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var63 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var64 = var63.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var65 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var66 = var63.withHeaderComments((java.lang.Object[])var65);
    org.apache.commons.csv.CSVFormat var67 = var59.withHeaderComments((java.lang.Object[])var65);
    java.lang.String var68 = var52.format((java.lang.Object[])var65);
    java.lang.String var69 = var42.format((java.lang.Object[])var65);
    java.lang.String var70 = var34.format((java.lang.Object[])var65);
    org.apache.commons.csv.CSVFormat var71 = var9.withHeaderComments((java.lang.Object[])var65);
    boolean var72 = var9.isNullStringSet();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + '4'+ "'", var22.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var68.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var69.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONE"+ "'", var70.equals("ALL#MINIMAL#NON_NUMERIC#NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test71");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = var6.withNullString("");
    java.lang.String var10 = var9.toString();
    org.apache.commons.csv.CSVFormat var11 = var9.withIgnoreSurroundingSpaces();
    char var12 = var9.getDelimiter();
    
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
    assertTrue(var12 == '#');

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test72");


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
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreHeaderCase(false);
    java.lang.String[] var14 = var13.getHeader();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var21 = var19.withQuote((java.lang.Character)'4');
    java.lang.Character var22 = var21.getQuoteCharacter();
    boolean var23 = var21.getSkipHeaderRecord();
    java.lang.Character var24 = var21.getEscapeCharacter();
    char var25 = var21.getDelimiter();
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var28 = var27.getHeader();
    boolean var29 = var27.isCommentMarkerSet();
    boolean var30 = var27.getIgnoreSurroundingSpaces();
    boolean var31 = var27.isNullStringSet();
    org.apache.commons.csv.CSVFormat var33 = var27.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var34 = var27.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var36 = var27.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var39 = var38.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var40 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var41 = var38.withHeaderComments((java.lang.Object[])var40);
    boolean var42 = var27.equals((java.lang.Object)var41);
    java.lang.String[] var43 = var27.getHeader();
    org.apache.commons.csv.CSVFormat var44 = var27.withAllowMissingColumnNames();
    boolean var45 = var44.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var47 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var48 = var47.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var50 = var48.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var52 = var50.withEscape(' ');
    java.lang.String[] var54 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var55 = var50.withHeader(var54);
    org.apache.commons.csv.CSVFormat var56 = var44.withHeader(var54);
    org.apache.commons.csv.CSVFormat var57 = var21.withHeader(var54);
    org.apache.commons.csv.CSVFormat var58 = var13.withHeader(var54);
    
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
    assertTrue("'" + var22 + "' != '" + '4'+ "'", var22.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test73");


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
    long var24 = var19.getCurrentLineNumber();
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

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test74");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var10 = var9.withSkipHeaderRecord();
    boolean var11 = var9.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var13 = var9.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.QuoteMode var14 = var13.getQuoteMode();
    boolean var15 = var13.isEscapeCharacterSet();
    boolean var16 = var7.equals((java.lang.Object)var15);
    boolean var17 = var7.isEscapeCharacterSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test75");


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
    org.apache.commons.csv.CSVFormat var18 = var1.withAllowMissingColumnNames();
    boolean var19 = var18.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var21.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var24 = var22.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var26 = var24.withEscape(' ');
    java.lang.String[] var28 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var29 = var24.withHeader(var28);
    org.apache.commons.csv.CSVFormat var30 = var18.withHeader(var28);
    boolean var31 = var30.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var32 = var30.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var33 = var30.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var35 = var30.withQuote((java.lang.Character)' ');
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test76");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var1.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    java.lang.String var4 = var3.getNullString();
    org.apache.commons.csv.CSVFormat var5 = var3.withAllowMissingColumnNames();
    boolean var6 = var3.isQuoteCharacterSet();
    boolean var7 = var3.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var9 = var3.withQuote('#');
    java.lang.Character var10 = var9.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var12 = var9.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var14 = var12.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var16 = var12.withSkipHeaderRecord(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
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

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test77");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var8 = var1.withNullString("Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var10 = var1.withSkipHeaderRecord(true);
    
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
    assertNotNull(var10);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test78");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    boolean var10 = var9.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var9.withSkipHeaderRecord(true);
    java.lang.String[] var13 = var12.getHeader();
    boolean var14 = var12.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var21.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var24 = var22.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var27 = var26.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var29 = var27.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var31 = var29.withEscape(' ');
    java.lang.String[] var33 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var34 = var29.withHeader(var33);
    org.apache.commons.csv.CSVFormat var35 = var22.withHeader(var33);
    org.apache.commons.csv.CSVFormat var36 = var19.withHeaderComments((java.lang.Object[])var33);
    org.apache.commons.csv.CSVFormat var37 = var12.withHeader(var33);
    java.lang.Character var38 = var12.getCommentMarker();
    java.lang.Character var39 = var12.getCommentMarker();
    boolean var40 = var12.getIgnoreHeaderCase();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test79");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    boolean var11 = var10.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var15 = var10.withRecordSeparator('#');
    java.lang.String var16 = var15.toString();
    java.lang.Character var17 = var15.getCommentMarker();
    org.apache.commons.csv.CSVFormat var19 = var15.withEscape((java.lang.Character)' ');
    char var20 = var19.getDelimiter();
    
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
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=<#> QuoteChar=<4> RecordSeparator=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var16.equals("Delimiter=<#> QuoteChar=<4> RecordSeparator=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == '#');

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test80");


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
    java.lang.String var15 = var9.getNullString();
    
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
    assertNull(var15);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test81");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withQuote('4');
    org.apache.commons.csv.CSVFormat var10 = var4.withRecordSeparator('a');
    org.apache.commons.csv.QuoteMode var11 = var10.getQuoteMode();
    org.apache.commons.csv.CSVFormat var13 = var10.withSkipHeaderRecord(false);
    
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

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test82");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    boolean var5 = var1.isQuoteCharacterSet();
    java.lang.Character var6 = var1.getCommentMarker();
    boolean var7 = var1.isEscapeCharacterSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test83");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    char var6 = var5.getDelimiter();
    org.apache.commons.csv.CSVFormat var8 = var5.withDelimiter('4');
    boolean var9 = var5.isCommentMarkerSet();
    org.apache.commons.csv.CSVParser var10 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> RecordSeparator=<a> SkipHeaderRecord:true", var5);
    java.lang.String var11 = var5.getNullString();
    org.apache.commons.csv.CSVFormat var13 = var5.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var16 = var15.getHeader();
    boolean var17 = var15.isCommentMarkerSet();
    boolean var18 = var15.getIgnoreSurroundingSpaces();
    boolean var19 = var15.isNullStringSet();
    org.apache.commons.csv.CSVFormat var21 = var15.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var22 = var15.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var23 = var22.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var24 = var23.withAllowMissingColumnNames();
    java.lang.String[] var25 = var24.getHeaderComments();
    org.apache.commons.csv.CSVFormat var27 = var24.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var29 = var27.withNullString("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var31 = var29.withCommentMarker(' ');
    boolean var32 = var29.getIgnoreSurroundingSpaces();
    java.lang.Character var33 = var29.getCommentMarker();
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var36 = var35.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var38 = var36.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var40 = var38.withEscape(' ');
    java.lang.String[] var42 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var43 = var38.withHeader(var42);
    org.apache.commons.csv.CSVFormat var44 = var29.withHeaderComments((java.lang.Object[])var42);
    org.apache.commons.csv.CSVFormat var45 = var13.withHeader(var42);
    org.apache.commons.csv.CSVFormat var47 = var45.withIgnoreSurroundingSpaces(false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test84");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    boolean var13 = var10.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var16 = var15.getHeader();
    boolean var17 = var15.isCommentMarkerSet();
    boolean var18 = var15.getIgnoreSurroundingSpaces();
    boolean var19 = var15.isNullStringSet();
    org.apache.commons.csv.CSVFormat var21 = var15.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var22 = var15.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var23 = var22.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var24 = var22.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var25 = var24.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var29 = var28.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var31 = var29.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var33 = var31.withEscape(' ');
    boolean var34 = var31.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var35 = org.apache.commons.csv.CSVParser.parse("hi!", var31);
    java.util.Spliterator var36 = var35.spliterator();
    java.util.Map var37 = var35.getHeaderMap();
    boolean var38 = var35.isClosed();
    java.util.List var39 = var35.getRecords();
    boolean var40 = var25.equals((java.lang.Object)var39);
    org.apache.commons.csv.CSVFormat var42 = var25.withCommentMarker('4');
    boolean var43 = var25.isQuoteCharacterSet();
    boolean var44 = var10.equals((java.lang.Object)var43);
    char var45 = var10.getDelimiter();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == '#');

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test85");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    boolean var5 = var4.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreEmptyLines();
    boolean var7 = var6.getIgnoreEmptyLines();
    java.lang.String var8 = var6.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:true"+ "'", var8.equals("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:true"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test86");


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
    org.apache.commons.csv.CSVFormat var28 = var11.withRecordSeparator(' ');
    
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

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test87");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var2.withQuote((java.lang.Character)'4');
    boolean var7 = var6.isQuoteCharacterSet();
    char var8 = var6.getDelimiter();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var15 = var13.withQuote((java.lang.Character)'4');
    java.lang.Character var16 = var15.getQuoteCharacter();
    boolean var17 = var15.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var15.withIgnoreSurroundingSpaces(true);
    boolean var20 = var19.getSkipHeaderRecord();
    java.lang.String[] var21 = var19.getHeaderComments();
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var24 = var23.withSkipHeaderRecord();
    boolean var25 = var23.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var27 = var23.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var28 = var27.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var32 = var30.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var33 = var32.getQuoteMode();
    java.lang.Character var34 = var32.getCommentMarker();
    java.lang.Object[] var35 = new java.lang.Object[] { var32};
    java.lang.String var36 = var28.format(var35);
    org.apache.commons.csv.CSVFormat var37 = var19.withHeaderComments(var35);
    boolean var38 = var37.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var41 = var40.getHeader();
    boolean var42 = var40.isCommentMarkerSet();
    boolean var43 = var40.getIgnoreSurroundingSpaces();
    boolean var44 = var40.isNullStringSet();
    org.apache.commons.csv.CSVFormat var46 = var40.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var47 = var40.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var49 = var40.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var51 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var52 = var51.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var53 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var54 = var51.withHeaderComments((java.lang.Object[])var53);
    boolean var55 = var40.equals((java.lang.Object)var54);
    java.lang.String[] var56 = var40.getHeader();
    java.lang.Character var57 = var40.getCommentMarker();
    org.apache.commons.csv.CSVFormat var59 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var61 = var59.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var62 = var59.getHeaderComments();
    org.apache.commons.csv.CSVFormat var64 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var65 = var64.withIgnoreEmptyLines();
    java.lang.String var66 = var64.toString();
    java.lang.Object[] var67 = new java.lang.Object[] { var64};
    java.lang.String var68 = var59.format(var67);
    org.apache.commons.csv.CSVFormat var70 = var59.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat.Predefined[] var71 = org.apache.commons.csv.CSVFormat.Predefined.values();
    java.lang.String var72 = var59.format((java.lang.Object[])var71);
    java.lang.String var73 = var40.format((java.lang.Object[])var71);
    java.lang.String var74 = var37.format((java.lang.Object[])var71);
    org.apache.commons.csv.CSVFormat var75 = var6.withHeaderComments((java.lang.Object[])var71);
    org.apache.commons.csv.CSVFormat var77 = var6.withQuote(' ');
    
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
    assertTrue(var8 == '#');
    
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
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + '4'+ "'", var34.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var36.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var66.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var68.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "Default#Excel#MySQL#RFC4180#TDF"+ "'", var72.equals("Default#Excel#MySQL#RFC4180#TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "Default#Excel#MySQL#RFC4180#TDF"+ "'", var73.equals("Default#Excel#MySQL#RFC4180#TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "Default#Excel#MySQL#4RFC441804#TDFa"+ "'", var74.equals("Default#Excel#MySQL#4RFC441804#TDFa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test88");


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
    org.apache.commons.csv.CSVFormat var22 = var10.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var24 = var10.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:trueDefault#Excel#MySQL#RFC4180#TDF");
    boolean var25 = var24.isCommentMarkerSet();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test89");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var9 = var5.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var10 = var5.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames(false);
    boolean var13 = var12.getIgnoreHeaderCase();
    java.lang.Character var14 = var12.getCommentMarker();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var17 = var16.getHeader();
    boolean var18 = var16.isCommentMarkerSet();
    boolean var19 = var16.getIgnoreSurroundingSpaces();
    boolean var20 = var16.isNullStringSet();
    org.apache.commons.csv.CSVFormat var22 = var16.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var23 = var16.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var25 = var16.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var28 = var27.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var29 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var30 = var27.withHeaderComments((java.lang.Object[])var29);
    boolean var31 = var16.equals((java.lang.Object)var30);
    java.lang.String[] var32 = var16.getHeader();
    org.apache.commons.csv.CSVFormat var33 = var16.withAllowMissingColumnNames();
    boolean var34 = var33.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var36 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var37 = var36.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var39 = var37.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var41 = var39.withEscape(' ');
    java.lang.String[] var43 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var44 = var39.withHeader(var43);
    org.apache.commons.csv.CSVFormat var45 = var33.withHeader(var43);
    boolean var46 = var45.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var48 = var45.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var50 = var45.withQuote((java.lang.Character)'4');
    boolean var51 = var12.equals((java.lang.Object)var50);
    boolean var52 = var12.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var54 = var12.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var55 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=< > SkipHeaderRecord:true", var54);
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test90");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var11 = var7.withNullString("a");
    org.apache.commons.csv.CSVFormat var13 = var11.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var15 = var11.withNullString("Delimiter=<a> SkipHeaderRecord:false");
    java.lang.String var16 = var15.toString();
    org.apache.commons.csv.CSVFormat var17 = var15.withSkipHeaderRecord();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=<#> NullString=<Delimiter=<a> SkipHeaderRecord:false> RecordSeparator=<> SkipHeaderRecord:false"+ "'", var16.equals("Delimiter=<#> NullString=<Delimiter=<a> SkipHeaderRecord:false> RecordSeparator=<> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test91");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var12 = var6.withRecordSeparator(' ');
    org.apache.commons.csv.CSVFormat var14 = var6.withRecordSeparator(' ');
    char var15 = var14.getDelimiter();
    org.apache.commons.csv.CSVFormat var17 = var14.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var19 = var14.withCommentMarker(' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var21 = var19.withDelimiter('4');
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test92");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var3.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var10 = var8.withRecordSeparator("Delimiter=<#> Escape=< > CommentStart=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var17 = var15.withQuote((java.lang.Character)'4');
    java.lang.Character var18 = var17.getQuoteCharacter();
    boolean var19 = var17.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var17.withIgnoreSurroundingSpaces(true);
    boolean var22 = var21.getSkipHeaderRecord();
    java.lang.String[] var23 = var21.getHeaderComments();
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withSkipHeaderRecord();
    boolean var27 = var25.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var29 = var25.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var30 = var29.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var34 = var32.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var35 = var34.getQuoteMode();
    java.lang.Character var36 = var34.getCommentMarker();
    java.lang.Object[] var37 = new java.lang.Object[] { var34};
    java.lang.String var38 = var30.format(var37);
    org.apache.commons.csv.CSVFormat var39 = var21.withHeaderComments(var37);
    org.apache.commons.csv.CSVFormat var41 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var42 = var41.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var44 = var42.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var46 = var44.withQuote((java.lang.Character)'4');
    java.lang.Character var47 = var46.getQuoteCharacter();
    boolean var48 = var46.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var50 = var46.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var52 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var53 = var52.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var55 = var53.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var57 = var55.withEscape(' ');
    java.lang.String[] var59 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var60 = var55.withHeader(var59);
    boolean var61 = var60.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var63 = var60.withSkipHeaderRecord(true);
    java.lang.String[] var64 = var63.getHeader();
    org.apache.commons.csv.CSVFormat var65 = var46.withHeader(var64);
    org.apache.commons.csv.CSVFormat var66 = var21.withHeader(var64);
    org.apache.commons.csv.CSVFormat var67 = var8.withHeader(var64);
    org.apache.commons.csv.CSVFormat var69 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var70 = var69.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var72 = var70.withRecordSeparator('a');
    java.lang.String var73 = var72.toString();
    org.apache.commons.csv.CSVFormat var75 = var72.withRecordSeparator("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var77 = var75.withQuote(' ');
    boolean var78 = var67.equals((java.lang.Object)var77);
    org.apache.commons.csv.CSVFormat var79 = var77.withSkipHeaderRecord();
    java.lang.Character var80 = var77.getCommentMarker();
    boolean var81 = var77.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var83 = var77.withIgnoreHeaderCase(false);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + '4'+ "'", var18.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '4'+ "'", var36.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var38.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
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
    assertTrue("'" + var47 + "' != '" + '4'+ "'", var47.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
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
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var73.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

}
