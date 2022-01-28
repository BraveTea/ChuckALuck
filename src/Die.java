import java.util.Random;

public class Die {

    private int numberRolled;
    private final Random rng = new Random();

    Die(){}

    protected void roll(){
        numberRolled = rng.nextInt(1,7);
    }

    @Override
    public String toString() {
        return ""+numberRolled;
    }



}
