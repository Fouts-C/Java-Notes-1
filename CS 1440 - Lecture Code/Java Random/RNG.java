import java.util.Random;

public class RNG
{

    public static void main(String[] args)
    {
        Random generator = new Random();

        int num = generator.nextInt(); //-2billion - 2billion

        num = generator.nextInt(10) + 1; //1-10
        //generator.nextLong();

        //generator.nextFloat();
        double db = generator.nextDouble(); //0.0 - 1.0

        //generate num between 1.0 and 10.0
        double rand = generator.nextDouble() * 9 + 1;



    }

}