package org.atiuleneva.dz6;

public class Dog extends Animal {
    private int maxRunDistance = 500;
    private final double MAX_HEIGHT_JUMP = 0.5;
    private final int MAX_SWIM_DISTANCE = 10;

    public Dog(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public void run(int length) {
        if (length > 0 && length <= maxRunDistance){
            System.out.printf("Собака пробежала %d м.\r\n", length);
        }
        else if (length > maxRunDistance){
            System.out.printf("Собака отказалась бежать дистанцию %d м.\r\n", length);
        }
        else {
            System.out.printf("Собака сдаёт назад %d м.\r\n", length * -1);
        }
    }

    @Override
    public void jump(double height){
        if (height > 0 && height <= MAX_HEIGHT_JUMP){
            System.out.printf("Собака подпрыгнула на %.1f м.\r\n",height);
        }
        else if (height > MAX_HEIGHT_JUMP){
            System.out.printf("Собака отказалась прыгать %.1f м.\r\n", height);
        }
        else {
            System.out.printf("Собака выкопала ямку %.1f м.\r\n", height * -1);
        }
    }
    @Override
    public void swim(int length){
        if (length > 0 && length <= MAX_SWIM_DISTANCE){
            System.out.printf("Собака проплыла %d м.\r\n", length);
        }
        else if (length > MAX_SWIM_DISTANCE){
            System.out.printf("Собака отказалась плыть дистанцию %d м.\r\n", length);
        }
        else {
            System.out.printf("Собака нырнула на %d м.\r\n", length * -1);
        }

    }

}
