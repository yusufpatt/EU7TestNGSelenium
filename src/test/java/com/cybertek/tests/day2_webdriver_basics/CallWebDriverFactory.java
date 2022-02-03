package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.tests.day8_types_of_elements_2.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) {


        String browserType = null;
        WebDriver driver = WebDriverFactory.getDriver(browserType ="chrome");

       driver.get("https://www.google.com/");

       String title = driver.getTitle();

        System.out.println("title = " + title);
    }
}
