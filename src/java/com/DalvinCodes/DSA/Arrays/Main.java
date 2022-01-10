package com.DalvinCodes.DSA.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 3,2,1,4,5};

        int[] newArray = new Permutation().buildArrayPermutation(arr);
        System.out.println(Arrays.toString(newArray));

    }
}
