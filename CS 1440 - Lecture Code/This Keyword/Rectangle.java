public class Rectangle
{
    private int length;
    private int width;
    
    /**
     * Create a new Rectangle with the given
     * length and width.
     * 
     * @param l the rectangle's length
     * @param w the rectanlge's width
     */
    //Use this to overcome shadowing
    public Rectangle(int length, int width) //Param is refrenced, this changes the variable to the field by refrencing the current object
    {
        this.length = length;
        this.width = width;
    }
    
    /**
     * Create a new Rectangle with length 0
     * and width 0.
     */
    public Rectangle()
    {
        //length = 0;
        //width = 0;
        //OR
        this(0, 0); //must be first statement in the constructor
        //this(); Recursed infinitely, crashing program
    }
    
    /**
     * Get the length of the rectangle.
     *
     * @return the length
     */
    public int getLength()
    {
        //this() - Can only call constructors using 'this' in other constructors
        return length;
    }
    
    /**
     * Set the length of the rectangle.
     *
     * @param l the length
     */
    public void setLength(int length)
    {
        this.length = length;
    }
    
    /**
     * Get the width of the rectangle.
     *
     * @return the width
     */
    public int getWidth()
    {
        return width;
    }
    
    /**
     * Set the width of the rectangle.
     *
     * @param w the width
     */
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    /**
     * Create a String with the dimensions of the rectangle.
     * 
     * @return the dimensions of the rectangle in the form
     *         "length x width"
     */
    public String toString()
    {
        return String.format("%d x %d", length, width);
    }
}
