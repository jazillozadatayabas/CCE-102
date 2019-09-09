package jazilnum2;
import java.util.Scanner;
public class JazilNum2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int pizza,toppings;
        System.out.print("Enter the Number of Pizza: ");
        pizza = input.nextInt();
        System.out.print("Enter the Total Number of Toppings: ");
        toppings = input.nextInt();
        
        double pizzaOne= pizza * 12;
        double toppingsTwo= toppings * 1.50;
        double result= pizzaOne + toppingsTwo;
        double result1= result * 0.05;
        double result2= pizzaOne + toppingsTwo + result1;
        
        //display
        System.out.println("Receipt: Number of Pizza: " + pizza);
        System.out.println("Number of Toppings: "+ toppings);
        System.out.println("Cost (incl tax): " + result2);
    }
    
}
