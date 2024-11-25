public class Demo
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Area: " + r.getArea());
        // r.length = 10;
        // r.width = 10;
        r.setLength(10);
        r.setWidth(10);
        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Area: " + r.getArea());

        //Instance methods
        //Any changes made to one object will not chang any others (rectangle r)
        Rectangle s = new Rectangle();
        s.set(30,40); //Instance method... directly refrencing an object

        Circle c = new Circle(5);
        System.out.println("Circle c has a radius of " + c.getRadius());

    }
}
