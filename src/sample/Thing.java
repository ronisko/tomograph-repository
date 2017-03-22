package sample;

public class Thing {
    private double x;
    private double y;

    public Thing() {

    }

    public Thing(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setAll(double x, double y) {
        setX(x);
        setY(y);
    }
}
