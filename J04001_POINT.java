

package oop;

import java.util.*;

class Point
{
    private double x;
    private double y;
    
    public Point(){}
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public Point(Point point)
    {
        this.x = point.x;
        this.y = point.y;
    }
    
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public double distance(Point secondPoint)
    {
        return Math.sqrt( ((secondPoint.x-this.x) * (secondPoint.x-this.x)) +((secondPoint.y-this.y) * (secondPoint.y-this.y)));
    }
    @Override
    public String toString()
    {
        return String.format("%.4f,%.4f",x,y);
    }
}

public class J04001_POINT {
    
    public static Scanner sc = new Scanner(System.in);
    
   
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0)
        {
            Point point1 = new Point(sc.nextDouble(),sc.nextDouble());
            Point point2 = new Point(sc.nextDouble(),sc.nextDouble());
            
            System.out.printf("%.4f",point1.distance(point2));
            System.out.println();
            
        }
    }

}
