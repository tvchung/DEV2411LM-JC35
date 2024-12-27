package lab.exer.vehicle.car;

import lab.exer.vehicle.Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
    String color;

    /**
     *
     */
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Car color: ");
        color = sc.nextLine();
    }

    /**
     *
     */
    @Override
    public void output() {
        super.output();
        System.out.println("Car color: " + color);
    }

    @Override
    public String toString() {
        String car = super.toString() + ", Car color: " + color;
        return car;
    }
}
