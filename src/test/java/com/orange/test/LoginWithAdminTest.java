package com.orange.test;

import com.openhrm.app.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class LoginWithAdminTest extends AbstractTest {

    private LoginPage loginPage;

    @Test
    public void testAdminIsAbleToLogin() {

        loginPage = orangeHRM.openLoginPage();
        loginPage.fillUsernameField("Admin");
        loginPage.fillPasswordField("admin");
        loginPage.clickLoginButton();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        orangeHRM.close();
    }


}
