package oop;

import java.util.Scanner;

public class UOC_CHIA_HET_CHO_HAI {

    public static Scanner sc = new Scanner(System.in);
    

    public static void testCase() {
        long n = sc.nextLong();
        long cnt = 0;
        long can = (long) Math.sqrt((double) n);
        for(int i = 1;i<=can;i++)
        {
            if(n%i==0)
            {
                if((n/i)%2==0&&(n/i)!=i)
                {
                    cnt++;
                }
                if(i%2==0)
                {
                    cnt++;
                }
            }

        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }

}
