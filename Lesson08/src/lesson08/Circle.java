package lesson08;

public class Circle extends Shape{
    float area;

    @Override
    void calculate(float val) {
        area = getPI() * val*val;
        System.out.println("The area of the circle is " + area);
    }
}
