package com.herokuapp.theinternet.keyPresses;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.KeyPressPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

class KeyPressTest extends TestUtilities {
    @Test
    public void KeyPressTest() {
        KeyPressPage keyPressPage = new KeyPressPage(driver, log);
        keyPressPage.openPage();

        keyPressPage.pressKey(Keys.ENTER);

        String result = keyPressPage.getResultText();

        Assert.assertTrue(result.equals("You entered: ENTER"));
    }
}
