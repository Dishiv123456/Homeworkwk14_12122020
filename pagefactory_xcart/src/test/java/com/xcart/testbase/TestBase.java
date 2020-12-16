package com.xcart.testbase;

import com.xcart.propertyreader.PropertyReader;
import com.xcart.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})

    public void openBrowser() {
        selectBrowser(browser);
    }

    @AfterMethod(groups = {"sanity", "smoke", "regression"})
    public void tearDown() {
        closeBrowser();
    }

}
