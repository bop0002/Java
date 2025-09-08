package oop;

import java.util.Scanner;

public class UOC_SO_NGUYEN_TO_LON_NHAT {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long end = n;
            long res = 0;
            for (long i = 2; i * i <= end; i++) {
                if (n % i == 0) {
                    res = i;
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
            if (n >1) {
                System.out.println(n);
            } else {
                System.out.println(res);
            }
        }

    }

}
