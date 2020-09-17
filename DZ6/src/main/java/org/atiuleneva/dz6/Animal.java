package org.atiuleneva.dz6;

public class Animal {
    public void run (int length) {
        System.out.printf("Животное пробежало %d метров\r\n", length);
    }

    public void jump (double height) {
        System.out.printf("Животное подпрыгнуло на %.1f м.\r\n",height);
    }

    public void swim (int length) {
        System.out.printf("Животное проплыло %d метров\r\n", length);
    }
}
