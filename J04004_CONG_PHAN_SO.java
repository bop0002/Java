

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
    
    public PhanSo Cong(PhanSo phanSo2)
    {
        long a = this.tu * phanSo2.mau;
        long b = phanSo2.tu * this.mau;
        long newMau = this.mau * phanSo2.mau;
        return new PhanSo(a+b,newMau);
    }
    
    @Override 
    public String toString()
    {
        return tu + "/" + mau;
    }
    
}

public class J04004_CONG_PHAN_SO {
    
    public static Scanner sc = new Scanner(System.in);
    
   
    public static void main(String[] args) {
        PhanSo phanSo1 = new PhanSo(sc.nextLong(),sc.nextLong());
        PhanSo phanSo2 = new PhanSo(sc.nextLong(),sc.nextLong());
        System.out.println(phanSo1.Cong(phanSo2));
    }

}
