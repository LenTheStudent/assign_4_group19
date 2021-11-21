import java.util.ArrayList;

/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private int teamNumber;
    private ArrayList<Player> players;
    private Coach coach;
    

    /**
     * Constructor for objects of class Team
     */
    public Team(String teamName, int teamNumber, Coach coach)
    {
        // initialise instance variables
        this.teamName = teamName;
        this.teamNumber = teamNumber;
        this.coach = coach;
        this.players = new ArrayList<Player>(); 
    }

    /**
     * This method returns the name of the team as a string.
     *
     * 
     * @return    the name of the team
     */
    public String getTeamName()
    {
        // put your code here
        return teamName;
    }
     /**
     * This method returns the number of the team as an int.
     *
     * 
     * @return    the number of the team
     */
    public int getTeamNumber()
    {
        // put your code here
        return teamNumber;
    }
     /**
     * This method adds a player object to the Team.
     *
     * 
     * @param    a player object
     */
    public void addPlayer(Player player)
    {   players.add(player);
        
    }
}
