package ptui.src;
public class Character {
    
    private String name;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int luck;

    public String getName() {
        return name;
    }

    public void setName(String input) {
        name = input;
    }

    public void setStr(int num) {
        strength = num;
    }

    public void setDex(int num) {
        dexterity = num;
    }

    public void setCon(int num) {
        constitution = num;
    }

    public void setInt(int num) {
        intelligence = num;
    }

    public void setWis(int num) {
        wisdom = num;
    }

    public void setCha(int num) {
        charisma = num;
    }

    public void setLuck(int num) {
        luck = num;
    }

    public void characterAction(String action, String modifiers) {
        Dice dice = new Dice(20);
        System.out.println("" + name + " attempts to " + action + ".");
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

    @Override
    public String toString() {
        String character = "" + name + ":\n\tStrength: " + strength + "\n\t" +
            "Dexterity: " + dexterity + "\n\t" +
            "Constitution: " + constitution + "\n\t" +
            "Intelligence: " + intelligence + "\n\t" +
            "Wisdom: " + wisdom + "\n\t" +
            "Charisma: " + charisma + "\n\t";
        return character; 
    }
}
