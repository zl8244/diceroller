package ptui.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Command {

    private static Scanner scan = new Scanner(System.in);
    
    public static void showMenu() {
        
    }

    private static boolean isIntInput(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch(final NumberFormatException e) {
            return false;
        }
    }

    private static int scanInt() {
        String input = scan.nextLine();
        while(!isIntInput(input)) {
            System.out.println("Please input a number");
            input = scan.nextLine();
        }
        return Integer.parseInt(input);
    }

    public static Character createCharacter() {
        Character c = new Character();
        System.out.println("What is the character's name?");
        c.setName(scan.nextLine());
        System.out.print("Assign Strength value out of 10: ");
        c.setStr(scanInt());
        System.out.print("Assign Dexterity value out of 10: ");
        c.setDex(scanInt());
        System.out.print("Assign Constitution value out of 10: ");
        c.setCon(scanInt());
        System.out.print("Assign Intelligence value out of 10: ");
        c.setInt(scanInt());
        System.out.print("Assign Wisdom value out of 10: ");
        c.setWis(scanInt());
        System.out.print("Assign Charisma value out of 10: ");
        c.setCha(scanInt());
        System.out.print("Assign Luck value out of 10: ");
        c.setLuck(scanInt());
        System.out.println("Character created!");
        return c;
    }

    public static Character selectCharacter(ArrayList<Character> characters) {
        System.out.println("Please select a character: ");
        for(int i = 0; i < characters.size(); i++) {
            System.out.println("(" + (i+1) + ") " + characters.get(i));
        }
        int index = scanInt()-1;
        return characters.get(index);
    }
}
