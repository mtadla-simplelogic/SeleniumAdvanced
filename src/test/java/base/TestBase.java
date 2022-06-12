package base;

import helpers.BrowserProvider;
import helpers.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = BrowserProvider.getDriver(Configuration.getBrowser());
        driver.get(Configuration.getAppUrl());
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void asd(){
    }
}
