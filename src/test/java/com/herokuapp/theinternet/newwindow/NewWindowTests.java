package com.herokuapp.theinternet.newwindow;

import com.herokuapp.theinternet.base.TestUtilities;

import com.herokuapp.theinternet.pages.NewWindowPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
import com.herokuapp.theinternet.pages.WindowPage;
import org.testng.Assert;
import org.testng.annotations.Test;

class NewWindowTests extends TestUtilities {
    @Test
    public void newWindowTest() {
        WelcomePageObject welcomePageObject = new WelcomePageObject(driver, log);
        welcomePageObject.openPage();
        WindowPage windowPage = welcomePageObject.clickMultipleWindowLink();

        windowPage.openNewWindow();
        NewWindowPage newWindowPage = windowPage.switchToNewWindowsPage();

        String pageSource = newWindowPage.getCurrentPageTitle();

        Assert.assertTrue(pageSource.contains("New Window"));
    }
}
