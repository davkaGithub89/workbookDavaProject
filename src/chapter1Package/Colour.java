package chapter1Package;

public class Colour 
{

    private int value;

    private Colour(int aValue) 
    {
        value = aValue;
    }

    public String toString() 
    {
        String strColour = null;
        switch (value) 
        {
            case 0:
                strColour = "BLACK: ";
                break;

            case 1:
                strColour = "RED: ";
                break;

            case 2:
                strColour = "GREEN: ";
                break;

            case 4:
                strColour = "BLUE: ";
                break;

            case 7:
                strColour = "WHITE: ";
                break;
        }
        return strColour;
    }

    public boolean equals(Colour aColour) 
    {
        return value == aColour.value;
    }
    public static final Colour black = new Colour(0);
    public static final Colour red = new Colour(1);
    public static final Colour green = new Colour(2);
    public static final Colour blue = new Colour(4);
    public static final Colour white = new Colour(7);
}