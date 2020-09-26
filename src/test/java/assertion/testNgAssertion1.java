package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;


public class testNgAssertion1 {

    @Test
    public void testAssert(){
        Assert.assertNotEquals(4,5);
    }

    @Test
    public void testAssert2(){
        boolean val = true;
        System.out.println("***1***");
        Assert.assertTrue(val);
        System.out.println("***2***");
        Assert.assertFalse(val);

    }
}
