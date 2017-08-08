package ilya;

public class Circle {
    private int centreX;
    private int centreY;
    private int radius;

    public Circle(int centreX, int centreY, int radius) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
    }

    public Double area() {
        return radius * radius * 3.14;
    }
}
