package org.atiuleneva.dz2;

import java.util.Arrays;

public class Main {
    public static void main (String [] args){
        task1();
        task2();
        task3();
        task4();
        task5();

        // task 6
        int [] arrMiddle = {3, 3, 4, 5, 2, 1, 2};
        boolean isLeftEqualRight = task6(arrMiddle);
        System.out.println("Is left equal right: " + isLeftEqualRight);

        int [] arrMiddle2 = {5, 6, 4, 5, 2, 1, 2, 9, -10};
        isLeftEqualRight = task6(arrMiddle2);
        System.out.println("Is left equal right: " + isLeftEqualRight);

        int [] arrMiddle3 = {5, 6, 2, 5, 2, 1, 2, 9, -10};
        isLeftEqualRight = task6(arrMiddle3);
        System.out.println("Is left equal right: " + isLeftEqualRight);
    }

    public static void task1 () {
        int [] onesAndZeros = {1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0};
        System.out.println("Before: " + Arrays.toString(onesAndZeros));
        for (int i = 0; i < onesAndZeros.length; i++){
           if (onesAndZeros[i] == 0)
               onesAndZeros[i] = 1;
           else
               onesAndZeros[i] = 0;
        }
        System.out.println("After: " + Arrays.toString(onesAndZeros));
    }

    public static void task2 () {
        int [] orderedNumbers = new int[8];
        for (int i = 0; i < orderedNumbers.length; i++){
            orderedNumbers[i] = i * 3;
        }
        System.out.println("Task #2 result: " + Arrays.toString(orderedNumbers));
    }
    public static void task3 (){
        int [] factorOnTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i< factorOnTwo.length; i++){
            if (factorOnTwo[i] < 6) {
                factorOnTwo[i] = factorOnTwo[i] * 2;
            }
        }
        System.out.println("Task #3 result: " + Arrays.toString(factorOnTwo));
    }
    public static void task4 (){
        int [] [] square = new int[7][7];
        // fill up
        for (int i = 0; i < square.length; i++){
            square [i][i] = 1;
            square[i][square.length-1-i]= 1;
        }

        // print out in console
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++){
                System.out.print(square[i][j] + " ");
            }
            System.out.println("");
        }

    }
    public static void task5 () {
        int[] arrMinMax = {7, 5, 23, 0, 11, 4, 35, -12, 4, 8, -9, 1};
        int numMin = arrMinMax[0];
        int numMax = arrMinMax[0];
        for (int i = 0; i < arrMinMax.length; i++) {
            if (numMin > arrMinMax[i]) {
                numMin = arrMinMax[i];
            }
            if (numMax<arrMinMax[i]){
                numMax = arrMinMax[i];
            }
        }

        System.out.println("MIN: " + numMin);
        System.out.println("MAX: " + numMax);
    }

    public static boolean task6 (int [] arrMiddle) {
        int sum = 0;
        for (int i = 0; i < arrMiddle.length; i++) {
            sum += arrMiddle[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arrMiddle.length; i++) {
            leftSum += arrMiddle[i];
            sum -= arrMiddle[i];
            if (sum == leftSum) {
                return true;
            }
        }
        return false;
    }
}
