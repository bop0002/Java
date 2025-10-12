package oop;

import java.lang.Math.*;
import java.util.Scanner;

public class J03032_DAO_TU {

    public static Scanner sc = new Scanner(System.in);

    public static class Point {

        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void testCase() {
        String s = sc.nextLine();
        String[] parts = s.split(" ");
        for(String part :parts)
        {
            StringBuilder sb = new StringBuilder(part);
            sb.reverse();
            System.out.print(sb.toString()+" ");
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
