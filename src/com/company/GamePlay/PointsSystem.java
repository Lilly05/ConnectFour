package com.company.GamePlay;

public class PointsSystem {
    private int column;
    private String symbol;
    private Grid grid;

    public PointsSystem(int column, String symbol, Grid grid) {
        this.column = column;
        this.symbol = symbol;
        this.grid = grid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol() {
        boolean isSymbolSet = false;
        for (int i = 0; i < this.grid.getGridLength(); i++) {
            for (int row = 5; i > 0; row--) { // For the symbol to be at the bottom, not at the top of the column
                if (this.grid.getExactField(row, column).equals("X")) {
                    this.grid.setGrid(this.symbol, row, column);
                    isSymbolSet = true;
                    break;
                }
                if (isSymbolSet) {
                    break;
                }
            }
        }
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public int getColumn(){
        return this.column;
    }

    public void setColumn(int column){
        this.column = column;
    }
}
