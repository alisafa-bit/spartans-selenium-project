package student.intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/products");

        By searchInputLocator = By.id("searchInput");
        WebElement searchInputElement = new driver.findElement(searchBtnLocator);

        By searchInputLocator = driver.findElement(searchInputLocator);
        Alert searchBtnLocator;
        searchBtnLocator.sendKeys("TV");
        By searchBtnLocator = By.id("searchBtn");
        WebElement searchBtnElement = new driver.findElements(searchBtnLocator);

    }
}
