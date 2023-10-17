package dev.mstoney.Scene;

import dev.mstoney.math.Vec2;

public class Wall {
    Vec2 p1, p2;
    Wall(Vec2 p1, Vec2 p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    Wall(float x1, float y1, float x2, float y2) {
        this.p1 = new Vec2(x1, y1);
        this.p2 = new Vec2(x2, y2);
    }


}
