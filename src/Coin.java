package src;

public class Coin {
    
    public void coinFlip() {
        System.out.println("Flipping a coin.");
        int result = (int)(Math.random() * 2)+1;
        if(result == 1) {
            System.out.println("Coin landed on Heads.");
        } else {
            System.out.println("Coin landed on Tails.");
        }
    }
}
