package com.example.jonib.tts_full_app.model;

/**
 * Created by jonib on 3/15/2018.
 */

public class DataModel {

    private int imageView;
    private String title;

    public DataModel(int imageView, String title) {
        this.imageView = imageView;
        this.title = title;
    }

    public int getImageView() {
        return imageView;
    }

    public String getTitle() {
        return title;
    }

}
