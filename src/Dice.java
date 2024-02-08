package src;
public class Dice {

    private int numSides;

    public Dice(int numSides) {
        this.numSides = numSides;
    }

    public int rollDice() {
        return (int)(Math.random() * numSides)+1;
    }
}
