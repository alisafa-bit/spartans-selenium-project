package Intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToFacebook {
    public static void main(String[] args) {
        ChromeDriver enteringToFacebook = new ChromeDriver();

        enteringToFacebook.manage().window().maximize();

        // To open browser
        enteringToFacebook.get("https://www.facebook.com");
        //To close browser entirely.


        String title = enteringToFacebook.getTitle();
        System.out.println(title);
        enteringToFacebook.quit();

    }
}
