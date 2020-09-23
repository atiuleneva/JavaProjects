package org.atiuleneva.dz07;

import com.sun.istack.internal.NotNull;

public class Cat {
    private int appetite;
    private String name;

    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(@NotNull Plate bowl){
        if (!bowl.isEmpty()) {
            int eatenFood = bowl.decreaseFood(appetite);
            appetite = appetite - eatenFood;
            System.out.printf("%s съел из миски %s %d гр \r\n", name, bowl.getColor(), eatenFood);
        }
        else {
            System.out.printf("%s понюхал пустую миску %s \r\n", name, bowl.getColor());
        }
    }

    public boolean isWellFed(){
        if (appetite == 0){
            System.out.printf("%s сытый!\r\n", name);
            return true;
        }
        System.out.printf("%s не наелся! Аппетит = %d \r\n", name, appetite);
        return false;

    }


}
