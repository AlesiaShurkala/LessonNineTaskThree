package com.model;

import java.util.Random;

public class Shuttle implements IStart {
Random random=new Random();

    @Override
    public boolean preStartCheck() {
       int randomValue= random.nextInt(10);
       if (randomValue>3){
           return true;
       }
       return false;
       }

    @Override
    public void runEngine() {
        System.out.println("Двигатели шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт шатла");
    }
}
