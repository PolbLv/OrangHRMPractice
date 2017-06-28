package com.orange.test;

import com.openhrm.app.OrangeHRM;
import org.testng.annotations.AfterClass;
import tools.App;
import tools.AppTest;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class AbstractTest  implements AppTest {

    protected OrangeHRM orangeHRM = new OrangeHRM();

    @Override
    public App getTestedApp(){
        return this.orangeHRM;
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        orangeHRM.close();
    }
}
