public class Elf extends Humanoid{
    private double nameGen;
    public void createSpecial(){
        super.setCharType("Elf");
        nameGen = (int)(Math.random() * 20);
        if (nameGen > 0 && nameGen < 5){
            super.setName("Gladriel");
            super.setSpecial("Forest Clan");
        }else if (nameGen >= 5 && nameGen < 10){
            super.setName("Legolas");
            super.setSpecial("City Clan");
        }else if (nameGen >= 10 && nameGen < 15){
            super.setName("Celeborn");
            super.setSpecial("Forest Clan");
        }else if (nameGen >= 15 && nameGen < 20){
            super.setName("Haldir");
            super.setSpecial("City Clan");
        }else {
            super.setName("Arwen");
            super.setSpecial("Forest Clan");
        }
    }
}
