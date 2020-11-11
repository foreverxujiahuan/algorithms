package com.algorithms.basicProgrammingModel;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int key = 5;
        int res = search(a, key);
        System.out.println(res);
    }

    private static int search(int[] a, int key) {
        int length = a.length;
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (a[mid] < key) {
                left = mid+1;
            }
            else if (a[mid] > key) {
                right = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}
