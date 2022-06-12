package helpers;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;

public class RandomHelper {
    public static String getRandomEmail() {
        return getRandomText(10) + "@gmail.com";
    }

    public static String getRandomText() {
        return getRandomText(10);
    }

    public static String getScreenshotPath() {
        return "src/main/resources/" + getRandomText()  + ".png";
    }


    public static String getRandomText(int count) {
        return RandomStringUtils.randomAlphabetic(count);
    }
}
