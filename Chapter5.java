package chapter5;
import java.util.Scanner;
import java.util.Random;
public class Chapter5 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        //multiplication table
        for(int j=1 ; j<=10 ; j++){
            for(int k=1 ; k<=10 ; k++){
                System.out.print(k*j +"\t");
            }
            System.out.println("");
        }
        //lahi ni
        int i;
        for(i=0; i < 10; i++)
        {
            System.out.println("Welcome to Java!");
        }
        int input = in.nextInt();
        int sum=0;
        while(input!=0)
        {
            sum += input;
            input = in.nextInt();
        }
        System.out.println(sum);
        
        //lahi na pud ni
        int count = 0;
        int num1, num2,answer, score=0;
        
        while(count < 5)
        {
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(10);
            System.out.print("Question " + (count+1) + " : " + num1 + " + " + num2 + " = ");
            answer = in.nextInt();
            
            if(num1-num2==answer)score++;
            count++;
        }
        System.out.println("You're score is: " + score);
        
        //lahi na pud
        int count = 0;
        while( count < 100 )
        {
            System.out.println("Welcome to Java!");
            count++;
        } 
       
        //lahi na pud
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        
        System.out.print(num1 + " + " + num2 + " = ");
        int answer = in.nextInt();
        
        while(num1 + num2 != answer)
        {
            System.out.println("You are incorrect. Try again.");
            answer = in.nextInt();
        }
        
        System.out.println("You got the correct answer.\n(SANA ALL MAKAKUHA)");
        
        //lahi na pud
        int randomNumber = rand.nextInt(101);
        System.out.println("Guess the number: ");
        int guess = -1;
        
        while (randomNumber != guess)
        {
            System.out.println("Guess the number: ");
            guess = in.nextInt();
            
            if(guess > randomNumber) System.out.println("Too High");
            else if(guess == randomNumber) System.out.println("You got it right!");
            else System.out.println("Too Low");
        }
    }
    
}
