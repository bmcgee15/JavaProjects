public class Humans extends Humanoid {
    private String kind;
    int magicRating;

    public Humans(String name, int strength, int dexterity, int armor, int moxie, int coins, int health, String kind, int magicRating){
        super(name, strength, dexterity, armor, moxie, coins, health );
        this.kind = kind;
        if (kind.equals("Fighter")){
            this.magicRating = 0;
        }else {
            this.magicRating = magicRating;
        }
    }

    public Humans(String name){
        super(name);
        int random = (int) (Math.random() * 10);
        if (random <= 5){
            this.kind = "Fighter";
        }
        else{
            this.kind = "Wizard";
        }

        int magicRating = (int) (Math.random() * 20);
    }

    public String getKind() {
        return kind;
    }

    public void Attack(int times){
        if (kind.equals("Fighter")) {
            super.Attack(2);
        }
        else {
            Attack(times);
        }
    }

    public int getMagicRating() {
        return magicRating;
    }

    public void setMagicRating(int decrease) {
        this.magicRating = magicRating - decrease;
    }

    public void setHealth(int ll ){
        if (kind.equals("Fighter")){
            super.setHealth(getAttack());
        }
        else{
            super.setHealth(0);
            setMagicRating(3);
        }
    }
    @Override
    public String toString() {
        return "Human: " + super.toString() + ", Kind:" + kind + " ]";
    }
}
