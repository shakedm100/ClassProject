package Week_5.FibonnaciSequence;

public class Fibonnaci {

    public static long[] fibonnaciSequence(int n)
    {
        if(n == 1)
            return new long[] {0};
        if(n == 2)
            return new long[] {0,1};
        
        long[] fibo = new long[n];
        for (int i = 0; i < fibo.length; i++)
        {
            if(i == 0)
                fibo[i] = 0;
            else if(i == 1)
                fibo[i] = 1;
            else
                fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return fibo;
    }
}
