package dev.mstoney.Scene;

import dev.mstoney.math.Vec2;

import java.awt.*;

public class Ray {
    public Vec2 orig, dir;
    public Ray() {
        this.orig = new Vec2(0f, 0f);
        this.dir = new Vec2(0f, 1f);
    }
    public Ray(float x, float y) {
        this.orig = new Vec2(x, y);
        this.dir = new Vec2(1, 0);
    }
    public Ray(Vec2 o, Vec2 d) {
        this.orig = o;
        this.dir = d;
    }

    public Vec2 pointAt(float t) {
        return new Vec2(orig.x + dir.x * t, orig.y + dir.y * t);
    }

    public void draw(Graphics2D g2) {
        g2.drawLine((int) orig.x, (int) orig.y, (int) (orig.x + 20 * dir.x), (int) (orig.y + 20 * dir.y));
    }

}
