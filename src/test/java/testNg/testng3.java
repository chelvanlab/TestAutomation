package testNg;

import org.testng.annotations.*;

public class testng3 {

    @BeforeClass
    public void before(){
        System.out.println("Before");
    }

    @AfterClass
    public void after(){
        System.out.println("After");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("Before test");
    }

    @Test
    public void print(){
        System.out.println("Hi!!");
    }

    @Test
    public void print2(){
        System.out.println("How are you!");
    }

    @AfterMethod
    public void finish(){
        System.out.println("Finished!");
    }
}
