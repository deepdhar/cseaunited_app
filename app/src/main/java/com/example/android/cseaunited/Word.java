package com.example.android.cseaunited;

public class Word {

    private String mName;
    private String mNumber;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String name, String number) {
        mName = name;
        mNumber = number;
    }

    public Word(String name, String number, int imageResourceId) {
        mName = name;
        mNumber = number;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getNumber() {
        return mNumber;
    }

    public int getImage() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
