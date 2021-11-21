
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coach
{
    // instance variables - replace the example below with your own
    private String coachName;
    private int coachNumber;

    /**
     * Constructor for objects of class Player
     */
    public Coach(String coachName, int coachNumber)
    {
        // initialise instance variables
        this.coachName = coachName;
        this.coachNumber = coachNumber;
    }

    /**
     * @return    Player's name as a string
     */
    public String getCoachName()
    {
        // put your code here
        return coachName;
    }
     /**
     * @return    Player's number as an int
     */
    public int getCoachNumber()
    {
        // put your code here
        return coachNumber;
    }
}

