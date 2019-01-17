import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) {
        System.out.println("Mel Gibson");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        if (name.equals("Bret")){
            System.out.println("Hello " + name);
        }
        else{
            System.out.println("You are not Bret!");
        }
        String str = "Bret";
        if (str == name) {
            System.out.println("String objects are the same");
        }
        else {
            System.out.println("String objects are different");
        }

        int count = 10;
        int show = count;
        while (count >= 1){
            show = count + 2;
            System.out.println(show);
            count--;
            System.out.println(count);

        }
        System.out.println(count);
        System.out.println(show);
        System.out.println("DONE");
        System.out.println("");


        for(count = 10; count >= 1; count--){
            System.out.println(show++);

        }
    }
}

