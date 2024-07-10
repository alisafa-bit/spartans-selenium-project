package student.intro;

import org.openqa.selenium.WebDriver;
import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsingHandling {
    public static void main(String[] args) {

        var scnObj = new Scanner(System.in);
        System.out.print("Enter your browser please.");
        String browserType = scnObj.next();
        WebDriver driver;

        if(browserType.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {//equalsIgnoreCase
           driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("wrong browser.");
        }
        driver.get("https//google.com");
    }
}
