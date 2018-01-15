package com.example.iload;

import android.graphics.ImageFormat;

import java.io.InputStream;

import ar.com.hjg.pngj.ImageLineByte;
import ar.com.hjg.pngj.PngReaderByte;

public class png implements ImageData {

    PngReaderByte pngr;

    int width;
    int height;
    int channels;
    byte[] data;


    @Override
    public void load(InputStream open) {
        pngr = new PngReaderByte(open);
    }

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
        data = new byte[pngr.imgInfo.cols*pngr.imgInfo.rows*pngr.imgInfo.channels];
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
