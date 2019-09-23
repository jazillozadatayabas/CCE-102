package exercise6;
import java.util.Scanner;
import java.util.Random;
public class Exercise6 
{
    public static void main(String[] args) 
    {
        //number1
        Scanner in = new Scanner(System.in);
        long phoneNumber, remainder;
        long firstPart, secondPart, thirdPart;
        
        System.out.println("Enter a 10-digit numbers: ");
        System.out.print("Input: ");
        phoneNumber = in.nextLong();
        firstPart = phoneNumber/10000000;
        remainder = phoneNumber%10000000;
        secondPart = remainder/10000;
        thirdPart = remainder%10000;
        
        if(firstPart == 800 || firstPart == 888 || firstPart == 877 || firstPart == 866)
        {
            System.out.println(firstPart + "-" + secondPart + "-" + thirdPart + " is a toll-free number.");
        }
        else
        {
            System.out.println(firstPart + "-" + secondPart + "-" + thirdPart + " is not a toll-free number.");
        }
        
        //number2
        Random random = new Random();
        
        int computer= random.nextInt(3);
        
        System.out.println("Rock: 0; Scissors: 1; Paper: 2");
        System.out.print("Choose: ");
        int player = in.nextInt();
        System.out.println("The computer chooses " + computer);
        System.out.println("*******************************");
        
        if (player==0)
        {
            System.out.println("Player: Rock");
        }
        if (computer==0)
        {
            System.out.println("Computer: Rock");
        }
        if (player==1)
        {
            System.out.println("Player: Scissors");
        }
        if (computer==1)
        {
            System.out.println("Computer: Scissors");
        }
        if (player==2)
        {
            System.out.println("Player: Paper");
        }
        if (computer==2)
        {
            System.out.println("Computer: Rock");
        }
        
        //anotherstatement
        else if (player == 0 && computer == 0)
        {
            System.out.println("It's a tie.");
        }
        else if (player == 1 && computer == 1)
        {
            System.out.println("It's a tie.");
        }
        else if (player == 2 && computer == 2)
        {
            System.out.println("It's a tie.");
        }
        
        else if (player == 0 && computer == 1)
        {
            System.out.println("Player wins.");
        }
        else if(player == 1 && computer == 0)
        {
            System.out.println("Computer wins.");
        }
        else if(player == 1 && computer == 2)
        {
            System.out.println("Player wins.");
        }
        else if(player == 2 && computer == 1)
        {
            System.out.println("Computer wins.");
        }
        else if(player == 2 && computer == 0)
        {
            System.out.println("Player wins.");
        }
        else if(player == 0 && computer == 2)
        {
            System.out.println("Computer wins.");
        }
    }
    
}
