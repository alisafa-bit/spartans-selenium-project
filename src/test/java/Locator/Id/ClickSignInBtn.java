package Locator.Id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickSignInBtn {
    //In Retail App click on Sign in then enter email and password
    //then Click on Login
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(1000);
        //finding the element
        WebElement signInBtn = driver.findElement(By.id("signinLink"));
        signInBtn.click();
        //driver.findElement(By.id("signinLink")).click();
        // By searchInputLocator = By.id("signinLink");
        //WebElement searchInputElement = driver.findElement(searchInputLocator);
        //searchInputElement.click();
        Thread.sleep(1000);


        By idLocator = By.id("email");
        WebElement idElement = driver.findElement(idLocator);
        idElement.sendKeys("alimu@gmail.com");


        By passwordLocator = By.id("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("arashsafa");


        By loginBtnLocator = By.id("loginBtn");
        WebElement loginBtnElement = driver.findElement(loginBtnLocator);
        loginBtnElement.click();
    }
}
