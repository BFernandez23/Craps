
/**
 * Creates a die object and has methods allowing one to roll a die
 * and to access their previous roll
 *
 * @author Benji Fernandez
 * @version 2021-1-11
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int roll;

    /**
     * Constructor for objects of class Die
     * Die should have a random roll when object is constructed
     */
    public Die()
    {
        roll = rollDie();
        
    }

    /**
     * Rolls two dice and returns the roll
     *
     * @return roll the roll that the die was
     */
    public int rollDie()
    {
        // put your code here
        roll = (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);
        return roll;
    }
    /**
     * Gets the roll value of a previous roll
     *
     * @return roll the roll that the die was
     */
    public int getRoll()
    {
        return roll;
    }
}
