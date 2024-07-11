package student.intro.CrossBrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorActivity3 {
    public static void main(String[] args) throws InterruptedException {
    /*
    In Retail App click on Sign in then enter email and password
    then Click on Login
    Push to your gitHub repository.
     */
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        By singInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(singInLocator);
        signInElement.click();

        By emailLocator = By.id("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("ali@gmail.com");

        By passwordLocator = By.id("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("password123");

        By loginBtnLocator = By.id("loginBtn");
        WebElement loginBtnElement = driver.findElement(loginBtnLocator);
        loginBtnElement.click();

    }
}
