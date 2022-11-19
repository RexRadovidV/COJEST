import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class UploadFileTest {
    @Test
    public void uploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        int randomNumber=(int)Math.random()*1000;

        driver.get("https://testeroprogramowania.github.io/selenium");
        driver.findElement(By.linkText("Załadowanie pliku")).click();


        driver.findElement(By.id("myFile")).sendKeys("D:\\CPU-Z\\cpuz.exe");

        TakesScreenshot screenshot= (TakesScreenshot) driver;
        File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
        String fileName="beforeUpload"+randomNumber+".png";
        FileUtils.copyFile(srcFile,new File("src/test/resources/"+fileName ));

        Actions actions=new Actions(driver);
        //actions.contextClick().perform();
        actions.contextClick(driver.findElement(By.id("myFile"))).perform();
    }
}
