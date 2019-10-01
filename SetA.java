package seta;
import java.util.Scanner;
public class SetA 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a five-digit integer: ");
        int number = in.nextInt();
        
        if(number > 9999 && number < 100000)
        {
            if((number/1000)%2==0 && (number/100)%3==0 && (number/10)%4==0 && (number%5==0))
                System.out.println(" is friendly");
            else
            System.out.println(" is not a friendly");
        }
        
        else
            System.out.println("not a five digit integer");
    }
        
    
}
