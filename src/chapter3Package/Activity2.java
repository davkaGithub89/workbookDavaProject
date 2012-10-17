package chapter3Package;
//import java.util.Scanner;
public class Activity2 
{
    //    public static void main (String args[])
    //    {
    //        Scanner console=new Scanner(System.in);
    //        System.out.println("Enter a letter= ");
    //        String temp=console.nextLine();
    //        char key=(temp.trim().charAt(0));
    //        System.out.println((char)(key+1));
    //    }

    public static void main(String args[]) throws Exception 
    {
        System.out.print("Enter a letter= ");
        int key = System.in.read();
        System.out.println("Next Letter is= " + (char) (key + 1));
        Console.pause();
    }
}
