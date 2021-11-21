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
    /**
     * This method takes two teams and a score and creates a match
     * 
     * @param    the two teams
     */
    public void addMatch(Team team1,Team team2)
    {
        Score score = new Score();
        score.result(team1, team2);
    }
    /**
     * This method returns the rankings of the teams in the group
     * 
     * @return     the ranking of the teams in the group
     */
    public void calculateRanking()
    {
        for (Team i : teams) {
            System.out.println("1: Team " + i.getTeamNumber() + ", " + i.getPoints() + " points.");
        }
    }
}
