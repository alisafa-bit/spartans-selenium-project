package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChangingQuantity {
    /*
    In Retail app under computer section choose accessories and then choose
    keyboard and change quantity to 5.
    use implicit wait
    use Explicit wait for all elements.
    push to your repository
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//img[@alt='Accessories']")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By
                .xpath("//div[@class='products']/div[2]/img"))).click();
        WebElement quantity = (WebElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.className("product__select")));
        Select selectQuantity = new Select(quantity);
        selectQuantity.selectByVisibleText("4");

    }
}
