package SmallGames.rpgGenerator;

import java.util.Scanner;

public class UserInput {
    private static boolean isDone = false;
    private static Scanner scanner = new Scanner(System.in);

    public static boolean getIsDone() {
        return isDone;
    }

    public static void askNameAndCreateRole(){
        System.out.println("What is your name?");

        String name = scanner.nextLine();
        Generator.setName(name);
        Generator.createRole();
    }

    public static void askDifficultyAndPopulateStats(){
        System.out.println("How strong do you want to start off? \n1:Easy 2:Normal 3:Hard");
        int num = scanner.nextInt();
        while(true){
            Generator.populateStats(Generator.howStrongStart(num));
            System.out.printf("Are you satisfied with these stats? Y/N\nStrength:%s | Agility:%s | Intelligence:%s%n",Generator.getStrength(), Generator.getAgility(), Generator.getIntelligence() );
            String answer = scanner.nextLine();
            if(answer.equals("Y")){
                break;
            }
        }
    }

    public static void checkStats(){
        System.out.printf("These are your current stats, are you satisfied? Y/N\nName:%s | Role:%s | Strength:%s | Agility:%s | Intelligence:%s%n%n",Generator.getName(), Generator.getRole(),Generator.getStrength(), Generator.getAgility(), Generator.getIntelligence() );
        String answer = scanner.nextLine();
        if(answer.equals("Y")){
            isDone = true;
        }
    }


}
