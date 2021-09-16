package dev.angelsflyinhell.m8ni.chip.utils;

import java.util.HashMap;

public class Dataset {

    public static HashMap<Integer, Integer> createDataset(int bitSize) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int i = 0; i < bitSize; i++) {
            h.put(i, 0);
        }

        return h;
    }

    public static HashMap<Integer, Integer> createDataset(Integer[] data) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int i = 0; i < data.length; i++) {
            h.put(i, data[i]);
        }

        return h;
    }

}
