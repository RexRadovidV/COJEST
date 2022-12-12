package pl.testeroprogramowania;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class SimpleTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult){
        System.out.println("I am starting test");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("I am taking screenshot");
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }

}
