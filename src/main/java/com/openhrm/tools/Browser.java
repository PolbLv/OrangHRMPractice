package com.openhrm.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class Browser {

    public static WebDriver open(){
//        System.setProperty("browser", "firefox");
        System.setProperty("browser", "chrome");

        String browserName = System.getProperty("browser");

        if (browserName == null || "chrome".equals(browserName)){
            return startChromeDriver();
        } else if ("firefox".equals(browserName)){
            return startFirefoxDriver();
        }
        throw new RuntimeException("Unsupposted browser " + browserName);
    }

    private static WebDriver startFirefoxDriver() {
        return new FirefoxDriver();
    }

    private static WebDriver startChromeDriver() {
        return new ChromeDriver();
    }
}
