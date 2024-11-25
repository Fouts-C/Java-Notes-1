import java.util.Scanner;

public class Grade
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        char letter = 'F';

        if (grade >= 90)
        {
            letter = 'A';
        }
        else if (grade >= 80)
        {
            letter = 'B';
        } 
        else if (grade >= 70)
        {
            letter = 'C';
        }
        else if (grade >= 60)
        {
            letter = 'D';
        }
        else
        {
            letter = 'F';
        }
        System.out.println("Letter Grade: " + letter);
    }

}