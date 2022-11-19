import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeTest {
    @Test
    public void Test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium");
        driver.findElement(By.linkText("Strona z iframe")).click();

        WebElement iframe=driver.findElement(By.cssSelector("[src='basics.html']"));

        driver.switchTo().frame(iframe);
        driver.findElement(By.name("fname")).sendKeys("Wojtek");
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h1")));


    }
}
