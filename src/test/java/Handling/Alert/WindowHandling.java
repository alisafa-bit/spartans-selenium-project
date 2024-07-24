package Handling.Alert;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class WindowHandling {
    /*
    Get current window id. before new tab open
    then open new tab.
    get all tabs id.(Make sure to have only 2 tab)
    Loop through all tabs and swithc to new tab when equal to current tab.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- get current window id.
        String currentWindowId = driver.getWindowHandle();
        driver.findElement(By.linkText("Test Selenium")).click();
        Thread.sleep(2000);

        //2- find all the tabs ID
        Set<String> allTabs = driver.getWindowHandles();
        //3 - Switch to new tab
        for(String tab : allTabs){
            if(!tab.equals(currentWindowId)){
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(2000);

      driver.findElement(By.linkText("Inputs")).click();
      Thread.sleep(2000);

      driver.close();
      driver.switchTo().window(currentWindowId);
      driver.findElement(By.linkText("Sign in")).click();
      Thread.sleep(1000);
      driver.quit();




    }
}
