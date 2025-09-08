package oop;

import java.util.Scanner;

public class CAT_DOI {

    public static Scanner sc = new Scanner(System.in);
    
    public static String convert(String s)
    {
        String res = "";
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            switch(c){
                case '1':
                    res+='1';
                    continue;
                case '0':
                    res+='0';
                    continue;
                case '8':
                    res+='0';
                    continue;
                case '9':
                    res+='0';
                    continue;
                default:
                    return "";
                    
            }
        }
        return res;
    }
    
    public static void testCase() {
        
        String input = sc.nextLine();
        if(!convert(input).equals(""))
        {
            if((Long.parseLong(convert(input)))==0)
            {
                System.out.println("INVALID");
            }
            else
            {
                System.out.println(Long.parseLong(convert(input)));
            }
        }
        else
        {
            System.out.println("INVALID");
        }
        
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            testCase();
        }
    }

}
