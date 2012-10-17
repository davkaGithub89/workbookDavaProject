package chapter3Package;
import java.io.IOException;
import java.util.Scanner;
public class Console 
{
    public static Scanner console = new Scanner(System.in);
    
    public static int askInt(String aPrompt)
    {
        int aNumber=1;
        boolean haveData = false;
        while (! haveData)
        {
            try 
            {
                System.out.print(aPrompt);
                String reply = console.nextLine();
                aNumber = Integer.parseInt(reply);
                haveData = true;
            }
            catch (NumberFormatException e) 
            {
                System.out.println("<Please Enter a Whole Number!!!>");
            }
        }
        return aNumber;
    }
    
    public static String askString(String aPrompt) 
    {
        System.out.print(aPrompt);
        String reply = console.nextLine();
        return reply;
    }
    
    
    public static char askOption(String aMenu) 
    {
        System.out.println(aMenu);
        String reply = askString("Enter option: ");
        if (reply.trim().length() == 0) 
        {
            return '\0';
        } 
        else 
        {
            return Character.toUpperCase(reply.trim().charAt(0));
        }
    }
    
    public static void pause() throws IOException 
    {
        System.out.println("Press <Return> to Terminate...");
        System.in.read();
    }
    
    
}