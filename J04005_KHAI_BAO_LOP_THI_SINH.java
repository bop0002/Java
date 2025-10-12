
package oop;

import java.util.Scanner;


class ThiSinh {
    
    private String name;
    private String date;
    private float s1;
    private float s2;
    private float s3;

    public ThiSinh(String name, String date, float s1, float s2, float s3) {
        this.name = name;
        this.date = date;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    
    public void Input()
    {

        public static Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.date = sc.nextLine();
        this.s1 = sc.nextFloat();
        this.s2 = sc.nextFloat();
        this.s3 = sc.nextFloat();
    }
    
    public void Output() {
        System.out.printf("%s,%s,%.1f",name,date,s1+s2+s3);
    }

    public class J04005_KHAI_BAO_LOP_THI_SINH {

        public static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            ThiSinh thiSinh = new ThiSinh();
            thiSinh.Input();
            thiSinh.Output();
        }
}
