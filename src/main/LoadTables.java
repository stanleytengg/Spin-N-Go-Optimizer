package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LoadTables {
    private final HashMap<String, int[][]> btnTables, sbTables;
    private final String[][] chart;

    public LoadTables() {
        btnTables = new HashMap<>();
        sbTables = new HashMap<>();
        chart = new String[13][13];
        loadTables();
    }

    private void loadTables() {
        loadTable(btnTables, "greater", "resources/tables/btn/greaterThan/table.txt");
        loadTable(btnTables, "ten", "resources/tables/btn/lessThan/tenBB.txt");
        loadTable(btnTables, "seven", "resources/tables/btn/lessThan/sevenBB.txt");
        loadTable(btnTables, "five", "resources/tables/btn/lessThan/fiveBB.txt");
        loadTable(sbTables, "greater", "resources/tables/sb/greaterThan/table.txt");
        loadTable(sbTables, "ten", "resources/tables/sb/lessThan/tenBB.txt");
        loadTable(sbTables, "seven", "resources/tables/sb/lessThan/sevenBB.txt");
        loadTable(sbTables, "five", "resources/tables/sb/lessThan/fiveBB.txt");
        loadChart();
    }

    private void loadTable(HashMap<String, int[][]> tables, String stackSize, String filePath) {
        int[][] data = new int[13][13];
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < 13; i++) {
                String line = br.readLine();
                String[] values = line.split(" ");
                for (int j = 0; j < 13; j++)
                    data[i][j] = Integer.parseInt(values[j]);
            }

            tables.put(stackSize, data);
        } catch (IOException e) {
            System.err.println("Error loading file: " + filePath);
        }
    }

    public int[][] getBtnTable(String stackSize) {
        return btnTables.get(stackSize);
    }

    public int[][] getSbTable(String stackSize) {
        return sbTables.get(stackSize);
    }

    private void loadChart() {
        String filePath = "resources/tables/table.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < 13; i++) {
                String line = br.readLine();
                String[] values = line.split(" ");
                System.arraycopy(values, 0, chart[i], 0, 13);
            }
        } catch (IOException e) {
            System.err.println("Error loading file: " + filePath);
        }
    }

    public String[][] getChart() {
        return chart;
    }
}

