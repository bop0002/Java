package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class HINH_CHU_NHAT {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static ArrayList<Integer> chuViDienTich(int l, int w) {
        ArrayList<Integer> res = new ArrayList<>();
  
        res.add((w + l) * 2);
        res.add(w * l);
        return res;
    }

    public static void testCase() {
        int l;int w;
        l = sc.nextInt();
        w = sc.nextInt();
        
        if(l<=0 || w <= 0)
        {
            System.out.print("0");
            return;
        }
        
        ArrayList<Integer> res = chuViDienTich(l,w);
        
        for(int it:res)
        {
            System.out.print(it + " ");
        }
        
    }

    public static void main(String[] args) {
        testCase();
    }

}
