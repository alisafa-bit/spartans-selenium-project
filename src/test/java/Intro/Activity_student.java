package Intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_student {
    public static void main(String[] args) {
        ChromeDriver insuranceTitle = new ChromeDriver();
        String title = insuranceTitle.getTitle();
        System.out.println(title);
        insuranceTitle.manage().window().maximize();
        System.out.println("https://dev.insurance.tekschool-students.com/");
        //insuranceTitle.quit();
    }
}
