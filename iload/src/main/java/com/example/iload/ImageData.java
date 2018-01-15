package com.example.iload;

import android.graphics.ImageFormat;
import android.media.Image;

import ar.com.hjg.pngj.ImageLineByte;
import ar.com.hjg.pngj.PngReaderByte;

public interface ImageData {
    ImageFormat getFormat();
    int getWidth();
    int getChannel();
    int getHeight();
    byte[] getData();
}


class png implements ImageData {

    PngReaderByte pngr;
    int width;
    int height;
    int channels;
    byte[] data;

    @Override
    public ImageFormat getFormat() {
       int form = ImageFormat.UNKNOWN;
        return null;
    }

    @Override
    public int getWidth() {
        width = pngr.imgInfo.cols;
        return width;
    }

    @Override
    public int getChannel() {
        //3 for RGB, 4 for RGBA, 2 for GA (gray with alpha), 1 for grayscale or indexed.
        channels = pngr.imgInfo.channels;
        return channels;
    }

    @Override
    public int getHeight() {
        height = pngr.imgInfo.rows;
        return height;
    }

    @Override
    public byte[] getData() {
        data = new byte[width*height*channels];
        int count = 0;
        while(pngr.hasMoreRows()) {
            ImageLineByte line = pngr.readRowByte();
            byte[] line1 = line.getScanlineByte();
            System.arraycopy(line1,0,data,(line1.length)*count,line1.length);
            count++;
        }
        return data;
    }
}