import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * @author 000207475
 */


public class FirstDay {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("   J    A    V     V    A");
        Thread.sleep(500);
        System.out.println("   J   A A    V   V    A A");
        Thread.sleep(500);
        System.out.println("J  J  AAAAA    V V    AAAAA");
        Thread.sleep(500);
        System.out.println(" JJ  A     A    V    A     A\n");
        Thread.sleep(500);

        System.out.println("x     x^2   X^3\n1     1     1\n2     4     8\n3     9     27\n4     16    64\n");
        Thread.sleep(500);

        int x = 5;
        System.out.printf("x = %d \n", x);
        System.out.println("x = " + x);


        System.out.print("Please enter an integer: ");
        Scanner input = new Scanner(System.in);
        int z = input.nextInt();
        System.out.println("z = " + z);

        input.nextLine();
        System.out.println("Please enter a Greeting: ");
        String g = input.nextLine();
        System.out.println("g = " + g);
    }
}
