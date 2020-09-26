package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.Keys;

public class KeyPressPage extends BasePageObject {

    private String keyPressesLink = "http://the-internet.herokuapp.com/key_presses";
    private By resultTextLocator = By.id("result");
    private By body = By.xpath("//body");

    public KeyPressPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        openUrl(keyPressesLink);
    }

    public void pressKey(Keys key) {
        pressKey(body, key);
    }

    public String getResultText() {
        return find(resultTextLocator).getText();
    }
}
