import java.util.Random;
/**
 * Write a description of class Score here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Score
{
    // instance variables - replace the example below with your own
    private int scoreFor;
    private int scoreAgainst;
    private Random random;

    /**
     * Constructor for objects of class Score
     */
    public Score()
    {
        this.scoreFor = scoreFor;
        this.scoreAgainst = scoreAgainst;
        this.random = new Random();
    }

    /**
     * Method that creates a result for a match
     *
     * @param     home - the home team
     *            away - the away team
     */
    public void result(Team home, Team away)
    {
        scoreFor = random.nextInt(10);
        scoreAgainst = random.nextInt(10);
        System.out.println(home.getTeamName() + ": " + scoreFor + " - " + away.getTeamName() + ": " + scoreAgainst);
        home.updatePoints(scoreFor, scoreAgainst);
        away.updatePoints(scoreAgainst, scoreFor);
    }
}
