package oop;

import java.util.Scanner;

public class J03004_CHUAN_HOA_HO_TEN_1 {

    public static Scanner sc = new Scanner(System.in);

    public static String Convert(String s)
    {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        char c = sb.charAt(0);
        char C = Character.toUpperCase(c);
        sb.setCharAt(0,C);
        return sb.toString();
        
    }
    public static void testCase() {
        String s = sc.nextLine().trim();
        String[] arr = s.split("\\s+");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(Convert(arr[i])+" ");
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            testCase();
        }
    }

}
