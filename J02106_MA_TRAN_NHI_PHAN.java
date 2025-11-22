package oop;
import java.io.*;
import java.util.*;
public class J02106_MA_TRAN_NHI_PHAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n+1][4];
        for(int i =1;i<=n;i++)
        {
            for(int j = 1;j<=3;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int cnt = 0;
        for(int i =1;i<=n;i++)
        {
            int cnt1 = 0;
            int cnt0 = 0;
            for(int j = 1;j<=3;j++)
            {
                if(arr[i][j]==1)
                {
                    cnt1++;
                }
                else
                {
                    cnt0++;
                }
            }
            if(cnt1>cnt0)cnt++;
        }
        System.out.println(cnt);
        
    }
}
