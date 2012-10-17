package chapter3Package;

import java.util.Scanner;

public class Activity3 
{

    public static void main(String args[]) throws Exception 
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter First Name= ");
        String fName = console.nextLine();
        System.out.print("Enter Last Name= ");
        String lName = console.nextLine();
        System.out.println("Full Name= " + fName + " " + lName);
        Console.pause();
    }
}
