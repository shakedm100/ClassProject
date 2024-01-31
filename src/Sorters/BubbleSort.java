package Sorters;

public class BubbleSort {

    public static void sort(int[] arr)
    {
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr)
    {
        if(arr.length != 1 && arr.length != 0)
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 1; j < arr.length; j++)
                {
                    if(arr[j-1] > arr[j]) //if the previous one is higher, swap them
                    {
                        swap(arr, j-1, j);
                    }
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
