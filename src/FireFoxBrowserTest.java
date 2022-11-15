import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {

    public static void main(String[] args) {
        String url = "https://courses.ultimateqa.com/users/sign_in";

        //Set firefox driver path
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");

        //Start firefox browser
        WebDriver driver = new FirefoxDriver();


        //Open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page Source is : " + driver.getPageSource());

        //Find and enter email in email field element
        WebElement emailFiled = driver.findElement(By.name("user[email]"));
        emailFiled.sendKeys("admin");

        //Find and enter password in password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("admin123");

        //Close browser
        driver.quit();




    }

}
