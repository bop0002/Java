package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class TINH_SO_FIBO {
    
    public static Scanner sc = new Scanner(System.in);
    


    public static void testCase() {
        
        int n;n=sc.nextInt();
        if(n==0)
        {
            System.out.println("0");
            return;
        }
        long fibo1 = 0;
        long fibo2 = 1;
        for(int i = 2;i<=n;i++)
        {
            long temp = fibo2;
            fibo2 = fibo1+fibo2;
            fibo1=temp;
        }
        System.out.println(fibo2);
    }

    public static void main(String[] args) {
        int t;t=sc.nextInt();
        while(t-->0)
        {
            testCase();
        }
    }

}
