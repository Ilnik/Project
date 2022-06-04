package org.example;
public class Vector { // инстуркция по созданию объектов Vector

    private int x; // 0

    private int y; // 0
    private int z; // 0


    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        if (x > 5) {
            this.x = x;
        }
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double lenght() { // типа метод, вычисляющий длинну вектора
        double sizeOfVector = Math.sqrt(x*x+ y*y +z*z);
        return sizeOfVector;
    }

    public int scolarMulty(Vector r) {
        return this.x * r.x + this.y * r.y + this.z * r.z;
    }
}






