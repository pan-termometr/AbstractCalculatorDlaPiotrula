public class Circle implements Shape{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double liczPole() {
        return Shape.pi * Math.pow(r, 2);
    }

    @Override
    public double liczObwod() {
        return 2 * Shape.pi * r;
    }
}