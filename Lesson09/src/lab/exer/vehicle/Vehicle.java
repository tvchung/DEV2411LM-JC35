package lab.exer.vehicle;

import java.util.Scanner;

public class Vehicle implements IVehicle {
    private String make;
    private String model;
    private double price;
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter make: ");
        make = sc.nextLine();
        System.out.print("Enter model: ");
        model = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }
    @Override
    public void output() {
        System.out.println("=====================");
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    // attribute
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor

    public Vehicle() {
    }

    public Vehicle(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

}
