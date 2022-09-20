package com.company.GamePlay;

public class Grid {
    private String[][] grid;

    public Grid() {
        this.grid = new String[][]{
                {"1", "2", "3", "4", "5", "6", "7"},
                {"_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_"}
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

    public void setGrid(Spot.Symbol symbol, int column, int row) {
        this.grid[column][row] = symbol.toString();
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

    public boolean winGame(){
        for(int column = 0; column < grid.length; column++) {
            for (int row = 0; row < grid[1].length; row++) {
                if(grid[column][row].equals(Spot.Symbol.O)){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
}
