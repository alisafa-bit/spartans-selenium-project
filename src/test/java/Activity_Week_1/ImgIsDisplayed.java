package Activity_Week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgIsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("email")).sendKeys("mnm87@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Password_87");
        driver.findElement(By.id("loginBtn")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("accountLink")).click();
        Thread.sleep(2000);

        WebElement profileElement = driver.findElement(By.id("profileImage"));
        Boolean isProfileImageDisplayed = profileElement.isDisplayed();

        if(isProfileImageDisplayed){
            System.out.println("Test Passed");
        }else
            System.out.println("Test Failed");

        driver.quit();
    }
}
