import java.util.Scanner;

public class DataPoint {
    
    private static int numDataPoints = 0;

    private String date;
    private int low;
    private int high;


    public DataPoint(String d, int l, int h){

        date = d;
        low = l;
        high = h;
        numDataPoints++;
    }

    public String getDate(){
        return date;
    }

    public int getLow(){
        return low;
    }

    public int getHigh(){
        return high;
    }

    public static DataPoint createDataPoint(){
        
        //get input for each field 
        //create a new DataPoint with data
        //return the data
        Scanner scan = new Scanner(System.in);
        System.out.print("Date: ");
        String date = scan.nextLine();

        System.out.print("Low: ");
        int low = scan.nextInt();
       
        System.out.print("High: ");
        int high = scan.nextInt();

        DataPoint d = new DataPoint(date, low, high);
        System.out.println("New DataPoint created!");
        return d;
    }

    //Return a string representation of a DataPoint
    public String toString(){

        String str = String.format("%s %d %d", getDate(), getLow(), getHigh());
        return str;

    }
}
