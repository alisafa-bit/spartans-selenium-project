package student.intro;

import org.openqa.selenium.edge.EdgeDriver;

public class CrossCrossing {
    public static void main(String[] args) {
        //Object of Edge.
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);


    }
}
