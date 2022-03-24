package SmallGames.GuessNum;

import SmallGames.GuessNum.packages.HigherOrLower;
import SmallGames.GuessNum.packages.UserInput;


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
