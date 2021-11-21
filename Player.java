
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private String playerName;
    private int playerNumber;

    /**
     * Constructor for objects of class Player
     */
    public Player(String playerName, int playerNumber)
    {
        // initialise instance variables
        this.playerName = playerName;
        this.playerNumber = playerNumber;
    }

    /*
     * @return    Player's name as a string
     */
    public String getPlayerName()
    {
        // put your code here
        return playerName;
    }
    public int getPlayerNumber()
    {
        // put your code here
        return playerNumber;
    }
}
