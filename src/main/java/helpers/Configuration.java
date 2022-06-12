package helpers;

import models.Browser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    // https://www.baeldung.com/java-properties
    public static String getAppUrl() {
        return getProperty("appUrl");
    }

    public static Boolean isHeadless() {
        return Boolean.valueOf(getProperty("headless"));
    }

    public static Browser getBrowser() {
        return Browser.valueOf(getProperty("browser").toUpperCase());
    }

    private static String getProperty(String propertyName) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(propertyName);
    }
}
