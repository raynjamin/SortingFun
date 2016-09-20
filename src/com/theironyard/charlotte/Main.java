package com.theironyard.charlotte;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Long> times = new CsvMap<>();

    	// write your code here
        for (int i = 1;i < 10000;i++) {
            int[] array = randomArrayOfLengthN(i);

            long startTime = System.nanoTime();
            MergeSort.sort(array);
            long endTime = System.nanoTime();

            times.put(i, endTime - startTime);
        }

        System.out.println(times);
    }

    private static int[] randomArrayOfLengthN(int n) {
        int[] array = new int[n];

        for(int i = 0;i < n;i++) {
            array[i] = (int)(Math.random() * 100);
        }

        return array;
    }
}
