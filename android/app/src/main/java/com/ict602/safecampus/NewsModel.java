package com.ict602.safecampus;

public class NewsModel {
    String title, description;

    // REQUIRED empty constructor (Firestore)
    public NewsModel() {}
    public NewsModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
