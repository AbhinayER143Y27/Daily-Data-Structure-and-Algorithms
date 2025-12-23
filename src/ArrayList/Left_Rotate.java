package ArrayList;
import java.util.*;

public class Left_Rotate {

    ArrayList<Integer> arraylist = new ArrayList<>();
    ArrayList<Integer> arraylist2 = new ArrayList<>();
    int tempvar;
    int size;

    public Left_Rotate() {
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        tempvar = arraylist.get(0);
        size =arraylist.size();
    }


    public void ValueRotator()
    {
        System.out.println("ArrayList before ---------------");
        System.out.println(arraylist);
        for(int i = 1; i < size; i++)
        {
            arraylist2.add(arraylist.get(i));
        }
        arraylist2.add(tempvar);
        System.out.println("arraylist after -----------------");
        System.out.println(arraylist2);
    }
    public static void main(String args[])
    {
        Left_Rotate lr = new Left_Rotate();
        lr.ValueRotator();
    }
}
