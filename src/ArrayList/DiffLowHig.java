package ArrayList;

import java.util.*;

public class DiffLowHig {

    ArrayList <Integer> arrayList = new ArrayList<>();
    public static final String ANSI_GREEN = "\u001B[31m";
    public DiffLowHig() {
        arrayList.add(10);
        arrayList.add(2240);
        arrayList.add(390);
        arrayList.add(400);
        arrayList.add(553460);
        arrayList.add(1034);
        arrayList.add(10334);
        arrayList.add(102);
        System.out.println(ANSI_GREEN + arrayList);
    }

    public static void main(String args[])
    {
        new DiffLowHig();
    }
}
