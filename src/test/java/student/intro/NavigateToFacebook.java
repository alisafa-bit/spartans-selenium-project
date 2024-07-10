package student.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToFacebook {
    public static void main(String[] args) {
        ChromeDriver enteringToFacebook = new ChromeDriver();
        enteringToFacebook.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");

    }
}
