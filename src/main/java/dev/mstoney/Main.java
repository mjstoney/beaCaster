package dev.mstoney;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int SCREENWIDTH = 800;
        int SCREENHEIGHT = 600;
        int FPS = 60;
        JFrame window = new JFrame();
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);

        GamePanel gamePanel = new GamePanel(SCREENWIDTH, SCREENHEIGHT, FPS);

        window.add(gamePanel);
        window.pack();
        gamePanel.startGameThread();
    }
}