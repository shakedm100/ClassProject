package Shuffles;

public class BoazShuffle {

    public static void shuffle(int[] arr)
    {
        boazShuffle(arr);
    }

    private static void boazShuffle(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int random = (int)(Math.random() * (arr.length - i));
            swap(arr, i, random);
        }
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
