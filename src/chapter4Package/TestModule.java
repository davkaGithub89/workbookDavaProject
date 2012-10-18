package chapter4Package;

public class TestModule
  {
    public static void main(String args[])
        {
//        Module module = new Module();
//        module.print("This is Activity 4.1");

        Module module2 = new Module("1111", "Computer Science");
//        module2.print("\nThis is Activity 4.2");

        module2.setCode("2222");
        module2.setTitle("Intro to IT");
        module2.setLevel(4);
        module2.setWeights(60, 40);
        module2.print("\nThis is Activity 4.3");

//        System.out.println("\nThis is Activity 4.4");
//        module2.setCode("4444");
//        module2.setTitle("Programming");
//        module2.setLevel(6);
//        module2.setWeights(30, 70);
//        System.out.println("Code= " + module2.getCode());
//        System.out.println("Title= " + module2.getTitle());
//        System.out.println("Level= " + module2.getLevel());
//        System.out.println("cwWeight= " + module2.getcwWeight());
//        System.out.println("exWeight= " + module2.getexWeight());
//    
//        module2.ask("\nThis is Activity 4.5");
//        module2.print("\nThis is Activity 4.5 Print Results");
//        
        Module module3 = new Module();
        module3.setCode("3333");
        module3.setTitle("Information Technology");
        module3.setLevel(5);
        module3.setWeights(10, 90);

        System.out.println("\nThis is Activity 4.6");
        System.out.println("module2 is: " + module2.toString());
        System.out.println("module3 is: " + module3);
        }
  }