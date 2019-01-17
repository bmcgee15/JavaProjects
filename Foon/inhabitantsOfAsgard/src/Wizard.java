public class Wizard extends Human{
    private double nameGen;
    public void createSpecial(){
        super.setCharType("Wizard");
        super.setSpecial("Healing Power");
        nameGen = (int)(Math.random() * 20);
        if (nameGen > 0 && nameGen < 5){
            super.setName("Dumbledoor");
        }else if (nameGen >= 5 && nameGen < 10){
            super.setName("Harry Potter");
        }else if (nameGen >= 10 && nameGen < 15){
            super.setName("Hermione");
        }else if (nameGen >= 15 && nameGen < 20){
            super.setName("Voldemort");
        }else {
            super.setName("Severus");
        }
    }
}
