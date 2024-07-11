package student.intro.CrossBrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorActivity2 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/auth/login");
        By searchProductName = By.id("productName");
        WebElement searchInputElement = driver.findElement(searchProductName);

        searchInputElement.sendKeys("plug");
        By searchButton = By.id("searchButton");
        WebElement searchButtonElement = driver.findElement(searchButton);
        searchButtonElement.click();
    }
}
