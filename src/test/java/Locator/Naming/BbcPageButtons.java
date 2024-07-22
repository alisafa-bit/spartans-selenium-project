package Locator.Naming;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BbcPageButtons {
    /*
    Find how many button are in the https://www.bbc.com/ home pages
    and print the text of each buttons
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");
        By anchorsTag = By.tagName("a");

        // method findElements return list<WebElements> contains all the elements finds with By strategy
        List<WebElement> anchorsTagElm= driver.findElements(anchorsTag);
        System.out.println(anchorsTagElm.size());
        for (WebElement element: anchorsTagElm){
            System.out.println(element.getText());}
        
        // find how many images in the web page
        By imageTag = By.tagName("img");
        List<WebElement> imageTagElm = driver.findElements(imageTag);
        System.out.println(imageTagElm.size());

        By buttons = By.tagName("button");
        List<WebElement> buttonElm = driver.findElements(buttons);
        System.out.println(buttonElm.size());
        for(WebElement button: buttonElm){
            System.out.println("Button text- " + button.getText());
        }
    }
}
