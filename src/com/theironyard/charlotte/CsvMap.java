package com.theironyard.charlotte;

import java.util.HashMap;

/**
 * Created by Ben on 9/19/16.
 */
public class CsvMap<K, V> extends HashMap<K, V> {

    @Override
    public String toString() {
        String results = "";

        for (K key : keySet()) {
            results += String.format("%s,%s\n", key.toString(), get(key).toString());
        }

        return results;
    }
}
