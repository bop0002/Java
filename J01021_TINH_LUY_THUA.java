package oop;

import java.util.Scanner;

public class J01021_TINH_LUY_THUA {

    public static Scanner sc = new Scanner(System.in);

    final static long MOD = 1_000_000_007L;

    public static long superPow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        long x = superPow(a,b/2)%MOD;
        if (b % 2 == 0) {
            return (x * x)%MOD;
        } else {
            return ((x * x)%MOD * a)%MOD;
        }
    }

    public static void main(String[] args) {

        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(superPow(a, b));

        }

    }

}
