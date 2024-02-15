package ptui.src;
public class Character {
    
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int luck;

    public Character() {
        strength = 5;
        dexterity = 5;
        constitution = 5;
        intelligence = 5;
        wisdom = 5;
        charisma = 5;
        luck = 5;
    }

    public Character(int str, int dex, int con, int intel, int wis, int cha, int luck) {
        strength = str;
        dexterity = dex;
        constitution = con;
        intelligence = intel;
        wisdom = wis;
        charisma = cha;
        this.luck = luck;
    }

    public void characterAction(String action, int diceSides, String modifiers) {
        Dice dice = new Dice(diceSides);
        System.out.println("You attempt to " + action + ".");
        int numDice = 0;
        switch (modifiers) {
            case "str":
                numDice = strength;
                break;
            case "dex":
                numDice = dexterity;
                break;
            case "con":
                numDice = constitution;
                break;
            case "int":
                numDice = intelligence;
                break;
            case "wis":
                numDice = wisdom;
                break;
            case "cha":
                numDice = charisma;
                break;
            case "luck":
                numDice = luck;
                break;
            default:
                numDice = 1;
                break;
        }
        int maxRoll = 0;
        for(int i = 0; i < numDice; i++) {
            maxRoll = Math.max(maxRoll, dice.rollDice());
        }
        System.out.println("Max roll: " + maxRoll);
    }
}
