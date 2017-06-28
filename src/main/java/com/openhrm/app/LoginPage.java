package com.openhrm.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class LoginPage extends AbstractPage {

    @FindBy(id = "txtUsername")
    private WebElement userNameInput;

    @FindBy(id = "txtPassword")
    private WebElement passwordInput;

    @FindBy(id = "btnLogin")
    private WebElement clickBurronLogin;


    public LoginPage(WebDriver driver){
        super(driver);
    }
}