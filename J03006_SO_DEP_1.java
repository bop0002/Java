package oop;

import java.util.Scanner;

public class J03006_SO_DEP_1 {

    public static Scanner sc = new Scanner(System.in);

    static boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if ((s.charAt(l) != s.charAt(r)) || (s.charAt(l) - '0') % 2 != 0) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}
