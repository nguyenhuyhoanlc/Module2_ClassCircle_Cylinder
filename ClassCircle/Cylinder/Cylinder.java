package ClassCircle.Cylinder;

import ClassCircle.Circle.Circle;

public class Cylinder extends Circle {
    private double h;

    public Cylinder(double r, double d, double h) {
        super(r, d);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getS() {
        return Math.PI * h * super.getR() * super.getR();
    }

    @Override
    public String toString() {
        return "Hình trụ lấy " + super.toString();
    }
}
