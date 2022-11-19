import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.security.Key;
import java.security.KeyException;
import java.util.Set;

public class NewWindowTest {
    @Test
    public void Test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium");

        String currentWindow=driver.getWindowHandle();

        WebElement basicPageLink=driver.findElement(By.linkText("Podstawowa strona testowa"));
        System.out.println(basicPageLink.getText());
        basicPageLink.click();

        driver.findElement(By.id("newPage")).click();

        Set<String> windowNames=driver.getWindowHandles();
        for(String window:windowNames){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }

        driver.findElement(By.cssSelector("div[class='QS5gu sy4vM']")).click();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.switchTo().window(currentWindow);
        driver.findElement(By.name("fname")).sendKeys("Wojtek");






    }
}
