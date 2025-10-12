package oop;

import java.util.Scanner;
import java.util.Stack;
import java.math.BigInteger;

public class J02008_BCNN_N_SO_NGUYEN_DAU_TIEN {

    public static Scanner sc = new Scanner(System.in);

    public static long bGCD(long a, long b)
    {
        BigInteger aB = BigInteger.valueOf(a);
        BigInteger bB = BigInteger.valueOf(b);
        BigInteger bgcd = aB.gcd(bB);
        return bgcd.longValue();
    }

    public static void testCase() {
        long n = sc.nextLong();
        long s =1;
        for (long i = 1L; i <= n; i++) {
            s = s*i/bGCD(s,i);
            
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            testCase();
        }
    }

}
