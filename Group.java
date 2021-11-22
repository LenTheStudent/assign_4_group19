import java.util.ArrayList;
import java.util.Random;


/**
 * This group
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
     * This exposes the the teams ArrayList
     *
     * 
     * @return  an ArrayList of team objects
     */
    public ArrayList<Team> returnTeams()
    {
        return this.teams;
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
    public void randomMatches(){
        Random random = new Random();
        for(int i = 0; i < 30; i++){
            int randIdxOne = random.nextInt(teams.size()-1);
            int randIdxTwo = random.nextInt(teams.size()-1);
            Team teamOne = teams.get(randIdxOne);
            Team teamTwo = teams.get(randIdxTwo);
            this.addMatch(teamOne, teamTwo); 
           
            
        }
        
    }
}
