package org.atiuleneva.dz6;

public class Main {
    public static void main (String [] args){

        Animal [] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog(500);
        animals[2] = new Dog(400);
        animals[3] = new Dog(600);
        for (int i=0; i < animals.length; i++){
            animals[i].run(100);
            animals[i].run(400);
            animals[i].run(600);
            animals[i].run(900);
            animals[i].run(-20);
            animals[i].jump(0.5);
            animals[i].jump(1);
            animals[i].jump(-1);
            animals[i].swim(10);
            animals[i].swim(-10);
            System.out.println("================================================");
        }
//        Cat cat1 = new Cat();
//        cat1.run(170);
//        cat1.run(250);
//        cat1.run(-56);
//        System.out.println("--------------------------------------");
//        cat1.jump(1.5);
//        cat1.jump(3);
//        cat1.jump(-1);
//        System.out.println("--------------------------------------");
//        cat1.swim(18);
//        System.out.println("--------------------------------------");
//        Dog dog1 = new Dog(500);
//        Dog dog2 = new Dog(400);
//        Dog dog3 = new Dog(600);
//        dog1.run(450);
//        dog1.run(700);
//        dog1.run(-10);
//        System.out.println("--------------------------------------");
//        dog2.run(350);
//        dog2.run(500);
//        dog2.run(-5);
//        System.out.println("--------------------------------------");
//        dog3.run(570);
//        dog3.run(900);
//        dog3.run(-4);
//        System.out.println("--------------------------------------");
//        dog1.jump(0.3);
//        dog1.jump(1);
//        dog1.jump(-0.4);
//        System.out.println("--------------------------------------");
//        dog1.swim(5);
//        dog1.swim(20);
//        dog1.swim(-3);


    }
}
