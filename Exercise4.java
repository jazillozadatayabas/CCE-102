package Exercise4; 
import java.util.Scanner;
import java.util.Random;
public class Exercise4
{
    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        if ((num%5) == 0)System.out.println("HIFIVE!");
        if ((num%2) == 0) System.out.println("HIEVEN!");
        
        //declare
        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
       
        int number1 =(int) (Math.random()* 10);
        int number2 =(int) (Math.random()* 10);
        System.out.println("What is " + num1 + " + " + num2 + "?");
        System.out.println("Result is ");
        int result = in.nextInt();
       
        int sum = num1 + num2;
       
        System.out.println((result == sum));
        if(result == sum)
        {
            System.out.println("Correct!");
        }
         else
        {
            System.out.println("You're Answer is Wrong!");
        }

    }    
}
