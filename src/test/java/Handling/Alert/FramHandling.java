package Handling.Alert;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FramHandling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

                driver.findElement(By.linkText("Login")).click();
                driver.findElement(By.name("username")).sendKeys("supervisor");
                driver.findElement(By.name("password")).sendKeys("tek_supervisor");
                driver.findElement(By.xpath("//button[text()='Sign In']")).click();

                driver.findElement(By.linkText("Plans")).click();

                WebElement priceElement = driver.findElement(By.xpath("//table//tr[1]//td[contains(@class, 'price')]"));
                String priceValue = priceElement.getText();
                System.out.println("Price Value: " + priceValue);

                driver.quit();
    }
}