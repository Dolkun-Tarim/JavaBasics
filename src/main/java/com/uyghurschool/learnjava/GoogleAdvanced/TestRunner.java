package com.uyghurschool.learnjava.GoogleAdvanced;

import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        FunctionLibrary functionLibrary=new FunctionLibrary();
        functionLibrary.openBrowser("https://www.google.com");
        String[] sw=new String[]{"uyghurschool.com",
                "New York",
                "JavaScript",
                "Washington DC","London","Turkey"};
        List<SearchWord> words=functionLibrary.searchWords(sw);
        for(SearchWord s: words)
        {
            functionLibrary.doSearch(s.getWord());
            System.out.println(functionLibrary.verifySearchResult());
            functionLibrary.goBackToSearchPage();
        }
        functionLibrary.closeBrowserAndQuit();
    }
}
