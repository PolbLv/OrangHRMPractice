package com.openhrm.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class DashboardPage extends AbstractPage {

   @FindBy(id = "welcome")
   private WebElement welcome;

    public DashboardPage(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("dashboard"));
    }
    @Step("Read Greetings message")
    @Attachment("Message")
    public String getGreetingsMessage(){
        return welcome.getText();
    }
}

