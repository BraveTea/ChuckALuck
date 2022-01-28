import java.util.Random;

public class Programme {
    public static void main(String[] args){
        System.out.println("config");

        ChuckALuck game = new ChuckALuck(100);

        Random rng = new Random();


        for (int i = 0; i < 50; i++){
            game.playRound( rng.nextInt(1,7),5);
            System.out.println(game);
        }



    }
}
