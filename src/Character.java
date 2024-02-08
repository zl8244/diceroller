package src;
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

    public void characterAction(String action, int diceSides) {
        Dice dice = new Dice(diceSides);
        System.out.println("You attempt to " + action + ".");
        System.out.println("Rolling a d" + diceSides);
        int result = dice.rollDice();
        if(result > diceSides/2) {
            System.out.println("You succeed at " + action + " with a roll of " + result + ".");
        } else {
            System.out.println("You fail at " + action + " with a roll of " + result + ".");
        }
    }
}
