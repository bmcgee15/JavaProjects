public class usingClasses {
    public static void main(String[] args) {
        classTwo c2 = new classTwo(); //CALLING CLASS
        c2.cTwo(); //CALLING METHOD IN THAT EXTERNAL CLASS
        int a = 5;
        int b = 10;
        int c = c2.add(a, b); //CALLING ANOTHER METHOD IN THAT CLASS
        System.out.printf("Your methods turned %d + %d into %d! ", a, b, c);


    }
}
