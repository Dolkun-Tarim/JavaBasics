package com.uyghurschool.learnjava.LoginAutomation;

import java.util.ArrayList;
import java.util.List;

public class LoginMultiuser {
    public static void main(String[] args) {
        List<User> users=new ArrayList<User>();
        users.add(new User("admin","MaharaDemo"));
        users.add(new User("student","MaharaDemo"));
        users.add(new User("learner","MaharaDemo"));
        for(User user:users) {
            FunctionLibrary functionLibrary = new FunctionLibrary();
            functionLibrary.openBrowser("https://demo.mahara.org");
            functionLibrary.enterUsername(user.getUsername());
            functionLibrary.enterPassword(user.getPassword());
            functionLibrary.clickOnSubmitButton();
            functionLibrary.loggedIn();
            functionLibrary.logOut();
            functionLibrary.closeTheBrowser();
        }
    }
}
