public class Circle
{
    private double radius;

    //Constructor - needs name of class
    //No arg constructor sets fields to 0
    //public Circle(){
      //  radius = 0;
    //}

    //arg constructor allows parameter input value when instantiating a new object
    public Circle(double r){
        radius = r;
    }


    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        radius = r;
    }

    public double getAreaCirc(){
        return Math.PI * radius * radius;

    }
}