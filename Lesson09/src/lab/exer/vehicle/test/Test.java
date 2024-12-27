package lab.exer.vehicle.test;

import lab.exer.vehicle.Vehicle;
import lab.exer.vehicle.car.Car;
import lab.exer.vehicle.truck.Truck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Test {
    public static void main(String[] args) {
        int chon = 0;
        System.out.println(chon);
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        do{
            chon=menu();
            switch(chon){
                case 1:
                    System.out.println("Nhap car:");
                    for (int i=0; i<3; i++){
                        System.out.println("car : " + (i+1));
                        Car car=new Car();
                        car.input();
                        vehicles.add(car);
                    }
                    System.out.println("Nhap Truck:");
                    for (int i=0; i<3; i++){
                        System.out.println("Truck : " + (i+1));
                        Truck truck=new Truck();
                        truck.input();
                        vehicles.add(truck);
                    }
                    break;

                case 2:
                    System.out.println("Danh sach:");
                    for(var vehicle:vehicles){
                        vehicle.output();
                    }
                    break;
                case 3:
                    System.out.println("Chua sap");
                    for(var vehicle:vehicles){
                        System.out.println(vehicle.toString());
                    }
                    System.out.println("Sort By price:");
                    Collections.sort(vehicles,(x,y)->{
                        if(x.getPrice()>y.getPrice())
                            return 1;
                        else if (x.getPrice()<y.getPrice())
                            return -1;
                        return 0;
                    });
                    for(var vehicle:vehicles){
                        System.out.println(vehicle.toString());
                    }
                    break;
                case 4:
                    System.out.println("Search:");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhap model tim:");
                    String keyword = scanner.nextLine();
                    AtomicBoolean found = new AtomicBoolean(false);
                    vehicles.forEach(vehicle->{
                       if(vehicle.getModel().toLowerCase().contains(keyword.toLowerCase())){
                           vehicle.output();
                           found.set(true);
                       }
                    });

                    if(!found.get()){
                        System.out.println("model not found");
                    }
                    break;
                case 5:
                    System.out.println("Googbye!");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai");
                    break;

            }
        }while (chon != 5);
    }

    static int menu(){
        System.out.println("1. Input \n " +
                "2. Display\n " +
                "3. Sort by price\n"+
                "4. Search by model.\n"+
                " 5. Exit \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Chon=");
        int choice = sc.nextInt();
        return choice;
    }
}
