package pl.testeroprogramowania;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class SimpleTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult){
        System.out.println("I am starting test");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("I am taking screenshot");



        WebDriver driver=DriverFactory.getDriver();
        int randomNumber=(int)(Math.random()*1000);
        TakesScreenshot screenshot= (TakesScreenshot) driver;
        File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
        String fileName="failedTest"+randomNumber+".png";
        try {
            FileUtils.copyFile(srcFile,new File("src/test/resources/" + fileName ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }

}
