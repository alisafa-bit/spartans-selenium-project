package CrossBrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigningUpToTek {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

        By getsignIn = By.id("signinLink");
        WebElement signin = webDriver.findElement(getsignIn);
        signin.click();

        By CreateAC = By.id("newAccountBtn");
        WebElement CreatAccount = webDriver.findElement(CreateAC);
        CreatAccount.click();

        By WriteName = By.id("nameInput");
        WebElement Writename = webDriver.findElement(WriteName);
        Writename.sendKeys("ALI");

        By Email = By.id("emailInput");
        WebElement emailIN = webDriver.findElement(Email);
        emailIN.sendKeys("ali@gmail.com");

        By password = By.id("passwordInput");
        WebElement Password = webDriver.findElement(password);
        Password.sendKeys("123456");

        By ConfirmPass = By.id("confirmPasswordInput");
        WebElement confirmPass = webDriver.findElement(ConfirmPass);
        confirmPass.sendKeys("123456");

        By signup = By.id("signupBtn");
        WebElement Signup = webDriver.findElement(signup);
        Signup.click();

        By profilePic = By.id("profileImage");
        WebElement ProfilePic = webDriver.findElement(profilePic);
        if(ProfilePic.isDisplayed()){
            System.out.println(" test Pass");
        }else {
            System.out.println(" test not Pass");
        }

    }

}
