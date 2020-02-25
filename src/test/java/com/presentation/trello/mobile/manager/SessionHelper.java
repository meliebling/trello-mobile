package com.presentation.trello.mobile.manager;

import com.presentation.trello.mobile.models.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SessionHelper extends HelperBase {
    public SessionHelper(AppiumDriver md) {
        super(md);
    }

    public void fillLogInForm(User user){
        type(By.id("user"), user.getUsername());
        type(By.id("password"), user.getPassword());
    }

    public void tapLogIn(){
        tap(By.id("authenticate"));

    }

    public void tapLoginAtlassian() throws InterruptedException {
        pause(3000);
        md.findElement(By.xpath("@resource-id=/hierarchy/android.widget.FrameLayout")).click();
pause(2000);
        tap(By.id("button1"));
        pause(2000);
        md.findElement(By.xpath("@resource-id=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout")).click();


    }


}
