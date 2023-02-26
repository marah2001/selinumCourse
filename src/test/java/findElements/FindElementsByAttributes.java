package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByAttributes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String webUrl = "https://www.wix.com/html5en/hiker-blog?utm_source=google&utm_medium=cpc&utm_campaign=18584426290^141902571989&experiment_id=blogs^e^627783515034^&gclid=Cj0KCQiA3eGfBhCeARIsACpJNU8j-0AY0Q8YYaS-9z28KCdb0vFD_z3Y6xRjldbXk8o6Ki2hf-gv1kwaAmWPEALw_wcB";
        driver.get(webUrl);
//        driver.findElement(By.xpath("//svg[@id=\"comp-jx338cqw\"]")).click();

//        String buttonText = driver.findElement(By.xpath("//*[@id='comp-iqm2knvh']/a/span")).getText();
//        System.out.println(buttonText);

        //tag[@attribute=''] >> xpath
  String text =   driver.findElement(By.cssSelector("#comp-l6df5q0s")).getText();
        System.out.println(text);
//        css selector:
//        #id
//        .class
    }

}
