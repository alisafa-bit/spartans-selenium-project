package Activity_Week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninToTek {
    /*
    In Retail App, click on sign in then click on Create new Account
    then fill up the form and sign up. Expectation is to Create Account.
    once account created make sure profile picture is displayed. (isDisplayed)
    And print result of isDisplayed method.
    Push to your repository.
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("newAccountBtn")).click();
        driver.findElement(By.id("nameInput")).sendKeys("mnm");
        driver.findElement(By.id("emailInput")).sendKeys("mnm87@gmail.com");
        driver.findElement(By.id("passwordInput")).sendKeys("Password_87");
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("Password_87");
        driver.findElement(By.id("signupBtn")).click();



    }
}
