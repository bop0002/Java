package oop;

import java.util.Scanner;

public class J02020_LIET_KE_TO_HOP_1 {

    public static Scanner sc = new Scanner(System.in);

    public static int[] a = new int[11];
    public static int n;
    public static int k;
    public static boolean Next()
    {
        int i = k;
        while(a[i]==n-k+i)i--;
        if(i!=0){
            a[i]++;
            for (int j = i+1; j <=k ; j++) {
                a[j] = a[j-1]+1;
                
            }
            return true; 
        }
        
        return false;
    }
    
    public static void testCase() {
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }
        int cnt =0;
        do {
            for (int i = 1; i <= k; i++) {
                System.out.print(a[i] + " ");
            }
            cnt++;
            System.out.println();
        } 
        while(Next());
        System.out.println("Tong cong co "+cnt+" to hop");
    }

    public static void main(String[] args) {
        testCase();
    }

}
