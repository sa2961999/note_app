package com.example.noteapp;

public class plan {
    int image;
    String hobby;

    public plan(int image, String hobby) {
        this.image = image;
        this.hobby = hobby;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
