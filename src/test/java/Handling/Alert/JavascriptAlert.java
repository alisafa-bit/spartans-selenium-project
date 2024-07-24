package Handling.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavascriptAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("alertBtn")).click();

        //switch to alert. after the alert popped up
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);

        Thread.sleep(1000);
        alert.accept();
        //when alert accepting user input.
        //alert.sendKeys("Entering some values to alert");
        //when you want to cancel the alert/dismiss
        //alert.dismiss();


    }
}
