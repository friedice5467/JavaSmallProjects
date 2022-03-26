package SmallGames.rpgGenerator;

public class Generator {
    private String name;
    private String role;
    private int strength;
    private int agility;
    private int intelligence;
//    private int[] stats;

    public Generator(String name, String role, int strength, int agility, int intelligence) {
        this.name = name;
        this.role = role;
//        this.stats = new int[]{strength, agility, intelligence};
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;

    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int howStrongStart(int num){
        if(num == 1) return 20;
        if(num == 2) return 30;
        if(num == 3) return 40;
        else return 20;
    }

    public int[] populateStats(int num){
        int[] statsArr = new int[3];


        return statsArr;
    }


}
