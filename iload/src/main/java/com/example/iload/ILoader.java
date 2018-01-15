package com.example.iload;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.InputStream;

public interface ILoader {
    boolean available();
    ImageData load(Context context, String assetPath) throws Exception;
}

class imageLoader implements ILoader{
    AssetManager am;
    @Override
    public boolean available() {

        return false;
    }

    @Override
    public ImageData load(Context context, String assetPath) throws Exception {
        am = context.getAssets();
        InputStream input = am.open(assetPath);

        return null;
    }
}