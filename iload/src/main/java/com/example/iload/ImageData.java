package com.example.iload;

import android.graphics.ImageFormat;

import java.io.InputStream;


public interface ImageData {
    ImageFormat getFormat();
    int getWidth();
    int getChannel();
    int getHeight();
    byte[] getData();

    void load(InputStream open);
}


