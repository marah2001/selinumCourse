package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlSelinium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
//        get website url
//        String currentUrl = driver.getCurrentUrl();
//        System.out.println("the current url is : "+currentUrl);
//        get website title
//        String websiteTitle = driver.getTitle();
//        System.out.println("the page title is : "+websiteTitle);

//    get page source
//        String source = driver.getPageSource();
//        System.out.println("the page source is : 🎳");
//        System.out.println(source);
//        to close the driver
//        driver.quit(); //to close all the tabs, at the last of the test
//        driver.close();

    }

}
