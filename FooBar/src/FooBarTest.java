import java.util.Scanner;

public class FooBarTest {

    public static void main(String[] args) {
//        System.out.println("\n***** new FooBar() *****");
//        FooBar f = new FooBar();
//        System.out.println(f);
//        System.out.println("\n***** new FooBar(1, 2, 3) *****");
//        FooBar g = new FooBar(1, 2, 3);
//        System.out.println(g);

        FooBarGrandma g1 = new FooBarGrandma(3);
        FooBarGrandma g2 = new FooBarGrandma(3);
        System.out.println((g1.equals(g2)));
        System.out.println(g1 == g2);
        System.out.println(g1);
        System.out.println(g2);
        g1 = g2;
        System.out.println((g1.equals(g2)));
        System.out.println(g1 == g2);
        System.out.println(g1);
        System.out.println(g2);
        int[] array = new int[5];
        String[] strang = new String[]{"Ay", "Bee", "See"};
        System.out.println(strang[2]);
        strang[2] = "Zee";
        System.out.println(strang[2]);
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(a.length);
        System.out.println(a[2]);
        Passenger x = new Passenger();
        Passenger y = new Passenger();
        Passenger z = new Passenger();
        Passenger[] passengers = new Passenger[]{x, y, z};
        z.setName("Bentley");
        System.out.println(passengers[2].getName());
        for(int i = 0; i < passengers.length; i++){
            passengers[i].setName("sally");
        }
        System.out.println(passengers[0].getName());
        System.out.println(passengers[1].getName());
        System.out.println(passengers[2].getName());

        Scanner in = new Scanner(System.in);
        System.out.println("enter the writing you fuck!");
        String g = in.nextLine();
        System.out.println(g + " " + g);

        for (int i = 0; i < strang.length; i++){
            System.out.println(strang[i]);
        }

        for(int i = 0; i < a.length; i++){
            a[i] = -1;
            System.out.println(a[i]);
        }

    }
}
