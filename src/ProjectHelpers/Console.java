package ProjectHelpers;
import java.util.*;

public class Console {
    public static void printLine(String text)
    {
        System.out.println(text);
    }

    public static void print(String text)
    {
        System.out.print(text);
    }

    public static int scanInt()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static double scanDouble()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static String scanString()
    {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

}
