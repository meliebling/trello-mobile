package com.presentation.trello.mobile.tests;

import com.presentation.trello.mobile.models.User;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

@Test
    public void testLogin() throws InterruptedException {
    app.getSession().pause(5000);
    app.getSession().fillLogInForm(new User().withUsername("meliebling@gmail.com").withPassword("7Ig%20K8"));
//    app.getSession().tapLoginAtlassian();
//    app.getSession().tapLogIn();





}


//.withPassword("7Ig%20K8")




}
