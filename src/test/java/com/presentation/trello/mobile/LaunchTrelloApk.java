package com.presentation.trello.mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LaunchTrelloApk {

    AppiumDriver md;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","qa22");
        capabilities.setCapability("platformVersion","8.0");
        capabilities.setCapability("automationName ","Appium");
        capabilities.setCapability("appPackage","com.trello");
        capabilities.setCapability("appActivity",".feature.launch.UriHandlerActivity");
        capabilities.setCapability("app","C:/Users/Matvey/Documents/GitHub/trello-mobile/src/test/resources/apk/trello.apk");

        md=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);



    }

    @Test

    public void testOpenUp(){
        System.out.println("Trello launched");

    }



@AfterClass
public void tearDown() throws InterruptedException {
    Thread.sleep(3000);
    md.quit();


    }

}
