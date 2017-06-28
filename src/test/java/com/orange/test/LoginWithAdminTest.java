package com.orange.test;

import com.openhrm.app.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static com.openhrm.data.UserData.ADMIN_USER;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class LoginWithAdminTest extends AbstractTest {

    private LoginPage onLoginPage;

    @Test
    public void testAdminIsAbleToLogin() {

        onLoginPage = orangeHRM.openLoginPage();
        onLoginPage.loginAS(ADMIN_USER);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        orangeHRM.close();
    }


}
