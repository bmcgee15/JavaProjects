public class testBase {
    public static void main(String[] args) {
        Hobbit x = new Hobbit();
        x.createChar();
        x.createSpecial();
        System.out.println(x);

        System.out.println("\n\n");

        Elf y = new Elf();
        y.createChar();
        y.createSpecial();
        System.out.println(y);

        System.out.println("\n\n");

        Fighter z = new Fighter();
        z.createChar();
        z.createSpecial();
        System.out.println(z);

        System.out.println("\n\n");

        Wizard w = new Wizard();
        w.createChar();
        w.createSpecial();
        System.out.println(w);
    }
}
