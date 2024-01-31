import ProjectHelpers.Console;
import Searchers.BinaryTree;
import Shuffles.BoazShuffle;
import Shuffles.FYShuffle;
import Sorters.BubbleSort;
import Sorters.InsertionSort;
import Sorters.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args)
    {
        Integer[] arr = {9, 100, 6, 86445, 46436,684486,4587,83,547,437,2434264,3};

        int count = 0;
        for (int i = 0; i < 999999; i++)
        {
            FYShuffle.FYShuffle(arr);
            if(arr[0] == 9)
                count++;
        }

        Console.printLine("Number 9 in index 0: "+count);
    }
}