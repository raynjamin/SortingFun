package com.theironyard.charlotte;

import java.util.Arrays;

/**
 * Created by Ben on 9/19/16.
 */
public class MergeSort {
    public static int[] sort(int[] array) {
        // already sorted
        if (array.length <= 1) {
            return array;
        }

        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] results = new int[left.length + right.length];

        int leftIdx = 0, rightIdx = 0;

        for (int i = 0;i < results.length;i++) {
            if (leftIdx < left.length && rightIdx < right.length) {
                if (left[leftIdx] < right[rightIdx]) {
                    results[i] = left[leftIdx++];
                } else {
                    results[i] = right[rightIdx++];
                }
            } else if (leftIdx < left.length) {
                results[i] = left[leftIdx++];
            } else {
                results[i] = right[rightIdx++];
            }
        }
        return results;
    }


}
