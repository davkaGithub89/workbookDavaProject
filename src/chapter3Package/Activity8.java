package chapter3Package;

public class Activity8 
{

    public static void main(String args[]) throws Exception 
    {

        int pence = Console.askInt("Enter the price= ");
        int gTotal = 0;
        while (pence != 0) 
        {
            int quantity = Console.askInt("Enter the quantity= ");
            gTotal = gTotal + (pence * quantity);
            System.out.println("Total= " + (pence * quantity) + " pence");
            pence = Console.askInt("\nEnter the price= ");
        }
        System.out.println("\nGrand Total= " + gTotal);
        Console.pause();
    }
}
