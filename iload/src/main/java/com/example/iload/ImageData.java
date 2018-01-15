package com.example.iload;

import android.graphics.ImageFormat;
import android.media.Image;

import java.io.InputStream;

import ar.com.hjg.pngj.ImageLineByte;
import ar.com.hjg.pngj.PngReaderByte;

public interface ImageData {
    ImageFormat getFormat();
    int getWidth();
    int getChannel();
    int getHeight();
    byte[] getData();

    void load(InputStream open);
}


