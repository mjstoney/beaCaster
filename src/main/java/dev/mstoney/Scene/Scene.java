package dev.mstoney.Scene;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Scene {
    List<Wall> walls;
    public Scene() {
        walls = new ArrayList<>();
        walls.add(new Wall(2, 2, 799, 2));
        walls.add(new Wall(799, 0, 799, 599));
        walls.add(new Wall(799, 599, 1, 599));
        walls.add(new Wall(1, 600, 1, 1));
        walls.add(new Wall(600, 200, 600, 400));
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.red);
        for (Wall w : walls) {
            g2.drawLine((int) w.p1.x, (int) w.p1.y, (int) w.p2.x, (int) w.p2.y);
        }
        g2.setColor(null);
    }
}
