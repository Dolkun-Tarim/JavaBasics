package com.uyghurschool.learnjava.GoogleAutomation;

public class SearchWord {
    private String word;

    //default constructor
    public SearchWord() {
    }
    //Constructor with initializing the argument
    public SearchWord(String word) {
        this.word = word;
    }
    //getter and setter

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
