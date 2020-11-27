package com.tamas;

public class BlogPost {

    private String authorName;
    String text;
    String title;
    String publicationDate;

    public BlogPost(String authorName,  String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
