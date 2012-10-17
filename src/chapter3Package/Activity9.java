package chapter3Package;

import java.io.IOException;

public class Activity9 
{

    public static void main(String args[]) throws IOException 
    {
        int gTotal = 0;
        
        int pence = Console.askInt("Enter the price= ");
        
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

