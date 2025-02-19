package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class DropDownSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.id("languageSelect"));
        Select programmingLanguage = new Select(element);
       // programmingLanguage.selectByVisibleText("Italian");
        //programmingLanguage.selectByIndex(4);
        List<WebElement> option = programmingLanguage.getOptions();
        int size = option.size();
        programmingLanguage.selectByIndex(size - 1);
    }
}
