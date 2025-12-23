package ArrayList;

import java.util.*;

public class reverse_arr {

    ArrayList<Integer> arraylist = new ArrayList<>();

    public void arrayAdd()
    {
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(50);

        System.out.println("This is the array before the reverse done: " + arraylist);

        int length = arraylist.size() - 1;

        for(int i = 0, j = length ;i < j; i++, j--)
        {
            int temp = arraylist.get(j);
            arraylist.set(j,arraylist.get(i));
            arraylist.set(i,temp);
        }
        // or just use the Colections.reverse(arraylist);
        System.out.println("This is after the reversion of the array: " + arraylist);
    }
    public static void main(String args[])
    {
        reverse_arr alr = new reverse_arr();
        alr.arrayAdd();
    }
}
