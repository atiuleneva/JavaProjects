package org.atiuleneva.dz07;

public class Main {
    public static void main (String [] args){
        Cat [] cats = new Cat[4];
        cats[0] = new Cat ("Barsik", 40);
        cats[1] = new Cat ("Pushok", 60);
        cats[2] = new Cat ("Vaska", 30);
        cats[3] = new Cat ("Tom", 40);

        Plate [] bowls = new Plate[4];
        bowls [0] = new Plate(20, "red");
        bowls [1] = new Plate(30, "green");
        bowls [2] = new Plate(50, "blue");
        bowls [3] = new Plate(40, "white");

        for (int i=0; i<cats.length; i++){
            System.out.println("==========================================");
            Cat cat = cats[i];
            for(int j = 0; j < bowls.length; j++){
                Plate bowl = bowls [j];
                cat.eat(bowl);
                if (cat.isWellFed()){
                    break;
                }
            }
        }
    }

}
