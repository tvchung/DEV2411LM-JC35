package lesson08.Lab;

import java.util.Scanner;

public class Rectangle extends Shape{
    float width;
    float height;

    @Override
    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = sc.nextFloat();
        System.out.print("Enter the height: ");
        height = sc.nextFloat();
    }

    @Override
    void calArea() {
        float area = width * height;
        System.out.println("Area is " + area);
    }
}
