package Intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class TekSchoolCreateAccount {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
