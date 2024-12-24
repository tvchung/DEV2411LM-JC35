package lesson08.Lab;

import java.util.Scanner;

public class Circle extends Shape {
    float radius;
    @Override
    void inputData() {
        System.out.println("Nhập bán kính:");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
    }

    @Override
    void calArea() {
        float area = (float)Math.PI * radius * radius;
        System.out.println("Diện tích:" + area);
    }
}
