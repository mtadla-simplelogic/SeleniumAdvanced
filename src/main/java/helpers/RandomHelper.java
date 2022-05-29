package helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomHelper {
    public static String getRandomEmail(){
        return getRandomText(10) + "@gmail.com";
    }

    public static String getRandomText(){
        return getRandomText(10);
    }

    public static String getRandomText(int count){
        return RandomStringUtils.randomAlphabetic(count);
    }
}
