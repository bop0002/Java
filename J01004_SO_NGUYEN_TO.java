package oop;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class SO_NGUYEN_TO {

    public static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(long n) {
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }  

    public static void testCase() {
        long n = sc.nextLong();
        if(isPrime(n)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }

}
