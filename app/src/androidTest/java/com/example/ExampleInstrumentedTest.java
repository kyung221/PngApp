package com.example;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
//    Context context;
//    @Test
//    public void useAppContext() throws Exception {
//        // Context of the app under test.
//        context = InstrumentationRegistry.getTargetContext();
//
//        assertEquals("com.example", context.getPackageName());
//    }
    protected Context context;

    @Before
    public void SetupContext(){
        context = InstrumentationRegistry.getTargetContext();
    }

    @After
    public void TestDownContext(){
        context = null;
    }

}
