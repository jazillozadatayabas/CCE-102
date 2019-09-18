package activity5;
import java.util.Scanner;
public class Activity5
{   
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        //number1
        int one,two,three,four,five,six,seven,eight,result;    
        
        System.out.println("\t\nAnswer each of the following questions with a number from 1 to 5 such that 1 means NEVER and 5 means ALWAYS ");
        System.out.print("1. I am competitive: ");
        one = in.nextInt();
        System.out.print("2. I am annoyed by people who are late for appointments: ");
        two = in.nextInt();
        System.out.print("3. I perform several tasks simultaneously: ");
        three = in.nextInt();
        System.out.print("4. I am ambitious: ");
        four = in.nextInt();
        System.out.print("5. I rush to get tasks completed: ");
        five = in.nextInt();
        System.out.print("6. I worry about the future: ");   
        six = in.nextInt();
        System.out.print("7. I am in a race with time: ");
        seven = in.nextInt();
        System.out.print("8. I speak very rapidly: ");
        eight = in.nextInt();
        
        result = one + two + three + four + five + six + seven + eight;
        
        if (result > 35 && result < 40)System.out.println("Score: " + result + " You are Type A");
        else if (result > 21 && result < 34)System.out.println("Score: " + result + " You are Between Type A and B, tending towards A");
        else if (result > 12 && result < 20)System.out.println("Score: " + result + " You are Between Type A and B, tending towards B");
        else if (result > 8 && result < 11)System.out.println("Score: " + result + " You are Type B");
        
        //number2
        int num1, num2, num3;
        System.out.print("\nEnter three numbers: ");
        
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        
        if (num1 > num2 && num1 > num3) System.out.print("Largest is " + num1);
        if (num2 > num1 && num2 > num3) System.out.print("Largest is " + two);
        if (num3 > num1 && num3 > num2) System.out.print("Largest is " + three);
          

    }    
}
