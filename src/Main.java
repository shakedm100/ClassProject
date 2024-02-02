import Week_5.FibonnaciSequence.Fibonnaci;
import ProjectHelpers.Console;

import java.util.Arrays;

public class Main {


    public static void main(String[] args)
    {
        Integer[] arr = {9, 100, 6, 86445, 46436,684486,4587,83,547,437,2434264,3};

        int n = 200;
        long[] fibo = Fibonnaci.fibonnaciSequence(n);

        Console.printLine(Arrays.toString(fibo));
    }
}