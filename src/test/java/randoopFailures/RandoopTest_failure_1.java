package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_1.test1");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var2 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape(' ');
    boolean var7 = var4.getIgnoreSurroundingSpaces();
    boolean var8 = var4.isEscapeCharacterSet();
    java.lang.String var9 = var4.getNullString();
    org.apache.commons.csv.CSVFormat var10 = var4.withIgnoreHeaderCase();
    
    // Checks the contract:  equals-hashcode on var4 and var10
    assertTrue("Contract failed: equals-hashcode on var4 and var10", var4.equals(var10) ? var4.hashCode() == var10.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var10 and var4
    assertTrue("Contract failed: equals-hashcode on var10 and var4", var10.equals(var4) ? var10.hashCode() == var4.hashCode() : true);

  }

}
