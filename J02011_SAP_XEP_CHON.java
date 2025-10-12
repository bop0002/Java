package oop;

import java.util.Scanner;

public class J02011_SAP_XEP_CHON {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 1;
        for (int i = 0; i < n-1; i++) {
            int min = a[i];
            int indexJ = -1;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    indexJ = j;
                }

            }
            if (indexJ != -1) {
                int temp = a[indexJ];
                a[indexJ] = a[i];
                a[i] = temp;
            }
            System.out.printf("Buoc %d: ", cnt);
            for (int l = 0; l < n; l++) {
                System.out.print(a[l] + " ");
            }
            cnt++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        testCase();
    }

}
