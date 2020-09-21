package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePageObject {

    private WebElement dropdown;

    public DropDownPage(WebDriver driver, Logger log) {
        super(driver, log);
        By dropdownLocator = By.id("dropdown");
        dropdown = find(dropdownLocator);
    }

    public void selectOption(int i) {
        Select drop = new Select(dropdown);
        drop.selectByValue("" + i);
    }

    public String getSelectedOption() {
        Select drop = new Select(dropdown);
        return drop.getFirstSelectedOption().getText();
    }
}
