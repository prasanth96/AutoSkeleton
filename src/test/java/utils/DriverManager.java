package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    public static WebDriver driver;

    public ChromeOptions options;

    public DriverManager(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver_v118.exe");
        driver = new ChromeDriver();
    }

    public void close(){
        driver.close();
        driver.quit();
    }

}
