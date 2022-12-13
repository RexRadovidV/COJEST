package pl.testeroprogramowania;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FourthTest {

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

    @Test(dataProvider = "data")
    public void dpTest(String val){
        System.out.println(val);
    }

    @DataProvider(name="data")
    public Object[][]dataProvider(){
        return new Object[][]{{"I am first test"},{"I am second test"},{"I am third test"}};
    }



}
