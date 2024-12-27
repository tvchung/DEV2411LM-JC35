package theory;

public class TwoWheelers implements IVehicle,IManufacturer{
    String id;
    String model;
    /**
     * @param detail
     */
    @Override
    public void addContact(String detail) {
        System.out.println("Contact added + " + detail);
    }

    /**
     * @param phone
     */
    @Override
    public void callManufacturer(String phone) {
        System.out.println("Manufacturer calling " + phone);
    }

    /**
     * @param amount
     * @return
     */
    @Override
    public void makePayment(float amount) {
        System.out.println("Payment making " + amount);
    }

    /**
     *
     */
    @Override
    public void start() {
        System.out.println("Starting " + id);
    }

    /**
     * @param speed
     */
    @Override
    public void accelerate(int speed) {
        System.out.println("Accelerating " + speed);
    }

    /**
     *
     */
    @Override
    public void brake() {
        System.out.println("Braking " + id);
    }

    /**
     *
     */
    @Override
    public void stop() {
        System.out.println("Stopping " + id);
    }

    /**
     *
     */
    public static void main(String[] args) {
        TwoWheelers tw = new TwoWheelers();
        tw.id="LA-001";
        tw.model="LM";
        tw.makePayment(10);
        tw.start();
        tw.accelerate(10);
        tw.brake();
        tw.stop();
        tw.addContact("Devmaster");
    }
}
