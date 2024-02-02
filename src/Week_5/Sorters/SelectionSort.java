package Week_5.Sorters;

public class SelectionSort {
    public static void sort(int[] arr){
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr)
    {
        if(arr.length != 0 && arr.length != 1)
        {
            int min;
            int toSwap = 0;
            for (int i = 0; i < arr.length; i++)
            {
                min = arr[i];
                for (int j = i; j < arr.length; j++)
                {
                    if(arr[j] < min)
                    {
                        min = arr[j];
                        toSwap = j;
                    }
                }
                swap(arr, toSwap, i);
            }
        }
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
