package pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Login_Page {

    ExtentTest test;

    public void Login_Page(ExtentTest test){
    this.test= test;
    }

    //Locators
    @FindBys({
            @FindBy(xpath = "//input[@name='username']")
    })
            WebElement username;

    @FindBys({
            @FindBy(xpath = "//input[@name='password']")
    })
    WebElement password;

    @FindBys({
            @FindBy(xpath = "//button[@type='submit']")
    })
    WebElement button;
}
