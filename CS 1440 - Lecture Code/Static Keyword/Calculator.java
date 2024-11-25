public class Calculator{

    //private String name;

    public static double inchesToCentimeters(double in){
        //System.out.println(name); //non static variable cannot be refrenced from a static context
        return in * 2.54;
    }

    public static double centimetersToInches(double cm){
        return cm/2.54;
    }

    //Overloaded methods
    //Java looks at method signature 
    // - method name
    // - data types of parameters
    public static int square(int x){
        System.out.println("Squaring int...");
        return x * x;
    }

    public static double square(double x){
        System.out.println("Squaring double...");
        return x * x;
    }

    public void method(int x, double y){

    }

    public void method(double x, int y){ //Allowed - different header from other method 

    }

    public static void add5(int x){
        x  += 5;
    }

    public static void add5(Circle2 x){
        double r = x.getRadius();
        x.setRadius(r + 5);
    }
}