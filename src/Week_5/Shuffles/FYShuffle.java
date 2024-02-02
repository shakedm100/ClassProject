package Week_5.Shuffles;

import java.util.ArrayList;
import java.util.Arrays;

public class FYShuffle {

    public static void FYShuffle(Integer[] arr)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        ArrayList<Integer> newList = new ArrayList<>();
        list = shuffle(list, newList);
        list.toArray(arr);
    }

    private static ArrayList<Integer> shuffle(ArrayList<Integer> list, ArrayList<Integer> newList)
    {
        if(list.isEmpty())
            return newList;
        int location = (int)(Math.random() * (list.size()));
        newList.add(list.get(location));
        list.remove(location);
        return shuffle(list, newList);
    }
}
