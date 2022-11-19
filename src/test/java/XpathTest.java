import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XpathTest {
    @Test
    public void findElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        //driver.get("https://testeroprogramowania.github.io/selenium/index.html");
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //clickOnMe(id)
        By buttonId =By.xpath("//button[@id='clickOnMe']");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //fname(nazwie)
        By firstName=By.xpath("//input[@name='fname']");
        WebElement firstNameInput=driver.findElement(firstName);
        driver.findElement(By.name("fname"));

        //topSecret(nazwa klasy)
        By paraHidden=By.xpath("//p[@class='topSecret']");
        driver.findElement(paraHidden);

        //input(tag)
        By input=By.xpath("//input");
        WebElement inpu=driver.findElement(input);
        inpu.sendKeys("Pierwszy");
        List<WebElement> inputs=driver.findElements(input);
        System.out.println(inputs.size());

        //Visit W3Schools.com!(nazwa linku)
        By linkText=By.xpath("//a[text()='Visit W3Schools.com!']");
        driver.findElement(linkText);

        By partalLink=By.xpath("//a[contains(text(),'Visit')]");
        WebElement schoolPartial=driver.findElement(partalLink);

        By fullPath=By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);

        By shortPath=By.xpath("//ul");
        driver.findElement(shortPath);

        By allXpath=By.xpath("//*");
        driver.findElement(allXpath);

        By secondElement=By.xpath("//input[2]");
        driver.findElement(secondElement);

        By lastElement=By.xpath("(//input)[last()]");
        driver.findElement(lastElement);

        By elementWithAttribute=By.xpath("//*[@name]");
        driver.findElement(elementWithAttribute);

        By attrEq=By.xpath("//button[@id='clickOnMe']");
        driver.findElement(attrEq);

        By attrNotEq=By.xpath("//button[@id!='clickOnMe']");
        driver.findElement(attrNotEq);

        By attrCont=By.xpath("//*[contains(@name,'user')]");
        driver.findElement(attrCont);

        By startWith=By.xpath("//*[starts-with(@name,'user')]");
        driver.findElement(startWith);

        By endsWith=By.xpath("//*[substring(@name,string-length(@name)-string-length('name')+1)='name']");
        driver.findElement(endsWith);

        By child=By.xpath("//div/child::ul");
        By desc=By.xpath("//div/descendant::ul");
        By parent=By.xpath("//div/../..");
        By asc=By.xpath("//div/ancestor::*");
        By foll=By.xpath("//img/following::*");
        By follSib=By.xpath("//img/following-sibling::*");
        By prec =By.xpath("//img/preceding::*");
        By precSib=By.xpath("//img/preceding-sibling::*");

        driver.findElement(child);
        driver.findElement(desc);
        driver.findElement(parent);
        driver.findElement(asc);
        driver.findElement(foll);
        driver.findElement(follSib);
        driver.findElement(prec);
        driver.findElement(precSib);

        By divsAndLinks=By.xpath("//a | //div");
        By andOperation=By.xpath("//input[@name='fname' and @id='fname']");
        By orOperation=By.xpath("//input[@name='fname' or @id='fnam']");

        driver.findElement(divsAndLinks);
        driver.findElement(andOperation);
        driver.findElement(orOperation);









        driver.close();
    }
 }

