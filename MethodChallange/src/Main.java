public class Main {
    public static void main(String[] args) {

        displayHighScorePosition("Antony", calculateHighScorePosition(1500));
        displayHighScorePosition("Audredo", calculateHighScorePosition(1000));
        displayHighScorePosition("Frankie", calculateHighScorePosition(500));
        displayHighScorePosition("Elkay", calculateHighScorePosition(100));
        displayHighScorePosition("Johnny", calculateHighScorePosition(25));

    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " in the high score list");
    }
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if ((playerScore>=500) && (playerScore< 1000)){
            return 2;

        }
        else if ((playerScore >= 100 && playerScore < 500)){
            return 3;
        }else {
            return 4;
        }



    }
}