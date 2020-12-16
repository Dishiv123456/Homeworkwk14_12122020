package com.xcart.pages;

import com.cucumber.listener.Reporter;
import com.xcart.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NewArrivalsPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewArrivalsPage.class.getName());


    @FindBy(xpath = "//h1[@id='page-title']")
    WebElement _newArrivalsText;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[3]/div/div/div[3]/ul/li[1]/div/div[1]/a/img")
    WebElement _fitnessTrackerSmartWatch;


    //This method gwt text from new arrivals tab
    public String getTextFromNeArrivalsTab() {
        Reporter.addStepLog("Get text from new arraivals tab" + _newArrivalsText.toString() + "<br>");
        log.info("Get text from new arraivals tab" + _newArrivalsText.toString());
        return getTextFromElement(_newArrivalsText);
    }

    //This method will click on fitness tracker smart watch
    public void clickOnFitnessTrackerSmartWatch() {
        Reporter.addStepLog("Clicking on fitness tracker watch" + _fitnessTrackerSmartWatch.toString() + "<br>");
        log.info("Clicking on fitness tracker watch" + _fitnessTrackerSmartWatch.toString());
        clickOnElement(_fitnessTrackerSmartWatch);
    }


}
