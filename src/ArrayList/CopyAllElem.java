package ArrayList;

import java.util.*;

public class CopyAllElem {

    ArrayList<Integer> array1 = new ArrayList<>();

    ArrayList<Integer> array2 = new ArrayList<>();

    public CopyAllElem() {
        array1.add(20);
        array1.add(30);
        array1.add(200);
        array1.add(300);
        array2.add(500);
        System.out.println(array1);
        System.out.println("----This is array1------");
        System.out.println(array2+"----------This is array2 ------");
        for (int value : array1) {
            array2.add(value);
        }
        System.out.println("This is array2 after copy----"+ array2);
    }

    public static void main(String args[])
    {
        new CopyAllElem();
    }
}
