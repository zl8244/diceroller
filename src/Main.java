package src;
public class Main {

    private static String parseArgs(String[] args, int index, String defaultValue) {
        if(args.length > index) {
            return args[index];
        }
        return defaultValue;
    }

    public static void main(String[] args) {
        Character MC = new Character();
        String action = parseArgs(args, 0, "test");
        int numSides = Integer.parseInt(parseArgs(args, 1, "20"));
        String statModify = parseArgs(args, 2, "int");
        MC.characterAction(action, numSides, statModify);
    }
}