package student.intro.CrossBrowsing;

import org.openqa.selenium.WebDriver;
import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsingHandling {
    public static void main(String[] args) {
        WebDriver driver;

        var scnObj = new Scanner(System.in);
        System.out.print("Enter your browser please.");
        String browserType = scnObj.next();


        if(browserType.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {//equalsIgnoreCase
           driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("wrong browser.");
        }

    }
}
