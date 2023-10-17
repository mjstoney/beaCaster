package dev.mstoney.math;

public class Vec2 {
    public float x, y;
    public Vec2() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vec2(Vec2 other) {
        this.x = other.x;
        this.y = other.y;
    }

    public Vec2 add(Vec2 rhs) {
        return new Vec2(this.x + rhs.x, this.y + rhs.y);
    }

    public Vec2 sub(Vec2 rhs) {
        return new Vec2(this.x - rhs.x, this.y - rhs.y);
    }

    public Vec2 mult(float rhs) {
        return new Vec2(this.x * rhs, this.y * rhs);
    }

    public Vec2 div(float rhs) {
        return new Vec2(this.x / rhs, this.y / rhs);
    }

    public float dot(Vec2 rhs) {
        return this.x * rhs.x + this.y * rhs.y;
    }

    public float magnitudeSq() {
        return x * x + y * y;
    }

    public float magnitude() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public Vec2 normalized() {
        float mag = this.magnitude();
        return new Vec2(this.x / mag, this.y / mag);
    }


    @Override
    public String toString() {
        return "Vec2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
