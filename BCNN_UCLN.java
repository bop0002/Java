package oop;

import java.util.Scanner;

public class BCNN_UCLN {

    public static Scanner sc = new Scanner(System.in);
    
    public static long gcd(long a,long b)
    {
        while(b!=0)
        {
            long temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static long lcm(long a,long b)
    {
        return a*b/gcd(a,b);
    }
    public static void testCase() {
        long a = sc.nextLong();
        long b= sc.nextLong();
        long ucnn = gcd(a,b);
        long bcnn = lcm(a,b);
        System.out.println(bcnn+" "+ucnn);
        
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }

}
