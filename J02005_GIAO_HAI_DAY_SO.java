package oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

public class J02005_GIAO_HAI_DAY_SO {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.add(x);
        }
        TreeSet<Integer> b = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            b.add(x);
        }
        a.retainAll(b);
        for(int i :a)
        {
            System.out.print(i+" ");
        }
    }

}
