package com.example.adas.app1;

import android.widget.ImageView;

/**
 * Created by Adas on 2018-04-09.
 */

public class List {

    public String title;
    public String subtitle;
    public ImageView image;

    public List(String title, String subtitle, ImageView image) {
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
