package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class J02013_SAP_XEP_NOI_BOT {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean ok = true;
        int cnt = 1;
        while (ok) {
            ok = false;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    ok = true;
                }
            }
            if (ok) {
                System.out.printf("Buoc %d: ", cnt);
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
            cnt++;
        }
    }

    public static void main(String[] args) {
        testCase();
    }

}
