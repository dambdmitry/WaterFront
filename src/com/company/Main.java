package com.company;

public class Main {

    public static void main(String[] args) {
        WaterFront waterFront = new WaterFront();

        //Поезда.
        Thread train1 = new Train(2400, 2, waterFront);
        Thread train2 = new Train(1800, 5, waterFront);
        Thread train3 = new Train(2700, 7, waterFront);
        Thread train4 = new Train(1400, 6, waterFront);
        Thread train5 = new Train(2400, 11, waterFront);

        //Корабли.
        Thread ship1 = new Ship(10_000, 15, waterFront);
        Thread ship2 = new Ship(20_000, 38, waterFront);
        Thread ship3 = new Ship(7000, 7, waterFront);

        train1.start();
        train2.start();
        train3.start();
        train4.start();
        train5.start();

        ship1.start();
        ship2.start();
        ship3.start();
    }
}
