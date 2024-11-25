import java.io.*;
import java.util.Scanner;


public class GradeReader
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        
        Scanner scan = new Scanner(System.in);
       
        // prompt for the filename
        System.out.println("Enter a file name: ");
       
        String fName = scan.nextLine();
        scan.close();
        
        // read the file to determine how many rows
        File gradeFile = new File(fName);
        Scanner fileReader = new Scanner(gradeFile);
       
        int rows = 0;
        while(fileReader.hasNextLine()){
            rows++;
            fileReader.nextLine();
        }
        fileReader.close();
        
        // read the file once more,
        // reading each grade into an int array
        fileReader = new Scanner(gradeFile);
        int[] grades = new int[rows];
        for(int i = 0; i < rows; i++){
            grades[i] = fileReader.nextInt();
        }
        fileReader.close();
        
        // create a LetterGrade array of the same
        // length as the int array
        LetterGrade[] letters = new LetterGrade[rows];
        
        // for each grade in the int array,
        // add its letter grade to the 
        // LetterGrade array
        public static LetterGrade getLetter(int grade){
          
            LetterGrade letter;

            if (grade >= 90){
                letter = LetterGrade.A;
            }else if (grade >= 80){
                letter = LetterGrade.B;
            }else if (grade >=70){
                letter = LetterGrade.C;
            }else if (grade >= 60){
                letter = LetterGrade.D;
            }else{
                letter = LetterGrade.F;
            }
            return letter;
        }
        
        // calculate the average grade using
        // the int array
        int sum = 0;
        for(int num : grades){
            sum += num;
        }
        double avg = (double)sum/grades.length;
        System.out.println("Average: " + avg);
        
        // determine the LetterGrade with the
        // highest count among all LetterGrades
        // (consider using a switch statement here)
        
        // write to a new file each grade
        // and the LetterGrade associated with it
    }
}
