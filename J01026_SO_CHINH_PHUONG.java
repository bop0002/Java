package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class J01026_SO_CHINH_PHUONG {

    public static Scanner sc = new Scanner(System.in);
    
    public static boolean check(long n)
    {
        long nSqrt = (long)Math.sqrt(n);
        return n == nSqrt*nSqrt;
    }
    
    public static void testCase() {
        long n = sc.nextLong();
        if(check(n))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int t =sc.nextInt();
        while(t-->0)
        {
            testCase();
        }
    }

}
