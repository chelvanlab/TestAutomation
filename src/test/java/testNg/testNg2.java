package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNg2 {
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
