//CREATING A CLASS OFF A UML DIAGRAM!
public class Artist {
    

    private String name;
    private int age;
    private String instrument;
    private String genre;


    //Constructors
    public Artist(){
        name = "";
        age = 0;
        instrument = "";
        genre = "";

    }

    public Artist(String name, int age, String instrument, String genre ){

        this.name = name; 
        this.age = age;
        this.instrument = instrument;
        this.genre = genre;
    }

    //Copy constructor
    public Artist(Artist artist) {

        name = artist.name;
        age = artist.age;
        instrument = artist.instrument;
        genre = artist.genre;
    }


    //Getters and setters //repeat over each field
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void printArtist (){
        return;
    }

    public void printArtistFormatted(){
        
    }
}
