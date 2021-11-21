import java.util.ArrayList;

/**
 * Write a description of class WorldCup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorldCup
{
    // instance variables - replace the example below with your own
    private ArrayList<Group> groups;

    /**
     * Constructor for objects of class WorldCup
     */
    public WorldCup()
    {
        // initialise instance variables
        this.groups = new ArrayList<Group>();
    }
    /**
     * Add a group object to the groups ArrayList
     *
     * @param   a Group Object
     * @return    void
     */
    public void addGroup(Group group)
    {
        // put your code here
        groups.add(group); 
    }

    /**
     * This method creates players, teams, and groups, and saves them in the WorldCup.groups ArrayList.
     *
     * @params: the number of groups, teams, and players per team respectively.
     * @return    void
     */
    public void worldCupSetup(int numberOfGroups, int numberOfTeams, int numberOfPlayersPerTeam)
    {
    
        for(int i = 0; i < numberOfGroups; i++){
            Group tempGroup = new Group(numberOfGroups + 1);
            for(int j = 0; j < numberOfTeams; j++){
                int currentTeamNumber = j + 1;
                String currentTeamName = "Team " + Integer.toString(currentTeamNumber);
                int currentCoachNumber = currentTeamNumber;
                String currentCoachName = "Coach " + Integer.toString(currentTeamNumber);
                Coach tempCoach = new Coach(currentCoachName, currentCoachNumber);
                Team tempTeam = new Team(currentTeamName,currentTeamNumber, tempCoach);
                for(int k = 0; k < numberOfPlayersPerTeam; k++){
                    int currentPlayerNumber = k + 1;
                    String currentPlayerName = "Player " + Integer.toString(currentPlayerNumber);
                    Player tempPlayer = new Player(currentPlayerName, currentPlayerNumber);
                    tempTeam.addPlayer(tempPlayer); 
                }
                tempGroup.addTeam(tempTeam);
                
                
            }
            this.addGroup(tempGroup);
            
            
            
        }
    }
}
