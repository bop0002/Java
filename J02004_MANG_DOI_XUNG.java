package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class J02004_MANG_DOI_XUNG {

    public static Scanner sc = new Scanner(System.in);
    
    public static boolean check(int a[])
    {
        int l = 0;
        int r = a.length-1;
        while(l<r)
        {
            if(a[l]!=a[r])
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public static void testCase() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (check(a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }

}
