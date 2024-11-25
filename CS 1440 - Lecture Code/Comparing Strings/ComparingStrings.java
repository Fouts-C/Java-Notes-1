public class ComparingStrings
{
    public static void main(String[] args){

    //equals method 
    //returns a boolean value if the strings are the same or equal
    String myStr1 = "Hello";
    String myStr2 = "Hello";
    String myStr3 = "Another String";
    System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
    System.out.println(myStr1.equals(myStr3)); // false

    //CompareTo method
    //name1.compareTo(name2);
    //returns an int
    //0 - name1 (Calling String) and name2 (agrument)
    //    are equal
    //if neg, calling string < argument string
    //pos - calling string > arg string (Compares ascii values)
    if(name1.compareTo(name2) == 0)
    {
        System.out.println(name1 + "equals" + name2);
    } else if (name1.compareTo(name2) < 0){
        System.out.println(name1 + "is less than" +  name2);
    }else{
        System.out.println(name1 + "is greater than" +  name2);
    }

    //equalsIgnoreCase - same as .equals, just isn't case sensitive
    if(name1.equalsIgnoreCase(name2)){
        System.out.println(name);
    }

    //compareToIgnoreCase - same as .compareTo, just isn't case sensitive
    //name1.compareToIgnoreCase(name2);

    }
}