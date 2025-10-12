package oop;

import java.util.Scanner;

public class J03007_SO_DEP_2 {

    public static Scanner sc = new Scanner(System.in);

    static boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;
        if(s.charAt(l)!='8' || s.charAt(r)!='8') return false;
        long res = 0;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            res += (s.charAt(l)-'0')*2;
            l++;
            r--;
        }
        if(s.length()%2!=0) res+= (s.charAt((s.length()/2))-'0');
//        System.out.println(res);
//        System.out.println(s.length());
        return res % 10 ==0;
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
