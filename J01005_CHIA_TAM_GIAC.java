package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class CHIA_TAM_GIAC {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        double n = sc.nextDouble();
        double h = sc.nextDouble();
        
        for(int i = 1;i<n;i++)
        {
            double x = Math.sqrt(i/n) * h;
            System.out.printf("%.6f ", x);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int t =sc.nextInt();
        while(t-->0)
        {
            testCase();
        }
    }

}
