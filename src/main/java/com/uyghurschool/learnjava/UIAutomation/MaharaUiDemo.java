package com.uyghurschool.learnjava.UIAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MaharaUiDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.mahara.org");
        WebElement usernameTextbox=driver.findElement(By.id("login_login_username"));
        usernameTextbox.sendKeys("admin");
        WebElement userPasswordTextbox=driver.findElement(By.id("login_login_password"));
        userPasswordTextbox.sendKeys("MaharaDemo");
        WebElement loginButton=driver.findElement(By.id("login_submit"));
        loginButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement userIcon=driver.findElement(By.xpath("//span[@class='icon icon-chevron-down collapsed']"));
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='icon icon-chevron-down collapsed']")));
        userIcon.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement logoutLink=driver.findElement(By.xpath("//span[text()='Logout']"));
        logoutLink.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Login button display: "+driver.findElement(By.id("login_submit")).isDisplayed());
        driver.close();
        driver.quit();

    }
}
