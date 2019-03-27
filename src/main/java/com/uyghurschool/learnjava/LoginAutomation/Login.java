package com.uyghurschool.learnjava.LoginAutomation;

public class Login {
    public static void main(String[] args) {
        User user=new User("admin","MaharaDemo");
        FunctionLibrary functionLibrary=new FunctionLibrary();
        functionLibrary.openBrowser("https://demo.mahara.org");
        functionLibrary.enterUsername(user.getUsername());
        functionLibrary.enterPassword(user.getPassword());
        functionLibrary.clickOnSubmitButton();
        functionLibrary.loggedIn();
        functionLibrary.logOut();
        functionLibrary.closeTheBrowser();
    }
}
