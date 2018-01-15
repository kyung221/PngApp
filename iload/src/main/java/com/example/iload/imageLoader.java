package com.example.iload;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.InputStream;

import ar.com.hjg.pngj.PngReaderByte;

public class imageLoader implements ILoader{
    AssetManager am;


    public imageLoader(Context context){

    }

    public imageLoader() {

    }

    @Override
    public boolean available() {
        return am != null;
    }

    @Override
    public ImageData load(Context context, String assetPath) throws Exception {

        am = context.getAssets();
        ImageData png = new png();
        png.load(am.open(assetPath));

        return png;
    }


}
