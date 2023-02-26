package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatesInSelinium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
//        driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com");
        driver.get("https://www.canva.com");
//        driver.navigate().refresh();
//        driver.navigate().back();
//        driver.navigate().forward();



    }
}
