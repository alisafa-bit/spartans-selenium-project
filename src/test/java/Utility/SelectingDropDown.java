package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectingDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.id("programmingLanguageSelect"));
        Select programmingLanguageSelect = new Select(element);
        //programmingLanguageSelect.selectByIndex(2);
        //programmingLanguageSelect.selectByValue("cPlusPlus");
        programmingLanguageSelect.selectByVisibleText("C#");
/*
        WebElement element1 = driver.findElement(By.id("Italian"));
        Select ItalianSelect = new Select(element1);
        ItalianSelect.selectByValue("Italian");
        */
        driver.findElement(By.xpath("//p[text()='Depart']/following-sibling::input"))
                .sendKeys("05/6/1987");

    }
}
