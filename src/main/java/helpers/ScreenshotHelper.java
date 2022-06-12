package helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotHelper {
    // https://www.selenium.dev/documentation/webdriver/browser/windows/#takescreenshot

    public static void takeScreenshot(WebDriver driver){
        File screenshotDriver = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File file = new File(RandomHelper.getScreenshotPath());

        try {
            FileUtils.copyFile(screenshotDriver, file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Saving scr at: " + file.getAbsolutePath());
    }
}
