package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class HandlingDropDownWithoutSelect {
    /*
    watch video after nine o'clock
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dynamic-select");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(2000);

        driver.findElement(By
                .xpath("//p[text()='From']/following-sibling::input"))
                .click();
        List<WebElement> fromOptions = driver.findElements(By
                .xpath("//p[text()='From']/following-sibling::ul/li"));
        //fromOptions.get(2).click();

        for(WebElement element: fromOptions){
            String text = element.getText();

            if (text.equals("Bamyan")){
                element.click();
                break;
            }
        }

    }
}
