package com.company;

import com.company.GamePlay.Grid;
import com.company.GamePlay.PointsSystem;

public class Main {

    public static void main(String[] args) {

        Grid grid = new Grid();
        System.out.println(grid);
        PointsSystem pointsSystem = new PointsSystem(2,"O", grid);
        PointsSystem pointsSystem1 = new PointsSystem(2 , "O", grid);
        pointsSystem.setSymbol();
        pointsSystem1.setSymbol();
        System.out.println(grid);
    }
}
