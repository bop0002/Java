package oop;

import java.util.Scanner;

public class J03008_SO_DEP_3 {

    public static Scanner sc = new Scanner(System.in);
    
    public static final boolean[] prime = {false,false,true,true,false,true,false,true,false,false};
   
    static boolean revString(String s)
    {
        StringBuilder sb= new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    
    static boolean isPrime(String s) 
    {
        for(int i = 0;i<s.length();i++)
        {
            if(prime[s.charAt(i)-'0']==false)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (isPrime(s)&&revString(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}
