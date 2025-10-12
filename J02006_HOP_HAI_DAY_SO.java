package oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

public class J02006_HOP_HAI_DAY_SO {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1001];
        int[] b = new int[1001];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[x] = 1;
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            b[x] = 1;
        }
        for(int i = 1;i<=1000;i++)
        {
            if(a[i]==1||b[i]==1)
            {
                System.out.print(i+" ");
            }
        }
    }

}
