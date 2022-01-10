package com.DalvinCodes.DSA.LinearSearch;

public class Main {

    public static void main(String[] args) {

        int target = 3;
        int[] arr = {3,4,6,7,8,9,3};
        int[] arr1 = {};

        int ans = new Search().findIndexOfItem(target, arr1);

        System.out.println(ans);
    }

}
