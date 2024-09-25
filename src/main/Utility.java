package main;

public class Utility {
    
    public String normalize(String hand) {
        if (hand.length() == 2) return hand.toUpperCase();
        String ranks = "AKQJT98765432";
        char firstCard = Character.toUpperCase(hand.charAt(0));
        char secondCard = Character.toUpperCase(hand.charAt(1));
        char suited = Character.toLowerCase(hand.charAt(2));

        // Reorder the hand if second card has higher rank than first card
        if (ranks.indexOf(secondCard) < ranks.indexOf(firstCard)) {
            char temp = firstCard;
            firstCard = secondCard;
            secondCard = temp;
        }

        return "" + firstCard + secondCard + suited;
    }

    public int[] getHandIndex(String hand, String[][] chart) {
        int[] handIndex = {-1, -1};

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if (hand.equals(chart[i][j])) {
                    handIndex[0] = i;
                    handIndex[1] = j;

                    return handIndex;
                }
            }
        }

        return handIndex;
    }

    public int getTableValue(int[] handIndex, int[][] table) {
        int row = handIndex[0];
        int col = handIndex[1];

        return table[row][col];
    }
}
