package chapter3Package;

public class Activity4 
{

    public static void main(String args[]) throws Exception 
    {
        String fName = Console.askString("What is your first name? ");
        String lName = Console.askString("What is your last name? ");
        System.out.println("Full Name= " + fName + " " + lName);
        Console.pause();
    }
}
