package com.algorithms.basicProgrammingModel;

public class BinarySearchByRecursion {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int key = 5;
        int res = rank(key, a);
        System.out.println(res);
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key > a[mid]) return rank(key, a, mid+1, hi);
        else if (key < a[mid]) return rank(key, a, lo, mid-1);
        else return mid;
    }
}
