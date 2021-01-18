package com.model;

import java.util.Random;

public class SpaceX implements IStart {
    Random random=new Random();
    @Override
    public boolean preStartCheck() {
        int randomValue= random.nextInt(10);
        if (randomValue>8){
            return true;
        }
        return false;
    }

    @Override
    public void runEngine() {
        System.out.println("Двигатели com.model.SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт com.model.SpaceX");
    }
}
