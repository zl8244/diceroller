package ptui.src;

import java.util.Scanner;

public class Main {

    private static Character createCharacter(Scanner scan) {
        int strength;
        int dexterity;
        int constitution;
        int intelligence;
        int wisdom;
        int charisma;
        int luck;
        System.out.print("Assign Strength value: ");
        strength = scan.nextInt();
        System.out.print("Assign Dexterity value: ");
        dexterity = scan.nextInt();
        System.out.print("Assign Constitution value: ");
        constitution = scan.nextInt();
        System.out.print("Assign Intelligence value: ");
        intelligence = scan.nextInt();
        System.out.print("Assign Wisdom value: ");
        wisdom = scan.nextInt();
        System.out.print("Assign Charisma value: ");
        charisma = scan.nextInt();
        System.out.print("Assign Luck value: ");
        luck = scan.nextInt();
        scan.nextLine();
        return new Character(strength, dexterity, constitution, intelligence, wisdom, charisma, luck);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! We will now create a character!");
        Character MC = createCharacter(scan);
        System.out.println("What would you like your character to do?");
        String action = scan.nextLine();
        System.out.println("Which stat does this action use?");
        String stat = scan.nextLine();
        MC.characterAction(action, 20, stat);
        scan.close();
    }
}