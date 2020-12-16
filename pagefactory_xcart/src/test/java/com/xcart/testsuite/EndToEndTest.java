package com.xcart.testsuite;

import com.xcart.pages.ElectronicPage;
import com.xcart.pages.FitnessTrackerSmartWatchPage;
import com.xcart.pages.HomePage;
import com.xcart.pages.NewArrivalsPage;
import com.xcart.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;

public class EndToEndTest extends TestBase {
    HomePage homePage;
    ElectronicPage electronicPage;
    NewArrivalsPage newArrivalsPage;
    FitnessTrackerSmartWatchPage fitnessTrackerSmartWatchPage;

    @BeforeMethod (groups = {"sanity", "smoke", "regression"})
    public void setUp() {
        homePage = new HomePage();
        electronicPage = new ElectronicPage();
        newArrivalsPage = new NewArrivalsPage();
        fitnessTrackerSmartWatchPage =new FitnessTrackerSmartWatchPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToCreateAccountSuccessfully() {
        homePage.clickSignUpLink();
        homePage.clickOnNewAccountTab();
        homePage.enterEmailAddressToEmailField();
        homePage.enterPasswordToPasswordField("Abcde1234");
        homePage.enterPasswordToConfirmPasswordField("Abcde1234");
        homePage.clickOnCreateButton();
        Assert.assertEquals("My account", homePage.VerifyUserShouldNavigateToMyAccountPage());
    }

    @Test(groups = {"smoke", "regression"})
    public void userShouldNavigateToElectronicPageSuccessfully() {
        homePage.clickOnHomePageTab();
        Assert.assertEquals("Welcome to X-Cart Demo Store!", homePage.VerifyUserShouldNavigateToHomePage());
        homePage.clickOnElectronicButton();
        Assert.assertEquals("Electronics",(electronicPage.clickOnElectronicButton()));

    }

    @Test (groups = {"regression"})
    public void userShouldAbleToPurchaseSuccessfully() {
        homePage.clickOnNewTab();
        Assert.assertEquals("New arrivals",newArrivalsPage.getTextFromNeArrivalsTab());
        newArrivalsPage.clickOnFitnessTrackerSmartWatch();
        Assert.assertEquals("Fitness Tracker Smart Watch",fitnessTrackerSmartWatchPage.getTextFromFitnessTracker());

    }

}
