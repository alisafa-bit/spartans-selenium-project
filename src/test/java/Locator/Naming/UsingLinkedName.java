package Locator.Naming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingLinkedName {
    public static void main(String[] args) throws InterruptedException {

                WebDriver driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.get("https://retail.tekschool-students.com/");

                driver.findElement(By.linkText("Sign in")).click();
                driver.findElement(By.name("email")).sendKeys("ali@gmail.com");
                driver.findElement(By.id("password")).sendKeys("Wrongpassword");
                driver.findElement(By.id("loginBtn")).click();
                Thread.sleep(1000);
                String errorText = driver.findElement(By.className("error")).getText();
                System.out.println(errorText);

            }

        }
