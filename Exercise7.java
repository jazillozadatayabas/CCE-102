package exercise7;
import java.util.Scanner;
public class Exercise7 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        //number1
        int a,b,number,sum=0;

        System.out.println("Enter a three-digit integer: ");
        number = in.nextInt();
        
       int first = number/100;
       int last = number%10;
       
        if (first == last)    System.out.print(" is a palindrome");
        else    System.out.print(" is not a palindrome");
    
        //number2
 
        System.out.println("Enter today's day:");
        int today = in.nextInt();

        System.out.println("Enter the number of days elapsed since today:");
        int elapsedDay = in.nextInt();

        int futureDay = (today + elapsedDay) % 7;

        switch (today) {
        case 0:
            System.out.print("Today is Sunday and");
            break;
        case 1:
            System.out.print("Today is Monday and");
            break;
        case 2:
            System.out.print("Today is Tuesday and");
            break;
        case 3:
            System.out.print("Today is Wednesday and");
            break;
        case 4:
            System.out.print("Today is Thursday and");
            break;
        case 5:
            System.out.print("Today is Friday and");
            break;
        case 6:
            System.out.print("Today is Saturday and");
            break;

    }

    switch (futureDay) {
        case 0:
            System.out.print(" the future day is Sunday.");
            break;
        case 1:
            System.out.print(" the future day is Monday.");
            break;
        case 2:
            System.out.print(" the future day is Tuesday.");
            break;
        case 3:
            System.out.print(" the future day is Wednesday.");
            break;
        case 4:
            System.out.print(" the future day is Thursday.");
            break;
        case 5:
            System.out.print(" the future day is Friday.");
            break;
        case 6:
            System.out.print(" the future day is Saturday.");
            break;

    }      
    }
    
}
