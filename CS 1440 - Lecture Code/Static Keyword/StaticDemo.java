public class StaticDemo {
    
    public static void main(String[] args){
        Countable c1 = new Countable();
        System.out.println("Instances: " + c1.getInstanceCount());

        Countable c2 = new Countable();
        System.out.println("Instances: " + c2.getInstanceCount());

        c1 = new Countable(); //still increases instance count
        System.out.println("Instances: " + c1.getInstanceCount());

        double in = 10.0;
        double cm = Calculator.inchesToCentimeters(in);
        System.out.printf("%.2f in = %.2f cm\n", in, cm);

        //Math is a utility class, full of static members
        Math.pow(1, 3);
        Math.log(10);

        int i = 5;
        double db = 8;

        System.out.println(Calculator.square(i));
        System.out.println(Calculator.square(db));


        Circle2 one = new Circle2();
        System.out.println("one's radius: " + one.getRadius());

        Circle2 two = new Circle2(5);
        System.out.println("two's radius: " + two.getRadius());

        //Since it's static, we don't need an object to call the method
        int y = 5;
        Calculator.add5(y);
        System.out.println(y); //will print out 5 since method is only changing the x

        Circle2 c = new Circle2(10);
        Calculator.add5(c);
        System.out.println(c.getRadius());
    }
}
