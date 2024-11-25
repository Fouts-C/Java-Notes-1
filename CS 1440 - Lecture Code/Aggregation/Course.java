public class Course {
    
    private String courseName;
    private Instructor instructor;
    private Textbook textBook;

    public Course(String name, Instructor instr, Textbook text){

        courseName = name;
        instructor = new Instructor(instr);
        //set fields to copies 
        textBook = text.copy();
    }

    public String getCourseName(){
        return courseName;
    }

    public Instructor getInstructor(){
        return new Instructor(instructor);
    }

    public Textbook getTextbook(){
        //getters return copies of fields
        return textBook.copy();
    }

    public String toString(){
        String str = String.format("%s\n%s\n%s", courseName, instructor.toString(), textBook.toString());
        return str;
    }
}
