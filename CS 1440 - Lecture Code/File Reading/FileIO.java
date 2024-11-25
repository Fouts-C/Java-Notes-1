import java.io.*;
import java.util.Scanner;

public class FileIO{

    //throws can be used to ignore any exception and allows code to be compiled
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException { 

        //Writing to files
        PrintWriter pw = new PrintWriter("data.txt"); //could write a whole java class 
        //data.txt opened, input buffer created in memory 
        pw.print("Hello");
        pw.println(", World");
        pw.close();

        //Appending to files
        //@param true tells the filewriter to append to the file, w/out overwriting the file
        //@param false tells the filewriter to overwrite the file
        FileWriter fw = new FileWriter("newData.txt", true);
        pw = new PrintWriter(fw);
        pw.println("Goodbye");
        pw.close();


        //Reading Files
        File f = new File("newData.txt");
        if (f.exists()){
            Scanner scan = new Scanner(f); //needs throws exception when giving a file to a scanner

            while (scan.hasNext()){ //Loop to read the whole file
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();

            //Reading file word by word
            scan = new Scanner(f);
            while (scan.hasNext()){
                String word = scan.next();
                System.out.println(word);
            }
            scan.close();
        }else{
            System.out.println("The file doesn't exist");
        }

    }



}