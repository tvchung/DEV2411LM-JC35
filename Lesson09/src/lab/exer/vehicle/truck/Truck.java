package lab.exer.vehicle.truck;

import lab.exer.vehicle.Vehicle;

import java.util.Scanner;

public class Truck extends Vehicle {
    int truckLoad;

    /**
     *
     */
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter truck load: ");
        truckLoad = sc.nextInt();
    }

    /**
     *
     */
    @Override
    public void output() {
        super.output();
        System.out.println("Truck load: " + truckLoad);
    }

    @Override
    public String toString() {
        String truck = super.toString() + ", Truckload: " + truckLoad;
        return truck;
    }
}
