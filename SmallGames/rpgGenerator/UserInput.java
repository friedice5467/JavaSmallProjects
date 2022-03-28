package SmallGames.rpgGenerator;

import java.util.Scanner;

public class UserInput {
    private static boolean isDone = false;
    private static Scanner scanner = new Scanner(System.in);

    public static boolean getIsDone() {
        return isDone;
    }

    public static void askName(){
        System.out.print("What is your name? >>> ");
        String name = scanner.nextLine();
        Generator.setName(name);

    }

    public static void askDifficultyAndPopulateStats(){
        System.out.print("How strong do you want to start off? \n1:Easy 2:Normal 3:Hard\n>>> ");
        int num = scanner.nextInt();
        while(true){
            Generator.populateStats(Generator.howStrongStart(num));
            Generator.createRole();
            checkStats();
            if(isDone) break;
            Generator.resetStats();
        }
    }

    public static void checkStats(){
        System.out.printf("These are your current stats, are you satisfied? >>> Y/N\nName:%s | Role:%s | Strength:%s | Agility:%s | Intelligence:%s%n%n",Generator.getName(), Generator.getRole(),Generator.getStrength(), Generator.getAgility(), Generator.getIntelligence() );
        String answer = scanner.nextLine().toLowerCase();
        if(answer.equals("y")){
            isDone = true;
        }
    }


}
