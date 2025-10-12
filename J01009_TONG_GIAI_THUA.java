package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class J01009_TONG_GIAI_THUA {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        long n = sc.nextLong();
        long tmp = 1;
        long res = 0;
        for(int i = 1;i<=n;i++)
        {
            tmp = tmp*i;
            res+=tmp;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        testCase();

    }

}
