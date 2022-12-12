package pl.testeroprogramowania;

import org.testng.annotations.Test;

public class ThirdTest {

    @Test(priority = 2)
    public void firstTest(){
        System.out.println("I am firstTest");
    }
    @Test(priority = 0)
    public void secondTest(){
        System.out.println("I am secondTest");

    }
    @Test(priority = 1)
    public void thirdTest(){
        System.out.println("I am thirdTest");
    }

}
