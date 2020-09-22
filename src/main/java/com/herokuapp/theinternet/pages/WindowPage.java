package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowPage extends BasePageObject {
    private By clickHereLink = By.linkText("Click Here");


    public WindowPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openNewWindow() {
        click(clickHereLink);
    }

    public NewWindowPage switchToNewWindowsPage() {
        switchToWindowWithTitle("New Window");
        return new NewWindowPage(driver, log);
    }
}
