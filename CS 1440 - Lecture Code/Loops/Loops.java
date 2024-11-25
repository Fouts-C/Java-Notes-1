import java.util.Scanner;

public class Loops{

    public static void main(String[] args){

        //While loop - pretest loop
        int x = 0;
        while (x < 5){
            System.out.println("While loop: " + x);
            x += 1;
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yes or no: ");
        String input = scan.nextLine();


        int total = 0;

        while(!input.equals("yes") && !input.equals("no")){
            
            System.out.println("bad input");
            System.out.println("Enter yes or no: ");
            String input = scan.nextLine();

            //break key word take you out of the loop
            if (input.equals("stop")){
                break;
            }

            System.out.println(total);

            //continue key word stops current iteration of loop and starts a new one
            if (input.equals("go")){
                continue;
            }
            total += 1;
        }

        //do-while - posttest loop
        do{
            System.out.println("do-while loop: " + x);
            x += 1;
        }
        while (x < 5);

        //for loop - pretest loop
        for(int i = 0; i < 5; i++){
            System.out.println("for loop: " + i);
        }

        //increment ++
        int y = 10;
        System.out.println(y++); //10 y printed before incremented
        //decrement --
        System.out.println(y--); //11 y printed before decremented 
        System.out.println(y); //10 y is decremented from previous case

        //Increment can also go in front of the variable to do operation before printing
        int z = 0;
        System.out.println(++z);
        //decrement --
        System.out.println(--z); 
        System.out.println(z);

        sellLemonade(10);

    }

    public static void sellLemonade(int numGlasses){
        for(int i = 0; i < numGlasses; i++){
            System.out.println("Selling lemonade...");

        }

    }
}