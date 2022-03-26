package SmallGames.GuessNum;


public class Main {
    public static void main(String[] args) {
        HigherOrLower.createRandomNum();

        System.out.println("Let's play a game, can you guess the number?");

        while(!UserInput.getIsDone()){
            while(!HigherOrLower.getIsCorrect()){
                UserInput.userInput();
            }

            UserInput.tryAgain();
        }

    }
}
