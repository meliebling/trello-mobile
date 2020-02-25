package com.presentation.trello.mobile.tests;

import com.presentation.trello.mobile.manager.AppManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class TestBase {


    public static AppManager app = new AppManager();

    @BeforeClass
    public void setUp() throws MalformedURLException {
        app.init();


    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        app.stop();


    }

}
