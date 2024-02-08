public class Main {

    private static int parseArgs(String[] args, int defaultValue) {
        if(args.length > 0) {
            return Integer.parseInt(args[0]);
        }
        return defaultValue;
    }

    public static void main(String[] args) {
        int sides = parseArgs(args, 6);
        Dice dice = new Dice(sides);
        System.out.println("Rolling a d" + sides + ".");
        int result = dice.rollDice();
        System.out.println("Rolled a " + result + ".");
    }
}