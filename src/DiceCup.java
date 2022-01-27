import java.util.Arrays;

public class DiceCup {

    protected Die[] throwResults = new Die[3];

    DiceCup(){}


    protected void throwDice(){
        for (int i = 0; i < 3; i++){
            Die die = new Die();
            die.roll();
            addToThrowResults(die, i);
        }
    }

    private void addToThrowResults(Die die, int index){
        throwResults[index] = die;
    }


    @Override
    public String toString() {
        return Arrays.toString(throwResults);
    }
}