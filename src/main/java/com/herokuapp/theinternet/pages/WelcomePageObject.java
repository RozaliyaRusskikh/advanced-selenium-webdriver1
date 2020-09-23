package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/";

    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
    private By checkboxesLinkLocator = By.linkText("Checkboxes");
    private By dropDownLinkLocator = By.linkText("Dropdown");
    private By alertLinkLocator = By.linkText("JavaScript Alerts");
    private By multipleWindows = By.linkText("Multiple Windows");
    private By WYSIWYGEditor = By.linkText("WYSIWYG Editor");

    public WelcomePageObject(WebDriver driver, Logger log) {
        super(driver, log);
    }

    /**
     * Open WelcomePage with it's url
     */
    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    /**
     * Open LoginPage by clicking on Form Authentication Link
     */
    public LoginPage clickFormAuthenticationLink() {
        log.info("Clicking Form Authentication link on Welcome Page");
        click(formAuthenticationLinkLocator);
        return new LoginPage(driver, log);
    }

    /**
     * Open CheckboxesPage by clicking on Checkboxes Link
     */
    public CheckboxesPage clickCheckboxesLink() {
        log.info("Clicking Checkboxes link on Welcome Page");
        click(checkboxesLinkLocator);
        return new CheckboxesPage(driver, log);
    }

    public DropDownPage clickDropDownLink() {
        click(dropDownLinkLocator);
        return new DropDownPage(driver, log);
    }

    public AlertPage clickJSalertLink() {
        click(alertLinkLocator);
        return new AlertPage(driver, log);
    }

    public WindowPage clickMultipleWindowLink() {
        click(multipleWindows);
        return new WindowPage(driver, log);
    }

    public WYSIWYGEditorPage enterWYSIWYGEditorLink() {
        click(WYSIWYGEditor);
        return new WYSIWYGEditorPage(driver, log);
    }
}
