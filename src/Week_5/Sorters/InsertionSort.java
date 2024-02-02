package Week_5.Sorters;

public class InsertionSort {

    public static void sort(int[] arr)
    {
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr)
    {
        int count = 1;
        boolean foundPlace = false;
        for (int i = 1; i < arr.length; i++)
        {
            count = i;
            foundPlace = false;
            while(!foundPlace)
            {
                if(arr[count] < arr[count-1])
                {
                    swap(arr, count, count-1);
                    count--;
                } else if (arr[count] > arr[count-1])
                {
                    foundPlace = true;
                }
                if(count == 1)
                {
                    foundPlace = true;
                    if(arr[count] < arr[count-1])
                        swap(arr, count, count-1);
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
