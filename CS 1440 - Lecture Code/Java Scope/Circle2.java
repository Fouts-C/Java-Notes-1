public class Circle2 
{
    private double radius; //field - Accessable accross the class or any method accross the class

    public double getRatius()
    {
        //System.out.println(r); - r isn't inside the scope
        return radius;
    }

    public void setRadius(double r)
    {
        int i = 10; //Local variable - only accessible in the method
        double radius;  //Shadowing our field
        //System.out.println(i);
        //System.out.println(r); // r is only accessible in setRadius
        radius = r;
        System.out.println("Local variable radius " + radius);
    }
}
