package lesson08;

public class Rectangle extends Shape{
    float perimeter;
    float length=10;

    @Override
    void calculate(float val) {
        perimeter=2*(val+length);
        System.out.println("Perimeter: "+perimeter);
    }
}
