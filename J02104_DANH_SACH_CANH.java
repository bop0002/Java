package oop;
import java.io.*;
import java.util.*;
public class J02104_DANH_SACH_CANH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n+1][n+1];
        for(int i =1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =1;i<=n;i++)
        {
            System.out.print("List("+i+") = ");
            for(int j = 1;j<=n;j++)
            {
                if(arr[i][j]==1)
                {
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }
    }
}
