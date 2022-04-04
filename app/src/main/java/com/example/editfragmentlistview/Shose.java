package com.example.editfragmentlistview;

public class Shose {
    private int id;
    private String decription;
    private int image;
    private String showText;

    public Shose(int id, String decription, int image, String showText) {
        this.id = id;
        this.decription = decription;
        this.image = image;
        this.showText = showText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getShowText() {
        return showText;
    }

    public void setShowText(String showText) {
        this.showText = showText;
    }
}
