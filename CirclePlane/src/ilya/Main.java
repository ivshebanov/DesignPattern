package ilya;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 12);
        System.out.println(circle.area());

        Circle circle1 = new Circle(3, 5, 11);
        System.out.println(circle1.area());
    }
}
