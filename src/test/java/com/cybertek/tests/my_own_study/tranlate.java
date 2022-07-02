package com.cybertek.tests.my_own_study;

import com.cybertek.tests.day8_types_of_elements_2.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tranlate {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://translate.google.com/");

        WebElement inputbox = driver.findElement(By.className("er8xn"));

        inputbox.sendKeys("my elder brother is a complete donkey");

        Thread.sleep(1000);

        WebElement langbutton = driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.WFnNle > c-wiz > div.OlSOob > c-wiz > div.ccvoYb.EjH7wc > div.aCQag > c-wiz > div.zXU7Rb > c-wiz > div:nth-child(5) > button"));

        langbutton.click();

        Thread.sleep(1000);

        WebElement turkishButton = driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.WFnNle > c-wiz > div.OlSOob > c-wiz > div.ccvoYb.EjH7wc > div.aCQag > c-wiz > div:nth-child(2) > c-wiz > div.ykTHSe > div > div.dykxn.MeCBDd.j33Gae > div > div:nth-child(2) > div:nth-child(122) > div.Llmcnf"));

        turkishButton.click();

        Thread.sleep(1000);


        WebElement voiceButton = driver.findElement(By.className("Tw0Tv"));

        voiceButton.click();

        driver.close();




    }
}
