package com.example.android.technewsapp;

public class News {

    private String title;

    private String author;

    private String date;

    private String url;

    public News(String articleTitle, String articleAuthor, String articleDate, String articleUrl) {
        this.title = articleTitle;
        this.author = articleAuthor;
        this.date = articleDate;
        this.url = articleUrl;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {

        return title;
    }
}
