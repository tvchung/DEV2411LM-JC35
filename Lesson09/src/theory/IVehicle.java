package theory;

public interface IVehicle {
    static final String STATEID="LA-09";
    // abstract method
    public void start();
    public void accelerate(int speed);
    public void brake();
    public void stop();
}
