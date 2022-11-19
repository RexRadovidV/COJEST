import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.security.Key;

public class BasicTest {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        Actions actions=new Actions(driver);
        WebElement heading=driver.findElement(By.tagName("h1"));
        actions.moveToElement(heading).perform();

        driver.findElement(By.id("clickOnMe")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.name("fname")).sendKeys("Wojciech");

        WebElement linkFinding=driver.findElement(By.linkText("Visit W3Schools.com!"));
        linkFinding.click();

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        driver.findElement(By.linkText("IamWeirdLink")).click();
        driver.findElement(By.cssSelector("div[class='QS5gu sy4vM']")).click();
        WebElement napis=driver.findElement(By.name("q"));
        napis.sendKeys("Selenium");
        napis.sendKeys(Keys.ENTER);

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement tabelka=driver.findElement(By.cssSelector("th[class='tableHeader']"));
        System.out.println(tabelka.getText());
        WebElement tabelka2=driver.findElement(By.cssSelector("td"));
        System.out.println(tabelka2.getText());

        WebElement select=driver.findElement(By.cssSelector("select"));
        Select cars=new Select(select);
        cars.selectByValue("volvo");

        driver.findElement(By.cssSelector("input[type='checkbox']")).click();

        driver.findElement(By.cssSelector("input[value='male']")).click();

        WebElement nazwa=driver.findElement(By.name("username"));
        nazwa.clear();
        nazwa.sendKeys("Mr.Jam33");

        WebElement haslo=driver.findElement(By.name("password"));
        haslo.clear();
        haslo.sendKeys("123");

        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        WebElement dziecko =driver.findElement(By.cssSelector("li:first-child"));
        System.out.println(dziecko);

        driver.quit();
    }
}
