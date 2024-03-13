package ptui.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static boolean firstLaunch = true;

    public static void displayMenu() {
        if(firstLaunch) {
            System.out.println("Welcome! What would you like to do?");
        } else {
            System.out.println("What would you like to do next?");
        }
        System.out.println("(1) Create a new Character");
        System.out.println("(2) Roll the dice");
        System.out.println("(q) Quit");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Character> characters = new ArrayList<>();
        displayMenu();
        String input = scan.nextLine();
        while(!input.equals("q")) {
            firstLaunch = false;
            switch (input) {
                case "1":
                    characters.add(Command.createCharacter());
                    displayMenu();
                    input = scan.nextLine();
                break;

                case "2":
                    if(characters.size() == 0) {
                        System.out.println("Please create a character first!");
                        displayMenu();
                        input = scan.nextLine();
                        break;
                    }
                    Character c = Command.selectCharacter(characters);
                    System.out.println("What would you like " + c.getName() + " to do?");
                    String action = scan.nextLine();
                    System.out.println("Which stat does that use?");
                    System.out.println("\t-str\n\t-dex\n\t-con\n\t-int\n\t-wis\n\t-cha");
                    String stat = scan.nextLine();
                    c.characterAction(action, stat);
                    displayMenu();
                    input = scan.nextLine();
                break;
            }
        }
        scan.close();
    }
}