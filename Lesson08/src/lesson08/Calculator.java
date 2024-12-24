package lesson08;

public class Calculator {
    public static void main(String[] args) {
        Circle  circle = new Circle();
        circle.calculate(10);

        Rectangle rectangle = new Rectangle();
        rectangle.length=100;
        rectangle.calculate(200);
    }
}
