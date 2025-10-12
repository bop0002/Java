package oop;

import java.util.Scanner;

public class J01016_CHU_SO_4_VA_7 {

    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        int countFour = 0;
        int countSeven = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '4') {
                countFour++;
            }
            if (s.charAt(i) == '7') {
                countSeven++;
            }
        }
        
        return countFour+countSeven==7 ||countFour+countSeven==4;

    }

    public static void main(String[] args) {
        String s = sc.nextLine();
        if(check(s)==true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }

}
