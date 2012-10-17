package chapter4Package;
import chapter3Package.Console;

public class Module
  {
    private String code;
    private String title;
    int level;
    int cwWeight;
    int exWeight;

    public Module()
        {
        code = "??????";
        title = "No Title";
        level = 0;
        cwWeight = 50;
        exWeight = 50;
        }

    public void print(String heading)
        {
        System.out.println(heading);
        System.out.println("code= " + code);
        System.out.println("title= " + title);
        System.out.println("level= " + level);
        System.out.println("cwWeight= " + cwWeight);
        System.out.println("exWeight= " + exWeight);
        }

    public Module(String aCode, String aTitle)
        {
        code = aCode;
        title = aTitle;
        level = 0;
        cwWeight = 50;
        exWeight = 50;
        }

    public void setCode(String aCode)
        {
        code = aCode;
        }

    public void setTitle(String aTitle)
        {
        title = aTitle;
        }

    public void setLevel(int aLevel)
        {
        level = aLevel;
        }

    public void setWeights(int aCwWeight, int aExWeight)
        {
        cwWeight = aCwWeight;
        exWeight = aExWeight;
        }

    public void setCwWeight(int aCwWeight)
        {
        cwWeight = aCwWeight;

        }

    public void setExWeight(int aExWeight)
        {
        exWeight = aExWeight;
        }

    public String getCode()
        {
        return code;
        }

    public String getTitle()
        {
        return title;
        }

    public int getLevel()
        {
        return level;
        }

    public int getcwWeight()
        {
        return cwWeight;
        }

    public int getexWeight()
        {
        return exWeight;
        }

    public void ask(String heading)
        {
        System.out.println(heading);
        setCode(Console.askString("Enter code= "));
        setTitle(Console.askString("Enter title= "));
        setLevel(Console.askInt("Enter level= "));
        setCwWeight(Console.askInt("Enter cwWeight= "));
        setExWeight(Console.askInt("Enter cwWeight= "));
        }
      
    @Override
    public String toString()
        {
        return code + " " + title + ". " + level + ", " + cwWeight + "%, " + exWeight + "% ";
        }
}

