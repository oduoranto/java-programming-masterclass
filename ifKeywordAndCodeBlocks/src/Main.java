public class Main {
    public static void main(String[] args) {
       boolean gameover = true;
       int score = 10000;
       int levelCompleted = 8;
       int bonus = 200;

       int finalScore = score;

       if (gameover){
           finalScore = score + (bonus * levelCompleted);
           System.out.println("GameOver! Your score is " + finalScore);
       } else {
           System.out.println("Oops!");
       }

    }
}