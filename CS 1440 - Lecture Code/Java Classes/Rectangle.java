// [access specifier] class [ClassName]
public class Rectangle
{
    // Members (fields and methods) private instance variables
    // Fields; iniitialized to 0 by default
    // private double length = 10;
    private double length;
    private double width;
    // public double area;

    //If no constructor is defined, Java provides a default no arg constructor
    

    // Methods
    // Setters (or mutators)
    public void setLength(double l) // Method header
    {                               // Method body
        length = l;
        // area = length * width;
    }

    public void setWidth(double w)
    {
        width = w;
        // area = length * width;
    }

    // Getters (or accessors)
    public double getLength()
    {
        return length;
        // System.out.println("hello"); this is unreachable
    }

    public double getWidth()
    {
        return width;
    }

    // public void setArea(double a)
    // {
    //     area = a;
    // }

    // public double getArea()
    // {
    //     return area;
    // }

    // not technically getters
    public double getArea()
    {
        return length * width;
    }

    public double getPerimeter()
    {
        return length + length + width + width;
    }

    public double set(){

    }
}
