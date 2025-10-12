

package oop;


import java.util.*;

public class J02022_SO_XA_CACH {
    
    public static Scanner sc = new Scanner(System.in);
    public static int check[] = new int[10];
    public static void Next(int n,String s)
    {
        int k = s.length();
        if(k == n)
        {
            System.out.println(s);
            return;
        }
        
        for(int i = 1;i<=n;i++)
        {
            if(k==0 || (check[i]== 0 && Math.abs(s.charAt(k-1) - '0'-i)!=1))
            {
                check[i] = 1;
                Next(n,s + Integer.toString(i));
                check[i] = 0;
            }
        }
        
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n = Integer.parseInt(sc.nextLine());
            Next(n,"");
            
        }
    }

}
