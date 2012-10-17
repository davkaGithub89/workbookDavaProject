package chapter3Package;

public class Activity7 
{

    public static void main(String args[]) throws Exception 
    {

        int pence = Console.askInt("Enter the price= ");
        while (pence != 0) 
        {
            int quantity = Console.askInt("Enter the quantity= ");
            System.out.println("Total= " + (pence * quantity) + " pence");
            pence = Console.askInt("Enter the price= ");
        }
        Console.pause();
    }
}
