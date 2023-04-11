package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "FireFox";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else {
            System.out.println("Wrong Browser name");
        }


        //Open the Url into the browser
        driver.get(baseUrl);

        //We give Implicit wait to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        //Maximize the browser
        driver.manage().window().maximize();

        //Get the title of the page
        System.out.println(driver.getTitle());

        //Get the base url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page Source : " + driver.getPageSource());

        //Find the Email field element and type the email address to email field element
        driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");

        //Find the password field element and type the password to the password element field
        driver.findElement(By.id("Password")).sendKeys("Xyz123");

        //Close the browser
        driver.close();
    }

}
