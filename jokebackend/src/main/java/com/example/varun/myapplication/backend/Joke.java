package com.example.varun.myapplication.backend;

/** The object model for the data we are sending through endpoints */
public class Joke {

    private String text;

    public Joke(String text) {
        this.text=text;
    }

    public String gettext() {
        return text;
    }
}