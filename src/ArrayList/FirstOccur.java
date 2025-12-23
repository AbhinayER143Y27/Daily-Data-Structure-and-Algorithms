package ArrayList;

import java.util.*;

public class FirstOccur {

    ArrayList<Integer> arrayList = new ArrayList<>();
    int  length;
    public FirstOccur()
    {
        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(20);
        length = arrayList.size();
        System.out.println("This is the arraylist before: " + arrayList);
    }

    public void firstOne()
    {
        System.out.println("Enter the target value : ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int i = 0;
        boolean found = false;
        while(i < length) {
            if (arrayList.get(i) == target) {
                System.out.println(i + " is the index where " + target + " exists");
                found = true;
                break;
            } else
                i++;
        }
        if(!found)
        {
            System.out.println("Value not found");
        }
        scanner.close();
    }

    public static void main(String args[])
    {
        FirstOccur fo = new FirstOccur();
        fo.firstOne();
    }
}
