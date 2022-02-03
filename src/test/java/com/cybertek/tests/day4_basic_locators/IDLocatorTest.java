package com.cybertek.tests.day4_basic_locators;

import com.cybertek.tests.day8_types_of_elements_2.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {

    public static void main(String[] args) {

            WebDriver driver = WebDriverFactory.getDriver("chrome");

            driver.get("http://practice.cybertekschool.com/multiple_buttons");

            //don't click button
            WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));

            dontClickButton.click();

            driver.quit();

    }
}
