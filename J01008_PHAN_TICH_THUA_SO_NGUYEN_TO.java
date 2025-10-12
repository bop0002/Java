package oop;

import java.util.Scanner;

public class J01008_PHAN_TICH_THUA_SO_NGUYEN_TO {

    public static Scanner sc = new Scanner(System.in);
    public static int count = 0;

    public static boolean isPrime(long n) {
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void testCase() {
        long n = sc.nextLong();
        System.out.print("Test " + count + ": ");
        for (long i = 2; i <=Math.sqrt(n); i++) {
            int cnt = 0;
            if (isPrime(i)) {
                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
            }
            if (cnt > 0) {
                System.out.print(i + "(" + cnt + ") ");
            }
        }
        if (n > 1) {
            System.out.printf("%d(1)", n);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            count++;
            testCase();
        }
    }

}
