package lesson08;

public class Vehicle {
    // field
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public void accelerate(int speed) {
        System.out.println("Accelerating at " + speed +"kmph");
    }
}
