package com.orange.test;

import com.openhrm.app.DashboardPage;
import com.openhrm.app.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static com.openhrm.data.UserData.ADMIN_USER;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class LoginWithAdminTest extends AbstractTest {

    private LoginPage onLoginPage;
    private DashboardPage onDashboardPage;

    @Test
    public void testAdminIsAbleToLogin() {

        onLoginPage = orangeHRM.openLoginPage();
        onDashboardPage = onLoginPage.loginAS(ADMIN_USER);

        String actualGreetingMessage = onDashboardPage.getGreetingsMessage();
        String expectedGreetingMessage = "Welcome " + ADMIN_USER.getUsername();

        Assert.assertEquals(actualGreetingMessage, expectedGreetingMessage, "Incorrect greeting message for " + ADMIN_USER);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        orangeHRM.close();
    }


}
