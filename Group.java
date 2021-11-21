import java.util.ArrayList;

/**
 * Write a description of class Group here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Group
{
    // instance variables - replace the example below with your own
    private ArrayList<Team> teams;
    private int groupNumber;
    

    /**
     * Constructor for objects of class Group
     */
    public Group(int groupNumber)
    {
        // initialise instance variables
        this.groupNumber = groupNumber;
        this.teams = new ArrayList<Team>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addTeam(Team team)
    {
        // put your code here
        teams.add(team); 
    }
     /**
     * @return    Group's number as an int
     */
    public int getGroupNumber()
    {
        // put your code here
        return groupNumber;
    }
}
