package Locator.Id;
import java.util.List;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEnabled {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("alisafa11@gmail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Alisafa@123");
        WebElement result = driver.findElement(By.id("loginBtn"));
        System.out.println("Status of Login button " + result.isEnabled());
        driver.findElement(By.id("loginBtn")).click();

        driver.navigate().to("https://www.goal.com/en");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().refresh();
        String title = driver.getTitle();


        System.out.println("This is the title " + title);
        driver.findElement(By.xpath("//*[text()='All']")).click();
        driver.findElement(By.xpath("//span[text()='Electronics']")).click();
        driver.findElement(By.xpath("//*[text()='Video Games']")).click();
        List<WebElement> products = driver.findElements(By.xpath("//*[@class='products__layout']"));
        System.out.println("Electronic items: " + products.size());
        for (WebElement n : products){
            if(n.getAttribute("alt").equals("Roblox Digital Gift Card ")){
                n.click();
                break;
            }
        }
    }
}
