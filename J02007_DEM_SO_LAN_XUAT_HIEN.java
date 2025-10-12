package oop;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

public class J02007_DEM_SO_LAN_XUAT_HIEN {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int j = 1;j<=t;j++)
        {
            int n = sc.nextInt();
            LinkedHashMap<Integer,Integer> mp = new LinkedHashMap<>();
            for(int i = 0;i<n;i++)
            {
                int x = sc.nextInt();
                mp.merge(x, 1, Integer::sum);
            }
            System.out.println("Test " + j + ":");
            for(int i :mp.keySet())
            {
                System.out.println(i +" xuat hien "+ mp.get(i)+" lan");
            }
        }
    }

}
