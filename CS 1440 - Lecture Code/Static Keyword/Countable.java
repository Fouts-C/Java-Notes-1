public class Countable{

    //Static Members
    // - exist separate from instances of the class
    // - do not need an object to access static members
    //Static Fields' values are stored separate from instance fields

    private static int instanceCount = 0;

    public Countable(){
        instanceCount++;
    }

    public int getInstanceCount(){
        return instanceCount;
    }



}