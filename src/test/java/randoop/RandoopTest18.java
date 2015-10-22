package randoop;

import junit.framework.*;

public class RandoopTest18 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test1");


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
    boolean var35 = var34.isEscapeCharacterSet();
    
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
    assertTrue(var35 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test2");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    boolean var4 = var2.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var6 = var2.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var11 = var9.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var12 = var11.getQuoteMode();
    java.lang.Character var13 = var11.getCommentMarker();
    java.lang.Object[] var14 = new java.lang.Object[] { var11};
    java.lang.String var15 = var7.format(var14);
    org.apache.commons.csv.CSVFormat var17 = var7.withQuote((java.lang.Character)'a');
    boolean var18 = var7.getSkipHeaderRecord();
    org.apache.commons.csv.CSVParser var19 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true", var7);
    org.apache.commons.csv.CSVFormat var21 = var7.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var23 = var21.withQuote('#');
    org.apache.commons.csv.CSVFormat var25 = var21.withEscape('a');
    java.lang.String var26 = var25.getNullString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '4'+ "'", var13.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var15.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
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

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test3");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    boolean var9 = var8.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var11 = var8.withRecordSeparator("aDelimiter=<#> SkipHeaaderRecord:trueaDelimiter=<#> Escape=<a> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var13 = var11.withCommentMarker('4');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test4");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    java.lang.Character var9 = var5.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var10 = var5.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var5.withIgnoreEmptyLines(false);
    java.lang.Character var13 = var12.getQuoteCharacter();
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#>  RecordSeparator=<a>  SkipHeaderRecord:true", var12);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test5");


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
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var20 = var19.getHeader();
    boolean var21 = var19.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var24 = var23.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var26 = var24.withRecordSeparator('a');
    java.lang.Object[] var27 = new java.lang.Object[] { var24};
    org.apache.commons.csv.CSVFormat var28 = var19.withHeaderComments(var27);
    java.lang.String[] var29 = var28.getHeaderComments();
    java.lang.String var30 = var15.format((java.lang.Object[])var29);
    org.apache.commons.csv.CSVFormat var31 = var15.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var33 = var31.withSkipHeaderRecord(false);
    
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
    assertTrue("'" + var30 + "' != '" + "Delimiter=< #>  SkipHeaderRecord:truea"+ "'", var30.equals("Delimiter=< #>  SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test6");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var4.withDelimiter(' ');
    boolean var10 = var8.equals((java.lang.Object)'4');
    boolean var11 = var8.getSkipHeaderRecord();
    boolean var12 = var8.isNullStringSet();
    
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
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test7");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    boolean var12 = var10.equals((java.lang.Object)(-1.0f));
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var15 = var13.withSkipHeaderRecord(false);
    java.lang.String[] var16 = var15.getHeader();
    org.apache.commons.csv.CSVFormat var18 = var15.withEscape((java.lang.Character)'4');
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test8");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = var6.withNullString("");
    java.lang.String var10 = var9.toString();
    org.apache.commons.csv.CSVFormat var12 = var9.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var14 = var9.withNullString("Default4Excel4MySQL4RFC41804TDFa");
    boolean var15 = var14.getAllowMissingColumnNames();
    java.lang.String[] var16 = var14.getHeader();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test9");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withQuote(' ');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var2);
    java.util.Iterator var7 = var6.iterator();
    long var8 = var6.getRecordNumber();
    boolean var9 = var6.isClosed();
    boolean var10 = var6.isClosed();
    java.util.Map var11 = var6.getHeaderMap();
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test10");


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
    var14.close();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test11");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces(true);
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withRecordSeparator(' ');
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    boolean var11 = var9.isCommentMarkerSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test12");


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
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var20 = var18.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var21 = var18.getHeaderComments();
    org.apache.commons.csv.CSVFormat var23 = var18.withCommentMarker('4');
    boolean var24 = var13.equals((java.lang.Object)var23);
    java.lang.String var25 = var13.toString();
    org.apache.commons.csv.CSVFormat var27 = var13.withQuote((java.lang.Character)'4');
    java.lang.String var28 = var13.toString();
    char var29 = var13.getDelimiter();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Delimiter=<#> Escape=< > RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"+ "'", var25.equals("Delimiter=<#> Escape=< > RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Delimiter=<#> Escape=< > RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"+ "'", var28.equals("Delimiter=<#> Escape=< > RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == '#');

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test13");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var5 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var7 = var4.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var9 = var7.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var11 = var7.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var13 = var11.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:falsea", var11);
    java.util.List var15 = var14.getRecords();
    java.util.Spliterator var16 = var14.spliterator();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test14");


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
    org.apache.commons.csv.CSVFormat var25 = var10.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var27 = var10.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var28 = var27.withIgnoreSurroundingSpaces();
    boolean var29 = var27.isCommentMarkerSet();
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test15");


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
    org.apache.commons.csv.CSVFormat var37 = var34.withAllowMissingColumnNames(false);
    boolean var38 = var34.isNullStringSet();
    
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
    assertTrue(var38 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test16");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var4.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var10 = var9.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var12 = var9.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var14 = var12.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var16 = var14.withEscape((java.lang.Character)'a');
    boolean var17 = var14.isCommentMarkerSet();
    boolean var18 = var14.isCommentMarkerSet();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test17");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var2.withQuote((java.lang.Character)'4');
    boolean var7 = var6.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    java.lang.String var10 = var9.toString();
    org.apache.commons.csv.CSVFormat var12 = var9.withIgnoreEmptyLines(true);
    boolean var13 = var12.isNullStringSet();
    org.apache.commons.csv.CSVFormat var15 = var12.withIgnoreSurroundingSpaces(true);
    
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
    assertTrue("'" + var10 + "' != '" + "Delimiter=<#> QuoteChar=<4> SkipHeaderRecord:true"+ "'", var10.equals("Delimiter=<#> QuoteChar=<4> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test18");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var15 = var13.withEscape(' ');
    boolean var16 = var13.getIgnoreSurroundingSpaces();
    boolean var17 = var13.isNullStringSet();
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var20 = var19.getHeader();
    boolean var21 = var19.isCommentMarkerSet();
    boolean var22 = var19.getIgnoreSurroundingSpaces();
    boolean var23 = var19.isNullStringSet();
    org.apache.commons.csv.CSVFormat var25 = var19.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var26 = var19.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var28 = var19.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var31 = var30.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var32 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var33 = var30.withHeaderComments((java.lang.Object[])var32);
    boolean var34 = var19.equals((java.lang.Object)var33);
    java.lang.String[] var35 = var19.getHeader();
    java.lang.Character var36 = var19.getCommentMarker();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var40 = var38.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var41 = var38.getHeaderComments();
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var43.withIgnoreEmptyLines();
    java.lang.String var45 = var43.toString();
    java.lang.Object[] var46 = new java.lang.Object[] { var43};
    java.lang.String var47 = var38.format(var46);
    org.apache.commons.csv.CSVFormat var49 = var38.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat.Predefined[] var50 = org.apache.commons.csv.CSVFormat.Predefined.values();
    java.lang.String var51 = var38.format((java.lang.Object[])var50);
    java.lang.String var52 = var19.format((java.lang.Object[])var50);
    java.lang.String var53 = var13.format((java.lang.Object[])var50);
    org.apache.commons.csv.CSVFormat var54 = var8.withHeaderComments((java.lang.Object[])var50);
    java.lang.String var55 = var8.getRecordSeparator();
    boolean var56 = var8.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var58 = var8.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var60 = var58.withAllowMissingColumnNames(true);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var45.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var47.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Default#Excel#MySQL#RFC4180#TDF"+ "'", var51.equals("Default#Excel#MySQL#RFC4180#TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Default#Excel#MySQL#RFC4180#TDF"+ "'", var52.equals("Default#Excel#MySQL#RFC4180#TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Default#Excel#MySQL#RFC4180#TDFa"+ "'", var53.equals("Default#Excel#MySQL#RFC4180#TDFa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test19");


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
    org.apache.commons.csv.CSVFormat var70 = var13.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var72 = var13.withAllowMissingColumnNames(false);
    boolean var73 = var13.isCommentMarkerSet();
    
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
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test20");


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
    boolean var78 = var77.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var80 = var77.withIgnoreSurroundingSpaces(false);
    java.lang.String[] var81 = var77.getHeader();
    
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
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test21");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var6.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker((java.lang.Character)'a');
    boolean var13 = var10.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var15 = var10.withIgnoreEmptyLines(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var17 = var10.withEscape((java.lang.Character)'#');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test22");


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
    java.util.Map var21 = var15.getHeaderMap();
    
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
    assertNotNull(var21);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test23");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    boolean var4 = var2.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var6 = var2.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var8 = var2.withRecordSeparator("");
    java.lang.Character var9 = var2.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var11 = var2.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false");
    java.lang.String var12 = var2.getNullString();
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> Escape=< > QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true", var2);
    long var14 = var13.getCurrentLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test24");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    java.lang.Character var8 = var7.getQuoteCharacter();
    boolean var9 = var7.getSkipHeaderRecord();
    boolean var11 = var7.equals((java.lang.Object)(byte)(-1));
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var7);
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var15 = var14.getHeader();
    boolean var16 = var14.isCommentMarkerSet();
    boolean var17 = var14.getIgnoreSurroundingSpaces();
    boolean var18 = var14.isNullStringSet();
    org.apache.commons.csv.CSVFormat var20 = var14.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var22 = var20.withSkipHeaderRecord(true);
    boolean var23 = var7.equals((java.lang.Object)var20);
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var28 = var26.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var30 = var28.withEscape(' ');
    boolean var31 = var28.getIgnoreSurroundingSpaces();
    boolean var32 = var28.isEscapeCharacterSet();
    java.lang.String var33 = var28.getNullString();
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var36 = var35.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var38 = var36.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var40 = var38.withEscape(' ');
    org.apache.commons.csv.CSVFormat var42 = var38.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var43 = var38.getQuoteMode();
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var46 = var45.getHeader();
    boolean var47 = var45.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var49 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var50 = var49.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var51 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var52 = var49.withHeaderComments((java.lang.Object[])var51);
    org.apache.commons.csv.CSVFormat var53 = var45.withHeaderComments((java.lang.Object[])var51);
    java.lang.String var54 = var38.format((java.lang.Object[])var51);
    java.lang.String var55 = var28.format((java.lang.Object[])var51);
    java.lang.String var56 = var20.format((java.lang.Object[])var51);
    org.apache.commons.csv.CSVFormat var57 = var20.withIgnoreSurroundingSpaces();
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
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
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
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
    assertTrue("'" + var54 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var54.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEa"+ "'", var55.equals("ALL#MINIMAL#NON_NUMERIC#NONEa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONE"+ "'", var56.equals("ALL#MINIMAL#NON_NUMERIC#NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test25");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var5 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var6 = var5.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withRecordSeparator('a');
    java.lang.Object[] var9 = new java.lang.Object[] { var6};
    org.apache.commons.csv.CSVFormat var10 = var1.withHeaderComments(var9);
    org.apache.commons.csv.CSVFormat var12 = var1.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var14 = var1.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var17 = var16.getHeader();
    boolean var18 = var16.isCommentMarkerSet();
    boolean var19 = var16.getIgnoreSurroundingSpaces();
    boolean var20 = var16.isNullStringSet();
    org.apache.commons.csv.CSVFormat var22 = var16.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var23 = var16.withIgnoreEmptyLines();
    boolean var24 = var23.getIgnoreEmptyLines();
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
    org.apache.commons.csv.CSVFormat var55 = var23.withHeaderComments((java.lang.Object[])var52);
    org.apache.commons.csv.CSVFormat var57 = var55.withAllowMissingColumnNames(true);
    boolean var58 = var14.equals((java.lang.Object)true);
    
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
    assertNotNull(var14);
    
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
    assertTrue(var24 == true);
    
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
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test26");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.getSkipHeaderRecord();
    java.lang.Character var9 = var6.getEscapeCharacter();
    char var10 = var6.getDelimiter();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var13 = var12.getHeader();
    boolean var14 = var12.isCommentMarkerSet();
    boolean var15 = var12.getIgnoreSurroundingSpaces();
    boolean var16 = var12.isNullStringSet();
    org.apache.commons.csv.CSVFormat var18 = var12.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var19 = var12.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var21 = var12.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var24 = var23.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var25 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var26 = var23.withHeaderComments((java.lang.Object[])var25);
    boolean var27 = var12.equals((java.lang.Object)var26);
    java.lang.String[] var28 = var12.getHeader();
    org.apache.commons.csv.CSVFormat var29 = var12.withAllowMissingColumnNames();
    boolean var30 = var29.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var33 = var32.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var35 = var33.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var37 = var35.withEscape(' ');
    java.lang.String[] var39 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var40 = var35.withHeader(var39);
    org.apache.commons.csv.CSVFormat var41 = var29.withHeader(var39);
    org.apache.commons.csv.CSVFormat var42 = var6.withHeader(var39);
    org.apache.commons.csv.CSVFormat var43 = var6.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var46 = var45.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var48 = var46.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var50 = var48.withEscape(' ');
    java.lang.String[] var52 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var53 = var48.withHeader(var52);
    java.lang.String var54 = var48.toString();
    boolean var55 = var48.getIgnoreHeaderCase();
    boolean var56 = var48.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var58 = var48.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var60 = var48.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var62 = var48.withEscape((java.lang.Character)'4');
    boolean var63 = var6.equals((java.lang.Object)'4');
    boolean var64 = var6.isQuoteCharacterSet();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var54.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test27");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    boolean var6 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withIgnoreEmptyLines();
    
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test28");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreEmptyLines();
    java.lang.String var8 = var6.toString();
    java.lang.Object[] var9 = new java.lang.Object[] { var6};
    java.lang.String var10 = var1.format(var9);
    org.apache.commons.csv.CSVFormat var12 = var1.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var14 = var1.withIgnoreEmptyLines(true);
    java.lang.Character var15 = var1.getQuoteCharacter();
    java.lang.String var16 = var1.getRecordSeparator();
    boolean var17 = var1.getIgnoreEmptyLines();
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test29");


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
    org.apache.commons.csv.CSVFormat var15 = var12.withAllowMissingColumnNames();
    boolean var16 = var15.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var17 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var21 = var20.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var23 = var21.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var25 = var23.withEscape(' ');
    java.lang.String[] var27 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var28 = var23.withHeader(var27);
    boolean var29 = var28.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var31 = var28.withSkipHeaderRecord(true);
    java.lang.String[] var32 = var31.getHeader();
    boolean var33 = var31.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var36 = var35.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var38 = var36.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var41 = var40.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var43 = var41.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var46 = var45.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var48 = var46.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var50 = var48.withEscape(' ');
    java.lang.String[] var52 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var53 = var48.withHeader(var52);
    org.apache.commons.csv.CSVFormat var54 = var41.withHeader(var52);
    org.apache.commons.csv.CSVFormat var55 = var38.withHeaderComments((java.lang.Object[])var52);
    org.apache.commons.csv.CSVFormat var56 = var31.withHeader(var52);
    boolean var57 = var31.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var58 = org.apache.commons.csv.CSVParser.parse("Default#Excel#MySQL#4RFC441804#TDFa", var31);
    java.util.Iterator var59 = var58.iterator();
    java.util.Spliterator var60 = var58.spliterator();
    boolean var61 = var17.equals((java.lang.Object)var60);
    org.apache.commons.csv.CSVFormat var63 = var17.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var65 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var67 = var65.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var68 = var67.getQuoteMode();
    java.lang.String var69 = var67.toString();
    boolean var70 = var67.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var72 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var73 = var72.getHeader();
    boolean var74 = var72.isCommentMarkerSet();
    boolean var75 = var72.getIgnoreSurroundingSpaces();
    boolean var76 = var72.isNullStringSet();
    org.apache.commons.csv.CSVFormat var78 = var72.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var79 = var72.withIgnoreSurroundingSpaces();
    boolean var80 = var79.isNullStringSet();
    org.apache.commons.csv.CSVFormat.Predefined[] var81 = org.apache.commons.csv.CSVFormat.Predefined.values();
    boolean var82 = var79.equals((java.lang.Object)var81);
    org.apache.commons.csv.CSVFormat var83 = var67.withHeaderComments((java.lang.Object[])var81);
    org.apache.commons.csv.CSVFormat var84 = var63.withHeaderComments((java.lang.Object[])var81);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var69.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test30");


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
    org.apache.commons.csv.CSVFormat var16 = var11.withRecordSeparator("hi!");
    org.apache.commons.csv.CSVFormat var18 = var11.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:trueDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var20 = var18.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var21 = var20.withIgnoreSurroundingSpaces();
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test31");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    boolean var4 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var6 = var1.withQuote('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test32");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.QuoteMode var3 = var1.getQuoteMode();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test33");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var9.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var11 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var14 = var13.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var16 = var14.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var18 = var16.withEscape(' ');
    java.lang.String[] var20 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var21 = var16.withHeader(var20);
    org.apache.commons.csv.CSVFormat var22 = var11.withHeader(var20);
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
    org.apache.commons.csv.CSVFormat var53 = var22.withHeader(var50);
    java.lang.String var54 = var22.getNullString();
    org.apache.commons.csv.CSVFormat var56 = var22.withNullString("Delimiter=<#> QuoteChar=<4> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var58 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var59 = var58.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var61 = var59.withRecordSeparator('a');
    char var62 = var61.getDelimiter();
    java.lang.String[] var63 = var61.getHeaderComments();
    org.apache.commons.csv.CSVFormat var66 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var67 = var66.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var69 = var67.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var71 = var69.withEscape(' ');
    boolean var72 = var69.getIgnoreSurroundingSpaces();
    java.lang.Character var73 = var69.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var74 = var69.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVParser var75 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var74);
    java.util.Map var76 = var75.getHeaderMap();
    java.util.List var77 = var75.getRecords();
    boolean var78 = var75.isClosed();
    boolean var79 = var61.equals((java.lang.Object)var75);
    org.apache.commons.csv.CSVFormat var81 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var82 = var81.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var84 = var82.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var86 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var87 = var86.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var89 = var87.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var91 = var89.withEscape(' ');
    java.lang.String[] var93 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var94 = var89.withHeader(var93);
    org.apache.commons.csv.CSVFormat var95 = var82.withHeader(var93);
    org.apache.commons.csv.CSVFormat var96 = var61.withHeaderComments((java.lang.Object[])var93);
    boolean var97 = var56.equals((java.lang.Object)var93);
    
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
    assertNotNull(var22);
    
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
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test34");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    boolean var9 = var8.isNullStringSet();
    org.apache.commons.csv.CSVFormat var11 = var8.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var13 = var11.withQuote(' ');
    java.lang.Character var14 = var13.getEscapeCharacter();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test35");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withQuote('4');
    org.apache.commons.csv.CSVFormat var10 = var4.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var11 = var4.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator("Delimiter=<#> Escape=< > SkipHeaderRecord:true");
    
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
    assertNotNull(var13);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test36");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var4.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var10 = var4.withRecordSeparator("Default#Excel#MySQL#RFC4180#TDFa");
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var14 = var12.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var15 = var12.getHeaderComments();
    org.apache.commons.csv.CSVFormat var17 = var12.withSkipHeaderRecord(false);
    org.apache.commons.csv.QuoteMode var18 = var17.getQuoteMode();
    java.lang.Character var19 = var17.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var21 = var17.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var23 = var17.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var26 = var25.getHeader();
    boolean var27 = var25.isCommentMarkerSet();
    boolean var28 = var25.getIgnoreSurroundingSpaces();
    boolean var29 = var25.isNullStringSet();
    org.apache.commons.csv.CSVFormat var31 = var25.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var33 = var31.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var36 = var35.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var38 = var36.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var40 = var38.withEscape(' ');
    java.lang.Character var41 = var40.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var43.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var46 = var44.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var48 = var46.withEscape(' ');
    java.lang.String[] var50 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var51 = var46.withHeader(var50);
    org.apache.commons.csv.CSVFormat var53 = var51.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var55 = var51.withEscape(' ');
    org.apache.commons.csv.CSVFormat var57 = var55.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var59 = var55.withCommentMarker('4');
    boolean var60 = var55.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var62 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var63 = var62.getHeader();
    boolean var64 = var62.isCommentMarkerSet();
    boolean var65 = var62.getIgnoreSurroundingSpaces();
    boolean var66 = var62.isNullStringSet();
    org.apache.commons.csv.CSVFormat var68 = var62.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var69 = var62.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var70 = var69.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var71 = var70.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var73 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var74 = var73.getHeader();
    boolean var75 = var73.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var77 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var78 = var77.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var80 = var78.withRecordSeparator('a');
    java.lang.Object[] var81 = new java.lang.Object[] { var78};
    org.apache.commons.csv.CSVFormat var82 = var73.withHeaderComments(var81);
    java.lang.String[] var83 = var82.getHeaderComments();
    org.apache.commons.csv.CSVFormat var84 = var71.withHeader(var83);
    org.apache.commons.csv.CSVFormat var85 = var55.withHeader(var83);
    org.apache.commons.csv.CSVFormat var86 = var40.withHeaderComments((java.lang.Object[])var83);
    java.lang.String var87 = var31.format((java.lang.Object[])var83);
    java.lang.String var88 = var23.format((java.lang.Object[])var83);
    org.apache.commons.csv.CSVFormat var89 = var4.withHeaderComments((java.lang.Object[])var83);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var87.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var88.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test37");


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
    java.lang.Character var22 = var4.getCommentMarker();
    org.apache.commons.csv.CSVFormat var24 = var4.withNullString("Delimiter=<#> CommentStart=< > RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
    
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
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test38");


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
    boolean var36 = var34.getSkipHeaderRecord();
    boolean var37 = var34.isQuoteCharacterSet();
    
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
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test39");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var7 = var3.withAllowMissingColumnNames(false);
    boolean var8 = var3.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var3.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var11 = var10.withIgnoreSurroundingSpaces();
    boolean var12 = var11.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var19 = var17.withEscape(' ');
    java.lang.String[] var21 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var22 = var17.withHeader(var21);
    org.apache.commons.csv.CSVFormat var24 = var22.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var26 = var22.withEscape(' ');
    org.apache.commons.csv.CSVFormat var28 = var26.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var30 = var26.withCommentMarker('4');
    boolean var31 = var26.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var34 = var33.getHeader();
    boolean var35 = var33.isCommentMarkerSet();
    boolean var36 = var33.getIgnoreSurroundingSpaces();
    boolean var37 = var33.isNullStringSet();
    org.apache.commons.csv.CSVFormat var39 = var33.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var40 = var33.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var41 = var40.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var42 = var41.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var44 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var45 = var44.getHeader();
    boolean var46 = var44.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var49 = var48.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var51 = var49.withRecordSeparator('a');
    java.lang.Object[] var52 = new java.lang.Object[] { var49};
    org.apache.commons.csv.CSVFormat var53 = var44.withHeaderComments(var52);
    java.lang.String[] var54 = var53.getHeaderComments();
    org.apache.commons.csv.CSVFormat var55 = var42.withHeader(var54);
    org.apache.commons.csv.CSVFormat var56 = var26.withHeader(var54);
    org.apache.commons.csv.CSVFormat var57 = var11.withHeader(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
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

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test40");


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
    org.apache.commons.csv.CSVFormat var22 = var4.withEscape(' ');
    
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

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test41");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var5 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var7 = var4.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var9 = var4.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator("Delimiter=<#> Escape=< > CommentStart=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var11);
    var12.close();
    java.util.Map var14 = var12.getHeaderMap();
    var12.close();
    boolean var16 = var12.isClosed();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test42");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    java.lang.String var11 = var10.getRecordSeparator();
    boolean var12 = var10.isQuoteCharacterSet();
    
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
    assertTrue(var12 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test43");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.QuoteMode var11 = var10.getQuoteMode();
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreSurroundingSpaces();
    boolean var13 = var10.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var14 = var10.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var17 = var16.getHeader();
    boolean var18 = var16.isCommentMarkerSet();
    boolean var19 = var16.getIgnoreSurroundingSpaces();
    boolean var20 = var16.isNullStringSet();
    org.apache.commons.csv.CSVFormat var22 = var16.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var23 = var16.withIgnoreSurroundingSpaces();
    boolean var24 = var23.isQuoteCharacterSet();
    java.lang.String var25 = var23.toString();
    boolean var26 = var14.equals((java.lang.Object)var23);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:false"+ "'", var25.equals("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test44");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var5 = var3.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var6 = var5.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var10 = var8.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var11 = var10.getQuoteMode();
    boolean var12 = var10.isCommentMarkerSet();
    boolean var13 = var5.equals((java.lang.Object)var12);
    org.apache.commons.csv.CSVFormat var15 = var5.withDelimiter('#');
    boolean var16 = var5.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var19 = var18.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var23 = var21.withEscape(' ');
    java.lang.String[] var25 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var26 = var21.withHeader(var25);
    org.apache.commons.csv.CSVFormat var27 = var5.withHeader(var25);
    org.apache.commons.csv.CSVFormat var28 = var1.withHeaderComments((java.lang.Object[])var25);
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var31 = var30.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var33 = var31.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var35 = var33.withEscape(' ');
    java.lang.String[] var37 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var38 = var33.withHeader(var37);
    org.apache.commons.csv.CSVFormat var40 = var38.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var42 = var38.withEscape(' ');
    org.apache.commons.csv.CSVFormat var44 = var42.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var46 = var42.withCommentMarker('4');
    boolean var47 = var42.isCommentMarkerSet();
    boolean var48 = var1.equals((java.lang.Object)var42);
    java.lang.String var49 = var42.getRecordSeparator();
    boolean var50 = var42.getIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "a"+ "'", var49.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test45");


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
    org.apache.commons.csv.CSVFormat var21 = var18.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var22 = var18.withIgnoreSurroundingSpaces();
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test46");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreEmptyLines();
    java.lang.String var8 = var6.toString();
    java.lang.Object[] var9 = new java.lang.Object[] { var6};
    java.lang.String var10 = var1.format(var9);
    org.apache.commons.csv.CSVFormat var12 = var1.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var14 = var1.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var16 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var19 = var18.getHeader();
    boolean var20 = var18.isCommentMarkerSet();
    boolean var21 = var18.getIgnoreSurroundingSpaces();
    java.lang.String[] var22 = var18.getHeader();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var25 = var24.getHeader();
    boolean var26 = var24.isCommentMarkerSet();
    boolean var27 = var24.getIgnoreSurroundingSpaces();
    boolean var28 = var24.isNullStringSet();
    org.apache.commons.csv.CSVFormat var30 = var24.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var31 = var24.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var32 = var31.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var33 = var32.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var35 = var33.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var37 = var35.withNullString("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var39 = var35.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var41 = var35.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var43.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var46 = var44.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var48 = var46.withQuote((java.lang.Character)'4');
    java.lang.String[] var49 = var46.getHeaderComments();
    org.apache.commons.csv.CSVFormat var51 = var46.withEscape((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var53 = var51.withQuote((java.lang.Character)'4');
    char var54 = var53.getDelimiter();
    org.apache.commons.csv.CSVFormat var56 = var53.withDelimiter('#');
    boolean var57 = var56.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var59 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var60 = var59.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var62 = var60.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var64 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var65 = var64.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var67 = var65.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var69 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var70 = var69.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var72 = var70.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var74 = var72.withEscape(' ');
    java.lang.String[] var76 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var77 = var72.withHeader(var76);
    org.apache.commons.csv.CSVFormat var78 = var65.withHeader(var76);
    org.apache.commons.csv.CSVFormat var79 = var62.withHeaderComments((java.lang.Object[])var76);
    org.apache.commons.csv.CSVFormat var80 = var79.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var81 = var79.withIgnoreEmptyLines();
    boolean var82 = var79.isEscapeCharacterSet();
    java.lang.String[] var83 = var79.getHeaderComments();
    java.lang.String var84 = var56.format((java.lang.Object[])var83);
    org.apache.commons.csv.CSVFormat var85 = var35.withHeaderComments((java.lang.Object[])var83);
    java.lang.String var86 = var18.format((java.lang.Object[])var83);
    java.lang.String var87 = var16.format((java.lang.Object[])var83);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
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
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
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
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "4Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true4a"+ "'", var84.equals("4Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true4a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var86.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var87.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test47");


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
    org.apache.commons.csv.CSVFormat var18 = var16.withRecordSeparator("hi!");
    org.apache.commons.csv.CSVFormat var20 = var18.withQuote('a');
    org.apache.commons.csv.CSVFormat var22 = var18.withRecordSeparator('4');
    java.lang.String var23 = var18.getRecordSeparator();
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test48");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var8 = var6.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var10 = var8.withCommentMarker(' ');
    
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

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test49");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var3.withSkipHeaderRecord(false);
    java.lang.String[] var10 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var11 = var8.withHeader(var10);
    java.lang.String var12 = var8.getRecordSeparator();
    
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
    assertNull(var12);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test50");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String var5 = var4.toString();
    org.apache.commons.csv.CSVFormat var7 = var4.withCommentMarker(' ');
    java.lang.String var8 = var4.toString();
    org.apache.commons.csv.CSVFormat var10 = var4.withRecordSeparator("Default#Excel#MySQL#4RFC441804#TDFa");
    org.apache.commons.csv.CSVFormat var12 = var4.withRecordSeparator('4');
    
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
    assertTrue("'" + var8 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var8.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test51");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var8 = var7.getHeader();
    boolean var9 = var7.isCommentMarkerSet();
    boolean var10 = var7.getIgnoreSurroundingSpaces();
    boolean var11 = var7.isNullStringSet();
    org.apache.commons.csv.CSVFormat var13 = var7.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var14 = var7.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var15 = var14.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var16 = var15.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = var15.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var21 = var20.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var23 = var21.withRecordSeparator('a');
    char var24 = var23.getDelimiter();
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var28 = var26.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var29 = var28.getQuoteMode();
    org.apache.commons.csv.CSVFormat var31 = var28.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var33 = var28.withSkipHeaderRecord(false);
    java.lang.String[] var35 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var36 = var33.withHeader(var35);
    java.lang.String var37 = var23.format((java.lang.Object[])var35);
    org.apache.commons.csv.CSVFormat var38 = var18.withHeaderComments((java.lang.Object[])var35);
    boolean var39 = var18.getIgnoreHeaderCase();
    boolean var40 = var5.equals((java.lang.Object)var18);
    org.apache.commons.csv.CSVFormat var42 = var18.withIgnoreHeaderCase(false);
    boolean var43 = var42.isCommentMarkerSet();
    java.lang.Character var44 = var42.getCommentMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertTrue(var24 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Delimiter=<#> SkipHeaderRecord:falsea"+ "'", var37.equals("Delimiter=<#> SkipHeaderRecord:falsea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test52");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var6.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var10 = var6.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var12 = var6.withEscape((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withIgnoreEmptyLines();
    java.lang.String var16 = var14.toString();
    boolean var17 = var14.isEscapeCharacterSet();
    boolean var18 = var14.getAllowMissingColumnNames();
    java.lang.Character var19 = var14.getEscapeCharacter();
    java.lang.String[] var20 = var14.getHeaderComments();
    org.apache.commons.csv.CSVFormat var22 = var14.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var25 = var24.getHeader();
    boolean var26 = var24.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var29 = var28.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var31 = var29.withRecordSeparator('a');
    java.lang.Object[] var32 = new java.lang.Object[] { var29};
    org.apache.commons.csv.CSVFormat var33 = var24.withHeaderComments(var32);
    java.lang.String[] var34 = var33.getHeaderComments();
    org.apache.commons.csv.CSVFormat var36 = var33.withDelimiter(' ');
    org.apache.commons.csv.CSVFormat var38 = var33.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var40 = var33.withDelimiter('#');
    boolean var41 = var33.isNullStringSet();
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var44 = var43.getHeader();
    boolean var45 = var43.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var47 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var48 = var47.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var50 = var48.withRecordSeparator('a');
    java.lang.Object[] var51 = new java.lang.Object[] { var48};
    org.apache.commons.csv.CSVFormat var52 = var43.withHeaderComments(var51);
    java.lang.String[] var53 = var52.getHeaderComments();
    org.apache.commons.csv.CSVFormat var54 = var33.withHeader(var53);
    boolean var55 = var14.equals((java.lang.Object)var53);
    org.apache.commons.csv.CSVFormat var56 = var6.withHeaderComments((java.lang.Object[])var53);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var16.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
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
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test53");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    boolean var4 = var2.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var6 = var2.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var11 = var9.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var12 = var11.getQuoteMode();
    java.lang.Character var13 = var11.getCommentMarker();
    java.lang.Object[] var14 = new java.lang.Object[] { var11};
    java.lang.String var15 = var7.format(var14);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var18 = var17.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var20 = var18.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var22 = var20.withEscape(' ');
    java.lang.String[] var24 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var25 = var20.withHeader(var24);
    org.apache.commons.csv.CSVFormat var27 = var20.withCommentMarker((java.lang.Character)'4');
    boolean var28 = var7.equals((java.lang.Object)var20);
    org.apache.commons.csv.CSVParser var29 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> Escape=< > CommentStart=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true", var7);
    boolean var30 = var29.isClosed();
    boolean var31 = var29.isClosed();
    java.util.Iterator var32 = var29.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '4'+ "'", var13.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var15.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test54");


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
    boolean var21 = var4.isCommentMarkerSet();
    java.lang.String var22 = var4.getRecordSeparator();
    boolean var23 = var4.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var25 = var4.withQuote((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var28 = var27.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var30 = var28.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var32 = var30.withEscape(' ');
    java.lang.String[] var34 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var35 = var30.withHeader(var34);
    java.lang.String var36 = var30.toString();
    boolean var37 = var30.getIgnoreHeaderCase();
    boolean var38 = var30.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var40 = var30.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var42 = var30.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var44 = var30.withEscape((java.lang.Character)'4');
    boolean var45 = var25.equals((java.lang.Object)var30);
    java.lang.Character var46 = var25.getEscapeCharacter();
    java.lang.Character var47 = var25.getCommentMarker();
    
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
    assertTrue("'" + var22 + "' != '" + "a"+ "'", var22.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var36.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test55");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = var4.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var13 = var4.withSkipHeaderRecord(false);
    org.apache.commons.csv.QuoteMode var14 = var13.getQuoteMode();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var21 = var19.withEscape(' ');
    java.lang.Character var22 = var21.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var25 = var24.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var27 = var25.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var29 = var27.withEscape(' ');
    java.lang.String[] var31 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var32 = var27.withHeader(var31);
    org.apache.commons.csv.CSVFormat var34 = var32.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var36 = var32.withEscape(' ');
    org.apache.commons.csv.CSVFormat var38 = var36.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var40 = var36.withCommentMarker('4');
    boolean var41 = var36.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var44 = var43.getHeader();
    boolean var45 = var43.isCommentMarkerSet();
    boolean var46 = var43.getIgnoreSurroundingSpaces();
    boolean var47 = var43.isNullStringSet();
    org.apache.commons.csv.CSVFormat var49 = var43.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var50 = var43.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var51 = var50.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var52 = var51.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var54 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var55 = var54.getHeader();
    boolean var56 = var54.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var58 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var59 = var58.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var61 = var59.withRecordSeparator('a');
    java.lang.Object[] var62 = new java.lang.Object[] { var59};
    org.apache.commons.csv.CSVFormat var63 = var54.withHeaderComments(var62);
    java.lang.String[] var64 = var63.getHeaderComments();
    org.apache.commons.csv.CSVFormat var65 = var52.withHeader(var64);
    org.apache.commons.csv.CSVFormat var66 = var36.withHeader(var64);
    org.apache.commons.csv.CSVFormat var67 = var21.withHeaderComments((java.lang.Object[])var64);
    boolean var68 = var13.equals((java.lang.Object)var67);
    org.apache.commons.csv.CSVFormat var70 = var67.withCommentMarker((java.lang.Character)'a');
    java.lang.String[] var71 = var67.getHeaderComments();
    boolean var72 = var67.getIgnoreHeaderCase();
    
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
    assertNull(var22);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
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
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test56");


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
    org.apache.commons.csv.CSVFormat var13 = var12.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var14 = var12.withIgnoreEmptyLines();
    boolean var15 = var12.getIgnoreEmptyLines();
    boolean var16 = var12.getSkipHeaderRecord();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test57");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var6 = var5.withIgnoreSurroundingSpaces();
    boolean var7 = var5.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces();
    java.lang.String var9 = var8.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var11 = var8.withAllowMissingColumnNames(true);
    
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
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test58");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var4.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var10 = var9.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var12 = var10.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var14 = var12.withQuote((java.lang.Character)'4');
    boolean var15 = var12.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var17 = var12.withRecordSeparator(' ');
    boolean var18 = var12.getAllowMissingColumnNames();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test59");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('a');
    org.apache.commons.csv.CSVFormat var3 = var1.withQuote((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var7 = var1.withIgnoreEmptyLines();
    java.lang.Character var8 = var1.getCommentMarker();
    
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
    assertNull(var8);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test60");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreHeaderCase(false);
    java.lang.String var11 = var10.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var12 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var13 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var15 = var13.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var17 = var13.withRecordSeparator("Delimiter=<#> RecordSeparator=<Delimiter=<#> SkipHeaderRecord:trueDelimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true> SurroundingSpaces:ignored SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:true]");
    org.apache.commons.csv.CSVFormat var19 = var13.withCommentMarker(' ');
    
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
    assertTrue("'" + var11 + "' != '" + "a"+ "'", var11.equals("a"));
    
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

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test61");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var1.withRecordSeparator('#');
    char var11 = var10.getDelimiter();
    org.apache.commons.csv.CSVFormat var13 = var10.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var14 = var10.withSkipHeaderRecord();
    boolean var15 = var14.isEscapeCharacterSet();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test62");


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
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var22 = var21.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var24 = var22.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var26 = var24.withEscape(' ');
    java.lang.String[] var28 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var29 = var24.withHeader(var28);
    org.apache.commons.csv.CSVFormat var30 = var15.withHeaderComments((java.lang.Object[])var28);
    org.apache.commons.csv.CSVFormat var32 = var30.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var34 = var30.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var36 = var30.withEscape((java.lang.Character)'4');
    java.lang.String[] var37 = var36.getHeaderComments();
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test63");


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
    org.apache.commons.csv.CSVFormat var32 = var11.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var34 = var32.withDelimiter(' ');
    boolean var35 = var32.isCommentMarkerSet();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test64");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    java.lang.Character var9 = var5.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var10 = var5.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var10);
    java.util.List var12 = var11.getRecords();
    java.util.List var13 = var11.getRecords();
    boolean var14 = var11.isClosed();
    boolean var15 = var11.isClosed();
    java.util.List var16 = var11.getRecords();
    java.util.List var17 = var11.getRecords();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test65");


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
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var28 = var26.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var30 = var28.withEscape(' ');
    java.lang.String[] var32 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var33 = var28.withHeader(var32);
    java.lang.Character var34 = var33.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var35 = var33.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var37 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var38 = var37.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var40 = var38.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var42 = var40.withEscape(' ');
    java.lang.String[] var44 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var45 = var40.withHeader(var44);
    org.apache.commons.csv.CSVFormat var46 = var35.withHeader(var44);
    org.apache.commons.csv.CSVFormat var47 = var21.withHeaderComments((java.lang.Object[])var44);
    org.apache.commons.csv.CSVFormat var49 = var21.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var51 = var21.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var53 = var21.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var54 = var53.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var56 = var53.withEscape(' ');
    
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
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
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
    assertNotNull(var56);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test66");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var11 = var7.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var13 = var7.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var14 = var7.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.QuoteMode var15 = var7.getQuoteMode();
    org.apache.commons.csv.CSVFormat var17 = var7.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var19 = var7.withQuote((java.lang.Character)'4');
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test67");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker((java.lang.Character)'4');
    boolean var10 = var1.equals((java.lang.Object)var7);
    org.apache.commons.csv.CSVFormat var12 = var7.withCommentMarker('4');
    boolean var13 = var7.getAllowMissingColumnNames();
    boolean var14 = var7.getSkipHeaderRecord();
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test68");


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
    java.lang.Character var14 = var8.getEscapeCharacter();
    java.lang.String var15 = var8.getNullString();
    org.apache.commons.csv.CSVFormat var16 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var18 = var16.withSkipHeaderRecord();
    boolean var19 = var18.getSkipHeaderRecord();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test69");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker('4');
    boolean var10 = var7.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var7.withQuote(' ');
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test70");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var5 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var6 = var5.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withRecordSeparator('a');
    java.lang.Object[] var9 = new java.lang.Object[] { var6};
    org.apache.commons.csv.CSVFormat var10 = var1.withHeaderComments(var9);
    java.lang.String[] var11 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var10.withDelimiter(' ');
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator("Delimiter=<#> Escape=<a> RecordSeparator=<a> SkipHeaderRecord:true");
    boolean var16 = var15.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var17 = var15.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var17.withIgnoreHeaderCase(false);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test71");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    org.apache.commons.csv.CSVFormat var12 = var5.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> NullString=<Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true> RecordSeparator=<hi!> EmptyLines:ignored SkipHeaderRecord:true", var5);
    long var14 = var13.getCurrentLineNumber();
    boolean var15 = var13.isClosed();
    var13.close();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test72");


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
    boolean var24 = var19.isClosed();
    long var25 = var19.getCurrentLineNumber();
    java.util.List var26 = var19.getRecords();
    java.util.List var27 = var19.getRecords();
    java.util.List var28 = var19.getRecords();
    
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test73");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat.Predefined var1 = org.apache.commons.csv.CSVFormat.Predefined.valueOf("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> SkipHeaderRecord:false]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test74");


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
    boolean var15 = var14.getIgnoreHeaderCase();
    java.lang.String var16 = var14.toString();
    java.lang.String var17 = var14.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var19 = var14.withEscape(' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var21 = var14.withCommentMarker((java.lang.Character)'#');
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=<#> NullString=<hi!> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var16.equals("Delimiter=<#> NullString=<hi!> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test75");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withQuote(' ');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var2);
    java.util.List var7 = var6.getRecords();
    java.util.List var8 = var6.getRecords();
    var6.close();
    java.util.Iterator var10 = var6.iterator();
    java.util.Map var11 = var6.getHeaderMap();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test76");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var2.toString();
    boolean var4 = var2.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var11 = var9.withEscape(' ');
    java.lang.String[] var13 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var14 = var9.withHeader(var13);
    java.lang.Character var15 = var14.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var16 = var14.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var19 = var18.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var23 = var21.withEscape(' ');
    java.lang.String[] var25 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var26 = var21.withHeader(var25);
    org.apache.commons.csv.CSVFormat var27 = var16.withHeader(var25);
    org.apache.commons.csv.CSVFormat var28 = var2.withHeader(var25);
    org.apache.commons.csv.CSVFormat var29 = var2.withAllowMissingColumnNames();
    char var30 = var29.getDelimiter();
    org.apache.commons.csv.CSVFormat var31 = var29.withIgnoreSurroundingSpaces();
    boolean var32 = var31.isCommentMarkerSet();
    java.lang.Character var33 = var31.getCommentMarker();
    org.apache.commons.csv.CSVFormat var35 = var31.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var37 = var31.withQuote('4');
    char var38 = var37.getDelimiter();
    org.apache.commons.csv.CSVFormat var40 = var37.withCommentMarker((java.lang.Character)'a');
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test77");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    boolean var5 = var4.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreEmptyLines();
    java.lang.String[] var7 = var4.getHeader();
    boolean var8 = var4.getAllowMissingColumnNames();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test78");


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
    org.apache.commons.csv.CSVFormat var19 = var16.withNullString("Delimiter=<#> NullString=<Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true> RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:true");
    
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
    assertNotNull(var19);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test79");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("hi!", var5);
    java.util.Spliterator var10 = var9.spliterator();
    java.util.Map var11 = var9.getHeaderMap();
    boolean var12 = var9.isClosed();
    long var13 = var9.getRecordNumber();
    var9.close();
    long var15 = var9.getCurrentLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var9.getRecords();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test80");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var1.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    boolean var4 = var3.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var6 = var3.withRecordSeparator("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true");
    boolean var7 = var3.getSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test81");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    org.apache.commons.csv.CSVFormat var4 = var1.withEscape('a');
    org.apache.commons.csv.CSVFormat var6 = var1.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var1.withRecordSeparator("Delimiter=<#> Escape=< > RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test82");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker('4');
    char var7 = var6.getDelimiter();
    boolean var8 = var6.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var12 = var6.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var14 = var12.withEscape('a');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test83");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var1.toString();
    boolean var4 = var1.isEscapeCharacterSet();
    boolean var5 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var13 = var11.withQuote((java.lang.Character)'4');
    java.lang.Character var14 = var13.getQuoteCharacter();
    boolean var15 = var13.getSkipHeaderRecord();
    boolean var17 = var13.equals((java.lang.Object)(byte)(-1));
    org.apache.commons.csv.CSVParser var18 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var13);
    long var19 = var18.getRecordNumber();
    java.util.List var20 = var18.getRecords();
    long var21 = var18.getRecordNumber();
    java.util.Iterator var22 = var18.iterator();
    boolean var23 = var1.equals((java.lang.Object)var18);
    java.util.Map var24 = var18.getHeaderMap();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '4'+ "'", var14.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test84");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var6.withNullString("Delimiter=<#> Escape=<a> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreEmptyLines(true);
    char var13 = var10.getDelimiter();
    org.apache.commons.csv.CSVFormat var15 = var10.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var17 = var10.withQuote((java.lang.Character)' ');
    
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
    assertTrue(var13 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test85");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String var5 = var4.toString();
    org.apache.commons.csv.CSVFormat var7 = var4.withCommentMarker(' ');
    java.lang.String var8 = var4.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var4.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var13 = var11.withSkipHeaderRecord(true);
    java.lang.Character var14 = var13.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var16 = var13.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var18 = var13.withEscape(' ');
    
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
    assertNotNull(var18);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test86");


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
    boolean var18 = var1.getAllowMissingColumnNames();
    boolean var19 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.QuoteMode var20 = var1.getQuoteMode();
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test87");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withEscape('a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false", var5);
    java.util.Map var7 = var6.getHeaderMap();
    java.util.List var8 = var6.getRecords();
    java.util.List var9 = var6.getRecords();
    long var10 = var6.getRecordNumber();
    
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
    assertTrue(var10 == 1L);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test88");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('4');
    java.lang.String[] var2 = var1.getHeaderComments();
    java.lang.Character var3 = var1.getCommentMarker();
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var8 = var7.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var8.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var12 = var10.withEscape(' ');
    java.lang.String[] var14 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var15 = var10.withHeader(var14);
    java.lang.Character var16 = var15.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var18 = var15.withIgnoreEmptyLines(true);
    boolean var19 = var15.getAllowMissingColumnNames();
    java.lang.String var20 = var15.toString();
    org.apache.commons.csv.CSVFormat var22 = var15.withEscape(' ');
    org.apache.commons.csv.CSVFormat var23 = var15.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var28 = var26.withRecordSeparator('a');
    java.lang.String var29 = var28.toString();
    boolean var30 = var28.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var32 = var28.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var36 = var34.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var37 = var36.getQuoteMode();
    boolean var38 = var36.isCommentMarkerSet();
    boolean var39 = var36.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var41 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var42 = var41.getHeader();
    boolean var43 = var41.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var46 = var45.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var48 = var46.withRecordSeparator('a');
    java.lang.Object[] var49 = new java.lang.Object[] { var46};
    org.apache.commons.csv.CSVFormat var50 = var41.withHeaderComments(var49);
    java.lang.String[] var51 = var50.getHeaderComments();
    org.apache.commons.csv.CSVFormat var52 = var36.withHeaderComments((java.lang.Object[])var51);
    org.apache.commons.csv.CSVFormat var53 = var32.withHeader(var51);
    org.apache.commons.csv.CSVFormat var54 = var15.withHeaderComments((java.lang.Object[])var51);
    java.lang.String[] var55 = var15.getHeader();
    org.apache.commons.csv.CSVFormat var56 = var5.withHeaderComments((java.lang.Object[])var55);
    java.lang.String var57 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"+ "'", var20.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var29.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
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
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "Delimiter=<4> EmptyLines:ignored SkipHeaderRecord:false"+ "'", var57.equals("Delimiter=<4> EmptyLines:ignored SkipHeaderRecord:false"));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test89");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var8 = var6.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var10 = var6.withRecordSeparator("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withSkipHeaderRecord();
    boolean var14 = var12.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var16 = var12.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.QuoteMode var17 = var16.getQuoteMode();
    boolean var18 = var16.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var21 = var20.withSkipHeaderRecord();
    boolean var22 = var20.isEscapeCharacterSet();
    java.lang.String[] var23 = var20.getHeaderComments();
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var28 = var26.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var31 = var30.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var33 = var31.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var35 = var33.withEscape(' ');
    java.lang.String[] var37 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var38 = var33.withHeader(var37);
    org.apache.commons.csv.CSVFormat var39 = var26.withHeader(var37);
    java.lang.String var40 = var20.format((java.lang.Object[])var37);
    java.lang.String var41 = var16.format((java.lang.Object[])var37);
    org.apache.commons.csv.CSVFormat var42 = var6.withHeaderComments((java.lang.Object[])var37);
    org.apache.commons.csv.CSVFormat var43 = var42.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var45 = var42.withEscape('a');
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var40.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var41.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test90");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var9 = var8.getHeader();
    org.apache.commons.csv.CSVFormat var11 = var8.withQuote(' ');
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("", var8);
    java.util.List var13 = var12.getRecords();
    java.util.Iterator var14 = var12.iterator();
    boolean var15 = var1.equals((java.lang.Object)var12);
    long var16 = var12.getRecordNumber();
    long var17 = var12.getCurrentLineNumber();
    java.util.Map var18 = var12.getHeaderMap();
    java.util.Iterator var19 = var12.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test91");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    java.lang.String[] var8 = var1.getHeader();
    java.lang.Character var9 = var1.getCommentMarker();
    boolean var10 = var1.isCommentMarkerSet();
    boolean var11 = var1.isCommentMarkerSet();
    char var12 = var1.getDelimiter();
    org.apache.commons.csv.CSVFormat var13 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var15 = var1.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:trueDelimiter=<#> SkipHeaderRecord:truea");
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test92");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    boolean var9 = var4.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var11 = var4.withDelimiter('a');
    boolean var12 = var4.getIgnoreSurroundingSpaces();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test93");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var4.withDelimiter(' ');
    boolean var10 = var8.equals((java.lang.Object)'4');
    org.apache.commons.csv.CSVFormat var12 = var8.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var14 = var12.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var17 = var14.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator("Delimiter=<#> CommentStart=<a> SkipHeaderRecord:false HeaderComments:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]");
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var22.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var25 = var23.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var27 = var25.withQuote((java.lang.Character)'4');
    java.lang.Character var28 = var27.getQuoteCharacter();
    boolean var29 = var27.getSkipHeaderRecord();
    boolean var31 = var27.equals((java.lang.Object)(byte)(-1));
    org.apache.commons.csv.CSVParser var32 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var27);
    long var33 = var32.getRecordNumber();
    java.util.List var34 = var32.getRecords();
    long var35 = var32.getRecordNumber();
    java.util.Iterator var36 = var32.iterator();
    long var37 = var32.getRecordNumber();
    java.util.Map var38 = var32.getHeaderMap();
    boolean var39 = var32.isClosed();
    boolean var40 = var19.equals((java.lang.Object)var32);
    long var41 = var32.getRecordNumber();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '4'+ "'", var28.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1L);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test94");


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
    var19.close();
    java.util.Spliterator var27 = var19.spliterator();
    java.util.Iterator var28 = var19.iterator();
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test95");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var5 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var7 = var4.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var9 = var4.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator("Delimiter=<#> Escape=< > CommentStart=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var11);
    var12.close();
    long var14 = var12.getCurrentLineNumber();
    java.util.Iterator var15 = var12.iterator();
    
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
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test96");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    boolean var11 = var10.isCommentMarkerSet();
    java.lang.String var12 = var10.toString();
    org.apache.commons.csv.CSVFormat var14 = var10.withRecordSeparator('#');
    org.apache.commons.csv.QuoteMode var15 = var14.getQuoteMode();
    org.apache.commons.csv.CSVFormat var17 = var14.withCommentMarker((java.lang.Character)' ');
    java.lang.Character var18 = var17.getCommentMarker();
    
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
    assertTrue("'" + var12 + "' != '" + "Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var12.equals("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ' '+ "'", var18.equals(' '));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test97");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withEscape('a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false", var5);
    java.util.Map var7 = var6.getHeaderMap();
    long var8 = var6.getCurrentLineNumber();
    java.util.Iterator var9 = var6.iterator();
    long var10 = var6.getCurrentLineNumber();
    long var11 = var6.getRecordNumber();
    
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
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test98");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    boolean var4 = var2.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator('a');
    java.lang.Object[] var10 = new java.lang.Object[] { var7};
    org.apache.commons.csv.CSVFormat var11 = var2.withHeaderComments(var10);
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("ALL#MINIMAL#NON_NUMERIC#NONEa", var2);
    org.apache.commons.csv.CSVFormat var13 = var2.withAllowMissingColumnNames();
    boolean var14 = var13.getIgnoreEmptyLines();
    boolean var15 = var13.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var17 = var13.withAllowMissingColumnNames(true);
    java.lang.String[] var18 = var17.getHeaderComments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test99");


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
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var21 = var19.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var22 = var21.getQuoteMode();
    org.apache.commons.csv.CSVFormat var24 = var21.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var26 = var24.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var28 = var26.withNullString("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var29 = var26.withIgnoreEmptyLines();
    java.lang.String var30 = var26.getNullString();
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var33 = var32.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var35 = var33.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var37 = var35.withQuote((java.lang.Character)'4');
    java.lang.String[] var38 = var35.getHeaderComments();
    org.apache.commons.csv.QuoteMode var39 = var35.getQuoteMode();
    org.apache.commons.csv.CSVFormat var41 = var35.withCommentMarker((java.lang.Character)'a');
    char var42 = var41.getDelimiter();
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
    org.apache.commons.csv.CSVFormat var63 = var41.withHeader(var61);
    org.apache.commons.csv.CSVFormat var65 = var63.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var67 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var68 = var67.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var70 = var68.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var72 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var73 = var72.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var75 = var73.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var77 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var78 = var77.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var80 = var78.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var82 = var80.withEscape(' ');
    java.lang.String[] var84 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var85 = var80.withHeader(var84);
    org.apache.commons.csv.CSVFormat var86 = var73.withHeader(var84);
    org.apache.commons.csv.CSVFormat var87 = var70.withHeaderComments((java.lang.Object[])var84);
    org.apache.commons.csv.CSVFormat var88 = var87.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var89 = var87.withIgnoreEmptyLines();
    boolean var90 = var87.isEscapeCharacterSet();
    java.lang.String[] var91 = var87.getHeaderComments();
    org.apache.commons.csv.CSVFormat var92 = var65.withHeaderComments((java.lang.Object[])var91);
    java.lang.String var93 = var26.format((java.lang.Object[])var91);
    org.apache.commons.csv.CSVFormat var94 = var17.withHeaderComments((java.lang.Object[])var91);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var30.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == '#');
    
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
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
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
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var93.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test100");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    java.lang.String[] var8 = var1.getHeader();
    org.apache.commons.csv.CSVFormat var9 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode var10 = var1.getQuoteMode();
    boolean var11 = var1.getSkipHeaderRecord();
    boolean var12 = var1.getIgnoreHeaderCase();
    boolean var13 = var1.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var15 = var1.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var17 = var1.withRecordSeparator('4');
    
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
    assertNull(var8);
    
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

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test101");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var12 = var10.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var14 = var10.withIgnoreEmptyLines(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var16 = var14.withQuote((java.lang.Character)'#');
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test102");


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
    org.apache.commons.csv.CSVFormat var37 = var35.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var39 = var37.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var41 = var37.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var43.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var46 = var44.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var48 = var46.withQuote((java.lang.Character)'4');
    java.lang.Character var49 = var48.getQuoteCharacter();
    boolean var50 = var48.getSkipHeaderRecord();
    java.lang.Character var51 = var48.getEscapeCharacter();
    char var52 = var48.getDelimiter();
    org.apache.commons.csv.CSVFormat var54 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var55 = var54.getHeader();
    boolean var56 = var54.isCommentMarkerSet();
    boolean var57 = var54.getIgnoreSurroundingSpaces();
    boolean var58 = var54.isNullStringSet();
    org.apache.commons.csv.CSVFormat var60 = var54.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var61 = var54.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var63 = var54.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var65 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var66 = var65.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var67 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var68 = var65.withHeaderComments((java.lang.Object[])var67);
    boolean var69 = var54.equals((java.lang.Object)var68);
    java.lang.String[] var70 = var54.getHeader();
    org.apache.commons.csv.CSVFormat var71 = var54.withAllowMissingColumnNames();
    boolean var72 = var71.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var74 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var75 = var74.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var77 = var75.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var79 = var77.withEscape(' ');
    java.lang.String[] var81 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var82 = var77.withHeader(var81);
    org.apache.commons.csv.CSVFormat var83 = var71.withHeader(var81);
    org.apache.commons.csv.CSVFormat var84 = var48.withHeader(var81);
    org.apache.commons.csv.CSVFormat var85 = var41.withHeader(var81);
    org.apache.commons.csv.QuoteMode var86 = var41.getQuoteMode();
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + '4'+ "'", var49.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
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
    assertNull(var86);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test103");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.String[] var7 = var4.getHeaderComments();
    org.apache.commons.csv.QuoteMode var8 = var4.getQuoteMode();
    java.lang.Character var9 = var4.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var11 = var4.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var12 = var11.withAllowMissingColumnNames();
    boolean var13 = var11.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var14 = var11.withAllowMissingColumnNames();
    java.lang.Character var15 = var14.getQuoteCharacter();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test104");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    org.apache.commons.csv.CSVFormat var9 = var5.withQuote('4');
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreSurroundingSpaces(true);
    java.lang.String var12 = var11.toString();
    org.apache.commons.csv.CSVFormat var14 = var11.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var18 = var16.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var19 = var16.getHeaderComments();
    boolean var20 = var16.isCommentMarkerSet();
    java.lang.String var21 = var16.toString();
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var24 = var23.getHeader();
    boolean var25 = var23.isCommentMarkerSet();
    boolean var26 = var23.getIgnoreSurroundingSpaces();
    boolean var27 = var23.isNullStringSet();
    org.apache.commons.csv.CSVFormat var29 = var23.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var30 = var23.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var31 = var30.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var32 = var31.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var35 = var34.getHeader();
    boolean var36 = var34.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var39 = var38.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var41 = var39.withRecordSeparator('a');
    java.lang.Object[] var42 = new java.lang.Object[] { var39};
    org.apache.commons.csv.CSVFormat var43 = var34.withHeaderComments(var42);
    java.lang.String[] var44 = var43.getHeaderComments();
    org.apache.commons.csv.CSVFormat var45 = var32.withHeader(var44);
    org.apache.commons.csv.CSVFormat var46 = var16.withHeader(var44);
    org.apache.commons.csv.CSVFormat var47 = var11.withHeader(var44);
    org.apache.commons.csv.CSVFormat var49 = var11.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var50 = org.apache.commons.csv.CSVParser.parse("4Delimiter=<#> SkipHeaderRecord:false4#", var11);
    org.apache.commons.csv.CSVFormat var52 = var11.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var53 = var52.withIgnoreSurroundingSpaces();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var55 = var52.withQuote((java.lang.Character)'#');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var12.equals("Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
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
    assertTrue("'" + var21 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var21.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
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
    assertTrue(var36 == false);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test105");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var6.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var12 = var10.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var14 = var12.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var16 = var14.withAllowMissingColumnNames(false);
    boolean var17 = var16.getSkipHeaderRecord();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test106");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var8 = var6.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var9 = var8.getQuoteMode();
    boolean var10 = var8.isCommentMarkerSet();
    boolean var11 = var3.equals((java.lang.Object)var10);
    org.apache.commons.csv.CSVFormat var13 = var3.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var15 = var3.withSkipHeaderRecord(false);
    java.lang.Character var16 = var15.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var18 = var15.withEscape(' ');
    org.apache.commons.csv.CSVFormat var20 = var15.withRecordSeparator('#');
    java.lang.String[] var21 = var20.getHeaderComments();
    
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
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test107");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var4.withDelimiter(' ');
    boolean var9 = var4.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var11 = var4.withQuote('a');
    org.apache.commons.csv.CSVFormat var13 = var11.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var15 = var11.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var18 = var17.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var20 = var18.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var22 = var20.withEscape(' ');
    org.apache.commons.csv.CSVFormat var24 = var20.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var25 = var20.getQuoteMode();
    org.apache.commons.csv.CSVFormat var26 = var20.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var28 = var26.withCommentMarker('4');
    boolean var29 = var28.isNullStringSet();
    boolean var30 = var28.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var33 = var32.withSkipHeaderRecord();
    boolean var34 = var32.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var36 = var32.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var38 = var32.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var42 = var40.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var43 = var40.getHeaderComments();
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var46 = var45.withIgnoreEmptyLines();
    java.lang.String var47 = var45.toString();
    java.lang.Object[] var48 = new java.lang.Object[] { var45};
    java.lang.String var49 = var40.format(var48);
    org.apache.commons.csv.CSVFormat var50 = var38.withHeaderComments(var48);
    boolean var51 = var28.equals((java.lang.Object)var38);
    org.apache.commons.csv.CSVFormat var52 = var38.withIgnoreSurroundingSpaces();
    boolean var53 = var15.equals((java.lang.Object)var38);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var47.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var49.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test108");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withQuote(' ');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var2);
    long var7 = var6.getRecordNumber();
    java.util.Iterator var8 = var6.iterator();
    java.util.List var9 = var6.getRecords();
    java.util.Map var10 = var6.getHeaderMap();
    long var11 = var6.getRecordNumber();
    java.util.List var12 = var6.getRecords();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test109");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var11 = var7.withNullString("a");
    boolean var12 = var7.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var13 = var7.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var7.withAllowMissingColumnNames(false);
    java.lang.String var16 = var7.getRecordSeparator();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test110");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    boolean var10 = var4.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var13 = var12.getHeader();
    boolean var14 = var12.isCommentMarkerSet();
    boolean var15 = var12.getIgnoreSurroundingSpaces();
    boolean var16 = var12.isNullStringSet();
    java.lang.String var17 = var12.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var18 = var12.withAllowMissingColumnNames();
    boolean var19 = var18.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var21 = var18.withDelimiter('#');
    java.lang.Character var22 = var18.getEscapeCharacter();
    java.lang.String var23 = var18.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var25 = var18.withIgnoreHeaderCase(false);
    boolean var26 = var4.equals((java.lang.Object)false);
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var30 = var29.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var32 = var30.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var34 = var32.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var36 = var32.withDelimiter(' ');
    boolean var38 = var36.equals((java.lang.Object)'4');
    org.apache.commons.csv.CSVFormat var40 = var36.withNullString("hi!");
    org.apache.commons.csv.CSVParser var41 = org.apache.commons.csv.CSVParser.parse("", var36);
    java.util.Map var42 = var41.getHeaderMap();
    boolean var43 = var41.isClosed();
    java.util.Map var44 = var41.getHeaderMap();
    long var45 = var41.getRecordNumber();
    long var46 = var41.getRecordNumber();
    java.util.Iterator var47 = var41.iterator();
    boolean var48 = var41.isClosed();
    java.util.Iterator var49 = var41.iterator();
    boolean var50 = var4.equals((java.lang.Object)var41);
    java.util.List var51 = var41.getRecords();
    long var52 = var41.getCurrentLineNumber();
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
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
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test111");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var6 = var5.withIgnoreSurroundingSpaces();
    java.lang.String[] var7 = var6.getHeaderComments();
    java.lang.String var8 = var6.getNullString();
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var12 = var11.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var14 = var12.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var16 = var12.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var18 = var12.withRecordSeparator('4');
    org.apache.commons.csv.CSVParser var19 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> QuoteChar=<4> RecordSeparator=<hi!> SkipHeaderRecord:true", var12);
    org.apache.commons.csv.CSVFormat var21 = var12.withDelimiter('a');
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var24 = var23.withSkipHeaderRecord();
    boolean var25 = var23.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var27 = var23.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var29 = var23.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var31 = var29.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var33 = var29.withSkipHeaderRecord(true);
    boolean var34 = var33.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var36 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var37 = var36.withSkipHeaderRecord();
    boolean var38 = var36.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var40 = var36.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var41 = var40.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var43 = var40.withRecordSeparator('4');
    java.lang.Character var44 = var40.getQuoteCharacter();
    java.lang.String var45 = var40.toString();
    org.apache.commons.csv.CSVFormat var47 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var49 = var47.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var50 = var49.getQuoteMode();
    org.apache.commons.csv.CSVFormat var52 = var49.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var54 = var49.withSkipHeaderRecord(false);
    java.lang.String[] var56 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var57 = var54.withHeader(var56);
    org.apache.commons.csv.CSVFormat var58 = var40.withHeader(var56);
    org.apache.commons.csv.CSVFormat var59 = var33.withHeader(var56);
    java.lang.String var60 = var12.format((java.lang.Object[])var56);
    org.apache.commons.csv.CSVFormat var61 = var6.withHeader(var56);
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Delimiter=<#> CommentStart=< > SkipHeaderRecord:false"+ "'", var45.equals("Delimiter=<#> CommentStart=< > SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var60.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test112");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.String[] var7 = var4.getHeaderComments();
    java.lang.Character var8 = var4.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines(false);
    
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

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test113");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var14 = var12.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var15 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var18 = var17.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var19 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var20 = var17.withHeaderComments((java.lang.Object[])var19);
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var22.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var25 = var23.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var27 = var25.withQuote((java.lang.Character)'4');
    java.lang.Character var28 = var27.getQuoteCharacter();
    boolean var29 = var27.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var31 = var27.withIgnoreSurroundingSpaces(true);
    boolean var32 = var31.getSkipHeaderRecord();
    java.lang.String[] var33 = var31.getHeaderComments();
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var36 = var35.withSkipHeaderRecord();
    boolean var37 = var35.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var39 = var35.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var40 = var39.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var42 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var44 = var42.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var45 = var44.getQuoteMode();
    java.lang.Character var46 = var44.getCommentMarker();
    java.lang.Object[] var47 = new java.lang.Object[] { var44};
    java.lang.String var48 = var40.format(var47);
    org.apache.commons.csv.CSVFormat var49 = var31.withHeaderComments(var47);
    org.apache.commons.csv.CSVFormat var51 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var52 = var51.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var54 = var52.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var56 = var54.withQuote((java.lang.Character)'4');
    java.lang.Character var57 = var56.getQuoteCharacter();
    boolean var58 = var56.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var60 = var56.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var62 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var63 = var62.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var65 = var63.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var67 = var65.withEscape(' ');
    java.lang.String[] var69 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var70 = var65.withHeader(var69);
    boolean var71 = var70.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var73 = var70.withSkipHeaderRecord(true);
    java.lang.String[] var74 = var73.getHeader();
    org.apache.commons.csv.CSVFormat var75 = var56.withHeader(var74);
    org.apache.commons.csv.CSVFormat var76 = var31.withHeader(var74);
    java.lang.String var77 = var20.format((java.lang.Object[])var74);
    java.lang.String var78 = var15.format((java.lang.Object[])var74);
    org.apache.commons.csv.CSVFormat var80 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var81 = var80.getHeader();
    boolean var82 = var80.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var84 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var85 = var84.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var87 = var85.withRecordSeparator('a');
    java.lang.Object[] var88 = new java.lang.Object[] { var85};
    org.apache.commons.csv.CSVFormat var89 = var80.withHeaderComments(var88);
    org.apache.commons.csv.CSVFormat var90 = var15.withHeaderComments(var88);
    org.apache.commons.csv.CSVFormat var92 = var90.withQuote('a');
    java.lang.Character var93 = var92.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var94 = var92.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var96 = var92.withEscape((java.lang.Character)' ');
    boolean var97 = var96.isNullStringSet();
    org.apache.commons.csv.CSVFormat var99 = var96.withIgnoreEmptyLines(true);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertTrue("'" + var28 + "' != '" + '4'+ "'", var28.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
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
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + '4'+ "'", var46.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var48.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
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
    assertTrue("'" + var57 + "' != '" + '4'+ "'", var57.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
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
    assertTrue("'" + var77 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var77.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"+ "'", var78.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + 'a'+ "'", var93.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test114");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var4.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var12 = var11.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var14 = var12.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var16 = var14.withEscape(' ');
    java.lang.String[] var18 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var19 = var14.withHeader(var18);
    java.lang.Character var20 = var19.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var21 = var19.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var24 = var23.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var26 = var24.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var28 = var26.withEscape(' ');
    java.lang.String[] var30 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var31 = var26.withHeader(var30);
    org.apache.commons.csv.CSVFormat var32 = var21.withHeader(var30);
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var35 = var34.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var37 = var35.withRecordSeparator('a');
    java.lang.String var38 = var37.toString();
    boolean var39 = var37.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var41 = var37.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var45 = var43.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var46 = var45.getQuoteMode();
    boolean var47 = var45.isCommentMarkerSet();
    boolean var48 = var45.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var50 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var51 = var50.getHeader();
    boolean var52 = var50.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var54 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var55 = var54.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var57 = var55.withRecordSeparator('a');
    java.lang.Object[] var58 = new java.lang.Object[] { var55};
    org.apache.commons.csv.CSVFormat var59 = var50.withHeaderComments(var58);
    java.lang.String[] var60 = var59.getHeaderComments();
    org.apache.commons.csv.CSVFormat var61 = var45.withHeaderComments((java.lang.Object[])var60);
    org.apache.commons.csv.CSVFormat var62 = var41.withHeader(var60);
    org.apache.commons.csv.CSVFormat var63 = var32.withHeader(var60);
    org.apache.commons.csv.CSVFormat var64 = var9.withHeader(var60);
    org.apache.commons.csv.CSVFormat var66 = var9.withQuote('a');
    org.apache.commons.csv.CSVFormat var67 = var66.withIgnoreSurroundingSpaces();
    
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
    assertNull(var20);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var38.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
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
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test115");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces(true);
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withRecordSeparator(' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var11 = var9.withQuote('#');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test116");


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
    org.apache.commons.csv.CSVFormat var23 = var21.withNullString("Delimiter=<#> Escape=< > NullString=<Delimiter=<#> Escape=<a> RecordSeparator=<a> SkipHeaderRecord:true> RecordSeparator=<a> SkipHeaderRecord:true");
    boolean var24 = var23.getSkipHeaderRecord();
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test117");


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
    org.apache.commons.csv.QuoteMode var19 = var18.getQuoteMode();
    org.apache.commons.csv.CSVFormat var21 = var18.withSkipHeaderRecord(false);
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
    java.lang.String var37 = var21.format(var35);
    
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
    assertNotNull(var21);
    
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
    assertTrue("'" + var37 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:falsea"+ "'", var37.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:falsea"));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test118");


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
    org.apache.commons.csv.CSVFormat var14 = var10.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var16 = var10.withAllowMissingColumnNames(false);
    
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

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test119");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var11 = var10.getHeader();
    boolean var12 = var10.isCommentMarkerSet();
    boolean var13 = var10.getIgnoreSurroundingSpaces();
    boolean var14 = var10.isNullStringSet();
    org.apache.commons.csv.CSVFormat var16 = var10.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var17 = var10.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var18 = var17.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var19 = var18.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var22 = var21.getHeader();
    boolean var23 = var21.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var28 = var26.withRecordSeparator('a');
    java.lang.Object[] var29 = new java.lang.Object[] { var26};
    org.apache.commons.csv.CSVFormat var30 = var21.withHeaderComments(var29);
    java.lang.String[] var31 = var30.getHeaderComments();
    org.apache.commons.csv.CSVFormat var32 = var19.withHeader(var31);
    java.lang.String var33 = var1.format((java.lang.Object[])var31);
    org.apache.commons.csv.CSVFormat var35 = var1.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var37 = var1.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var39 = var37.withIgnoreHeaderCase(false);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertTrue("'" + var33 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var33.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test120");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var10 = var8.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var11 = var8.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var13 = var11.withAllowMissingColumnNames(true);
    java.lang.Character var14 = var11.getQuoteCharacter();
    
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
    assertNull(var14);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test121");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var6.withCommentMarker(' ');
    java.lang.Character var11 = var6.getQuoteCharacter();
    java.lang.Character var12 = var6.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var14 = var6.withEscape('a');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test122");


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
    org.apache.commons.csv.QuoteMode var33 = var12.getQuoteMode();
    org.apache.commons.csv.CSVFormat var34 = var12.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var35 = var12.withSkipHeaderRecord();
    org.apache.commons.csv.QuoteMode var36 = var35.getQuoteMode();
    boolean var37 = var35.isEscapeCharacterSet();
    
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
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test123");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    boolean var4 = var2.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var6 = var2.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var6.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var11 = var6.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> SurroundingSpaces:ignored SkipHeaderRecord:false", var11);
    java.util.Iterator var13 = var12.iterator();
    var12.close();
    java.util.Map var15 = var12.getHeaderMap();
    java.util.Spliterator var16 = var12.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test124");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    boolean var4 = var2.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var6 = var2.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.QuoteMode var7 = var6.getQuoteMode();
    boolean var8 = var6.isEscapeCharacterSet();
    java.lang.Character var9 = var6.getEscapeCharacter();
    boolean var10 = var6.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=< > SkipHeaderRecord:false", var6);
    boolean var12 = var11.isClosed();
    var11.close();
    boolean var14 = var11.isClosed();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test125");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    boolean var5 = var4.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var10 = var7.withIgnoreSurroundingSpaces();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test126");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = var6.withNullString("");
    java.lang.String var10 = var9.toString();
    org.apache.commons.csv.CSVFormat var12 = var9.withEscape(' ');
    java.lang.Character var13 = var9.getCommentMarker();
    boolean var14 = var9.getIgnoreEmptyLines();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test127");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var1.toString();
    boolean var4 = var1.isEscapeCharacterSet();
    boolean var5 = var1.getIgnoreSurroundingSpaces();
    boolean var6 = var1.isCommentMarkerSet();
    boolean var7 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var9 = var1.withEscape(' ');
    java.lang.Character var10 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var12 = var1.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var14 = var1.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var15 = var14.withIgnoreSurroundingSpaces();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test128");


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
    java.util.Spliterator var16 = var13.spliterator();
    java.util.List var17 = var13.getRecords();
    java.util.Spliterator var18 = var13.spliterator();
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Map var20 = var13.getHeaderMap();
    boolean var21 = var13.isClosed();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test129");


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
    org.apache.commons.csv.CSVFormat var33 = var31.withDelimiter('#');
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
    java.lang.String var64 = var63.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var66 = var63.withCommentMarker((java.lang.Character)' ');
    java.lang.String[] var67 = var63.getHeader();
    java.lang.String var68 = var33.format((java.lang.Object[])var67);
    org.apache.commons.csv.CSVFormat var70 = var33.withIgnoreHeaderCase(false);
    
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
    assertTrue("'" + var64 + "' != '" + "a"+ "'", var64.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "aDelimiter=<#> SkipHeaaderRecord:trueaa"+ "'", var68.equals("aDelimiter=<#> SkipHeaaderRecord:trueaa"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test130");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var5 = var2.withIgnoreEmptyLines();
    boolean var6 = var5.isNullStringSet();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var9 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var13 = var11.withEscape(' ');
    java.lang.String[] var15 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var16 = var11.withHeader(var15);
    java.lang.Character var17 = var16.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var18 = var16.withAllowMissingColumnNames();
    java.lang.Character var19 = var16.getEscapeCharacter();
    boolean var20 = var16.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var22 = var16.withDelimiter('#');
    java.lang.String[] var23 = var22.getHeaderComments();
    org.apache.commons.csv.CSVFormat var25 = var22.withCommentMarker((java.lang.Character)'4');
    java.lang.Character var26 = var25.getQuoteCharacter();
    java.lang.String[] var27 = var25.getHeader();
    org.apache.commons.csv.CSVFormat var28 = var5.withHeader(var27);
    java.lang.String var29 = var28.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"+ "'", var29.equals("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test131");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat.Predefined var1 = org.apache.commons.csv.CSVFormat.Predefined.valueOf("Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test132");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var11 = var7.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var13 = var7.withIgnoreEmptyLines(true);
    java.lang.Character var14 = var13.getCommentMarker();
    org.apache.commons.csv.CSVFormat var16 = var13.withQuote((java.lang.Character)'a');
    
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

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test133");


    org.apache.commons.csv.CSVFormat var3 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var8 = var6.withEscape(' ');
    org.apache.commons.csv.CSVFormat var10 = var6.withQuote('4');
    org.apache.commons.csv.CSVFormat var12 = var6.withIgnoreSurroundingSpaces(true);
    java.lang.String var13 = var12.toString();
    org.apache.commons.csv.CSVFormat var15 = var12.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var19 = var17.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var20 = var17.getHeaderComments();
    boolean var21 = var17.isCommentMarkerSet();
    java.lang.String var22 = var17.toString();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var25 = var24.getHeader();
    boolean var26 = var24.isCommentMarkerSet();
    boolean var27 = var24.getIgnoreSurroundingSpaces();
    boolean var28 = var24.isNullStringSet();
    org.apache.commons.csv.CSVFormat var30 = var24.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var31 = var24.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var32 = var31.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var33 = var32.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var36 = var35.getHeader();
    boolean var37 = var35.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var39 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var40 = var39.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var42 = var40.withRecordSeparator('a');
    java.lang.Object[] var43 = new java.lang.Object[] { var40};
    org.apache.commons.csv.CSVFormat var44 = var35.withHeaderComments(var43);
    java.lang.String[] var45 = var44.getHeaderComments();
    org.apache.commons.csv.CSVFormat var46 = var33.withHeader(var45);
    org.apache.commons.csv.CSVFormat var47 = var17.withHeader(var45);
    org.apache.commons.csv.CSVFormat var48 = var12.withHeader(var45);
    org.apache.commons.csv.CSVFormat var50 = var12.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var51 = org.apache.commons.csv.CSVParser.parse("4Delimiter=<#> SkipHeaderRecord:false4#", var12);
    org.apache.commons.csv.CSVFormat var53 = var12.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var54 = var53.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var55 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=<4> RecordSeparator=<4> SurroundingSpaces:ignored SkipHeaderRecord:true", var53);
    boolean var56 = var55.isClosed();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var13.equals("Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
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
    assertTrue("'" + var22 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var22.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test134");


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
    java.lang.String[] var15 = var14.getHeader();
    org.apache.commons.csv.CSVFormat var17 = var14.withQuote('4');
    org.apache.commons.csv.CSVFormat var18 = var14.withAllowMissingColumnNames();
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test135");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var9 = var5.withDelimiter(' ');
    boolean var11 = var9.equals((java.lang.Object)'4');
    org.apache.commons.csv.CSVFormat var13 = var9.withNullString("hi!");
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("", var9);
    java.lang.Character var15 = var9.getEscapeCharacter();
    java.lang.Character var16 = var9.getCommentMarker();
    java.lang.Character var17 = var9.getQuoteCharacter();
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test136");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('a');
    org.apache.commons.csv.CSVFormat var3 = var1.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var5 = var1.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var7 = var5.withIgnoreEmptyLines(false);
    char var8 = var7.getDelimiter();
    java.lang.String var9 = var7.toString();
    org.apache.commons.csv.CSVFormat var10 = var7.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.QuoteMode var11 = var7.getQuoteMode();
    org.apache.commons.csv.CSVFormat var13 = var7.withRecordSeparator("4Delimiter=<#> SkipHeaderRecord:false4#");
    org.apache.commons.csv.CSVFormat var14 = var13.withSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Delimiter=<a> NullString=<Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false> SkipHeaderRecord:false"+ "'", var9.equals("Delimiter=<a> NullString=<Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test137");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker('4');
    char var7 = var6.getDelimiter();
    org.apache.commons.csv.CSVFormat var9 = var6.withDelimiter('#');
    boolean var10 = var9.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var12.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var17 = var15.withEscape(' ');
    java.lang.String[] var19 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var20 = var15.withHeader(var19);
    boolean var21 = var20.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var23 = var20.withSkipHeaderRecord(true);
    java.lang.String[] var24 = var23.getHeader();
    boolean var25 = var23.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var28 = var27.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var30 = var28.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var33 = var32.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var35 = var33.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var37 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var38 = var37.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var40 = var38.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var42 = var40.withEscape(' ');
    java.lang.String[] var44 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var45 = var40.withHeader(var44);
    org.apache.commons.csv.CSVFormat var46 = var33.withHeader(var44);
    org.apache.commons.csv.CSVFormat var47 = var30.withHeaderComments((java.lang.Object[])var44);
    org.apache.commons.csv.CSVFormat var48 = var23.withHeader(var44);
    org.apache.commons.csv.CSVFormat var49 = var9.withHeaderComments((java.lang.Object[])var44);
    java.lang.Character var50 = var49.getEscapeCharacter();
    
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
    assertNotNull(var9);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
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
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test138");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var11 = var9.withEscape(' ');
    org.apache.commons.csv.CSVFormat var13 = var9.withQuote('4');
    java.lang.String var14 = var9.getNullString();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var17 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var21 = var19.withQuote((java.lang.Character)'4');
    java.lang.Character var22 = var21.getQuoteCharacter();
    boolean var23 = var21.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var25 = var21.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var28 = var27.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var30 = var28.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var32 = var30.withEscape(' ');
    java.lang.String[] var34 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var35 = var30.withHeader(var34);
    boolean var36 = var35.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var38 = var35.withSkipHeaderRecord(true);
    java.lang.String[] var39 = var38.getHeader();
    org.apache.commons.csv.CSVFormat var40 = var21.withHeader(var39);
    java.lang.String var41 = var9.format((java.lang.Object[])var39);
    java.lang.String var42 = var3.format((java.lang.Object[])var39);
    org.apache.commons.csv.CSVFormat var44 = var3.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var45 = var3.withSkipHeaderRecord();
    java.lang.Character var46 = var3.getCommentMarker();
    org.apache.commons.csv.CSVFormat var48 = var3.withEscape('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"+ "'", var41.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var42.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test139");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    boolean var7 = var6.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var9.withQuote((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var12 = var9.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var14 = var12.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var16 = var14.withIgnoreEmptyLines(true);
    
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
    assertNotNull(var16);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test140");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    boolean var11 = var10.isCommentMarkerSet();
    java.lang.String var12 = var10.toString();
    org.apache.commons.csv.CSVFormat var14 = var10.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var16 = var14.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var17 = var14.withIgnoreSurroundingSpaces();
    java.lang.Character var18 = var14.getQuoteCharacter();
    
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
    assertTrue("'" + var12 + "' != '" + "Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var12.equals("Delimiter=<#> QuoteChar=<4> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + '4'+ "'", var18.equals('4'));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test141");


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
    org.apache.commons.csv.CSVFormat var26 = var5.withNullString("Delimiter=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var29 = var28.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var31 = var29.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var33 = var29.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var35 = var29.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var40 = var38.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var41 = var40.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var43 = var41.withDelimiter('#');
    boolean var44 = var41.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var45 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:false", var41);
    boolean var46 = var41.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var48 = var41.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var50 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var51 = var50.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var53 = var51.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var55 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var56 = var55.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var58 = var56.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var60 = var58.withEscape(' ');
    java.lang.String[] var62 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var63 = var58.withHeader(var62);
    org.apache.commons.csv.CSVFormat var64 = var51.withHeader(var62);
    org.apache.commons.csv.CSVFormat var65 = var41.withHeader(var62);
    org.apache.commons.csv.CSVFormat var66 = var29.withHeaderComments((java.lang.Object[])var62);
    org.apache.commons.csv.CSVFormat var67 = var26.withHeaderComments((java.lang.Object[])var62);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test142");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord(true);
    char var12 = var9.getDelimiter();
    org.apache.commons.csv.CSVFormat var14 = var9.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var16 = var14.withEscape((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var18 = var16.withRecordSeparator("4Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true4Delimiter=<#> Escape=<a> RecordSeparator=<a> SkipHeaderRecord:true");
    
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
    assertTrue(var12 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test143");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var8.withAllowMissingColumnNames(true);
    boolean var11 = var10.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames();
    boolean var13 = var10.isEscapeCharacterSet();
    org.apache.commons.csv.QuoteMode var14 = var10.getQuoteMode();
    org.apache.commons.csv.CSVFormat var16 = var10.withNullString("ALL#MINIMAL#NON_NUMERIC#NONE4");
    org.apache.commons.csv.QuoteMode var17 = var16.getQuoteMode();
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test144");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var5 = var3.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var6 = var5.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var10 = var8.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var11 = var10.getQuoteMode();
    boolean var12 = var10.isCommentMarkerSet();
    boolean var13 = var5.equals((java.lang.Object)var12);
    org.apache.commons.csv.CSVFormat var15 = var5.withDelimiter('#');
    boolean var16 = var5.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var19 = var18.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var23 = var21.withEscape(' ');
    java.lang.String[] var25 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var26 = var21.withHeader(var25);
    org.apache.commons.csv.CSVFormat var27 = var5.withHeader(var25);
    org.apache.commons.csv.CSVFormat var28 = var1.withHeaderComments((java.lang.Object[])var25);
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var31 = var30.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var33 = var31.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var35 = var33.withEscape(' ');
    java.lang.String[] var37 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var38 = var33.withHeader(var37);
    org.apache.commons.csv.CSVFormat var40 = var38.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var42 = var38.withEscape(' ');
    org.apache.commons.csv.CSVFormat var44 = var42.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var46 = var42.withCommentMarker('4');
    boolean var47 = var42.isCommentMarkerSet();
    boolean var48 = var1.equals((java.lang.Object)var42);
    org.apache.commons.csv.CSVFormat var49 = var1.withSkipHeaderRecord();
    java.lang.Character var50 = var1.getEscapeCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test145");


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
    boolean var36 = var34.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var38 = var34.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var40 = var34.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var42 = var34.withEscape((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var44 = var42.withAllowMissingColumnNames(true);
    java.lang.Character var45 = var44.getQuoteCharacter();
    
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
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test146");


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
    java.util.List var16 = var13.getRecords();
    java.util.Iterator var17 = var13.iterator();
    java.util.Iterator var18 = var13.iterator();
    java.util.Map var19 = var13.getHeaderMap();
    java.util.Map var20 = var13.getHeaderMap();
    java.util.Map var21 = var13.getHeaderMap();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test147");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.QuoteMode var1 = org.apache.commons.csv.QuoteMode.valueOf("Delimiter=<#> Escape=<a> QuoteChar=< > RecordSeparator=<Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false> SkipHeaderRecord:true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test148");


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
    java.lang.Character var17 = var15.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var19 = var15.withQuote('a');
    org.apache.commons.csv.CSVFormat var20 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var22 = var15.withAllowMissingColumnNames(false);
    char var23 = var22.getDelimiter();
    org.apache.commons.csv.CSVParser var24 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false", var22);
    boolean var25 = var24.isClosed();
    
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
    assertTrue("'" + var17 + "' != '" + ' '+ "'", var17.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test149");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var4.getCommentMarker();
    org.apache.commons.csv.CSVFormat var11 = var4.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var13 = var4.withEscape('4');
    org.apache.commons.csv.CSVFormat var14 = var13.withSkipHeaderRecord();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var16 = var13.withDelimiter('4');
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test150");


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
    java.lang.Character var54 = var53.getEscapeCharacter();
    boolean var55 = var53.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var57 = var53.withIgnoreEmptyLines(false);
    
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
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test151");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreEmptyLines();
    java.lang.String var8 = var6.toString();
    java.lang.Object[] var9 = new java.lang.Object[] { var6};
    java.lang.String var10 = var1.format(var9);
    java.lang.String var11 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var13 = var1.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var16 = var15.withAllowMissingColumnNames();
    java.lang.String[] var17 = var16.getHeaderComments();
    org.apache.commons.csv.CSVFormat var18 = var16.withSkipHeaderRecord();
    
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
    assertNull(var11);
    
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

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test152");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withQuote(' ');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var2);
    java.util.Iterator var7 = var6.iterator();
    var6.close();
    java.util.Map var9 = var6.getHeaderMap();
    long var10 = var6.getCurrentLineNumber();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test153");


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
    org.apache.commons.csv.CSVFormat var18 = var11.withQuote('a');
    org.apache.commons.csv.CSVFormat var19 = var11.withIgnoreEmptyLines();
    char var20 = var11.getDelimiter();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == '#');

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test154");


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
    boolean var15 = var13.isClosed();
    java.util.Map var16 = var13.getHeaderMap();
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test155");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var2.toString();
    boolean var4 = var2.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var11 = var9.withEscape(' ');
    java.lang.String[] var13 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var14 = var9.withHeader(var13);
    java.lang.Character var15 = var14.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var16 = var14.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var19 = var18.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var23 = var21.withEscape(' ');
    java.lang.String[] var25 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var26 = var21.withHeader(var25);
    org.apache.commons.csv.CSVFormat var27 = var16.withHeader(var25);
    org.apache.commons.csv.CSVFormat var28 = var2.withHeader(var25);
    org.apache.commons.csv.CSVFormat var29 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var31 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var32 = var31.getHeader();
    boolean var33 = var31.isCommentMarkerSet();
    boolean var34 = var31.getIgnoreSurroundingSpaces();
    boolean var35 = var31.isNullStringSet();
    org.apache.commons.csv.CSVFormat var37 = var31.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var38 = var31.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var40 = var31.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var42 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var43 = var42.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var44 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var45 = var42.withHeaderComments((java.lang.Object[])var44);
    boolean var46 = var31.equals((java.lang.Object)var45);
    java.lang.String[] var47 = var31.getHeader();
    org.apache.commons.csv.CSVFormat var48 = var31.withAllowMissingColumnNames();
    boolean var49 = var48.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var51 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var52 = var51.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var54 = var52.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var56 = var54.withEscape(' ');
    java.lang.String[] var58 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var59 = var54.withHeader(var58);
    org.apache.commons.csv.CSVFormat var60 = var48.withHeader(var58);
    org.apache.commons.csv.CSVFormat var61 = var2.withHeaderComments((java.lang.Object[])var58);
    org.apache.commons.csv.CSVFormat var63 = var61.withAllowMissingColumnNames(true);
    boolean var64 = var63.isNullStringSet();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test156");


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
    org.apache.commons.csv.CSVFormat var55 = var10.withHeader(var53);
    java.lang.String[] var56 = var10.getHeaderComments();
    boolean var57 = var10.isCommentMarkerSet();
    boolean var58 = var10.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var60 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var61 = var60.getHeader();
    boolean var62 = var60.isCommentMarkerSet();
    boolean var63 = var60.getIgnoreSurroundingSpaces();
    boolean var64 = var60.isNullStringSet();
    org.apache.commons.csv.CSVFormat var66 = var60.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var67 = var60.withIgnoreSurroundingSpaces();
    boolean var68 = var67.isNullStringSet();
    org.apache.commons.csv.CSVFormat var70 = var67.withSkipHeaderRecord(false);
    boolean var71 = var10.equals((java.lang.Object)var67);
    
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
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test157");


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
    java.lang.String var20 = var10.getNullString();
    
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
    assertNull(var20);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test158");


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
    org.apache.commons.csv.CSVFormat var17 = var14.withAllowMissingColumnNames();
    boolean var18 = var14.isNullStringSet();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test159");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    boolean var7 = var6.getSkipHeaderRecord();
    boolean var8 = var6.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var6.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var12 = var6.withAllowMissingColumnNames(true);
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test160");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    java.lang.String[] var7 = var4.getHeaderComments();
    org.apache.commons.csv.QuoteMode var8 = var4.getQuoteMode();
    java.lang.Character var9 = var4.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var11 = var4.withRecordSeparator('#');
    boolean var12 = var4.isQuoteCharacterSet();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test161");


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
    long var15 = var12.getRecordNumber();
    var12.close();
    java.util.Iterator var17 = var12.iterator();
    java.util.Spliterator var18 = var12.spliterator();
    long var19 = var12.getRecordNumber();
    boolean var20 = var12.isClosed();
    java.util.Map var21 = var12.getHeaderMap();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test162");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    java.lang.Character var8 = var4.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var11 = var4.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var13 = var11.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var14 = var11.withSkipHeaderRecord();
    java.lang.String var15 = var14.toString();
    java.lang.Character var16 = var14.getCommentMarker();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var15.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test163");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var1.toString();
    java.lang.Character var4 = var1.getCommentMarker();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var8 = var1.withEscape(' ');
    java.lang.String[] var9 = var8.getHeaderComments();
    org.apache.commons.csv.CSVFormat var11 = var8.withDelimiter('a');
    org.apache.commons.csv.CSVFormat var12 = var11.withIgnoreEmptyLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var3.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test164");


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
    org.apache.commons.csv.CSVFormat var32 = var31.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var34 = var31.withIgnoreHeaderCase(false);
    java.lang.String var35 = var31.getNullString();
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test165");


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
    boolean var39 = var12.isEscapeCharacterSet();
    boolean var40 = var12.isNullStringSet();
    java.lang.Character var41 = var12.getEscapeCharacter();
    
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
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test166");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var8.withNullString("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var11 = var8.withIgnoreEmptyLines();
    java.lang.Character var12 = var11.getEscapeCharacter();
    
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
    assertNull(var12);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test167");


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
    java.lang.Character var21 = var4.getCommentMarker();
    boolean var22 = var4.isQuoteCharacterSet();
    
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test168");


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
    java.util.Iterator var33 = var24.iterator();
    java.util.Iterator var34 = var24.iterator();
    var24.close();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test169");


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
    boolean var32 = var31.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var35 = var34.getHeader();
    boolean var36 = var34.isCommentMarkerSet();
    boolean var37 = var34.getIgnoreSurroundingSpaces();
    boolean var38 = var34.isNullStringSet();
    java.lang.String var39 = var34.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var40 = var34.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var41 = var40.withAllowMissingColumnNames();
    boolean var42 = var40.getSkipHeaderRecord();
    boolean var43 = var40.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var46 = var45.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var48 = var46.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var50 = var48.withEscape(' ');
    java.lang.String[] var52 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var53 = var48.withHeader(var52);
    org.apache.commons.csv.CSVFormat var55 = var53.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var56 = var53.withIgnoreEmptyLines();
    java.lang.String[] var57 = var53.getHeader();
    org.apache.commons.csv.CSVFormat var58 = var40.withHeader(var57);
    org.apache.commons.csv.CSVFormat var59 = var31.withHeaderComments((java.lang.Object[])var57);
    
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
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

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test170");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var2.getRecordSeparator();
    boolean var4 = var2.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var2.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test171");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    java.lang.String var6 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var7 = var1.withAllowMissingColumnNames();
    boolean var8 = var7.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var7.withDelimiter('#');
    java.lang.Character var11 = var7.getEscapeCharacter();
    java.lang.String var12 = var7.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var14 = var7.withAllowMissingColumnNames(true);
    java.lang.String var15 = var7.toString();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var15.equals("Delimiter=<#> SkipHeaderRecord:false"));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test172");


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
    java.util.Spliterator var16 = var13.spliterator();
    java.util.List var17 = var13.getRecords();
    java.util.Spliterator var18 = var13.spliterator();
    java.util.List var19 = var13.getRecords();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test173");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    boolean var4 = var2.isCommentMarkerSet();
    boolean var5 = var2.getIgnoreSurroundingSpaces();
    boolean var6 = var2.isNullStringSet();
    org.apache.commons.csv.CSVFormat var8 = var2.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var9 = var2.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var10.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var13 = var10.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var16 = var15.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var18 = var16.withRecordSeparator('a');
    char var19 = var18.getDelimiter();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var21.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var24 = var23.getQuoteMode();
    org.apache.commons.csv.CSVFormat var26 = var23.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var28 = var23.withSkipHeaderRecord(false);
    java.lang.String[] var30 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var31 = var28.withHeader(var30);
    java.lang.String var32 = var18.format((java.lang.Object[])var30);
    org.apache.commons.csv.CSVFormat var33 = var13.withHeaderComments((java.lang.Object[])var30);
    org.apache.commons.csv.QuoteMode var34 = var13.getQuoteMode();
    org.apache.commons.csv.CSVFormat var35 = var13.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var36 = var13.withSkipHeaderRecord();
    java.lang.Character var37 = var13.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var38 = var13.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVParser var39 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> Escape=< > CommentStart=<a> SkipHeaderRecord:false", var38);
    org.apache.commons.csv.CSVFormat var41 = var38.withQuote((java.lang.Character)'a');
    
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
    assertTrue(var19 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Delimiter=<#> SkipHeaderRecord:falsea"+ "'", var32.equals("Delimiter=<#> SkipHeaderRecord:falsea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test174");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var2.withQuote((java.lang.Character)'4');
    boolean var7 = var6.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var6.withEscape('a');
    org.apache.commons.csv.CSVFormat var11 = var9.withCommentMarker(' ');
    java.lang.String var12 = var11.getNullString();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var14.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var19 = var17.withEscape(' ');
    org.apache.commons.csv.CSVFormat var21 = var17.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var22 = var17.getQuoteMode();
    org.apache.commons.csv.CSVFormat var23 = var17.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var25 = var23.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var27 = var23.withNullString("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var29 = var23.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var31 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var32 = var31.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var34 = var32.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var36 = var34.withEscape(' ');
    java.lang.String[] var38 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var39 = var34.withHeader(var38);
    org.apache.commons.csv.CSVFormat var41 = var39.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var43 = var39.withEscape(' ');
    org.apache.commons.csv.CSVFormat var45 = var43.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var47 = var43.withCommentMarker('4');
    boolean var48 = var43.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var50 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var51 = var50.getHeader();
    boolean var52 = var50.isCommentMarkerSet();
    boolean var53 = var50.getIgnoreSurroundingSpaces();
    boolean var54 = var50.isNullStringSet();
    org.apache.commons.csv.CSVFormat var56 = var50.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var57 = var50.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var58 = var57.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var59 = var58.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var61 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var62 = var61.getHeader();
    boolean var63 = var61.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var65 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var66 = var65.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var68 = var66.withRecordSeparator('a');
    java.lang.Object[] var69 = new java.lang.Object[] { var66};
    org.apache.commons.csv.CSVFormat var70 = var61.withHeaderComments(var69);
    java.lang.String[] var71 = var70.getHeaderComments();
    org.apache.commons.csv.CSVFormat var72 = var59.withHeader(var71);
    org.apache.commons.csv.CSVFormat var73 = var43.withHeader(var71);
    java.lang.String var74 = var23.format((java.lang.Object[])var71);
    org.apache.commons.csv.CSVFormat var75 = var11.withHeaderComments((java.lang.Object[])var71);
    boolean var76 = var75.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var78 = var75.withIgnoreSurroundingSpaces(false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
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
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "Delimiter=<#> SkipHeaderRecord:truea"+ "'", var74.equals("Delimiter=<#> SkipHeaderRecord:truea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test175");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreEmptyLines();
    java.lang.String var8 = var6.toString();
    java.lang.Object[] var9 = new java.lang.Object[] { var6};
    java.lang.String var10 = var1.format(var9);
    org.apache.commons.csv.CSVFormat var12 = var1.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var14 = var1.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var15 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var16 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var18 = var16.withDelimiter('#');
    boolean var19 = var18.getAllowMissingColumnNames();
    boolean var20 = var18.isNullStringSet();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test176");


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
    org.apache.commons.csv.CSVFormat var71 = var13.withEscape('#');
    java.lang.String[] var72 = var13.getHeader();
    org.apache.commons.csv.QuoteMode var73 = var13.getQuoteMode();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test177");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var1.withIgnoreHeaderCase(false);
    boolean var11 = var1.isQuoteCharacterSet();
    java.lang.String[] var12 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var15 = var14.getHeader();
    boolean var16 = var14.isCommentMarkerSet();
    boolean var17 = var14.getIgnoreSurroundingSpaces();
    boolean var18 = var14.isNullStringSet();
    org.apache.commons.csv.CSVFormat var20 = var14.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var21 = var14.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var24 = var23.getHeader();
    boolean var25 = var23.isCommentMarkerSet();
    boolean var26 = var23.getIgnoreSurroundingSpaces();
    boolean var27 = var23.isNullStringSet();
    org.apache.commons.csv.CSVFormat var29 = var23.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var30 = var23.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var31 = var30.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var32 = var31.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var35 = var34.getHeader();
    boolean var36 = var34.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var39 = var38.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var41 = var39.withRecordSeparator('a');
    java.lang.Object[] var42 = new java.lang.Object[] { var39};
    org.apache.commons.csv.CSVFormat var43 = var34.withHeaderComments(var42);
    java.lang.String[] var44 = var43.getHeaderComments();
    org.apache.commons.csv.CSVFormat var45 = var32.withHeader(var44);
    java.lang.String var46 = var14.format((java.lang.Object[])var44);
    org.apache.commons.csv.CSVFormat var47 = var1.withHeader(var44);
    org.apache.commons.csv.CSVFormat var49 = var47.withCommentMarker((java.lang.Character)' ');
    boolean var50 = var49.isQuoteCharacterSet();
    
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
    assertTrue(var11 == false);
    
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
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
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
    assertTrue(var36 == false);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var46.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test178");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var14 = var12.withEscape(' ');
    boolean var15 = var14.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var16 = var14.withIgnoreSurroundingSpaces();
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test179");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var7 = var4.withIgnoreEmptyLines();
    java.lang.Character var8 = var4.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var10 = var4.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var11 = var10.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var13 = var10.withQuote(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test180");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    boolean var7 = var6.isQuoteCharacterSet();
    char var8 = var6.getDelimiter();
    
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

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test181");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    org.apache.commons.csv.CSVFormat var5 = var2.withQuote(' ');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var2);
    java.util.List var7 = var6.getRecords();
    long var8 = var6.getCurrentLineNumber();
    var6.close();
    var6.close();
    java.util.Spliterator var11 = var6.spliterator();
    
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
    assertNotNull(var11);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test182");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("ALL#MINIMAL#NON_NUMERIC#NONEDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var8 = var1.withSkipHeaderRecord();
    boolean var9 = var8.isQuoteCharacterSet();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test183");


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
    org.apache.commons.csv.CSVFormat var19 = var11.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
    boolean var20 = var19.getIgnoreSurroundingSpaces();
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test184");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var3 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var4 = var1.withHeaderComments((java.lang.Object[])var3);
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreSurroundingSpaces();
    java.lang.String var8 = var7.toString();
    org.apache.commons.csv.CSVFormat var10 = var7.withIgnoreHeaderCase(false);
    java.lang.Character var11 = var10.getCommentMarker();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:false HeaderComments:[ALL, MINIMAL, NON_NUMERIC, NONE]"+ "'", var8.equals("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:false HeaderComments:[ALL, MINIMAL, NON_NUMERIC, NONE]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test185");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String[] var5 = var4.getHeaderComments();
    org.apache.commons.csv.CSVFormat var7 = var4.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var13 = var11.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var14 = var13.getQuoteMode();
    boolean var15 = var13.isCommentMarkerSet();
    boolean var16 = var13.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = var13.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var21 = var20.withSkipHeaderRecord();
    boolean var22 = var20.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var24 = var20.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.QuoteMode var25 = var24.getQuoteMode();
    boolean var26 = var24.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var29 = var28.withSkipHeaderRecord();
    boolean var30 = var28.isEscapeCharacterSet();
    java.lang.String[] var31 = var28.getHeaderComments();
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var34 = var33.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var36 = var34.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var39 = var38.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var41 = var39.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var43 = var41.withEscape(' ');
    java.lang.String[] var45 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var46 = var41.withHeader(var45);
    org.apache.commons.csv.CSVFormat var47 = var34.withHeader(var45);
    java.lang.String var48 = var28.format((java.lang.Object[])var45);
    java.lang.String var49 = var24.format((java.lang.Object[])var45);
    org.apache.commons.csv.CSVFormat var50 = var18.withHeaderComments((java.lang.Object[])var45);
    java.lang.String var51 = var7.format((java.lang.Object[])var45);
    boolean var52 = var7.getSkipHeaderRecord();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var48.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var49.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true#"+ "'", var51.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test186");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape((java.lang.Character)' ');
    java.lang.Character var8 = var5.getQuoteCharacter();
    
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
    assertNull(var8);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test187");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var8.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var14 = var10.withCommentMarker(' ');
    org.apache.commons.csv.CSVFormat var15 = var14.withAllowMissingColumnNames();
    boolean var16 = var15.isQuoteCharacterSet();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test188");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.String var10 = var4.toString();
    boolean var11 = var4.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var13 = var4.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var15 = var13.withAllowMissingColumnNames(false);
    java.lang.Character var16 = var13.getCommentMarker();
    org.apache.commons.csv.CSVFormat var18 = var13.withRecordSeparator('a');
    boolean var19 = var18.getAllowMissingColumnNames();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test189");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var5 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var6 = var5.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withRecordSeparator('a');
    java.lang.Object[] var9 = new java.lang.Object[] { var6};
    org.apache.commons.csv.CSVFormat var10 = var1.withHeaderComments(var9);
    org.apache.commons.csv.CSVFormat var12 = var1.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var14 = var1.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:truea");
    org.apache.commons.csv.CSVFormat var16 = var1.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var19 = var18.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var23 = var21.withQuote((java.lang.Character)'4');
    boolean var24 = var23.getSkipHeaderRecord();
    java.lang.Character var25 = var23.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var27 = var23.withDelimiter('a');
    boolean var28 = var27.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var31 = var30.getHeader();
    boolean var32 = var30.isCommentMarkerSet();
    boolean var33 = var30.getIgnoreSurroundingSpaces();
    boolean var34 = var30.isNullStringSet();
    org.apache.commons.csv.CSVFormat var36 = var30.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var37 = var30.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var38 = var37.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var40 = var38.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var42 = var38.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var44 = var42.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:falsea");
    org.apache.commons.csv.CSVFormat var46 = var42.withNullString("ALL#MINIMAL#NON_NUMERIC#NONEDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var49 = var48.getHeader();
    boolean var50 = var48.isCommentMarkerSet();
    boolean var51 = var48.getIgnoreSurroundingSpaces();
    boolean var52 = var48.isNullStringSet();
    org.apache.commons.csv.CSVFormat var54 = var48.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var55 = var48.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var57 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var58 = var57.getHeader();
    boolean var59 = var57.isCommentMarkerSet();
    boolean var60 = var57.getIgnoreSurroundingSpaces();
    boolean var61 = var57.isNullStringSet();
    org.apache.commons.csv.CSVFormat var63 = var57.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var64 = var57.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var65 = var64.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var66 = var65.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var68 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var69 = var68.getHeader();
    boolean var70 = var68.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var72 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var73 = var72.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var75 = var73.withRecordSeparator('a');
    java.lang.Object[] var76 = new java.lang.Object[] { var73};
    org.apache.commons.csv.CSVFormat var77 = var68.withHeaderComments(var76);
    java.lang.String[] var78 = var77.getHeaderComments();
    org.apache.commons.csv.CSVFormat var79 = var66.withHeader(var78);
    java.lang.String var80 = var48.format((java.lang.Object[])var78);
    org.apache.commons.csv.CSVFormat var81 = var42.withHeader(var78);
    boolean var82 = var27.equals((java.lang.Object)var78);
    java.lang.String var83 = var1.format((java.lang.Object[])var78);
    boolean var84 = var1.isCommentMarkerSet();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '4'+ "'", var25.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
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
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
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
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var80.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "Delimiter=<#> SkipHeaderRecord:true"+ "'", var83.equals("Delimiter=<#> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test190");


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
    org.apache.commons.csv.CSVFormat var36 = var32.withCommentMarker('4');
    
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
    assertNotNull(var36);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test191");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var4.withHeader(var8);
    java.lang.Character var10 = var4.getCommentMarker();
    org.apache.commons.csv.CSVFormat var11 = var4.withIgnoreSurroundingSpaces();
    boolean var12 = var11.isNullStringSet();
    org.apache.commons.csv.CSVFormat var13 = var11.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var14 = var13.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var16 = var13.withEscape((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var18 = var13.withNullString("ALL#MINIMAL#NON_NUMERIC#NONEDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var20 = var13.withCommentMarker((java.lang.Character)' ');
    java.lang.Character var21 = var13.getEscapeCharacter();
    org.apache.commons.csv.QuoteMode var22 = var13.getQuoteMode();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var25 = var24.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var27 = var25.withRecordSeparator('a');
    char var28 = var27.getDelimiter();
    java.lang.String[] var29 = var27.getHeaderComments();
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var33 = var32.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var35 = var33.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var37 = var35.withEscape(' ');
    boolean var38 = var35.getIgnoreSurroundingSpaces();
    java.lang.Character var39 = var35.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var40 = var35.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVParser var41 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var40);
    java.util.Map var42 = var41.getHeaderMap();
    java.util.List var43 = var41.getRecords();
    boolean var44 = var41.isClosed();
    boolean var45 = var27.equals((java.lang.Object)var41);
    org.apache.commons.csv.CSVFormat var47 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var48 = var47.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var50 = var48.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var52 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var53 = var52.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var55 = var53.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var57 = var55.withEscape(' ');
    java.lang.String[] var59 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var60 = var55.withHeader(var59);
    org.apache.commons.csv.CSVFormat var61 = var48.withHeader(var59);
    org.apache.commons.csv.CSVFormat var62 = var27.withHeaderComments((java.lang.Object[])var59);
    org.apache.commons.csv.CSVFormat var63 = var13.withHeader(var59);
    org.apache.commons.csv.CSVFormat var64 = var63.withIgnoreEmptyLines();
    
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
    assertTrue(var28 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
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
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test192");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var3 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var4 = var1.withHeaderComments((java.lang.Object[])var3);
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator("Default#Excel#MySQL#RFC4180#TDF");
    java.lang.Character var10 = var7.getEscapeCharacter();
    boolean var11 = var7.isNullStringSet();
    org.apache.commons.csv.CSVFormat var13 = var7.withCommentMarker('4');
    boolean var14 = var7.getIgnoreEmptyLines();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test193");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var4.withDelimiter(' ');
    boolean var10 = var8.equals((java.lang.Object)'4');
    char var11 = var8.getDelimiter();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var14 = var13.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var16 = var14.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var18 = var16.withEscape(' ');
    org.apache.commons.csv.CSVFormat var20 = var16.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var23 = var22.withSkipHeaderRecord();
    boolean var24 = var22.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var26 = var22.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var28 = var22.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var32 = var30.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var33 = var30.getHeaderComments();
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var36 = var35.withIgnoreEmptyLines();
    java.lang.String var37 = var35.toString();
    java.lang.Object[] var38 = new java.lang.Object[] { var35};
    java.lang.String var39 = var30.format(var38);
    org.apache.commons.csv.CSVFormat var40 = var28.withHeaderComments(var38);
    org.apache.commons.csv.CSVFormat var41 = var16.withHeaderComments(var38);
    org.apache.commons.csv.CSVFormat var42 = var8.withHeaderComments(var38);
    boolean var43 = var42.getIgnoreSurroundingSpaces();
    
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
    assertTrue(var11 == ' ');
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var37.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var39.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test194");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var5 = var2.getHeaderComments();
    org.apache.commons.csv.CSVFormat var7 = var2.withCommentMarker('4');
    char var8 = var7.getDelimiter();
    org.apache.commons.csv.CSVFormat var10 = var7.withDelimiter('#');
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse("Default#Excel#MySQL#RFC4180#TDFa", var10);
    java.util.Map var12 = var11.getHeaderMap();
    java.util.Iterator var13 = var11.iterator();
    var11.close();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test195");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var10 = var8.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var14 = var10.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var16 = var14.withCommentMarker('4');
    java.lang.Character var17 = var14.getEscapeCharacter();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test196");


    org.apache.commons.csv.CSVFormat var3 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var8 = var6.withEscape(' ');
    java.lang.String[] var10 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var11 = var6.withHeader(var10);
    org.apache.commons.csv.CSVFormat var13 = var6.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var15 = var13.withNullString("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVParser var16 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> CommentStart=< > SkipHeaderRecord:false", var13);
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var19 = var18.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var23 = var21.withQuote((java.lang.Character)'4');
    java.lang.Character var24 = var23.getQuoteCharacter();
    boolean var25 = var23.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var27 = var23.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var29 = var23.withRecordSeparator(' ');
    java.lang.Character var30 = var29.getCommentMarker();
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var33 = var32.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var35 = var33.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var37 = var35.withEscape(' ');
    java.lang.String[] var39 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var40 = var35.withHeader(var39);
    boolean var41 = var40.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var43 = var40.withSkipHeaderRecord(true);
    java.lang.String[] var44 = var43.getHeader();
    boolean var45 = var43.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var47 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var48 = var47.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var50 = var48.withRecordSeparator('a');
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
    org.apache.commons.csv.CSVFormat var67 = var50.withHeaderComments((java.lang.Object[])var64);
    org.apache.commons.csv.CSVFormat var68 = var43.withHeader(var64);
    org.apache.commons.csv.CSVFormat var69 = var29.withHeaderComments((java.lang.Object[])var64);
    org.apache.commons.csv.CSVFormat var70 = var13.withHeaderComments((java.lang.Object[])var64);
    org.apache.commons.csv.CSVParser var71 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SkipHeaderRecord:false", var13);
    java.lang.String[] var72 = var13.getHeaderComments();
    boolean var73 = var13.isQuoteCharacterSet();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '4'+ "'", var24.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
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
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test197");


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
    char var49 = var48.getDelimiter();
    org.apache.commons.csv.CSVFormat var51 = var48.withRecordSeparator(' ');
    org.apache.commons.csv.CSVFormat var53 = var48.withQuote((java.lang.Character)'4');
    boolean var54 = var53.isNullStringSet();
    java.lang.String var55 = var53.toString();
    
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
    assertTrue(var49 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Delimiter=<#> Escape=< > QuoteChar=<4> CommentStart=<a> SkipHeaderRecord:false"+ "'", var55.equals("Delimiter=<#> Escape=< > QuoteChar=<4> CommentStart=<a> SkipHeaderRecord:false"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test198");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var5.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var5.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:falsea", var11);
    java.util.Map var13 = var12.getHeaderMap();
    java.util.Spliterator var14 = var12.spliterator();
    java.util.Iterator var15 = var12.iterator();
    boolean var16 = var12.isClosed();
    java.util.Iterator var17 = var12.iterator();
    java.util.Map var18 = var12.getHeaderMap();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test199");


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
    org.apache.commons.csv.QuoteMode var39 = var37.getQuoteMode();
    org.apache.commons.csv.CSVFormat var41 = var37.withQuote('a');
    org.apache.commons.csv.CSVFormat var43 = var37.withEscape((java.lang.Character)' ');
    boolean var44 = var43.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var46 = var43.withIgnoreSurroundingSpaces(true);
    char var47 = var46.getDelimiter();
    
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
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == '#');

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test200");


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
    org.apache.commons.csv.CSVFormat var23 = var13.withRecordSeparator(' ');
    java.lang.String var24 = var13.toString();
    java.lang.Character var25 = var13.getQuoteCharacter();
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Delimiter=<#> Escape=< > RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"+ "'", var24.equals("Delimiter=<#> Escape=< > RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test201");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var3.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var8 = var3.withRecordSeparator("a");
    java.lang.Character var9 = var3.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var11 = var3.withEscape((java.lang.Character)' ');
    boolean var12 = var3.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var14 = var3.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var15 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> QuoteChar=<4> RecordSeparator=<#> SurroundingSpaces:ignored SkipHeaderRecord:true", var14);
    boolean var16 = var14.isNullStringSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
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

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test202");


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
    org.apache.commons.csv.CSVFormat var20 = var14.withNullString("Delimiter=<#> SkipHeaderRecord:false HeaderComments:[Delimiter=<#> SkipHeaderRecord:true]");
    org.apache.commons.csv.CSVFormat var22 = var20.withDelimiter(' ');
    org.apache.commons.csv.CSVFormat var23 = var20.withSkipHeaderRecord();
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test203");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    java.lang.String[] var9 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var10 = var5.withHeader(var9);
    org.apache.commons.csv.CSVFormat var12 = var10.withNullString("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true", var10);
    long var14 = var13.getCurrentLineNumber();
    boolean var15 = var13.isClosed();
    java.util.Spliterator var16 = var13.spliterator();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test204");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("hi!", var5);
    java.util.Map var10 = var9.getHeaderMap();
    var9.close();
    java.util.Spliterator var12 = var9.spliterator();
    java.util.Map var13 = var9.getHeaderMap();
    long var14 = var9.getCurrentLineNumber();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test205");


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
    java.lang.Character var54 = var53.getEscapeCharacter();
    java.lang.String var55 = var53.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var56 = var53.withSkipHeaderRecord();
    
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
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var55.equals("Delimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test206");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var2 = var1.getHeader();
    boolean var3 = var1.isCommentMarkerSet();
    boolean var4 = var1.getIgnoreSurroundingSpaces();
    boolean var5 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    boolean var9 = var8.isNullStringSet();
    org.apache.commons.csv.CSVFormat var11 = var8.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var13 = var11.withNullString("4");
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator("Delimiter=<#> Escape=< > RecordSeparator=<a> SkipHeaderRecord:true Header:[Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true]");
    boolean var16 = var13.isNullStringSet();
    org.apache.commons.csv.CSVFormat var18 = var13.withDelimiter('4');
    org.apache.commons.csv.QuoteMode var19 = var18.getQuoteMode();
    boolean var20 = var18.getIgnoreEmptyLines();
    boolean var21 = var18.isCommentMarkerSet();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test207");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    boolean var8 = var5.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var5.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var5.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> SkipHeaderRecord:falsea", var11);
    java.util.Map var13 = var12.getHeaderMap();
    java.util.List var14 = var12.getRecords();
    boolean var15 = var12.isClosed();
    long var16 = var12.getRecordNumber();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test208");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    java.lang.String var9 = var4.getNullString();
    org.apache.commons.csv.CSVFormat var11 = var4.withAllowMissingColumnNames(true);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test209");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape(' ');
    org.apache.commons.csv.CSVFormat var9 = var5.withQuote('4');
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreSurroundingSpaces(true);
    java.lang.String var12 = var11.toString();
    org.apache.commons.csv.CSVFormat var14 = var11.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var18 = var16.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var19 = var16.getHeaderComments();
    boolean var20 = var16.isCommentMarkerSet();
    java.lang.String var21 = var16.toString();
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var24 = var23.getHeader();
    boolean var25 = var23.isCommentMarkerSet();
    boolean var26 = var23.getIgnoreSurroundingSpaces();
    boolean var27 = var23.isNullStringSet();
    org.apache.commons.csv.CSVFormat var29 = var23.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var30 = var23.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var31 = var30.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var32 = var31.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var35 = var34.getHeader();
    boolean var36 = var34.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var39 = var38.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var41 = var39.withRecordSeparator('a');
    java.lang.Object[] var42 = new java.lang.Object[] { var39};
    org.apache.commons.csv.CSVFormat var43 = var34.withHeaderComments(var42);
    java.lang.String[] var44 = var43.getHeaderComments();
    org.apache.commons.csv.CSVFormat var45 = var32.withHeader(var44);
    org.apache.commons.csv.CSVFormat var46 = var16.withHeader(var44);
    org.apache.commons.csv.CSVFormat var47 = var11.withHeader(var44);
    org.apache.commons.csv.CSVFormat var49 = var11.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var50 = org.apache.commons.csv.CSVParser.parse("4Delimiter=<#> SkipHeaderRecord:false4#", var11);
    boolean var51 = var50.isClosed();
    java.util.Spliterator var52 = var50.spliterator();
    
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
    assertTrue("'" + var12 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var12.equals("Delimiter=<#> RecordSeparator=<a> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
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
    assertTrue("'" + var21 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var21.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
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
    assertTrue(var36 == false);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test210");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreEmptyLines();
    java.lang.String var3 = var2.toString();
    boolean var4 = var2.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var7 = var6.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var11 = var9.withEscape(' ');
    java.lang.String[] var13 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var14 = var9.withHeader(var13);
    java.lang.Character var15 = var14.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var16 = var14.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var19 = var18.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var23 = var21.withEscape(' ');
    java.lang.String[] var25 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var26 = var21.withHeader(var25);
    org.apache.commons.csv.CSVFormat var27 = var16.withHeader(var25);
    org.apache.commons.csv.CSVFormat var28 = var2.withHeader(var25);
    org.apache.commons.csv.CSVFormat var29 = var2.withAllowMissingColumnNames();
    char var30 = var29.getDelimiter();
    org.apache.commons.csv.CSVFormat var31 = var29.withIgnoreSurroundingSpaces();
    boolean var32 = var31.getIgnoreSurroundingSpaces();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test211");


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
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var22 = var21.getHeader();
    boolean var23 = var21.isCommentMarkerSet();
    boolean var24 = var21.getIgnoreSurroundingSpaces();
    boolean var25 = var21.isNullStringSet();
    org.apache.commons.csv.CSVFormat var27 = var21.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var28 = var21.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var29 = var28.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var30 = var29.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var32 = var30.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var34 = var32.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var36 = var34.withQuote('a');
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var39 = var38.getHeader();
    boolean var40 = var38.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var42 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var43 = var42.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode[] var44 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var45 = var42.withHeaderComments((java.lang.Object[])var44);
    org.apache.commons.csv.CSVFormat var46 = var38.withHeaderComments((java.lang.Object[])var44);
    java.lang.String var47 = var34.format((java.lang.Object[])var44);
    java.lang.String var48 = var17.format((java.lang.Object[])var44);
    org.apache.commons.csv.CSVFormat var50 = var17.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var52 = var50.withQuote('4');
    org.apache.commons.csv.CSVFormat var54 = var52.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var56 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var57 = var56.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var59 = var57.withRecordSeparator('a');
    char var60 = var59.getDelimiter();
    org.apache.commons.csv.CSVFormat var62 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var64 = var62.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var65 = var64.getQuoteMode();
    org.apache.commons.csv.CSVFormat var67 = var64.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var69 = var64.withSkipHeaderRecord(false);
    java.lang.String[] var71 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var72 = var69.withHeader(var71);
    java.lang.String var73 = var59.format((java.lang.Object[])var71);
    org.apache.commons.csv.QuoteMode[] var74 = org.apache.commons.csv.QuoteMode.values();
    org.apache.commons.csv.CSVFormat var75 = var59.withHeaderComments((java.lang.Object[])var74);
    java.lang.String var76 = var54.format((java.lang.Object[])var74);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
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
    assertTrue("'" + var47 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONE4"+ "'", var47.equals("ALL#MINIMAL#NON_NUMERIC#NONE4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var48.equals("ALL#MINIMAL#NON_NUMERIC#NONEDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
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
    assertTrue(var60 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "Delimiter=<#> SkipHeaderRecord:falsea"+ "'", var73.equals("Delimiter=<#> SkipHeaderRecord:falsea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "ALL#MINIMAL#NON_NUMERIC#NONEDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var76.equals("ALL#MINIMAL#NON_NUMERIC#NONEDelimiter=<#> SurroundingSpaces:ignored SkipHeaderRecord:true"));

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test212");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var4 = var3.getQuoteMode();
    boolean var5 = var3.isNullStringSet();
    char var6 = var3.getDelimiter();
    java.lang.String var7 = var3.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var9 = var3.withNullString("Delimiter=<#> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test213");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var4 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker('4');
    char var7 = var6.getDelimiter();
    boolean var8 = var6.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var11 = var10.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var13 = var11.withIgnoreEmptyLines(false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test214");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    boolean var10 = var4.isNullStringSet();
    org.apache.commons.csv.CSVFormat var12 = var4.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var14 = var4.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var16 = var14.withDelimiter('4');
    java.lang.String var17 = var16.getRecordSeparator();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "a"+ "'", var17.equals("a"));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test215");


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
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var33 = var32.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var35 = var33.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var37 = var35.withEscape(' ');
    org.apache.commons.csv.CSVFormat var39 = var35.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var40 = var35.getQuoteMode();
    org.apache.commons.csv.CSVFormat var41 = var35.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var43 = var41.withCommentMarker('4');
    boolean var44 = var41.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var46 = var41.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var48 = var46.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var50 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var51 = var50.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var53 = var51.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var55 = var53.withEscape(' ');
    org.apache.commons.csv.CSVFormat var57 = var53.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var59 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var60 = var59.withSkipHeaderRecord();
    boolean var61 = var59.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var63 = var59.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var65 = var59.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var67 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var69 = var67.withCommentMarker((java.lang.Character)'4');
    java.lang.String[] var70 = var67.getHeaderComments();
    org.apache.commons.csv.CSVFormat var72 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var73 = var72.withIgnoreEmptyLines();
    java.lang.String var74 = var72.toString();
    java.lang.Object[] var75 = new java.lang.Object[] { var72};
    java.lang.String var76 = var67.format(var75);
    org.apache.commons.csv.CSVFormat var77 = var65.withHeaderComments(var75);
    org.apache.commons.csv.CSVFormat var78 = var53.withHeaderComments(var75);
    java.lang.String var79 = var46.format(var75);
    org.apache.commons.csv.CSVFormat var80 = var30.withHeaderComments(var75);
    java.lang.String var81 = var80.getNullString();
    org.apache.commons.csv.CSVFormat var83 = var80.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var85 = var83.withRecordSeparator("Delimiter=<#> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true Header:[Delimiter=<#> SkipHeaderRecord:true]");
    
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
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var74.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var76.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "Delimiter=<#> SkipHeaderRecord:falsea"+ "'", var79.equals("Delimiter=<#> SkipHeaderRecord:falsea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test216");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var3 = var2.getHeader();
    boolean var4 = var2.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = var2.withCommentMarker('a');
    boolean var7 = var6.getIgnoreEmptyLines();
    boolean var8 = var6.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> NullString=<Delimiter=<#> CommentStart=<4> EmptyLines:ignored SkipHeaderRecord:false> RecordSeparator=<a> SkipHeaderRecord:true", var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test217");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    java.lang.String var5 = var4.toString();
    boolean var6 = var4.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = var4.withEscape((java.lang.Character)'a');
    boolean var9 = var8.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var8.withSkipHeaderRecord(false);
    java.lang.String[] var12 = var11.getHeader();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat('#');
    java.lang.String[] var15 = var14.getHeader();
    boolean var16 = var14.isCommentMarkerSet();
    boolean var17 = var14.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var19 = var14.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var21 = var14.withNullString("Delimiter=<#> QuoteChar=<4> NullString=<> RecordSeparator=<a> SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var23 = var21.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var26 = var25.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var28 = var26.withRecordSeparator('a');
    char var29 = var28.getDelimiter();
    org.apache.commons.csv.CSVFormat var31 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var33 = var31.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var34 = var33.getQuoteMode();
    org.apache.commons.csv.CSVFormat var36 = var33.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var38 = var33.withSkipHeaderRecord(false);
    java.lang.String[] var40 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false"};
    org.apache.commons.csv.CSVFormat var41 = var38.withHeader(var40);
    java.lang.String var42 = var28.format((java.lang.Object[])var40);
    java.lang.String var43 = var21.format((java.lang.Object[])var40);
    org.apache.commons.csv.CSVFormat var44 = var11.withHeaderComments((java.lang.Object[])var40);
    org.apache.commons.csv.QuoteMode var45 = var11.getQuoteMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"+ "'", var5.equals("Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertTrue(var29 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Delimiter=<#> SkipHeaderRecord:falsea"+ "'", var42.equals("Delimiter=<#> SkipHeaderRecord:falsea"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false"+ "'", var43.equals("Delimiter=<#> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test218");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    java.lang.Character var8 = var7.getQuoteCharacter();
    boolean var9 = var7.getSkipHeaderRecord();
    boolean var11 = var7.equals((java.lang.Object)(byte)(-1));
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false", var7);
    boolean var13 = var12.isClosed();
    java.util.Map var14 = var12.getHeaderMap();
    long var15 = var12.getRecordNumber();
    java.util.List var16 = var12.getRecords();
    java.util.Spliterator var17 = var16.spliterator();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test219");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.QuoteMode var9 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('4');
    boolean var13 = var10.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var15 = var10.withAllowMissingColumnNames(true);
    boolean var16 = var10.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var18 = var10.withSkipHeaderRecord(false);
    boolean var19 = var10.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var21 = var10.withQuote(' ');
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest18.test220");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    boolean var3 = var1.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var5 = var1.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("");
    org.apache.commons.csv.CSVFormat var9 = var7.withCommentMarker('4');
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var12 = var11.withSkipHeaderRecord();
    boolean var13 = var11.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var15 = var11.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var16 = var15.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var18 = var15.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var20 = var15.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var24 = var22.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var25 = var24.getQuoteMode();
    org.apache.commons.csv.CSVFormat var27 = var24.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var29 = var24.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var31 = var29.withRecordSeparator("Delimiter=<#> Escape=< > CommentStart=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var34 = var33.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var36 = var34.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var38 = var36.withQuote((java.lang.Character)'4');
    java.lang.Character var39 = var38.getQuoteCharacter();
    boolean var40 = var38.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var42 = var38.withIgnoreSurroundingSpaces(true);
    boolean var43 = var42.getSkipHeaderRecord();
    java.lang.String[] var44 = var42.getHeaderComments();
    org.apache.commons.csv.CSVFormat var46 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var47 = var46.withSkipHeaderRecord();
    boolean var48 = var46.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var50 = var46.withCommentMarker((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var51 = var50.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var53 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var55 = var53.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.QuoteMode var56 = var55.getQuoteMode();
    java.lang.Character var57 = var55.getCommentMarker();
    java.lang.Object[] var58 = new java.lang.Object[] { var55};
    java.lang.String var59 = var51.format(var58);
    org.apache.commons.csv.CSVFormat var60 = var42.withHeaderComments(var58);
    org.apache.commons.csv.CSVFormat var62 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var63 = var62.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var65 = var63.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var67 = var65.withQuote((java.lang.Character)'4');
    java.lang.Character var68 = var67.getQuoteCharacter();
    boolean var69 = var67.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var71 = var67.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var73 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var74 = var73.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var76 = var74.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var78 = var76.withEscape(' ');
    java.lang.String[] var80 = new java.lang.String[] { "Delimiter=<#> RecordSeparator=<a> SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var81 = var76.withHeader(var80);
    boolean var82 = var81.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var84 = var81.withSkipHeaderRecord(true);
    java.lang.String[] var85 = var84.getHeader();
    org.apache.commons.csv.CSVFormat var86 = var67.withHeader(var85);
    org.apache.commons.csv.CSVFormat var87 = var42.withHeader(var85);
    org.apache.commons.csv.CSVFormat var88 = var29.withHeader(var85);
    org.apache.commons.csv.CSVFormat var89 = var15.withHeader(var85);
    org.apache.commons.csv.CSVFormat var90 = var7.withHeaderComments((java.lang.Object[])var85);
    org.apache.commons.csv.CSVFormat var92 = var90.withDelimiter('4');
    java.lang.String[] var93 = var92.getHeaderComments();
    boolean var94 = var92.getIgnoreEmptyLines();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
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
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + '4'+ "'", var57.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"+ "'", var59.equals("Delimiter=<#> CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + '4'+ "'", var68.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
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
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);

  }

}
