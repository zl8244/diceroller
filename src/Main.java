package src;
public class Main {

    private static int parseArgs(String[] args, int defaultValue) {
        if(args.length > 0) {
            return Integer.parseInt(args[0]);
        }
        return defaultValue;
    }

    public static void main(String[] args) {
        Character MC = new Character();
        MC.characterAction("run", 6);
    }
}