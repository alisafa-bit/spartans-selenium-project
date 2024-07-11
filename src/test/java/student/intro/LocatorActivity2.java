package student.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorActivity2 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("https://retail.tekschool-students.com/auth/login");
        By searchInputLocator = By.id("searchInput");
        WebElement searchInputElement = driver.findElement(searchInputLocator);
    }
}
