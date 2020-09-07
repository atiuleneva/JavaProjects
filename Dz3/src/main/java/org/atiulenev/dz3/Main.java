package org.atiulenev.dz3;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число! Удачи!");

        while (true) {
            boolean isVictory = guessTheNumber(10);
            if (isVictory) {
                System.out.println("Поздравляю! Вы выиграли!!!");
            } else {
                System.out.println("Вы проиграли!!!");
            }
            System.out.println("Хотите сыграть ещё? 1 – повторить, 0 – нет");
            int attempts = scanner.nextInt();
            if (attempts == 0){
                break;
            }
        }

        scanner.close();
    }

    // play one turn of game
    public static boolean guessTheNumber (int range) {
        int number = (int) (Math.random() * range);
        boolean isWin = false;
        // three tries to guess
        for (int i = 0; i < 3; i++) {
            System.out.println("Угадайте число от 0 до " + (range - 1) +  ". У вас есть три попытки.");
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали!");
                isWin = true;
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
                isWin = false;
            } else {
                System.out.println("Загаданное число больше");
                isWin = false;
            }
        }

        return isWin; // true/false
    }

}
