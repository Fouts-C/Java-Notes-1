public class MoreFormatting
{
    public static void main(String[] args)
    {
        double x = 2.57;
        System.out.printf("The value of x is: %f\n", x);

        System.out.printf("The value of x is: %.1f\n", x);

        System.out.printf("The value of x is: %10.1f\n", x);

        System.out.printf("The value of x is: %-10.1f\n", x);


        // Flags: - 0 ,
        int y = 25;
        System.out.printf("The value of y is: %d\n", y);

        System.out.printf("The value of y is: %05d\n", y);

        int z = 10500000;
        System.out.printf("The value of z is: %,d\n", z);

        System.out.printf("The value of z is: %,20d\n", z);

        System.out.printf("The value of z is: %-,20d\n", z);


        // String.format
        int a = 10;
        String s = String.format("The value of a is: %d", a);
        System.out.println(s);
    }
}