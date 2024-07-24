package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FillupFormFacebook {
    /*
    Navigate to facebook.com click on create new account and fill up the form
    Do not Click on sign up.
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create new account")))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")))
                .sendKeys("Alisafa");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")))
                .sendKeys("Purity");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__")))
                .sendKeys("mnm87@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_passwd__")))
                .sendKeys("FreaksBurg@12");

        WebElement monthElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
        Select monthSelect = new Select(monthElement);
        monthSelect.selectByIndex(3);

        WebElement dayElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
        Select daySelect = new Select(dayElement);
        daySelect.selectByIndex(10);

        WebElement yearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        Select yearSelect = new Select(yearElement);
        yearSelect.selectByVisibleText("1988");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='-1']")))
                .click();




        
    }
}
