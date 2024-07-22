package Locator.Id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Refresh {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("alisafa11@gmail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Alisafa@123");
        WebElement result = driver.findElement(By.id("loginBtn"));
        System.out.println("Status of Login button " + result.isEnabled() );
        driver.findElement(By.id("loginBtn")).click();

        driver.navigate().to("https://www.goal.com/en");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().refresh();
        String title = driver.getTitle();

        System.out.println("This is the title "+ title);


    }
}
