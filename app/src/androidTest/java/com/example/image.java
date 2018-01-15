package com.example;

import android.content.res.AssetManager;
import android.media.Image;

import com.example.iload.ILoader;
import com.example.iload.ImageData;
import com.example.iload.imageLoader;
import com.example.iload.png;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static android.support.test.InstrumentationRegistry.getContext;

/**
 * Created by alchera on 18. 1. 15.
 */

public class image extends ExampleInstrumentedTest {
    @Test
    public void loadimage() throws Exception {
        ILoader myloader = new imageLoader();

        ImageData img = myloader.load(context,"cake.png");
        Assert.assertNotNull(img);

        Assert.assertEquals(10,img.getHeight());

    }


}
