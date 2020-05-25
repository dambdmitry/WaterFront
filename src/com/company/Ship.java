package com.company;

public class Ship extends Thread{
    private int weightCapacity; //Вместимость корабля.
    private int travelTime; //Время за которое корабль перевозит руду.
    private WaterFront waterFront; //Порт.
    private int currentWeight; //Текущая нагруженность корабля.

    public Ship(int capacity, int time, WaterFront waterFront){
        this.weightCapacity = capacity;
        this.travelTime = time;
        this.waterFront = waterFront;
    }

    public void run() {
        try {
            while (true) {
                currentWeight = 0;
                while (currentWeight <= weightCapacity) {
                    waterFront.fromWaterFront();
                    currentWeight++;
                    yield();
                }
                sleep(travelTime*1000);
            }
        } catch (Exception e) {
            System.out.println("Кораблик затерялся");
            System.out.println(e.getMessage());
        }
    }
}
