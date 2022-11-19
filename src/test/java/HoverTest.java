import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class HoverTest {
    @Test
    public void actionTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        int randomNumber=(int)Math.random()*1000;

        driver.get("https://testeroprogramowania.github.io/selenium");
        driver.findElement(By.linkText("Podstawowa strona testowa")).click();

        Actions actions=new Actions(driver);
        WebElement heading=driver.findElement(By.tagName("h1"));

        actions.moveToElement(heading).perform();
    }
}
