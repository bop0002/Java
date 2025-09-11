package oop;

import java.util.Scanner;

public class SO_LIEN_KE {

    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        int end = s.length();
        for (int i = 1; i < end; i++) {
            if(Math.abs((s.charAt(i)-'0')-(s.charAt(i-1)-'0'))!=1)
            {
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
            }
            else
            {
                System.out.println("NO"); 
            }
        }

    }

}
