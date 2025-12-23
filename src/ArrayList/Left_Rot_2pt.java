package ArrayList;

import java.util.*;

public class Left_Rot_2pt {

    int firstone;
    ArrayList<Integer> arraylist = new ArrayList<>();

    public Left_Rot_2pt()
    {
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(50);
        firstone = arraylist.getFirst();
        System.out.println(arraylist);
    }

    public void leftRotatingArray()
    {
        for(int i = 0,j = 1; j < arraylist.size();i++ )
        {
            arraylist.set(i,arraylist.get(j));
            j++;
        }
        arraylist.set(arraylist.size() - 1,firstone);
        System.out.println("-----------This is after the edit----------------");
        System.out.println(arraylist);
    }
    public static void main(String args[])
    {
        Left_Rot_2pt l1 = new Left_Rot_2pt();
        l1.leftRotatingArray();
    }

}
