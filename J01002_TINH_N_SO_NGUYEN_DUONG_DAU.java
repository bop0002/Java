package oop;

import java.util.Scanner;

public class TINH_N_SO_NGUYEN_DUONG_DAU {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        long n = sc.nextInt();
        long res = n * (n+1) /2;
        System.out.println(res);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }

}
