public class Rectangle implements Shape {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double liczPole() {
        return a * b;
    }

    @Override
    public double liczObwod() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        return "Prostokąt {" +
                "a=" + a +
                ", b=" + b +
                "} " +
                "ma pole = " + liczPole() +
                " i obwód = " + liczObwod();
    }
}