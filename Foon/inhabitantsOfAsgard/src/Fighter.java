public class Fighter extends Human{
    private double nameGen;
    public void createSpecial(){
        super.setCharType("Fighter");
        super.setSpecial("Double Damage");
        nameGen = (int)(Math.random() * 20);
        if (nameGen > 0 && nameGen < 5){
            super.setName("Smoke");
        }else if (nameGen >= 5 && nameGen < 10){
            super.setName("Sub Zero");
        }else if (nameGen >= 10 && nameGen < 15){
            super.setName("Raiden");
        }else if (nameGen >= 15 && nameGen < 20){
            super.setName("Scorpion");
        }else {
            super.setName("Noob Saibot");
        }
    }
}
