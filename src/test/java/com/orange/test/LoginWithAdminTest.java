package com.orange.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class LoginWithAdminTest extends AbstractTest {

    @Test
    public void testAdminIsAbleToLogin() {
        orangeHRM.openLoginPage();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        orangeHRM.close();
    }


}
