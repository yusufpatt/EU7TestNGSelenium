package com.cybertek.tests.day4_basic_locators;

import com.cybertek.tests.day8_types_of_elements_2.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        //task
        //put some email and click sign up button

        //proper way
       //WebElement emailInput = driver.findElement(By.name("email"));
        //emailInput.sendKeys("mike@smith.com");

        //lazy way
        driver.findElement(By.name("email")).sendKeys("mike@smith.com");

        //WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        //signUpButton.click();

        //lazy way
        driver.findElement(By.name("wooden_spoon")).click();

    }
}
