package lesson08;

public class FourWheeler extends Vehicle {
    private boolean powerSteer;
    public FourWheeler() {}
    public FourWheeler(String vId,
                       String vName,
                       int numWheels,
                       boolean powerSteer) {
        vehicleNo=vId;
        vehicleName=vName;
        wheels=numWheels;
        powerSteer=powerSteer;
    }

    public  void showDetails() {
        System.out.println("Vehicle ID: " + vehicleNo);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Wheels: " + wheels);
        System.out.println("Power Steer: " + powerSteer);
        if(powerSteer==true){
            System.out.println("Power Steering: true");
        }else{
            System.out.println("Power Steering: false");
        }
    }

    // Main test
    public static void main(String[] args) {
        FourWheeler f = new FourWheeler();
        f.showDetails();
        f = new FourWheeler("LA-09 CS-1406","Vlkswagen",4,true);
        f.showDetails();
        f.accelerate(200);
    }
}
