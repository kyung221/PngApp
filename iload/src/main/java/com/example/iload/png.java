package com.example.iload;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.ImageFormat;

import java.io.IOException;
import java.io.InputStream;

import ar.com.hjg.pngj.ImageLineByte;
import ar.com.hjg.pngj.PngReaderByte;

public class png implements ImageData {

    int width;
    int height;
    int channels;
    byte[] data;

    PngReaderByte pngr;

    @Override
    public ImageFormat getFormat() {
      // int form = ImageFormat.UNKNOWN;
       final ImageFormat format = getFormat();
       return format;
    }


    @Override
    public int getWidth() {
        width = pngr.imgInfo.cols;
        return width;
    }

    @Override
    public int getChannel() {
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
