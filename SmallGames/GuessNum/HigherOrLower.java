package SmallGames.GuessNum;

public class HigherOrLower {
    private static boolean isCorrect;
    private static int randomNumber;

    public static int createRandomNum(){
        randomNumber = (int) (10 * Math.random());
       return randomNumber;
    }

    public static int getRandomNumber() {
        return randomNumber;
    }

    public static void setIsCorrect(boolean isCorrect) {
        HigherOrLower.isCorrect = isCorrect;
    }

    public static boolean getIsCorrect(){
        return isCorrect;
    }

    public static String guessNum(int num) {
        if(num > getRandomNumber()) return "Lower";
        if(num < getRandomNumber()) return "Higher";

        else{
            isCorrect = true;
            return "You got it!";
        }
    }
}




