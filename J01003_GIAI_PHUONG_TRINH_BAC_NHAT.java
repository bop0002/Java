package oop;

import java.util.Scanner;

public class GIAI_PHUONG_TRINH_BAC_NHAT {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        float a = sc.nextLong();
        float b = sc.nextLong();

        if (b == 0) {
            System.out.println("VSN");
            return;
        }
        if (a == 0) {
            System.out.println("VN");
            return;
        }
        System.out.println(String.format("%.2f", -b / a));

    }

    public static void main(String[] args) {
        testCase();
    }

}
