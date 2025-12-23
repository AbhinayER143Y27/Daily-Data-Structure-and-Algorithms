package ArrayList;
import java.util.*;

public class LeftRotate1array {

    ArrayList<Integer> arraylist = new ArrayList<>();
    int firstvalue;

    public LeftRotate1array()
    {
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(50);
        firstvalue = arraylist.getFirst();
        System.out.println(firstvalue);

        System.out.println("This is the arraylist before ----------");
        System.out.println(arraylist);

        for(int i = 1; i < arraylist.size(); i++)
        {
            arraylist.set(i-1,arraylist.get(i));
        }
        arraylist.set(arraylist.size() - 1, firstvalue);

        System.out.println("after the swip------");
        System.out.println(arraylist);
   }
   public static void main(String args[])
   {
       new LeftRotate1array();
   }
}
