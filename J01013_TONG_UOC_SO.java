package oop;

import java.util.Scanner;

public class TONG_UOC_SO {

    public static Scanner sc = new Scanner(System.in);
    static int a[] = new int[2000001];
    
    public static void Sieve()
    {
        for(int i = 2 ;i*i<2000001;i++)
        {
            if(a[i]==0)
            {
                for(int j = i*i;j<2000001;j+=i)
                {
                    a[j] = i;
                }
            }
        }
        for(int i = 2;i<2000001;i++)
        {
            if(a[i]==0)
            {
                a[i] = i;
            }
        }
        
    }



    public static void main(String[] args) {
        int t = sc.nextInt();
        long res = 0;
        Sieve();
        while(t-->0)
        {
            int n = sc.nextInt();
            while(n>1)
            {
                res+=a[n];
                n/=a[n];
            }
        }
        System.out.println(res);
    }

}
