package SmallGames.rpgGenerator;


public class Main {

    public static void main(String[] args) {

        Main.main();

    }

    public static void main(){
        UserInput.askNameAndCreateRole();
        UserInput.askDifficultyAndPopulateStats();
        while(!UserInput.getIsDone()){
            UserInput.checkStats();
        }
    }
}
