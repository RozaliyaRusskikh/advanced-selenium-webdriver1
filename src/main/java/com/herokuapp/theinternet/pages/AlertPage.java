package com.herokuapp.theinternet.pages;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePageObject {
    private By alertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By confirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By promptButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    private By resultTextLocator = By.id("result");

    public AlertPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openJSalert() {
        click(alertButton);
    }

    public void openJSconfirm() {
        click(confirmButton);
    }

    public void openJSprompt() {
        click(promptButton);
    }

    public String getAlertText() {
        Alert alert = switchToAlert();
        return alert.getText();
    }

    public void acceptAlert() {
        Alert alert = switchToAlert();
        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = switchToAlert();
        alert.dismiss();
    }

    public void typeTextIntoAlert(String text) {
        Alert alert = switchToAlert();
        alert.sendKeys(text);
        alert.accept();
    }

    public void typeTextIntoAlertDismiss(String text) {
        Alert alert = switchToAlert();
        alert.sendKeys(text);
        alert.dismiss();
    }
    public String getResultString() {
        return find(resultTextLocator).getText();
    }
}
