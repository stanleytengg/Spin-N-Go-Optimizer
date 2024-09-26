package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private final Player player;
    private final InputValidator validator;
    private final Scanner scanner;

    public Game() {
        this.player = new Player();
        this.validator = new InputValidator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("System starting...");

        while (true) { 
            play();
            if (end()) break;
        }
    }

    private void play() {
        String position = getPosition();
        String hand = getHand();
        double stack = getStack();
        player.update(position, hand, stack);
        String action = player.action();
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Recommended action: " + action);
        System.out.println("-----------------------------");
        System.out.println();
    }

    private String getPosition() {
        while (true) { 
            System.out.print("Enter your position (SB/BTN/BB): ");
            String position = scanner.nextLine().toUpperCase();
            if (validator.isValidPosition(position)) return position;
            else System.out.println("Invalid position! Needs to be SB or BTN or BB");
        }
    }

    private String getHand() {
        while (true) { 
            System.out.print("Enter your hand: ");
            String hand = scanner.nextLine();
            if (validator.isValidHand(hand)) return hand;
            else System.out.println("Invalid hand or didn't specify suited or offsuited!");
        }
    }

    private double getStack() {
        while (true) {
            try {
                System.out.print("Enter your stack: ");
                double stack = scanner.nextDouble();
                scanner.nextLine();
                if (validator.isValidStack(stack)) return stack;
                else System.out.println("Invalid stack! Stack must be greater than 0.");
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.nextLine();
            }
        }
    }

    private boolean end() {
        System.out.print("Terminate? (Y/N) ");
        String terminate = scanner.nextLine().trim();
        return terminate.equalsIgnoreCase("Y");
    }
}
