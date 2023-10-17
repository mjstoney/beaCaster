package dev.mstoney.Entity;

import java.awt.*;

public class Player extends Entity {

    public Player(float x, float y) {
        super(x, y);
    }

    public void draw(Graphics2D g2) {
        g2.drawOval((int) this.x - 5, (int) this.y - 5, 10, 10);
        ptr.draw(g2);
    }
}
