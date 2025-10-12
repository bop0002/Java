package oop;

import java.util.Scanner;

public class J03025_XAU_DOI_XUNG {

    public static Scanner sc = new Scanner(System.in);


    static boolean check(String s)
    {
        int l = 0;
        int r = s.length()-1;
        int change = 0;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                change++;
            }
            l++;
            r--;
        }
        int len = s.length();
        if(change>1) return false;
        if(change == 0 && len%2==0 ) return false;
        else return true;
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if(check(s))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

    }

}
