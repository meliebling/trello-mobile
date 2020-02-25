package com.presentation.trello.mobile.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppManager {
    AppiumDriver md;
    SessionHelper session;

    public void init() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","qa22");
        capabilities.setCapability("platformVersion","8.0");
        capabilities.setCapability("automationName ","Appium");
        capabilities.setCapability("appPackage","com.trello");
        capabilities.setCapability("appActivity",".feature.launch.UriHandlerActivity");
        capabilities.setCapability("app","C:/Users/Matvey/Documents/GitHub/trello-mobile/src/test/resources/apk/trello.apk");

        md=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        session=new SessionHelper(md);

    }

    public void stop() throws InterruptedException {
            Thread.sleep(3000);
            md.quit();
        }

    public SessionHelper getSession() {
        return session;
    }
}
