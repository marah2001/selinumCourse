package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GooglePageTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hi guys");
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[1]/div/span")).click();

        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);
        for (String window : allWindows){
            if(!window.equalsIgnoreCase(parent)){
                System.out.println(driver.getTitle());
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
            }

        }
    }

}
