

package oop;

import java.util.*;

class Rectange 
{
    private double width;
    private double height;
    private String color;
    public Rectange()
    {
        this.width = 1;
        this.height = 1;
    }
    public Rectange(double width,double height,String color)
    {
        this.width = width;
        this.height = height;
        this.color = convertString(color);
        
    }
    private String convertString(String s)
    {
        StringBuilder sb = new StringBuilder();
        s = s.trim().toLowerCase();
        sb.append(Character.toUpperCase(s.charAt(0)));
        sb.append(s.substring(1));
        return sb.toString();
        
        
    }
    
    private boolean Check()
    {
        int Width = (int)this.width;
        int Height = (int)this.height;
        if(Width!=width || height!=Height  || width<=0 || height<=0)
        {
            return false;
        }
        return true;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return this.color;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }
    public double findArea()
    {
        return this.width*this.height;
    }
    public double findPerimeter()
    {
        return (width+height)*2;
    }
    @Override
    public String toString()
    {
        if(Check()==false) return "INVALID";
        return String.format("%d %d %s",(int)findPerimeter(),(int)findArea(),this.color);
    }

}

public class J04002_HINH_CHU_NHAT {
    
    public static Scanner sc = new Scanner(System.in);
    
   
    public static void main(String[] args) {
        Rectange rec = new Rectange(sc.nextInt(),sc.nextInt(),sc.next());
        System.out.println(rec);
    }

}
