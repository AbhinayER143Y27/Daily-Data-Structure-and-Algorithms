package Patterns.PrefixSum;

// This is there to see what and how the prefix and the suffix sum works nothing less and nothing more.

import java.util.Scanner;

public class PrefixSumCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = arr[0];
        suffix[n - 1] = arr[n - 1];
       for(int i = 1; i < arr.length; i++)
       {
           prefix[i] = arr[i] + prefix[i - 1];
       }
       //suffix
        for(int i = arr.length - 2; i >= 0; i--)
        {
            suffix[i] = arr[i] + suffix[i + 1];
        }



        System.out.println("Prefix Sum:");
        for (int x : prefix) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Suffix Sum:");
        for (int x : suffix) {
            System.out.print(x + " ");
        }
        System.out.println();

        sc.close();
    }
}
