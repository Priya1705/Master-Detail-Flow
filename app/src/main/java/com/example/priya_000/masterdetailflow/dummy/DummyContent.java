package com.example.priya_000.masterdetailflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {

    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {


            addItem(new DummyItem("1","one","http://www.facebook.com"));
            addItem(new DummyItem("2","two","http://www.google.com"));
            addItem(new DummyItem("3","three","http://www.android.com"));
        }


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    public static class DummyItem {
        public final String id;
        public final String item_name;
        public final String url;

        public DummyItem(String id, String item_name, String url) {
            this.id = id;
            this.item_name = item_name;
            this.url = url;
        }

        @Override
        public String toString() {

            return item_name;
        }

        }
        }


