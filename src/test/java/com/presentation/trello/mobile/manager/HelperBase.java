package com.presentation.trello.mobile.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HelperBase {

    AppiumDriver md;

    public HelperBase(AppiumDriver md) {
        this.md = md;
    }

    public void tap(By locator) {

        md.findElement(locator).click();

    }

    public void type(By locator, String text) {
        if (text != null) {
            tap(locator);
            md.findElement(locator).clear();
            md.findElement(locator).sendKeys(text);

        }
    }

    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public boolean isElementPresent(By locator){
        return md.findElements(locator).size()>0;
    }

}
