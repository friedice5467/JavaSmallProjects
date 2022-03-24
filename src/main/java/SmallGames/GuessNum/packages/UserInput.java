package SmallGames.GuessNum.packages;

import java.util.Scanner;

public class UserInput {
    private static boolean isDone = false;


    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10: ");
        int num = scanner.nextInt();
        System.out.println(HigherOrLower.guessNum(num));
    }

    public static boolean getIsDone() {
        return isDone;
    }

    public static void tryAgain(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to try again? 'Y' / 'N' ");
        String str = scanner.nextLine();
        if(str.equals("n".toUpperCase()) || str.equals("N".toLowerCase())){
            isDone = true;
            System.out.println("Hope you had fun!");
        }
        else{
            HigherOrLower.createRandomNum();
            HigherOrLower.setIsCorrect(false);
            System.out.println("Let's play again!");
        }
    }

}
