package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {
    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
    }

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public void sendKeys(WebElement element, String text){
        System.out.println("Typing: " + text);
        element.sendKeys(text);
    }

    public void sendKeysWithClear(WebElement element, String text){
        System.out.println("Clearing input");
        element.clear();
        sendKeys(element, text);
    }

    public void click(WebElement element){
        System.out.println("Clicking: " + element.getText());
        element.click();
    }

    public void waitToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement getRandomElement(List<WebElement> elements) {
        return elements.get(new Random().nextInt(elements.size()));
    }
}
