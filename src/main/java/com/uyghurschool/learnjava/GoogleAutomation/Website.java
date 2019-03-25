package com.uyghurschool.learnjava.GoogleAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class Website implements Runnable {
    private String url;

    public Website(String url) {
        this.url = url;
    }

    public void run() {
        //setup system environment for using chrome driver
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define Chrome Driver
        WebDriver driver=new ChromeDriver();
        //Maximize the window and open the site
        driver.manage().window().maximize();
        Date now=new Date();
        System.out.println(now);
        driver.get(url);
        System.out.println(driver.getTitle());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
        driver.quit();
    }
}
