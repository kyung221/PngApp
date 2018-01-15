package com.example.iload;

import android.content.Context;
import android.content.res.AssetManager;

import ar.com.hjg.pngj.PngReaderByte;

public interface ILoader {
    boolean available();
    ImageData load(Context context, String assetPath) throws Exception;

}

