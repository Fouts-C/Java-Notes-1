public class primitives{
    public static void main(String[] args){
        //Variable names can have digits (not at start), letters, _, $
        byte bt; // 1 byte = 2^8 = 256 = -128 to 127
        short s; // 2 bytes = 2^16 = -32768 to 32, 767
        int num; // 4 bytes = 2^32
        long l; // 8 bytes = 2^64
        //arithmetic operations can be used amongst these types
        num = 505;
        bt = 10;
        //remember INT DIVISION... leaves off the reaminder
        System.out.println(num / bt);   
        
        
        //Floating-point data types
        float f; //4 bytes; 7 digits of precision
        double d; //8 bytes; 15 digits of precision
        
        f = 1.5f; //Needs f to declare as a float
        d = 5.0; 
        
        //Double divided by int will give 0.5 *Floating-point division
        System.out.println(d / bt);
        double sci = 10e8; //can use scientific notation
        
        
        //Boolean data types
        boolean bl = true; //Other languages can use 0 or 1
        
        //char - math can also be done with chars
        char c = 's'; //2 bytes
        char c2 = 97; //uses uni code 
        char c3 = '\n'; //can also store tabs and line breaks 
        
    }
}
