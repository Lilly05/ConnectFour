package com.company;

import com.company.GamePlay.Grid;
import com.company.GamePlay.Spot;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Grid grid = new Grid();
    static Spot spotPlayer1 = new Spot(Spot.Symbol.X, grid);
    static Spot spotPlayer2 = new Spot(Spot.Symbol.O, grid);
    static String player1;
    static String player2;

    public static void main(String[] args) {
        startGame();
        choseSpots();
    }
    public static void startGame(){
        System.out.println("***** WELCOME TO CONNECT FOUR *****");

        System.out.println("Player 1 please enter your name: ");
        player1 = scanner.next();
        System.out.println("Welcome " + player1 + "\nYour symbol is X");

        System.out.println("Player 2 please enter your name: ");
        player2 = scanner.next();
        System.out.println("Welcome " + player2 + "\nYour symbol is O");

        System.out.println("\nHere's your grid\n");
        System.out.println(grid);
    }

    public static void choseSpots(){
        int spot;
        while(true) {
            System.out.println(player1 + " enter the number of the column where you want to set your symbol");
            spot = scanner.nextInt();
            spotPlayer1.setSymbol(spot -1);
            System.out.println(grid);

            System.out.println(player2 + " enter the number of the column where you want to set your symbol");
            spot = scanner.nextInt();
            spotPlayer2.setSymbol(spot-1);
            System.out.println(grid);


        }
    }
}
