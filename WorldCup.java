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
    public void worldCupSetup()
    {
        int numberOfPlayersPerTeam = 23;
        int numberOfTeamsPerGroup = 4;
        int numberOfGroups = 6;
        String [] countryNamesArray = {"Canada","United States","Mexico","Qatar","Russia","Brazil","South Africa","Germany","Japan","South Korea","Spain","Argentina","England","Chile","Sweden",
            "Switzerland","France","Italy","Denmark","Belgium","Croatia","Serbia","Netherlands","Portugal"};
        
        ArrayList<String> countryNamesList = new ArrayList<String>(); 
         for(String country: countryNamesArray){
            countryNamesList.add(country);
             System.out.println(country);
        }
        
        
        
        for(int i = 0; i < numberOfGroups; i++){
            Group tempGroup = new Group(numberOfGroups + 1);
            for(int j = 0; j < numberOfTeamsPerGroup; j++){
                int currentTeamNumber = j + 1;
                String tempCountryName = countryNamesList.get(0);
                String currentTeamName = "Team " + Integer.toString(currentTeamNumber) + ": " + tempCountryName;
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
                
                countryNamesList.remove(0);
                
                
            
            this.addGroup(tempGroup);
            
            
            
        }
    }
}
}


