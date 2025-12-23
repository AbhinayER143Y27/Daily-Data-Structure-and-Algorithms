package ArrayList;

import java.util.*;

public class EvenIndex {

    ArrayList<Integer> arrayList = new ArrayList<>();
    int length;
    public void arrayAdd()
    {
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println("This is the arraylist : " + arrayList);
        length = arrayList.size() - 1;
    }

    public void arrayPrint()
    {
        for(int i = 0; i <= length; i = i+2)
        {
            System.out.println(arrayList.get(i));
        }
    }
    public static void main(String args[])
    {
        EvenIndex ei = new EvenIndex();
        ei.arrayAdd();
        ei.arrayPrint();
    }
}
