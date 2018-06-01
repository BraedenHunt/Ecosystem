package org.mrt3216.ecosystem;

import android.os.Parcel;

import java.io.Serializable;

public class Attribute implements Serializable {
    private String title;
    private String desc;
    private int image;

    public Attribute(String title, String desc, int image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}
