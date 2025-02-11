public class Instructor
{
    private String lastName,
                   firstName,
                   officeNumber;
    
    public Instructor(String l, String f, String o)
    {
        lastName = l;
        firstName = f;
        officeNumber = o;
    }

    public Instructor(Instructor other){

        lastName = other.lastName;
        firstName = other.firstName;
        officeNumber = other.officeNumber;

    }
    
    public void set(String l, String f, String o)
    {
        lastName = l;
        firstName = f;
        officeNumber = o;
    }
    
    public String toString()
    {
        return String.format("%s\n%s\n%s",
            lastName, firstName, officeNumber);
    }

    public boolean equals(Instructor other){

        boolean eq = lastName == other.lastName && firstName == other.firstName && officeNumber == other.officeNumber;
        return eq;

    }
}