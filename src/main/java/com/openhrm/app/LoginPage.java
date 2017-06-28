package com.openhrm.app;

import com.openhrm.data.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class LoginPage extends AbstractPage {

    @FindBy(id = "txtUsername")
    private WebElement userNameInput;

    @FindBy(id = "txtPassword")
    private WebElement passwordInput;

    @FindBy(id = "btnLogin")
    private WebElement clickButtonLogin;


    public LoginPage(WebDriver driver){
        super(driver);
    }
    @Step("Fill Username field with value <{0}>")
    public void fillUsernameField(String username) {
        userNameInput.sendKeys(username);
    }
    @Step("Fill Password field with value <{0}>")
    public void fillPasswordField(String password){
        passwordInput.sendKeys(password);
    }

    @Step("Click Login Button")
    public void clickLoginButton(){
        clickButtonLogin.click();
    }

    public void loginAS(User user){
        fillUsernameField(user.getUsername());
        fillPasswordField(user.getPassword());
        clickLoginButton();
    }

}