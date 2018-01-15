package com.example;

import com.example.iload.ILoader;
import com.example.iload.ImageData;
import com.example.iload.PNGLoader;



import junit.framework.Assert;

import org.junit.Test;


/**
 * Created by alchera on 18. 1. 15.
 */

public class image extends ExampleInstrumentedTest {
    @Test
    public void loadimage() throws Exception {
        ILoader myloader = new PNGLoader();

        ImageData img = myloader.load(context,"cake.png");

        Assert.assertNotNull(img);
       // Assert.assertEquals(4,img.getFormat());
        //Assert.assertEquals(10,img.getChannel());
        Assert.assertEquals(10, img.getData().length);

    }


}
