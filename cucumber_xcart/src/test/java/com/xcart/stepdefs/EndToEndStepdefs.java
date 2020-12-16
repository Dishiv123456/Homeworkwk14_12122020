package com.xcart.stepdefs;

import com.xcart.pages.ElectronicPage;
import com.xcart.pages.FitnessTrackerSmartWatchPage;
import com.xcart.pages.HomePage;
import com.xcart.pages.NewArrivalsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EndToEndStepdefs {
    @Given("^i am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^i click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickSignUpLink();
    }

    @And("^i click on new account tab$")
    public void iClickOnNewAccountTab() {
        new HomePage().clickOnNewAccountTab();
    }

    @And("^i enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
     new HomePage().enterPasswordToPasswordField(password);
    }

    @And("^i enater confirm password \"([^\"]*)\"$")
    public void iEnaterConfirmPassword(String confirmPassword){
       new HomePage().enterPasswordToConfirmPasswordField(confirmPassword);
    }

    @And("^i click on create button$")
    public void iClickOnCreateButton() {
        new HomePage().clickOnCreateButton();
    }

    @Then("^i should be able to create account successfully$")
    public void iShouldBeAbleToCreateAccountSuccessfully() {
        new HomePage().VerifyUserShouldNavigateToMyAccountPage();
    }

    @And("^i enter email address$")
    public void iEnterEmailAddress() {
        new HomePage().enterEmailAddressToEmailField();
    }

    @When("^i click on home tab$")
    public void iClickOnHomeTab() {
        new HomePage().clickOnHomePageTab();
    }

    @And("^i navigate to home page$")
    public void iNavigateToHomePage() {
        new HomePage().VerifyUserShouldNavigateToHomePage();
    }

    @And("^i click on electronic button$")
    public void iClickOnElectronicButton() {
        new HomePage().clickOnElectronicButton();
    }

    @Then("^i should navigate to electronic page$")
    public void iShouldNavigateToElectronicPage() {
        new ElectronicPage().clickOnElectronicButton();
    }

    @Then("^i click on new tab$")
    public void iClickOnNewTab() {
        new HomePage().clickOnNewTab();
    }

    @And("^i navigate to new arrivals page$")
    public void iNavigateToNewArrivalsPage() {
        new NewArrivalsPage().getTextFromNeArrivalsTab();
    }

    @And("^i click on  fitness tracker smart watch$")
    public void iClickOnFitnessTrackerSmartWatch() {
        new NewArrivalsPage().clickOnFitnessTrackerSmartWatch();
    }

    @Then("^i should be bale to select watch successfully$")
    public void iShouldBeBaleToSelectWatchSuccessfully() {
        new FitnessTrackerSmartWatchPage().getTextFromFitnessTracker();
    }
}
