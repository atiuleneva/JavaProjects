package org.atiuleneva.dz08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MyGame extends JFrame {
    public final int SIZE = 3;
    public static final int CELLS_TO_WIN = 3;
    public static final String CELL_X = "X";
    public static final String CELL_O = "O";
    public static Random rand = new Random();
    public JButton [][] playField = new JButton[SIZE][SIZE];

    public MyGame() {
        setTitle("Test Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 500);
        setLayout(new GridLayout(SIZE, SIZE));
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                playField[i][j] = new JButton("");
                playField[i][j].setFont(new Font("Arial", Font.BOLD, 50));
                final int finalI = i;
                final int finalJ = j;
                playField[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        stepHuman(finalI, finalJ);
                    }
                });
                add(playField[i][j]);
            }
        }
    }

    public void stepHuman(int i, int j) {
        System.out.println("i = " + i + "; j = " + j);
        playField[i][j].setText(CELL_X);
        playField[i][j].setEnabled(false);
        if(!checkWin(CELL_X) && !isPlayFieldFull()){
            stepRobot();
        }
        else if (checkWin(CELL_X)){
            showEndGameMessage("Congratulation, you win!!!");
        }
        else {
            showEndGameMessage("Nobody wins!");
        }
    }

    public void stepRobot(){
        int i, j;
        do{
            i = rand.nextInt(SIZE);
            j = rand.nextInt(SIZE);
        } while (!playField[i][j].isEnabled() && !isPlayFieldFull());
        playField[i][j].setText(CELL_O);
        playField[i][j].setEnabled(false);
        if(checkWin(CELL_O)){
            showEndGameMessage("Sorry, you lose, robot is win!");
        }
        else if (isPlayFieldFull()) {
            showEndGameMessage("Nobody wins!");
        }
    }

    public boolean checkWin(String symb) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isLineToRight(i, j, symb)) return true;
                if (isLineToDown(i, j, symb)) return true;
                if (isLineToDiagonal(i, j, symb)) return true;
                if (isLineToNegDiagonal(i, j, symb)) return true;
            }
        }

        return false;
    }

    public boolean isLineToRight(int curi, int curj, String symb) {
        int num = 0;
        for (int i = curi; i < SIZE; i++) {
            if (playField[i][curj].getText() == symb) num++;

            if (num == CELLS_TO_WIN) return true;
        }

        return false;
    }

    public boolean isLineToDown(int curi, int curj, String symb) {
        int num = 0;
        for (int j = curj; j < SIZE; j++) {
            if (playField[curi][j].getText() == symb) num++;

            if (num == CELLS_TO_WIN) return true;
        }

        return false;
    }

    public boolean isLineToDiagonal(int curi, int curj, String symb) {
        int num = 0;
        for (int n = 0; n < CELLS_TO_WIN; n++) {
            if (n + curi >= SIZE || n + curj >= SIZE) break;

            if (playField[n + curi][n + curj].getText() == symb) num++;

            if (num == CELLS_TO_WIN) return true;
        }

        return false;
    }

    public boolean isLineToNegDiagonal(int curi, int curj, String symb) {
        int num = 0;
        for (int n = 0; n < CELLS_TO_WIN; n++) {
            if (curi - n <= 0 || n + curj >= SIZE) break;

            if (playField[curi - n][curj + n].getText() == symb) num++;

            if (num == CELLS_TO_WIN) return true;
        }

        return false;
    }

    public boolean isPlayFieldFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (playField[i][j].isEnabled()) return false;
            }
        }

        return true;
    }

    public void showEndGameMessage(String message) {
        JOptionPane optionPane = new JOptionPane(message, JOptionPane.YES_NO_OPTION);
        JDialog dlg = optionPane.createDialog("End Game");
        dlg.setAlwaysOnTop(true);

        int r = JOptionPane.showConfirmDialog(
                null,
                message + " Would you like to start new game?",
                "End Game",
                JOptionPane.YES_NO_OPTION
        );

        if (r == JOptionPane.YES_OPTION) {
            resetPlayField();
        }
        else {
            setVisible(false);
            dispose();
            System.exit(0);
        }
    }

    public void resetPlayField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                playField[i][j].setText("");
                playField[i][j].setEnabled(true);
            }
        }
    }
}