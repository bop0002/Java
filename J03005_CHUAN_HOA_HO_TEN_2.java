
package oop.Java;
import java.io.*;
import java.util.*;
public class J03005_CHUAN_HOA_HO_TEN_2 {
    private static void chuanHoa(String name)
    {
        StringBuilder sb = new StringBuilder();
        String[] arr = name.trim().split("\\s+");
        for(int i = 1;i<arr.length;i++)
        {
            arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
        }
        String lastName = arr[0].toUpperCase();
        for(int i = 1;i<arr.length;i++)
        {
            sb.append(arr[i]);
            if(i!=arr.length-1) sb.append(" ");
        }
        System.out.println(sb.toString() +", "+ lastName);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String name = sc.nextLine();
            chuanHoa(name);
        }
        
    }
}
