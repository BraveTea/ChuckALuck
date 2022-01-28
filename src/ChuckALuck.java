public class ChuckALuck {
    private int round;
    private int luckyNumber;
    private final DiceCup diceCup = new DiceCup();
    private int balance;

    ChuckALuck(int startingBalance){
        this.balance = startingBalance;
    }

    public void playRound(int luckyNumber, int betAmount){
        this.luckyNumber = luckyNumber;

        if (luckyNumber <= 6 && luckyNumber >= 1) {
            increaseRound();
            diceCup.throwDice();
            runBetting(luckyNumber, betAmount);
        }
        else {
            System.out.printf("Your luckyNumber must be 1, 2, 3, 4, 5, or 6 %nPlease try again%n%n");
        }
    }


    private void runBetting(int luckyNumber, int betAmount){

        if (enoughBalance(balance, betAmount)) {
            decreaseBalance(betAmount);
            int numOfDice = diceInThrowResults(luckyNumber, diceCup.throwResults);
            payOut(betAmount, betMultiplier(numOfDice));
        }
        else System.exit(0);
    }


    private void payOut(int betAmount, int betMultiplier){
        increaseBalance(betAmount * betMultiplier);
    }

    private int betMultiplier(int diceInThrowResults){
        return switch (diceInThrowResults){
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 10;
            default -> 0;
        };
    }

    private int diceInThrowResults(int luckyNumber, Die[] throwResults){
        int diceInResults = 0;
        for (Die die : throwResults){
            if (luckyNumber == Integer.parseInt(die.toString())){ 
                diceInResults += 1;
            }
        }
        return diceInResults;
    }

    private boolean enoughBalance(int balance, int betAmount){
        return balance >= betAmount;
    }

    private void increaseBalance(int amount){
        balance += amount;
    }

    private void decreaseBalance(int amount){
        balance -= amount;
    }

    private void increaseRound(){
        round++;
    }

    @Override
    public String toString() {
        return String.format("ChuckALuck{" + "%n" +
                "round=" + round + "%n" +
                "luckyNumber=" + luckyNumber + "%n" +
                "throw=" + diceCup + "%n" +
                "balance=" + balance + "%n" +
                '}');
    }
}
