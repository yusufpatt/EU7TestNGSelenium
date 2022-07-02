package com.cybertek.tests.my_own_study;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;

public class bus_ticket {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.kamilkoc.com.tr/");

        Thread.sleep(1000);

        driver.manage().window().maximize();

        WebElement destinationButton = driver.findElement(By.xpath("(//input[@class=\"smhc-input__field\"])[1]"));

        //destinationButton.click();

        destinationButton.sendKeys("izmir");

        Thread.sleep(2000);

        destinationButton.sendKeys(ENTER);

       // WebElement izmirbutton = driver.findElement(By.className("notranslate FFwb2 njR0m synPG"));
        // izmirbutton.click();

        WebElement dateButton = driver.findElement(By.xpath("(//input[@class=\"smhc-input__field\"])[3]"));

        dateButton.click();

        driver.findElement(By.xpath("//span[@data-date=\"2022-07-08\"]/..")).click();

      Thread.sleep(2000);

      driver.findElement(By.xpath("//button[contains(.,'Seferleri Göster')]")).click();

      BrowserUtils.waitFor(10);

        driver.findElement(By.xpath("(//button[contains(.,'1 koltuk seç')])[2]")).click();

        BrowserUtils.waitForPageToLoad(15);

        Thread.sleep(6000);

        driver.findElement(By.xpath("//input[@id=\"form__checkout__passengers.0.gender__option__male\"]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("(//input[@input=\"[object Object]\"])[1]")).sendKeys("Inıl");

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@input=\"[object Object]\"])[2]")).sendKeys("WhiteIron");

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@input=\"[object Object]\"])[3]")).sendKeys("69696969311");

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@input=\"[object Object]\"])[4]")).sendKeys("zıkkımınkökü@kuzukerimail.com");

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@class=\"flix-input__field\"])[5]")).sendKeys("05312313131");














    }
}
