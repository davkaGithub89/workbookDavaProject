package chapter3Package;

public class Activity5 
{

    public static void main(String args[]) throws Exception 
    {
        String fName = Console.askString("What is your first name? ");
        while (! fName.equals("$$$")) 
        {
            String lName = Console.askString("What is your last name? ");
            System.out.println("Total characters= " + (fName.length() + lName.length()));
            fName = Console.askString("What is your first name? ");
        }
        Console.pause();
    }
}
