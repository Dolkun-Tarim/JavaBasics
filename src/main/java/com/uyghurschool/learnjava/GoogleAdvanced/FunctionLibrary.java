package com.uyghurschool.learnjava.GoogleAdvanced;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class FunctionLibrary {
    private WebDriver driver;
    public void openBrowser(String url)
    {
        //setup system environment for using chrome driver
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //open the site
        driver.get(url);
    }
    public List<SearchWord> searchWords(String[] words)
    {
        List<SearchWord> wordList=new ArrayList<SearchWord>();
        for(String word: words)
        {
            wordList.add(new SearchWord(word));
        }
        return wordList;
    }
    public void doSearch(String wordToSearch)
    {
        WebElement searchTextbox=driver.findElement(By.name("q"));
        System.out.println("Search Word: "+wordToSearch);
        searchTextbox.sendKeys(wordToSearch+ Keys.ENTER);
    }
    public boolean verifySearchResult()
    {
        WebElement resultDiv=driver.findElement(By.id("resultStats"));
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(resultDiv));
        String resultText=resultDiv.getText();
        System.out.println(resultText);
        return resultText.contains("results");
    }
    public void goBackToSearchPage()
    {
        driver.navigate().back();
        //wait until the text box displays
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
    }
    public void closeBrowserAndQuit()
    {
        driver.close();
        driver.quit();
    }
}
