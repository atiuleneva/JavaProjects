package org.atiuleneva.dz6;


public class Cat extends Animal {
    private final int MAX_RUN_DISTANCE = 200;
    private final int MAX_HEIGHT_JUMP = 2;

    @Override
    public void run(int length) {
        if (length > 0 && length <= MAX_RUN_DISTANCE){
            System.out.printf("Кот пробежал %d м.\r\n", length);
        }
        else if (length > MAX_RUN_DISTANCE){
            System.out.printf("Кот отказался бежать дистанцию %d м.\r\n", length);
        }
        else {
            System.out.printf("Кот сдаёт назад %d м.\r\n", length * -1);
        }
    }

    @Override
    public void jump(double height){
        if (height > 0 && height <= MAX_HEIGHT_JUMP){
            System.out.printf("Кот подпрыгнул на %.1f м.\r\n",height);
        }
        else if (height > MAX_HEIGHT_JUMP){
            System.out.printf("Кот отказался прыгать %.1f м.\r\n", height);
        }
        else {
            System.out.printf("Кот выкопал ямку %.1f м.\r\n", height * -1);
        }
    }
    @Override
    public void swim(int length){
        System.out.println("Кот не умеет плавать.");
    }


}
