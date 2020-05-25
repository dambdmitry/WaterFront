package com.company;

public class Train extends Thread {
    private int weightCapacity; //Вместимость поезда.
    private int currentWeight; //Текущая вместимость.
    private WaterFront waterFront; //Порт.
    private int travelTime; //Время пути.

    public Train(int capacity, int time, WaterFront waterFront){
        this.weightCapacity = capacity;
        this.travelTime = time;
        this.waterFront = waterFront;
    }

    public void run(){
        try {
            while (true) {
                currentWeight = weightCapacity;
                while (currentWeight > 0) {
                    waterFront.toWaterFront();
                    currentWeight--;
                    yield();
                }
                sleep(travelTime*1000);
            }
        } catch (Exception e) {
            System.out.println("Поезд затерялся");
            System.out.println(e.getMessage());
        }
    }
}
