package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UcasLoginPageTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://my.ucas.edu.ps/login?backurl=/home");
        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtUsername']")).sendKeys("220190189");
        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPassword']")).sendKeys("407854363");
//       global for all elements : implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkLogin']")).click();
//   explicit wait for a selected item
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ContentPlaceHolder1_lnkLogin']")));

        driver.switchTo().alert().accept();
    }
}
