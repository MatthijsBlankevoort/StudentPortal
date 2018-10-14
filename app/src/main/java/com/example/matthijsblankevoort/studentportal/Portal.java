package com.example.matthijsblankevoort.studentportal;

import android.os.Parcel;
import android.os.Parcelable;

public class Portal{
    private String title;
    private String url;

    public Portal(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
