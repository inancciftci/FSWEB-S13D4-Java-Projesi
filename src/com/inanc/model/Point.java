package com.inanc.model;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(Point p) {
        int xDiff = p.getX() - this.x;
        int yDiff = p.getY() - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(int a, int b) {
        int xDiff = a - this.x;
        int yDiff = b - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
