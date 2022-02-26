package com.company;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%f, %f", x, y);
    }

    public boolean isOnXAxis() {
        return (y == 0);
    }

    public boolean hasSameCoordinates(Point b) {
        return (this.x == b.x && this.y == b.y);
    }

    public double distance(Point b) {
        return Math.sqrt(Math.pow((b.x - this.x), 2) + Math.pow((b.y - this.y), 2));
    }

    public boolean isInUnitCircle() {
        return Math.abs(this.distance(new Point(0, 0))) <= 1;
    }

    public Point midPoint(Point b) {
        return new Point((this.x + b.x) / 2, (this.y + b.y) / 2);
    }
}
