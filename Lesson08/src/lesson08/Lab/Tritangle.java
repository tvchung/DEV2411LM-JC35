package lesson08.Lab;

import java.util.Scanner;

public class Tritangle extends Shape{
    float height;
    float bottom;
    @Override
    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the triangle: ");
        height = sc.nextFloat();
        System.out.println("Enter the bottom of the triangle: ");
        bottom = sc.nextFloat();
    }

    @Override
    void calArea() {
        float area = (height * bottom)/2;
        System.out.println("The area of the triangle is " + area);
    }
}
