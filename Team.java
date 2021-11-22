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
    private float points;
    

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
        this.points = points;
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
     * This exposes the the players ArrayList
     *
     * 
     * @return  an ArrayList of player objects
     */
    public ArrayList<Player> getPlayers()
    {
        return this.players;
    }
     /**
      * This method returns the points of the team
      * 
      * 
      * @return    the total points for the team
      */
    public float getPoints()
    {
        return points;
    }
    /**
     * This method updates the points for a team
     *
     * 
     * @param    a score object
     */
    public void updatePoints(int scoreFor, int scoreAgainst)
    {
        if (scoreFor > scoreAgainst) {
                points += 3;
        }
        if (scoreFor == scoreAgainst) {
            points++;
        }
        points += 0.1*scoreFor;
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
