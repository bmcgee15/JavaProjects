public class Hobbit extends Humanoid{
    private double nameGen;
    public void createSpecial(){
        super.setCharType("Hobbit");
        super.setSpecial("Steal");
        nameGen = (int)(Math.random() * 20);
        if (nameGen > 0 && nameGen < 5){
            super.setName("Samwise");
        }else if (nameGen >= 5 && nameGen < 10){
            super.setName("Bilbo");
        }else if (nameGen >= 10 && nameGen < 15){
            super.setName("Meriadoc");
        }else if (nameGen >= 15 && nameGen < 20){
            super.setName("Frodo");
        }else {
            super.setName("Deagol");
        }
    }
}
