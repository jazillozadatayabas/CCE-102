package Exercise3;
import java.util.Scanner;
public class Exercise3 
{   
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
         
        System.out.print("Enter time in seconds: ");
        long seconds = in.nextLong();
         
        //compute
        long hrs = seconds / 3600;
        long min = seconds % 3600 / 60;
        long sec = seconds % 60;
         
        //display
        System.out.println("Time is " + hrs + " hours " + min + " minutes " + sec + " seconds ");
    
        
        
        //declare
        double drivingDistance, mpGallon, ppGallon;
        
        System.out.print("Enter the driving distance: ");
        drivingDistance = in.nextDouble();
        System.out.print("Enter miles per gallon: ");
        mpGallon = in.nextDouble();
        System.out.print("Enter price per gallon: ");
        ppGallon = in.nextDouble();
        
        double cost = (drivingDistance / mpGallon)* ppGallon;
        
        System.out.printf("The cost of driving is %.2f ", cost);
    }
    
}
