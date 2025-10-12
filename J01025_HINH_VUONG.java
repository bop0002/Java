package oop;

import java.util.Scanner;

public class J01025_HINH_VUONG {

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
        Point a = new Point(sc.nextInt(), sc.nextInt());
        Point b = new Point(sc.nextInt(), sc.nextInt());
        Point c = new Point(sc.nextInt(), sc.nextInt());
        Point d = new Point(sc.nextInt(), sc.nextInt());
        int minX = Math.min(Math.min(a.x, b.x),Math.min(c.x,d.x));
        int maxX = Math.max(Math.max(a.x, b.x),Math.max(c.x,d.x));
        int minY = Math.min(Math.min(a.y, b.y),Math.min(c.y,d.y));
        int maxY = Math.max(Math.max(a.y, b.y),Math.max(c.y,d.y));
        int edge = Math.max(maxX-minX,maxY-minY);
        System.out.println(edge*edge);
    }

    public static void main(String[] args) {
        testCase();
    }

}
