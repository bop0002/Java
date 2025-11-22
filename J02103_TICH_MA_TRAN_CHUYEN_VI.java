package oop;
import java.io.*;
import java.util.*;
public class J02103_TICH_MA_TRAN_CHUYEN_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while(t-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] mat = new int[n][m];
            int[][] matTrans = new int [m][n];
            for(int i = 0;i<n;i++)
            {
                for(int j = 0;j<m;j++)
                {
                    mat[i][j] = sc.nextInt();
                    matTrans[j][i] = mat[i][j];
                }
            }
            int[][] res = new int[n][n];
            for(int i = 0;i<n;i++)
            {
                for(int j =0;j<n;j++)
                {
                    for(int z = 0;z<m;z++)
                    {
                        res[i][j] += mat[i][z] * matTrans[z][j]; 
                    }
                }
            }
            System.out.println("Test "+cnt+":");
            for(int i = 0;i<n;i++)
            {
                for(int j = 0;j<n;j++)
                {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
            cnt++;
        }
        
    }
}
