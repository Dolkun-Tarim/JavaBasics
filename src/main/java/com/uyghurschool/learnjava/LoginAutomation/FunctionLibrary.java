package com.uyghurschool.learnjava.LoginAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionLibrary {
    private WebDriver driver;
    public void openBrowser(String url)
    {
        //setup system environment for using the chrome driver
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //create a webdriver instance for the chrome browser
        driver=new ChromeDriver();
        //open the browser and maximize browser window
        driver.manage().window().maximize();
        //open the site
        driver.get(url);
    }
    public void enterUsername(String username)
    {
        WebElement usernameTextBox=driver.findElement(By.id("login_login_username"));
        usernameTextBox.sendKeys(username);
    }
    public void enterPassword(String password)
    {
        WebElement passwordTextBox=driver.findElement(By.id("login_login_password"));
        passwordTextBox.sendKeys(password);
    }

    public void clickOnSubmitButton()
    {
        WebElement loginButton=driver.findElement(By.id("login_submit"));
        loginButton.click();
    }

    public boolean loggedIn()
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        By icon=By.cssSelector("span.icon.icon-chevron-down.collapsed");
        wait.until(ExpectedConditions.presenceOfElementLocated(icon));
        boolean isUserLoggedIn=driver.findElement(icon).isDisplayed();
        System.out.println("Login test passed: "+isUserLoggedIn);
        return isUserLoggedIn;
    }
    public void logOut()
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        By icon=By.cssSelector("span.icon.icon-chevron-down.collapsed");
        wait.until(ExpectedConditions.presenceOfElementLocated(icon));
        driver.findElement(icon).click();
        try {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("span.icon.icon-sign-out")).click();
        boolean isUserLoginDisplayed=driver.findElement(By.id("login_login_username")).isDisplayed();
        System.out.println("Login page display: "+isUserLoginDisplayed);
    }
    public void closeTheBrowser()
    {
        driver.close();
        driver.quit();
    }
}
