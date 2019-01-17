import java.util.Scanner;

/**
 * This class Runs the turn for turn fighting game.
 * It creates two random characters calling on two
 * random constructors. The two characters fight
 * to the death.
 * @author Lovepreet Singh & Bret McGee
 */

public class Asgard {

    /**
     * Player1 & player 2 are created and characters are chosen.
     * The fight mechanics are called upon and the battle begins.
     * @param args the command line arguments
     */

    public static void main(String[] args) throws InterruptedException {

        Hobbits hobbit1 = new Hobbits("Frodo", 7, 11, 3, 16, 14, 32); // Hobbit object is created using constructor 1.
        Hobbits hobbit2 = new Hobbits("Bilbo"); // Hobbit object is created using constructor 2.

        Humans human1 = new Humans("Harry", 12, 19, 6, 14, 20, 36, "Wizard", 18); // Human object is created using constructor 1.
        Humans human2 = new Humans("Thor"); // Human object is created using constructor 2.

        Elves elf1 = new Elves("Legolas", 10, 14, 12, 8, 12, 29, "city"); // Elves object is created using constructor 1.
        Elves elf2 = new Elves("Arwen"); // Elves object is created using constructor 2.

        Humanoid player1; // Humanoid object is created for player1.
        Humanoid player2; // Humanoid object is created for player2.

        /** Randomly chooses character for player1 **/
        int random = (int) (Math.random() * 30);
        if (random <= 5){
            player1 = hobbit1;
        }else if (random <= 10){
            player1 = hobbit2;
        }else if (random <= 15){
            player1 = human1;
        }else if (random <= 20){
            player1 = human2;
        }else if (random <= 25){
            player1 = elf1;
        }else{
            player1 = elf2;
        }

        /** Randomly chooses character for player2 **/
        do{
            int random1 = (int) (Math.random() * 30);
            if (random1 <= 5 ){
                player2 = hobbit1;
            }else if (random1 <= 10){
                player2 = hobbit2;
            }else if (random1 <= 15){
                player2 = human1;
            }else if (random1 <= 20){
                player2 = human2;
            }else if (random1 <= 25){
                player2 = elf1;
            }else{
                player2 = elf2;
            }
        }while(player1 == player2);

        /** Initializes counter to 1 **/
        int counter = 1;

        /** Starts the fight loop until one of the players health is not greater than 0 **/
        while (player1.getHealth() > 0 && player2.getHealth() > 0){
            /** Runs player1 attack when counter is odd **/
            if (counter % 2 == 1){
                /** Initializes the random defend variable **/
                int defend = (int) (Math.random() * 10);
                System.out.println(player1); // prints player1 toString.
                System.out.println(player2); // prints player2 toString.
                Scanner input = new Scanner(System.in);
                System.out.println("\nHit Enter to Continue ... \n");
                input.nextLine();
                /** This stops the stealing method from being executed for both players at the same time if both hobbits **/
                if (player1 == hobbit1 || player1 == hobbit2 ){
                    /** checks to make sure that more coins are not stolen than are available **/
                    if ((int)(player1.getDexterity() / 2) > player2.getCoins()){
                        System.out.println(player1.getName() + " is Stealing coins.....");
                        player1.setCoins((int) (player2.getCoins()), "hobbit"); // set coins for player1.
                        player2.setCoins((int) (player2.getCoins()) , "any"); // set coins for player2.
                    }else{
                        System.out.println(player1.getName() + " is Stealing coins.....");
                        player1.setCoins((int) (player1.getDexterity() / 2), "hobbit"); // set coins for player1.
                        player2.setCoins((int) (player1.getDexterity() / 2) , "any"); // set coins for player2.
                    }
                }
                System.out.println(player1.getName() + " is attacking......");
                Thread.sleep(500); // causes a 500 milisecond delay.
                /** Ramdomly chooses if player defends attack if defend variable is less than 7 **/
                if (defend < 7){
                    /** player1 attacks **/
                    player1.Attack(1);
                }else{
                    /** player1 attack got defended **/
                    player1.Defend();
                    System.out.println(player2.getName() + " defended the attack!");
                }
                /** gets damage for player2, checks for wizard for healing abilities **/
                if (player2 == human1 ){
                    player2.setHealth(player1.getAttack(), human1.getMagicRating());
                }else if (player2 == human2){
                    player2.setHealth(player1.getAttack(), human2.getMagicRating());
                }else{
                    player2.setHealth(player1.getAttack(), 0);
                }
            }else{
                /** Initializes the random defend variable **/
                int defend1 = (int) (Math.random() * 10);
                System.out.println(player1); // prints player1 toString.
                System.out.println(player2); // prints player2 toString.
                Scanner input = new Scanner(System.in);
                System.out.println("\nHit Enter to Continue ... \n");
                input.nextLine();
                if (player2 == hobbit1 || player2 == hobbit2){
                    /** checks to make sure that more coins are not stolen than are available **/
                    if ((int)(player2.getDexterity() / 2) > player1.getCoins()){
                        System.out.println(player2.getName() + " is Stealing coins.....");
                        player2.setCoins((int) (player1.getCoins()), "hobbit"); // set coins for player2.
                        player1.setCoins((int) (player1.getCoins()) , "any"); // set coins for player1.
                    }else {
                        System.out.println(player2.getName() + " is Stealing coins.....");
                        player2.setCoins((int) (player2.getDexterity() / 2), "hobbit");  // set coins for player2.
                        player1.setCoins((int) (player2.getDexterity() / 2), "any");  // set coins for player1.
                    }
                }
                System.out.println(player2.getName() + " is attacking......");
                Thread.sleep(500); // causes a 500 millisecond delay.
                /** Ramdomly chooses if player defends attack if defend variable is less than 7 **/
                if (defend1 < 7){
                    /** Player2 attacks **/
                    player2.Attack(1);
                }else{
                    /** Player2 attack is defended **/
                    player2.Defend();
                    System.out.println(player2.getName() + " defended the attack!");
                }
                /** gets damage for player1, checks for wizard for healing abilities **/
                if (player1 == human1 ){
                    player1.setHealth(player2.getAttack(), human1.getMagicRating());
                }else if (player2 == human2){
                    player1.setHealth(player2.getAttack(), human2.getMagicRating());
                }else{
                    player1.setHealth(player2.getAttack(), 0);
                }
            }
            counter++;
        }
        /** Checks if player 1 or 2 are dead, and steals the corpses coins accordingly **/
        if (player1.getHealth() == 0){
            player2.setCoins(player1.getCoins(), "hobbit");
            player1.setCoins(player1.getCoins(), "any");
            System.out.println(player1);
            System.out.println(player2);
            System.out.println("\n" + player1.getName() + " is dead.\n" + player2.getName() + " WINS!!!");
        }else{
            player1.setCoins(player2.getCoins(), "hobbit");
            player2.setCoins(player2.getCoins(), "any");
            System.out.println(player1);
            System.out.println(player2);
            System.out.println("\n" + player2.getName() + " is dead.\n" + player1.getName() + " WINS!!!");
        }



    }
}