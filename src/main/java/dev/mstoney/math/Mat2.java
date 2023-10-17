package dev.mstoney.math;

public class Mat2 {
    public float[][] data;
    public Mat2() {
        data = new float[2][2];
    }

    public Mat2(float m11, float m12, float m21, float m22) {
        data = new float[2][2];
        data[0][0] = m11;
        data[0][1] = m12;
        data[1][0] = m21;
        data[1][1] = m22;
    }

    public Vec2 mult(Vec2 rhs) {
        return new Vec2(rhs.x * data[0][0] - rhs.y * data[0][1], rhs.x * data[1][0] + rhs.y * data[1][1]);
    }

}
