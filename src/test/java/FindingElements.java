import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindingElements {
    @Test
    public void findElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        //driver.get("https://testeroprogramowania.github.io/selenium/index.html");
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //clickOnMe(id)
        By buttonId =By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //fname(nazwie)
        By firstName=By.name("fname");
        WebElement firstNameInput=driver.findElement(firstName);
        driver.findElement(By.name("fname"));

        //topSecret(nazwa klasy)
        By paraHidden=By.className("topSecret");
        driver.findElement(paraHidden);
        //input(tag)
        By input=By.tagName("input");
        WebElement inpu=driver.findElement(input);
        inpu.sendKeys("Pierwszy");
        List<WebElement>inputs=driver.findElements(input);
        System.out.println(inputs.size());

        //Visit W3Schools.com!(nazwa linku)
        By linkText=By.linkText("Visit W3Schools.com!");
        driver.findElement(linkText);

        By partalLink=By.partialLinkText("Visit");
        WebElement schoolPartial=driver.findElement(partalLink);
    }
}
