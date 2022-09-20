package com.company.GamePlay;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Grid {
    private String[][] grid;

    public Grid() {
        this.grid = new String[][]{
                {"X", "X", "X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X", "X", "X"}
        };
    }

    public String getGrid() {
        return this.grid.toString();
    }

    public String[] getGridField(int column){
        return this.grid[column];
    }

    public String getExactField(int column, int row){
        return this.grid[column][row];
    }

    public int getGridLength(){
        return this.grid.length;
    }

    public void setGrid(String symbol, int column, int row) {
        this.grid[column][row] = symbol;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i + 0].length; j++){
                temp += grid[i][j] + "    ";
            }
            temp += "\n";
        }
        return temp;
    }
}
