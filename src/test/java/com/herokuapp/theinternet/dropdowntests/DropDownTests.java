package com.herokuapp.theinternet.dropdowntests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.CheckboxesPage;
import com.herokuapp.theinternet.pages.DropDownPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTests extends TestUtilities {

    @Test
    public void optionTwoTest() {
        log.info("Starting selectingTwoCheckboxesTest");

        // open main page
        WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
        welcomePage.openPage();

        DropDownPage dropDownPage = welcomePage.clickDropDownLink();
        dropDownPage.selectOption(2);

        String selectedOption = dropDownPage.getSelectedOption();
        Assert.assertTrue(selectedOption.equals("Option 2"));
    }
}
