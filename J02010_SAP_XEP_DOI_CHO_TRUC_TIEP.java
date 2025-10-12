package oop;

import java.util.Scanner;

public class J02010_SAP_XEP_DOI_CHO_TRUC_TIEP {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for(int j = i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.printf("Buoc %d: ", i+1);
            for(int l=0;l<n;l++)
            {
                System.out.print(a[l]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        testCase();
    }

}
