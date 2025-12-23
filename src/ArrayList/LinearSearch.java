package ArrayList;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    ArrayList<Integer> arraylist = new ArrayList<>();
    int size;
    int target;
    boolean found = false;
    public LinearSearch() {
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        size = arraylist.size();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target : ");
        target = scanner.nextInt();

    }

    public void search()
    {
        for(int num = 0 ; num < size; num++)
        {
            if(arraylist.get(num) == target)
            {
                System.out.println("Found the target at " + num + " index");
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("Not found");
        }
    }

    public static void main(String args[])
    {
        LinearSearch ls = new LinearSearch();
        ls.search();
    }


}
