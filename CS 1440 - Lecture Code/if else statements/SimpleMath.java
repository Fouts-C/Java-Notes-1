public class SimpleMath
{
    public static void evenOrOdd(int x)
    {
        //check x is even
        if(x % 2 == 0)
        {
            System.out.printf("%d is even", x);
        }
        else
        {
            System.out.printf("%d is odd", x);
        }
    }

    public static int divide(int x, int y)
    {
        if (y != 0)
        {
            return x/y;
        }
        else
        {
            System.out.println("Cannot divide by 0");
            return -1;
        }
    }
}