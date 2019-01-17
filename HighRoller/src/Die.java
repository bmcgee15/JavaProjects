/** This is the Die class that generates a die with n
 *  number of sides, and simulates a roll with a number
 *  between 1 & n, n being the number of sides.
 *
 *  @author Bret McGee - 000207475  */

public class Die {
    int sides;
    int roll = (int)(1 + Math.random() * sides);


    public Die(int sides){
        this.sides = sides;
    }

    public void RollDie(){
        roll = (int)(1 + Math.random() * sides);
    }

    public int getSides(){
        return sides;
    }

    public int getRoll(){
        return roll;
    }

    public String toString(){
        return "d" + sides + "=" + roll;
    }

}
