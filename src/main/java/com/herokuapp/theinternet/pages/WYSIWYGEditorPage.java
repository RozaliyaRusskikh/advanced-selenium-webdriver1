package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage extends BasePageObject {

    private By editorLocator = By.id("tinymce");
    private By frame = By.id("mce_0_ifr");

    public WYSIWYGEditorPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public String getEditorText() {
        switchToFrame(frame);
        String text = find(editorLocator).getText();
        return text;
    }
}
