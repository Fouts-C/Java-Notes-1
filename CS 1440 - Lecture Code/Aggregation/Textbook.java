import org.w3c.dom.Text;

public class Textbook
{
    private String title,
                   author,
                   publisher;
    public Textbook(String t, String a, String p)
    {
        title = t;
        author = a;
        publisher = p;
    }
    
    public void set(String t, String a, String p)
    {
        title = t;
        author = a;
        publisher = p;
    }
    
    public String toString()
    {
        return String.format("%s\n%s\n%s",
            title, author, publisher);
    }

    //copy methods help changes from one object from effecting/changing other objects
    public Textbook copy(){
        Textbook copy = new Textbook(title, author, publisher);
        return copy;
    }
}