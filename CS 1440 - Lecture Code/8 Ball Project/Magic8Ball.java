import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Magic8Ball
{
    public static final int NUM_RESPONSES = 12;
    String[] responses;
    Random rand = new Random();

    Scanner scan = new Scanner(System.in);

    public Magic8Ball() throws FileNotFoundException{
        Scanner file = new Scanner(new File("responses.txt"));
        responses = new String[NUM_RESPONSES];
        for(int i = 0; i < NUM_RESPONSES; i++){
            responses[i] = file.nextLine();
        }
        file.close();
    }

    public void prompt(){
        System.out.println("Enter a question: ");
        scan.nextLine();
    }

    private String generateResponse(){
        int randNum = rand.nextInt(NUM_RESPONSES);
        return responses[randNum];
    }

    public void consult(){
        boolean play = true;
        while(play){
        prompt();
        System.out.println(generateResponse());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Magic8Ball ball = new Magic8Ball();
        ball.consult();
    }
}
