import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Billybobby
 */
public class StringTestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReadOnlyStringArray sa = new ReadOnlyStringArray("John", "Paul", "George", "Richard", "Brian");
        Scanner input = new Scanner(System.in);
        int index = 0;

        do {
            System.out.print("Enter an array index to read (-1 to exit): ");
            try {
                index = input.nextInt();
                if (index != -1){
                    String sv = sa.get(index);
                    System.out.println(sv);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The input is out of bounds! Try Again");;
            } catch (InputMismatchException e) {
                System.out.println("The input is not an int! Try Again");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }while(index != -1);
        System.out.println("Bye");
    }
}
