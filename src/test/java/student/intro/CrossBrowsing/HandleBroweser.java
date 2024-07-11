package student.intro.CrossBrowsing;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBroweser {
    public static void main(String[] args) {
        //Open Browser Chrome Browser
        ChromeDriver chromeDriver = new ChromeDriver();
        //Navigate to a URL
        chromeDriver.get("https://google.com");
    }
}
