package org.atiuleneva.dz08;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        UIManager.put("Button.disabledText", Color.blue);
        MyGame myGame = new MyGame();
        myGame.setVisible(true);
    }
}
