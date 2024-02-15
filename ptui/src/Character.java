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
        int numDice = luck;
        int maxRoll = 0;
        for(int i = 0; i < numDice; i++) {
            maxRoll = Math.max(maxRoll, dice.rollDice());
        }
        System.out.println("Max Roll is: " + maxRoll);
        int bonusPoints = 0;
        switch (modifiers) {
            case "str":
                bonusPoints = maxRoll/strength;
                break;
            case "dex":
                bonusPoints = maxRoll/dexterity;
                break;
            case "con":
                bonusPoints = maxRoll/constitution;
                break;
            case "int":
                bonusPoints = maxRoll/intelligence;
                break;
            case "wis":
                bonusPoints = maxRoll/wisdom;
                break;
            case "cha":
                bonusPoints = maxRoll/charisma;
                break;
            default:
                numDice = 1;
                break;
        }
        int finalResult = maxRoll+bonusPoints;
        System.out.println("Final roll is " + finalResult);
    }
}
