package Searchers;

import java.util.Arrays;

public class BinaryTree {

    public static int search(int[] arr, int num)
    {
        return recursiveBinarySearch(arr, num, 0, arr.length-1);
    }

    private static int recursiveBinarySearch(int[] arr, int find, int left, int right)
    {
        if(left > right)
        {
            return -1;
        }

        int mid = (right + left) / 2;

        if(arr[mid] == find)
            return mid;
        else if(arr[mid] > find)
            return recursiveBinarySearch(arr, find, left, mid);
        else
            return recursiveBinarySearch(arr, find, mid, right);
    }

}
