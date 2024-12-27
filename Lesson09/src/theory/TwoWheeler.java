package theory;

public class TwoWheeler implements IVehicle {
    String id;
    String type;

    public TwoWheeler(String id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Starting the " + type + " vehicle");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Accelerating at " + speed + " kmph vehicle");
    }

    @Override
    public void brake() {
        System.out.println("Applying brake");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + type + " vehicle");
    }

    // test
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler("LA-02737","Bike");
        twoWheeler.start();
        twoWheeler.accelerate(10);
        twoWheeler.brake();
        twoWheeler.stop();
    }
}
