package com.company;

public class WaterFront {
    private int ironstone = 0; //Количество железной руды в порту.
    final static private int maxAmountIronstone = 25_000; //Максимальное количество руды которое вмещает порт.

    public synchronized void toWaterFront() throws Exception{
        while (ironstone == maxAmountIronstone){
            wait();
        }
        ironstone++;
        System.out.println("В порт завезли стало " + ironstone + " тонн руды");
        notify();
    }

    public synchronized void fromWaterFront() throws Exception{
        while(ironstone == 0){
            wait();
        }
        ironstone--;
        System.out.println("Из порта вывезли, осталось " + ironstone + " тонн руды");
        notify();
    }
}
