package org.atiuleneva.dz07;

public class Plate {
    private int food;
    private String color;
    public Plate (int food, String color){
        this.food = food;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public boolean isEmpty(){
        return (food == 0);
    }

    public void addFood(int food) {
        if (food > 0) {
            this.food = this.food + food;
        }
    }

    public int decreaseFood(int food){
        if (this.food >= food){
            this.food = this.food - food;
            return food;
        }
        else {
            int tmpFood = this.food;
            this.food = 0;
            return tmpFood;
        }
    }
}
