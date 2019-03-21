package com.uyghurschool.learnjava.GoogleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        //setup system environment for using chrome driver
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //create a webdriver instance for chrome driver
        WebDriver driver=new ChromeDriver();
        //open the browser and maximize browser windows
        driver.manage().window().maximize();
        //open the google site
        driver.get("https://www.google.com");
        //define a list that contains multiple words
        List<SearchWord> words=new ArrayList<SearchWord>();
        SearchWord word1=new SearchWord();
        word1.setWord("Selenium");
        words.add(word1);
        words.add(new SearchWord("Java"));
        words.add(new SearchWord("Python"));
        words.add(new SearchWord("Uyghur"));
        for(SearchWord word: words)
        {
            System.out.println(driver.getTitle());
            WebElement searchBox=driver.findElement(By.name("q"));
            //type the search word in the text box and press enter
            searchBox.sendKeys(word.getWord()+ Keys.ENTER);
            WebElement searchResult=driver.findElement(By.id("resultStats"));
            String result=searchResult.getText();
            if(result.contains("results")) {
                System.out.println("Search Word : "+word.getWord());
                System.out.println("Test Passed");
            }
            else
            {
                System.out.println("Test Failed");
            }
            //go back
            Thread.sleep(5000);
            driver.navigate().back();

        }
        //close the browser and quit
        driver.close();
        driver.quit();
    }
}
