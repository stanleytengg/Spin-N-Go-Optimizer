package main;

public class Player {
    private String position;
    private String hand;
    private double stack;
    private final LoadTables tables;
    private final Utility util;

    public Player() {
        position = "SB";
        hand = null;
        stack = 20.0;
        tables = new LoadTables();
        util = new Utility();
    }

    public String getPosition() {
        return position;
    }

    public String getHand() {
        return hand;
    }

    public double getStack() {
        return stack;
    }

    public void update(String position, String hand, double stack) {
        this.position = position;
        hand = util.normalize(hand);
        this.hand = hand;
        this.stack = stack;
    }

    public String action() {
        int[] handIndex = util.getHandIndex(hand, tables.getChart());
        int[][] table;
        int val;
        switch (position) {
            case ("SB") -> { 
                if (stack <= 10.0 && stack > 7.0) {
                    table = tables.getSbTable("ten");
                    val = util.getTableValue(handIndex, table);
                    
                    if (val == 1) return "PUSH!";
                    else return "FOLD!";
                }

                else if (stack <= 7.0 && stack > 5.0) {
                    table = tables.getSbTable("seven");
                    val = util.getTableValue(handIndex, table);

                    if (val == 1) return "PUSH!";
                    else return "FOLD!";
                }

                else if (stack <= 5.0) {
                    table = tables.getSbTable("five");
                    val = util.getTableValue(handIndex, table);

                    if (val == 1) return "PUSH!";
                    else return "FOLD!";
                }

                else {
                    table = tables.getSbTable("greater");
                    val = util.getTableValue(handIndex, table);

                    if (val == 1) return "MINRAISE 2.5BB";
                    else return "FOLD!";
                }
            }

            case ("BTN") -> {
                if (stack <= 10.0 && stack > 7.0) {
                    table = tables.getBtnTable("ten");
                    val = util.getTableValue(handIndex, table);
                    
                    if (val == 1) return "PUSH!";
                    else return "FOLD!";
                }

                else if (stack <= 7.0 && stack > 5.0) {
                    table = tables.getBtnTable("seven");
                    val = util.getTableValue(handIndex, table);

                    if (val == 1) return "PUSH!";
                    else return "FOLD!";
                }

                else if (stack <= 5.0) {
                    table = tables.getBtnTable("five");
                    val = util.getTableValue(handIndex, table);

                    if (val == 1) return "PUSH!";
                    else return "FOLD!";
                }

                else {
                    table = tables.getBtnTable("greater");
                    val = util.getTableValue(handIndex, table);

                    if (val == 1) return "MINRAISE 2.5BB";
                    else return "FOLD!";
                }
            }
            
            default -> {
                return "Big Blind's strategy is not available yet...";
            }
        }
    }

}
