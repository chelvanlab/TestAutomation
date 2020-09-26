package simple_cal_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.calculator;
import org.testng.annotations.BeforeMethod;

public class CalLogicTest {

    calculator calc;

    @BeforeMethod
    public void setup() {
        calc = new calculator();
    }

    @Test
    public void testSum() {
        Assert.assertEquals(calc.sum(4, 10), 14);
    }

    @Test(dataProvider = "getNum")
    public void testSum1(int input1, int input2,int expectedres) {
        Assert.assertEquals(calc.sum(input1, input2), expectedres);
    }

    @DataProvider
    public Object[][] getNum() {
        return new Object[][]{
                {100, 40, 140},
                {23, 20, 33},
                {20, 10, 30},
                {10, 10, 20}
        };
    }
}
