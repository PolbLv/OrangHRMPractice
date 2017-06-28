package com.orange.test;

import com.openhrm.app.DashboardPage;
import com.openhrm.app.LoginPage;
import com.openhrm.data.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.openhrm.data.UserData.*;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class LoginWithAdminTest extends AbstractTest {

    private LoginPage onLoginPage;
    private DashboardPage onDashboardPage;


    @Test(dataProvider = "testData")
    public void testAdminIsAbleToLogin(User user) {
        onDashboardPage = orangeHRM.openLoginPage().loginAS(user);

        String actualGreetingMessage = onDashboardPage.getGreetingsMessage();
        String expectedGreetingMessage = "Welcome " + user.getName();

        Assert.assertEquals(actualGreetingMessage, expectedGreetingMessage, "Incorrect greeting message for " + user);
    }

    @DataProvider(name = "testData")
    public static Object [][] testData(){
        return new Object[][] {{ADMIN_USER}, /*{FIONA}*/};
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        orangeHRM.close();
    }


}
