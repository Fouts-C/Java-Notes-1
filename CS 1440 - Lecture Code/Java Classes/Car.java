public class Car
{
    //Private instance variables
    private double gallonsOfGas;
    private int miles;
    private int milesPerGallon;

    //Constructor
    public Car(double gallons, int mpg)
    {
        gallonsOfGas = gallons;
        milesPerGallon = mpg;
        miles = 0;
    }

    public double getGallonsOfGas()
    {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallons)
    {
        gallonsOfGas = gallons;
    }

    public int getMiles()
    {
        return miles;
    }

    public int getMilesPerGallon()
    {
        return milesPerGallon;
    }

    public void drive(int distance)
    {
        miles += distance;
        gallonsOfGas -= ((double) distance / milesPerGallon);
    }
}