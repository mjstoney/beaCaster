package dev.mstoney;

import dev.mstoney.Entity.Player;
import dev.mstoney.Scene.Scene;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    public int FPS, w, h;
    Thread mainThread;
    Scene scene;
    Player player;
    GamePanel() {
        this.w = 800;
        this.h = 600;
        init();
    }

    GamePanel(int width, int height, int FPS) {
        this.w = width;
        this.h = height;
        this.FPS = FPS;
        init();
    }

    void init() {
        this.setPreferredSize(new Dimension(w, h));
        this.setBackground(Color.black);
        this.scene = new Scene();
        this.player = new Player(200, 300);
    }
    void startGameThread() {
        mainThread = new Thread(this);
        mainThread.start();

    }

    @Override
    public void run() {
        double drawInterval = (double) 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;
        while(mainThread != null){
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;
            if(delta >= 1){
                update();
                repaint();
                delta--;
                drawCount++;

            }
            if(timer >= 1000000000){
                System.out.println("FPS:" + drawCount);
                drawCount = 0;
                timer = 0;
            }
        }
    }

    public void update() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        scene.draw(g2);
        player.draw(g2);
    }
}
