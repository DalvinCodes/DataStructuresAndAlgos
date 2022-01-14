package com.DalvinCodes.DSA.LinearSearch;

public class Search {


    // return the index of an item (target) in an array
    public int findIndexOfItem(int target, int[] arr) {

        if (arr == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}