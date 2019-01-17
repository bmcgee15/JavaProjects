public class FooBarMama extends FooBarGrandma {

    private int y;

    public FooBarMama() {
    }

    public FooBarMama(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public String toString() {
        return "FooBarMama{" + "y=" + y + "} --> "+super.toString();
    }

}
