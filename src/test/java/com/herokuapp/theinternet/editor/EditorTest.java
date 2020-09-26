package com.herokuapp.theinternet.editor;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.NewWindowPage;
import com.herokuapp.theinternet.pages.WYSIWYGEditorPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
import com.herokuapp.theinternet.pages.WindowPage;
import org.testng.Assert;
import org.testng.annotations.Test;

class EditorTest extends TestUtilities {
    @Test
    public void editorTest() {
        WelcomePageObject welcomePageObject = new WelcomePageObject(driver, log);

        welcomePageObject.openPage();

        welcomePageObject.scrollToBottom();

        WYSIWYGEditorPage wysiwygEditorPage = welcomePageObject.enterWYSIWYGEditorLink();

        String editorText = wysiwygEditorPage.getEditorText();

        Assert.assertEquals(editorText, "Your content goes here.");

    }
}
