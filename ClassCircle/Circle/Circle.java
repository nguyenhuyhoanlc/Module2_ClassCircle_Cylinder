package ClassCircle.Circle;

public class Circle {
    private double r;
    private double d;


    public Circle(double r, double d) {
        this.r = r;
        this.d = d;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getS() {
        return r * r * Math.PI;
    }

    public double getA() {
        return ((d * d) / 4) * Math.PI;
    }

    @Override
    public String toString() {
        return "Bán kính là: " + getR();
    }
}
