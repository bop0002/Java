package oop;

import java.util.Scanner;

public class J01022_XAU_NHI_PHAN {

    public static Scanner sc = new Scanner(System.in);

    public static long[] len = new long[94];

    public static void conCac() {
        len[1] = 1;
        len[2] = 1;
        for (int i = 3; i < 94; i++) {
            len[i] = len[i - 2] + len[i - 1];
        }
    }

    public static String Try(int n, long i) {
        if (n == 1) {
            return "0";
        } else if (n == 2) {
            return "1";
        }
        if (i > len[n - 2]) {
            return Try(n - 1, i-len[n-2]);
        } else {
            return Try(n - 2, i);
        }
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        conCac();
        while (t-- > 0) {
            int a = sc.nextInt();
            long b = sc.nextLong();
            System.out.println(Try(a, b));
        }

    }

}
