package oop;

import java.util.Scanner;

public class J02014_DIEM_CAN_BANG {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }
        int rSum = total;
        int lSum = 0;
        int index = -1;
        for (int i = 1; i <+ n; i++) {
            lSum = lSum + a[i-1];
            rSum = total - lSum -a[i];
            if (lSum == rSum) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(index + 1);
        } else {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }

}
