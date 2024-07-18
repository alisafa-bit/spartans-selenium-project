package Intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowser {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https//google.com");
        chromeDriver.manage().window().maximize();
    }
}
