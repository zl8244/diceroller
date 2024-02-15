package ptui.src;
public class Dice {

    private int numSides;

    public Dice(int numSides) {
        this.numSides = numSides;
    }

    public int rollDice() {
        System.out.println("Rolling a d" + numSides);
        int diceRoll = (int)(Math.random() * numSides)+1;
        System.out.println("Rolled a " + diceRoll);
        return diceRoll;
    }
}
