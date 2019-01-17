public class FooBar extends FooBarMama {

    private int z;

    public FooBar() {
    }

    /**
     * ALERT! This constructor is broken. It doesn't set values for y and z. How
     * can we fix it?
     */
    public FooBar(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "FooBar{" + "z=" + z + "} --> " + super.toString();
    }

}