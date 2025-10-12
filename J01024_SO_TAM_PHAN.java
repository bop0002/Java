package oop;

import java.util.Scanner;

public class J01024_SO_TAM_PHAN {

    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '0') {
                return false;
            }
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
