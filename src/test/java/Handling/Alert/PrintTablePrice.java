package Handling.Alert;
import java.util.List;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PrintTablePrice {
    /*
    on Insurance app "https://dev.insurance.tekschool-students.com/", login with
    supervisor / tek_supervisor credentials, and go to plans section
    then print all the price values from table.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("username")).sendKeys("supervisor");
        driver.findElement(By.id("password")).sendKeys("tek_supervisor");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Plans")).click();
        List<WebElement> pricesElement = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));

        for(WebElement price:pricesElement){
            System.out.println(price.getText());
        }
        Thread.sleep(4000);
        driver.quit();
    }
}
