package com.example.adas.app1.Classes;

import android.widget.ImageView;

/**
 * Created by Adas on 2018-04-09.
 */

public class Item {

    public String title;
    public String subtitle;
    public String image;

    public Item(String title, String subtitle, String image) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
