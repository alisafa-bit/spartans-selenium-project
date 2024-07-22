package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingAccount {
    public static void main(String[] args) {

        //Creating account in Retail TekSchool
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("newAccountBtn")).click();
        driver.findElement(By.id("nameInput")).sendKeys("alisafa");
        driver.findElement(By.id("emailInput")).sendKeys("alisafa11@gmail.com");
        driver.findElement(By.id("passwordInput")).sendKeys("Alisafa@123");
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("Alisafa@123");
        driver.findElement(By.id("signupBtn")).click();

    }
}
