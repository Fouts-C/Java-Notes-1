public class AggDemo {
    
    public static void main(String[] args){
        String courseName = "CS I";
        Instructor instr = new Instructor("McCann", "Shane", "312E");
        Textbook text = new Textbook("JAVA", "Gaddis", "IDK");

       Course c = new Course(courseName, instr, text);
       System.out.println(c);

       Textbook book = c.getTextbook();
       book.set("hello", "world", "Carson");
       System.out.println(c);

       Instructor newInstructor = new Instructor(instr);

       Course newCourse = new Course("CS II", newInstructor, text);
       System.out.println(newCourse);
       Instructor cInstr = newCourse.getInstructor();
       
       System.out.println();


    }
}
