// import java.util.Scanner; //explicit import
import java.util.*; //Implicit import    * = wildcard

//import hello.world; Can import our own packages if created.

public class Driver 
{
    public static void main(String[] args)
    {
        Circle c = new Circle; // radius field will be set to 0 with java default constructor
        c.setRadius(5);
        System.out.println("c radius " + c.getRadius());

        String s = "hello";
        ArrayList<String> al = new ArrayList();

        //If Statements 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter purchase amount");
        double total = scan.nextDouble();

        if (total > 50)
        {
            total *= .9;
            System.out.println("Discount applied");
        }
        System.out.println(total);

        // relational operators
        // >, <, >=, <=, ==, !=

        //Flags 
        boolean flag = false;
        int greatScore = scan.nextInt();
        scan.nextLine(); //Helps with scanning correct line

        if (score > 95)
        {
            greatScore = true;
        }

        if (greatScore)
        {
            System.out.println("Great Score!");
        }

        //lots of other things
        int highScore = 98;
        
        if (greatScore)
        {
            if(score > highScore)
            {
                highScore = score;
                System.out.println("New high score!");
            }
        }

        char lowerA = 'a';
        char upperA = 'A';
        char upperB = 'B';

        //gets first character of input
        char input = scan.nextLine().charAt(0);

        if (input == lowerA)
        {
            System.out.println("input is a");
        }

        if (lowerA > upperA)
        {
            System.out.println("a is greater than A");
        }
    }
}
