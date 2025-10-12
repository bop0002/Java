

package oop;
import java.math.BigInteger;
import java.util.*;

class PhanSo
{
    private long tu;
    private long mau;
    
    public PhanSo(long tu,long mau)
    {
        long ucln = BigInteger.valueOf(tu).gcd(BigInteger.valueOf(mau)).longValue();
        this.tu = tu/ucln;
        this.mau = mau/ucln;
    }
    
    @Override 
    public String toString()
    {
        return tu + "/" + mau;
    }
    
}

public class J04003_PHAN_SO {
    
    public static Scanner sc = new Scanner(System.in);
    
   
    public static void main(String[] args) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(new PhanSo(a,b));
    }

}
