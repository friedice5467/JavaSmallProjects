package SmallGames.rpgGenerator;

import java.util.Random;

public class Generator {
    private static String name;
    private static String role;
    private static int strength;
    private static int agility;
    private static int intelligence;

    public Generator(String name, String role, int strength, int agility, int intelligence) {
        Generator.name = name;
        Generator.role = role;
        Generator.strength = strength;
        Generator.agility = agility;
        Generator.intelligence = intelligence;

    }

    public static void setName(String name) {
        Generator.name = name;
    }

    public static String getName() {
        return name;
    }

    public static String getRole() {
        return role;
    }

    public static int getStrength() {
        return strength;
    }

    public static int getAgility() {
        return agility;
    }

    public static int getIntelligence() {
        return intelligence;
    }

    public static int howStrongStart(int num){
        if(num == 1) return 20;
        if(num == 2) return 30;
        if(num == 3) return 40;
        else return 20;
    }

    public static void populateStats(int num){
        int counter = 0;
        int sum = 0;

        //unweighted, so stats are pretty random/unbalanced
        do {
            Random random = new Random();

            int decrement = (random.nextInt(num - 1) + 1)/4;
            sum += decrement;

            if (counter == 3) counter = 0;
            if (counter == 0) strength += decrement;
            if (counter == 1) agility += decrement;
            if (counter == 2) intelligence += decrement;


            num -= decrement;
            counter++;

        } while (sum <= num);

    }

    public static void resetStats(){
        strength = 0;
        agility = 0;
        intelligence = 0;
    }

    public static String createRole(){
        int num = (int)(Math.random() * 3);
        if(num == 1) return role = "Warrior";
        if(num == 2) return role = "Thief";
        return role = "Mage";
    }


}
