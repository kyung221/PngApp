package com.example.dummy;


import android.content.Context;
import android.media.Image;


import com.example.iload.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;



    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
//    private static DummyItem createDummyItem(int position)
//    {
//        return new DummyItem(String.valueOf(position),makeImage("cake.png"));
//
//    }
//    private static ImageData makeImage(String name){
//        Context context = null;
//        imageLoader myloader = new imageLoader();
//       // ImageData myimg = new png();
//        try {
//           myimg = myloader.load(context,name);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return myimg;
//
//    }
    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        ILoader myloader = new PNGLoader();
        ImageData img = null;
       // img = myloader.load(this.getContext(),"cake.png");
        int height=img.getHeight();


        builder.append(height);
        return builder.toString();
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }


    }
//
//    public static class DummyItem {
//        public final String id;
//        public final ImageData image;
//        //public char[] content;
//
//        public final String content;
//        public final String details;
//
//        public DummyItem(String id, ImageData image)
//        {
//            this.id = id;
//            this.image = image;
//            this.content = image.toString();
//            this.details = image.toString();
//
//        }
//
//    }
}
