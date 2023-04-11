package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the URL into Browser
        driver.get(baseUrl);

        //Maximize the browser
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        System.out.println(driver.getTitle());

        //Get the current Url.
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the Email Field Element and type the Email address to email field element
        driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");

        //Find the password field element and type the password to password field element
        driver.findElement(By.id("Password")).sendKeys("Xyz123");

        //close the Browser
        driver.quit();
    }

}
