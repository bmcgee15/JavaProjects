/** This is the Die class that generates a die with n
 *  number of sides, and simulates a roll with a number
 *  between 1 & n, n being the number of sides.
 *
 *  @author Bret McGee - 000207475  */

public class Die {
    /** initialize sides variable **/
    private int sides;
    /** initialize roll variable **/
    private int roll = (int)(1 + Math.random() * sides);

    /** initialize die constructor **/
    public Die(int sides){
        this.sides = sides;
    }
    /** initialize roll die method **/
    public void RollDie(){
        roll = (int)(1 + Math.random() * sides);
    }
    /** initialize sides getter **/
    public int getSides(){
        return sides;
    }
    /** initialize roll getter **/
    public int getRoll(){
        return roll;
    }
    /** initialize toString **/
    public String toString(){
        return "d" + sides + "=" + roll;
    }

}
