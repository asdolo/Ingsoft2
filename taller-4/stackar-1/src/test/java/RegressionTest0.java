import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass1 = stackAr0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        java.lang.Class<?> wildcardClass9 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) (short) 1, (int) (short) -1, 4);
        java.lang.Class<?> wildcardClass13 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 100, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 10, (int) (short) 1, 0);
        int int12 = stackAr0.triangle((int) (byte) -1, 4, 10);
        java.lang.Class<?> wildcardClass13 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) '4', 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle(0, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 10, (int) (short) 1, 0);
        int int12 = stackAr0.triangle((int) (short) -1, (int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass13 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) ' ', (int) (byte) 0, 0);
        int int16 = stackAr0.triangle(0, 0, 0);
        java.lang.Class<?> wildcardClass17 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) (byte) 0, (int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) (byte) 0, (int) 'a', (int) (byte) 0);
        int int16 = stackAr0.triangle(4, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) ' ', (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass13 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) 'a', (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 10, (int) (short) 1, 0);
        int int12 = stackAr0.triangle((int) (short) -1, (int) (short) 1, (int) ' ');
        int int16 = stackAr0.triangle(0, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) (byte) 1, 1, 10);
        java.lang.Class<?> wildcardClass13 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 10, (int) (short) 1, 0);
        int int12 = stackAr0.triangle((int) (byte) -1, 4, 10);
        int int16 = stackAr0.triangle((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        int int20 = stackAr0.triangle((int) (byte) 1, 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) (short) 1, (int) (short) -1, 4);
        int int16 = stackAr0.triangle((int) (byte) -1, (int) (short) -1, 4);
        java.lang.Class<?> wildcardClass17 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 10, (int) (short) 1, 0);
        int int12 = stackAr0.triangle((int) (byte) -1, 4, 10);
        int int16 = stackAr0.triangle((int) (byte) 100, 1, 1);
        java.lang.Class<?> wildcardClass17 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 10, (int) (short) 1, 0);
        int int12 = stackAr0.triangle((int) (byte) -1, 4, 10);
        int int16 = stackAr0.triangle((int) (short) 100, (int) (short) 0, (int) '4');
        int int20 = stackAr0.triangle(2, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 10, (int) (short) 1, 0);
        int int12 = stackAr0.triangle((int) (byte) -1, 4, 10);
        int int16 = stackAr0.triangle((int) (byte) 100, 1, 1);
        int int20 = stackAr0.triangle((int) (byte) 100, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) ' ', (int) (byte) 0, 0);
        int int16 = stackAr0.triangle(0, 0, 0);
        int int20 = stackAr0.triangle(10, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 10, (int) (short) 1, 0);
        int int12 = stackAr0.triangle((int) (short) -1, (int) (short) 1, (int) ' ');
        int int16 = stackAr0.triangle((int) (byte) 1, 4, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 10, (int) (short) 1, 0);
        int int12 = stackAr0.triangle(4, (int) (short) 100, (int) (short) 100);
        int int16 = stackAr0.triangle((int) '4', 4, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (byte) 0, (int) (short) 10, 1);
        int int12 = stackAr0.triangle((int) ' ', (int) (byte) 0, 0);
        int int16 = stackAr0.triangle((int) (short) 1, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass17 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int4 = stackAr0.triangle((int) (short) -1, (int) 'a', (int) (short) 1);
        int int8 = stackAr0.triangle((int) (short) 10, (int) (short) 1, 0);
        int int12 = stackAr0.triangle((int) (byte) -1, 4, 10);
        int int16 = stackAr0.triangle((int) (short) 100, (int) (short) 0, (int) '4');
        int int20 = stackAr0.triangle((int) (byte) 100, (int) '4', (int) (byte) 100);
        int int24 = stackAr0.triangle((int) 'a', 4, 3);
        int int28 = stackAr0.triangle(100, 4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }
}

