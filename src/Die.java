public class Die
{
    //variables
    private int sides;
    private int x;
    private double y;
    private int z;

    //establishes private variables
    //constructors
    public Die(int sides)
    {

        this.sides = sides; //constructs main variable
    }//close constructor


    //getters

    public int getSides()
    {
        return sides; //returns existing side value
    }//close getter

    //setters
    public void setSides(int newSides)
    {
        sides = newSides;//sets new side value
    }//close setter


    //possible brain methods
    public int roll()
    {
        int x = sides;
        double y = Math.random() ;
        int z = (int)(x * y) + 1;
        return z;
//main method / calculation of program, finds random side to land on
    }//close brain method roll

    //toString
    public String toString()
    {
        String output = " ";
        output += "You have a die with " + sides + "sides";
        output += "\nThe side it rolled on is " + z;
        return output;
    }//close toString


}
