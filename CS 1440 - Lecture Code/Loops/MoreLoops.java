import java.util.Random;
import java.util.Scanner;

public class MoreLoops{

    public static void main(String[] args){

        //Sum of Squares: 1*1 + 2*2 + 3*3
        int sum = 0;     //accumulator

        for (int i = 1; i <= 10; i++ ){
            sum = i * i;
        }
        System.out.println("Sum " + sum);

        //generate 100 random numbers & keep track of evens
        Random r = new Random();
        int even = 0;
        for (int i = 0; i < 100; i++){
            int x = r.nextInt();
            if (x % 2 == 0){
                even++;
            }
        }
        System.out.println("Evens " + even);


        //Sentinel Values - denote end of data
        Scanner scan = new Scanner(System.in);
        int grade = 0;
        double total = 0;
        int count = -1;
        while (grade != -1){
            total += grade;
            count++;
            System.out.println("Enter grade: ");
            grade = scan.nextInt();
        }
        System.out.println("Avg Grade: " + total/count);


        //Nested loops - Clock example
        for (int hours = 0; hours < 24; hours++){
            for (int min = 0; min < 60; min++){
                for (int sec = 0; sec < 60; sec++){
                    System.out.printf("%02d:%02d:%02d\n", hours, min, sec);
                }
            }
        }

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 5; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}