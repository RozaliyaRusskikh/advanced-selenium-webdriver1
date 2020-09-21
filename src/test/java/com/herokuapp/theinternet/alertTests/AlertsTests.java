package com.herokuapp.theinternet.alertTests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.AlertPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

class AlertsTests extends TestUtilities {
    @Test
    public void jsAlertTest() {
        WelcomePageObject welcomePageObject = new WelcomePageObject(driver, log);
        welcomePageObject.openPage();

        AlertPage alertPage = welcomePageObject.clickJSalertLink();
        // Click on JS Alert button
        alertPage.openJSalert();
        // Get alert text
        String alertMessage = alertPage.getAlertText();
        // Click on OK button
        alertPage.acceptAlert();
        //Get result text
        String result = alertPage.getResultString();

        //Verifications
        // 1 Alert text is expected
        Assert.assertTrue(alertMessage.equals("I am a JS Alert"));

        // 2 Result text is expected

        Assert.assertTrue(result.equals("You successfuly clicked an alert"));
    }

    @Test
    public void jsDismissTest() {
        WelcomePageObject welcomePageObject = new WelcomePageObject(driver, log);
        welcomePageObject.openPage();

        AlertPage alertPage = welcomePageObject.clickJSalertLink();
        // Click on JS Confirm button
        alertPage.openJSconfirm();
        // Get alert text
        String alertMessage = alertPage.getAlertText();
        // Click on Cancel button
        alertPage.dismissAlert();
        //Get result text
        String result = alertPage.getResultString();

        //Verifications
        // 1 Alert text is expected
        Assert.assertTrue(alertMessage.equals("I am a JS Confirm"));

        // 2 Result text is expected

        Assert.assertTrue(result.equals("You clicked: Cancel"));
    }

    @Test
    public void jsPromptTest() {
        WelcomePageObject welcomePageObject = new WelcomePageObject(driver, log);
        welcomePageObject.openPage();

        AlertPage alertPage = welcomePageObject.clickJSalertLink();
        // Click on JS Prompt button
        alertPage.openJSprompt();
        // Get alert text
        String alertMessage = alertPage.getAlertText();
        //
        alertPage.typeTextIntoAlert("Hello");
        //Get result text
        String result = alertPage.getResultString();

        //Verifications
        // 1 Alert text is expected
        Assert.assertTrue(alertMessage.equals("I am a JS Prompt"));

        // 2 Result text is expected

        Assert.assertTrue(result.equals("Hell"));
    }
}
