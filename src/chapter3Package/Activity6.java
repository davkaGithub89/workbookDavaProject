package chapter3Package;

public class Activity6 
{

    public static void main(String args[]) 
    {
        int pence = Console.askInt("Enter the price= ");
        int quantity = Console.askInt("Enter the quantity= ");
        System.out.println("Total= " + (pence * quantity) + " pence");
    }
}
