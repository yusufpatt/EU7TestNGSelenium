package com.cybertek.tests.day4_basic_locators;

import com.cybertek.tests.day8_types_of_elements_2.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        //sendkeys to fullname
        WebElement fullNameInput =driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith With Tag Name");

        //send keys to email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@smith.com");

        //lazy way to click button
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);

        //close browser
        driver.quit();
    }
}
