package openingBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserUsingDriver {
    public static void main(String[] args) {
//        to open any browser that we need
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }
}
