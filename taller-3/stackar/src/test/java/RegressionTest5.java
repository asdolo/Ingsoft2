import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3001");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(10);
        org.junit.Assert.assertTrue(stackAr1.equals(stackAr1));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3002");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(10);
        stackAr1.push(2);
        stackAr1.push(6);
        stackAr1.push("Hello");
        org.junit.Assert.assertEquals(843516944, stackAr1.hashCode());
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3003");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(10);
        org.junit.Assert.assertTrue(stackAr1.repOK());
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3004");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(5);

        stackAr1.push("Hello");
        stackAr1.push(4);
        stackAr1.push(12);
        stackAr1.push("something");
        stackAr1.push('a');
        org.junit.Assert.assertTrue(stackAr1.repOK());
    }
}

