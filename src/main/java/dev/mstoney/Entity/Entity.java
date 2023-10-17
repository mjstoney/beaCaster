package dev.mstoney.Entity;

import dev.mstoney.Scene.Ray;
public abstract class Entity {
    public float x, y;
    Ray ptr;
    public Entity(float x, float y) {
        this.x = x;
        this.y = y;
        ptr = new Ray(x, y);

    }
}
