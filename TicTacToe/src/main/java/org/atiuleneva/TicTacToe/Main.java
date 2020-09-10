package org.atiuleneva.TicTacToe;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static final int SIZE = 4;
    public static final int CELLS_TO_WIN = 3;

    public static final char CELL_EMPTY = '·';
    public static final char CELL_ZERO = '⊞';
    public static final char CELL_X = 'X';
    public static final char CELL_O = 'O';

    public static char [][] playField = new char[SIZE][SIZE];
    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        resetPlayField();
        printPlayField();

        while (true){
            stepHuman();
            printPlayField();
            if(checkWin(CELL_X)) {
                System.out.println("Вы победили! Поздравляем!!!");
                break;
            }
            else if (isPlayFieldFull()){
                System.out.println("Все ходы исчерпаны. Попробуйте заново!");
                break;
            }

            stepRobot();
            printPlayField();

            if (checkWin(CELL_O)){
                System.out.println("Победил робот!");
                break;
            }
            else if (isPlayFieldFull()){
                System.out.println("Все ходы исчерпаны. Попробуйте заново!");
                break;
            }
        }
    }

    public static void printPlayField() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(playField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void resetPlayField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                playField[i][j] = CELL_EMPTY;
                if (i == 0 && j==0) {
                    playField[i][j] = CELL_ZERO;
                }
                else if (i == 0){
                    playField[i][j] = (char)(48 + j);
                }
                else if (j == 0){
                    playField[i][j] = (char)(48 + i);
                }
            }
        }
    }

    public static void stepHuman(){
        System.out.println("Введите координаты вашего хода.");
        int i, j;
        do {
            System.out.print("Номер строки: ");
            i = scanner.nextInt();
            System.out.print("Номер столбца: ");
            j = scanner.nextInt();
        } while (!isValidCell(i, j, true));
        playField[i][j] = CELL_X;
    }

    public static boolean isValidCell(int i, int j, boolean isHuman) {
        if(i>0 && i<SIZE && j>0 && j< SIZE){
            if (playField[i][j] == CELL_EMPTY)
                return true;
        }
        if (isHuman)
            System.out.println("Вы ввели некорректные координаты, повторите ввод");
        return false;
    }

    public static void stepRobot(){
        int i, j;
        do{
            i = rand.nextInt(SIZE);
            j = rand.nextInt(SIZE);
        } while (!isValidCell(i, j, false));
        playField[i][j] = CELL_O;
        System.out.println("Робот сходил в ячейку " + i + "/" + j);
    }

    public static boolean checkWin(char symb) {
      /*  if(playField[1][1] == symb && playField[1][2] == symb && playField[1][3] == symb) return true;
        if(playField[2][1] == symb && playField[2][2] == symb && playField[2][3] == symb) return true;
        if(playField[3][1] == symb && playField[3][2] == symb && playField[3][3] == symb) return true;
        if(playField[1][1] == symb && playField[2][1] == symb && playField[3][1] == symb) return true;
        if(playField[1][2] == symb && playField[2][2] == symb && playField[3][2] == symb) return true;
        if(playField[1][3] == symb && playField[2][3] == symb && playField[3][3] == symb) return true;
        if(playField[1][1] == symb && playField[2][2] == symb && playField[3][3] == symb) return true;
        if(playField[3][1] == symb && playField[2][2] == symb && playField[1][3] == symb) return true;
        return false;*/
        for (int i = 1; i < SIZE; i++) {
            for (int j = 1; j < SIZE; j++) {
                if (isLineToRight(i, j, symb)) return true;
                if (isLineToDown(i, j, symb)) return true;
                if (isLineToDiagonal(i, j, symb)) return true;
                if (isLineToNegDiagonal(i, j, symb)) return true;
            }
        }

        return false;
    }

    public static boolean isLineToRight(int curi, int curj, char symb) {
        int num = 0;
        for (int i = curi; i < SIZE; i++) {
            if (playField[i][curj] == symb) num++;

            if (num == CELLS_TO_WIN) return true;
        }

        return false;
    }

    public static boolean isLineToDown(int curi, int curj, char symb) {
        int num = 0;
        for (int j = curj; j < SIZE; j++) {
            if (playField[curi][j] == symb) num++;

            if (num == CELLS_TO_WIN) return true;
        }

        return false;
    }

    public static boolean isLineToDiagonal(int curi, int curj, char symb) {
        int num = 0;
        for (int n = 0; n < CELLS_TO_WIN; n++) {
            if (n + curi >= SIZE || n + curj >= SIZE) break;

            if (playField[n + curi][n + curj] == symb) num++;

            if (num == CELLS_TO_WIN) return true;
        }

        return false;
    }

    public static boolean isLineToNegDiagonal(int curi, int curj, char symb) {
        int num = 0;
        for (int n = 0; n < CELLS_TO_WIN; n++) {
            if (curi - n <= 0 || n + curj >= SIZE) break;

            if (playField[curi - n][curj + n] == symb) num++;

            if (num == CELLS_TO_WIN) return true;
        }

        return false;
    }

    public static boolean isPlayFieldFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (playField[i][j] == CELL_EMPTY) return false;
            }
        }

        return true;
    }
}
