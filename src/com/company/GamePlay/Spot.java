package com.company.GamePlay;

import java.util.Scanner;

public class Spot {
    public enum Symbol{
        X, O
    }
    private int column;
    private Symbol symbol;
    private Grid grid;

    public Spot(Symbol symbol, Grid grid) {
        this.symbol = symbol;
        this.grid = grid;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(int column) {
        this.setColumn(column);
        boolean isSymbolSet = false;
        for (int i = 0; i < this.grid.getGridLength(); i++) {
            for (int row = 6; row > 0; row--) { // For the symbol to be at the bottom, not at the top of the column
                if (this.grid.getExactField(row, this.column).equals("_")) {
                    this.grid.setGrid(this.symbol, row, this.column);
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
            while(column > 6 || column < 0){
                System.out.println("Please enter a column number between 1 and 7");
                Scanner scanner = new Scanner(System.in);
                column = scanner.nextInt() -1;
            }
        this.column = column;
    }
}
