package Activity_Week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomNumber {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        Double random = Math.random();
        System.out.println(random);
        //Down Casting
        int number = (int) (random * 1000);
        System.out.println(number);

        // Print whole in one line
        // int num = (int) (Math.random() * 1000);
        // System.out.println(num);

        String emailPrefix = "ali_safa";
        int num = (int) (Math.random() * 1000);
        String email = emailPrefix + num + "@gmail.com";

        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.id("signinLink")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("newAccountBtn")).click();
        driver.findElement(By.id("nameInput")).sendKeys("arash");
        driver.findElement(By.id("emailInput")).sendKeys(email);
        driver.findElement(By.id("passwordInput")).sendKeys("Password_87");
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("Password_87");
        driver.findElement(By.id("signupBtn")).click();


    }
}
