package main;

public class InputValidator {
    public boolean isValidPosition(String position) {
        return  position.equalsIgnoreCase("SB") || 
                position.equalsIgnoreCase("BTN") ||
                position.equalsIgnoreCase("BB");
    }

    public boolean isValidHand(String hand) {
        if (hand.length() < 2) return false;

        String validRanks = "AKQJT98765432";
        String validSuits = "os";
        String firstCard = String.valueOf(hand.charAt(0)).toUpperCase();
        String secondCard = String.valueOf(hand.charAt(1)).toUpperCase();

        switch (hand.length()) {
            case (2) -> { 
                return  hand.charAt(0) == hand.charAt(1) &&
                        validRanks.contains(firstCard);
            }
            
            case (3) -> { 
                String suit = String.valueOf(hand.charAt(2));
                return  hand.charAt(0) != hand.charAt(1) &&
                        validRanks.contains(firstCard) &&
                        validRanks.contains(secondCard) &&
                        validSuits.contains(suit);
            }
            
            default -> {
                return false;
            }
        }
    }

    public boolean isValidStack(double stack) {
        return stack > 0.0;
    }
}
