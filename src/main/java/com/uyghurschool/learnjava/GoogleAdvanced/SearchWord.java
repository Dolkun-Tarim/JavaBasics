package com.uyghurschool.learnjava.GoogleAdvanced;

public class SearchWord {
    private String word;
    //default constructor
    public SearchWord() {
    }
    //constructor with initializing the argument

    public SearchWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "SearchWord{" +
                "word='" + word + '\'' +
                '}';
    }
}
