import java.util.Scanner;

public class DataPointDriver {

    public static void main(String[] args){
        //get data from user
        //ask user if they want to enter more data
        //if 'y', continue
        
        Scanner scan = new Scanner(System.in);
        String input = "";

        do{
            DataPoint d = DataPoint.createDataPoint();
            System.out.println(d.toString()); //don't need .toString... will automatically print to a String

            System.out.print("Continue? ");
            input = scan.nextLine();
        }
        while(input.equals("y"));


    }
    
}
