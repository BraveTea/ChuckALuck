public class Programme {
    public static void main(String[] args){
        System.out.println("config");
        DiceCup diceCup = new DiceCup();

        for (int i = 0; i < 10 ; i++){
            diceCup.throwDice();
            System.out.println(diceCup);
        }



    }
}
