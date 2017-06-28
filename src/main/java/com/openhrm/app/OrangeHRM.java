package com.openhrm.app;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;
import tools.App;
import tools.Browser;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class OrangeHRM implements App {
    private static final String BASE_URL = "http://opensource.demo.orangehrmlive.com//";
    private WebDriver driver;

    @Step("Open Home Page by URL: " + BASE_URL)
    public LoginPage openLoginPage(){
        driver = Browser.open();
        if (!"android".equals(System.getProperty("browser"))) {
            driver.manage().window().maximize();
        }
        driver.get(BASE_URL);
        return new LoginPage(driver);
    }

    @Step("Close Browser")
    public void close(){
        if(driver !=null)
            driver.quit();
        driver = null;
    }
    @Attachment("Screenshot")
    public byte[] takeScreenshot() {
        TakesScreenshot takesScreenshot = TakesScreenshot.class.cast(driver);
        return takesScreenshot.getScreenshotAs(OutputType.BYTES);
    }
}
