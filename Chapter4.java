package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 
{
    public static void main(String[] args) 
    {
        // Create a Scanner
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double x2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y1 = in.nextDouble();
        double y2 = in.nextDouble();
        double y3 = in.nextDouble();
        
        double a = Math.sqrt((Math.pow(x2-x3,2))+ (Math.pow(y2-y3,2)));
        double b = Math.sqrt((Math.pow(x1-x3,2))+ (Math.pow(y1-y3,2)));
        double c = Math.sqrt((Math.pow(x1-x2,2))+ (Math.pow(y1-y2,2)));
        
        double A = Math.acos((a*a-b*b-c*c)/(-2*b*c));
        double B = Math.acos((b*b-a*a-c*c)/(-2*a*c));
        double C = Math.acos((c*c-a*a-b*b)/(-2*a*b));
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.println(Math.toDegrees(A));
        System.out.println(Math.toDegrees(B));
        System.out.println(Math.toDegrees(C));
    }
    
}
