package Locator.Id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(2000);

        //Locate the element
        //Find the element
        //Perform the action
        By searchInputLocator = By.id("searchInput");
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        searchInputElement.sendKeys("TV");

        By searchBtnLocator = By.id("searchBtn");
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        searchBtnElement.click();


    }
}
