package com.cybertek.pages;

import com.cybertek.tests.day8_types_of_elements_2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactsPage extends BasePage{

    //since we are extending BasePage we do not need explicit constructor for this c   lass

//    @FindBy(xpath = "//td[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']")
//    public WebElement email;

    public WebElement getContactEmail(String email){
        String xpath ="//td[contains(text(),'"+email+"')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }
}
