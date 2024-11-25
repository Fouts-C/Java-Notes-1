import java.util.Scanner;

public class Switches{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();

        /* Long way to write switch statement
        if (month.equals("September")){
            System.out.println("September is in fall");
        
        }else if (month.equals("October")){
            System.out.println("October is in fall");
        
        } else if (month.equals("November")){
            System.out.println("November is in fall");
        } */

        //Switch Statements
        switch(month)
        {
            case "September":
                System.out.println("September is in fall");
                break;
            
            case "October":
                System.out.println("October is in fall");
                break; //Without break, waterfall will occur (Seen in next example)

            case "November":
                System.out.println("November is in fall");
                break;
            
            //If none of the cases are met
            default:
                System.out.println(month + "isn't in fall");
        }

        //Switch Statements Waterfall (missing break statements)
        switch(month)
        {
            case "September":
            case "October":
            case "November":
                System.out.println(month + " is in fall");
                break;
            
            //If none of the cases are met
            default:
                System.out.println(month + "isn't in fall");
        }

    }
}