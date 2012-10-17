package chapter1Package;

public class Pen 
{

    static int issued = 0; //class members
    final static int FULL = 5000;
    int inkAmount; //the properties
    Colour inkColour;
    boolean capIsOn;

    Pen(Colour aColour) 
    {
        inkAmount = FULL;
        inkColour = aColour;
        capIsOn = true;
        issued = issued + 1;
    }

    Pen() 
    {
        inkAmount = FULL;
        inkColour = Colour.black;
        capIsOn = true;
        issued = issued + 1;
    }

    void removeCap() 
    {
        capIsOn = false;
    }

    void replaceCap() 
    {
        capIsOn = true;
    }

    void write(char aChar) 
    {
        if (inkAmount > 0) 
        {
            System.out.println(aChar); //print aChar on the console
            inkAmount = inkAmount - 1; //reduce the amount of ink
        }
    }

    void write(String aString) 
    {
        System.out.println(inkColour); //print the 'colour' on the console
        if (!capIsOn) //we can only write if cap is not on
        {
            for (int i = 0; i < aString.length(); i++) 
            {
                write(aString.charAt(i)); //write each char of aString in turn
            }
        }
    }

    boolean isEmpty() 
    {
        return inkAmount == 0;
    }

    int inkLeft() 
    {
        return inkAmount;
    }

    boolean isColour(Colour aColour) 
    {
        return inkColour.equals(aColour);
    }

    static void newLine() 
    {
        System.out.println("\n");
    }

    static void clearBoard() 
    {
        System.out.println("\n\nHit <Return> to clear board...");
        try 
        {
            System.in.read(); //reads CR
            System.in.read(); //reads LF
        } catch (java.io.IOException e) 
        {
            System.out.println("ERROR: Cannot access System.in ");
        }
        for (int i = 0; i < 20; i++) 
        {
            System.out.println();
        }
    }
}
