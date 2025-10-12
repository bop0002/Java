package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class J02012_SAP_XEP_CHEN {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(a[0]);
        for (int i = 1; i < n; i++) {
            int index = arr.size();
            System.out.printf("Buoc %d: ", i - 1);
            for (int it : arr) {
                System.out.print(it + " ");
            }
            System.out.println();
            for (int j = 0; j < arr.size(); j++) {
                if (a[i] < arr.get(j)) {
                    index = j;
                    break;
                }
            }
            arr.add(index,a[i]);
        }
        System.out.printf("Buoc %d: ", n-1);
        for (int it : arr) {
            System.out.print(it + " ");
        }
    }

    public static void main(String[] args) {
        testCase();
    }

}
