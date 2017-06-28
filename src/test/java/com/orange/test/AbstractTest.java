package com.orange.test;

import com.openhrm.app.OrangeHRM;
import com.openhrm.tools.App;
import com.openhrm.tools.AppTest;

/**
 * Created by LVIVSOFT\spolyakov on 28.06.17.
 */
public class AbstractTest  implements AppTest {

    protected OrangeHRM orangeHRM = new OrangeHRM();

    @Override
    public App getTestedApp(){
        return this.orangeHRM;
    }

}
