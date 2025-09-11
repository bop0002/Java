package oop;

import java.util.Scanner;

public class SO_KO_LIEN_KE {

    public static Scanner sc = new Scanner(System.in);
    
    public static boolean check1(String s)
    {
        long res = 0;
        for(int i = 0;i<s.length();i++)
        {
            res+=s.charAt(i)-'0';
        }
        return res%10==0;
    }
    
    public static boolean check2(String s) {
        int end = s.length();
        for (int i = 0; i < end; i++) {
            if (i != 0 && Math.abs((s.charAt(i) - '0') - (s.charAt(i - 1) - '0')) != 2) {
                return false;
            }
            if (i != end - 1 && Math.abs((s.charAt(i) - '0') - (s.charAt(i + 1) - '0')) != 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check1(s)&&check2(s)) {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO"); 
            }
        }

    }

}
