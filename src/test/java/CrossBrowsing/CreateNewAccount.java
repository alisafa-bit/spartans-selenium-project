package CrossBrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccount {
    /*
    In Retail app, click on sign in then click on Create new Account then
    fill up the form and sign up. Expectation is to Create newAccount.
    one account created make sure profile picture is displayed. (isDisplayed)
    and print result of isDisplayed method.
    Push to your repository
     */
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signIn = By.id("signinLink");
        WebElement signInBtn = driver.findElement(signIn);
        signInBtn.click();

        By createNewAccount = By.id("newAccountBtn");
        WebElement createNewAccountElm = driver.findElement(createNewAccount);
        createNewAccountElm.click();

        By name = By.id("nameInput");
        WebElement nameElm = driver.findElement(name);
        nameElm.sendKeys("ali");

        By email = By.id("emailInput");
        WebElement emailElm = driver.findElement(email);
        emailElm.sendKeys("ali@gmail.com");

        By password = By.id("passwordInput");
        WebElement passwordElm = driver.findElement(password);
        emailElm.sendKeys("123456");

        By confirmPassword = By.id("confirmPasswordInput");
        WebElement confirmPasswordElm = driver.findElement(confirmPassword);
        confirmPasswordElm.sendKeys("123456");

        By signupBtn = By.id("signupBtn");
        WebElement signupBtnElm = driver.findElement(signupBtn);
        signupBtnElm.click();
    }
}
