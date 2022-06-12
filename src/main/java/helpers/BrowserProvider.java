package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import models.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserProvider {
    // https://bonigarcia.dev/webdrivermanager/
    public static WebDriver getDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                return getChromedriver();
            case FIREFOX:
                return getFirefoxDriver();
            case IE:
                return getIeDriver();
            case EDGE:
                return getEdgeDriver();
            default:
                throw new IllegalStateException("Unexpected value: " + browser);
        }
    }

    private static WebDriver getChromedriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        if(Configuration.isHeadless()){
            chromeOptions.addArguments("--headless");
        }

        return new ChromeDriver(chromeOptions);
    }

    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

    private static WebDriver getIeDriver() {
        WebDriverManager.iedriver().setup();

        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        return driver;
    }

    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
