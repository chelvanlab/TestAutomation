package testNg;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgBasic {

    @BeforeMethod
    public void setup(){
        System.out.println("Before test");
    }

    @Test
    public void print(){
        System.out.println("Hi!!");
    }

    @AfterMethod
    public void finish(){
        System.out.println("Finished!");
    }
}
