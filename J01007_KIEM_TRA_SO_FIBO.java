package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class KIEM_TRA_SO_FIBO {

    public static Scanner sc = new Scanner(System.in);
    
    public static boolean isFibo(long n)
    {
        if(n==0) return true;
        long a = 0;
        long b = 1;
        while(b<n)
        {
            if(b==n)
            {
                return true;
            }
            long temp = b;
            b = a + b;
            a = temp;
        }
        return b == n;
    }
    
    public static void testCase() {
        long n = sc.nextLong();
        if(isFibo(n))
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
