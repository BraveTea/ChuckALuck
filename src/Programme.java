public class Programme {
    public static void main(String[] args){
        System.out.println("config");

        ChuckALuck game = new ChuckALuck(100);

        for (int i = 0; i < 10; i++){
            game.playRound(1,5);
            System.out.println(game);
        }



    }
}
