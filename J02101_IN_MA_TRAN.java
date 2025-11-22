package oop;
import java.io.*;
import java.util.*;
public class J02101_IN_MA_TRAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[][] mat = new int [n][n];
            for(int i =0;i<n;i++)
            {
                for(int j = 0;j<n;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }
            boolean reversed = false;
            for(int i =0;i<n;i++)
            {
                if(reversed == true)
                {
                    for(int j = n-1;j>=0;j--)
                    {
                        System.out.print(mat[i][j] + " ");
                    }
                    reversed = false;
                }
                else
                {
                    for(int j = 0;j<n;j++)
                    {
                        System.out.print(mat[i][j] + " ");
                    }
                    reversed = true;
                }
            }
            System.out.println();
        }
        
    }
}
