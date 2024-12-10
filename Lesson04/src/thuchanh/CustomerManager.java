package thuchanh;

import java.util.Scanner;

public class CustomerManager {
    Customer globalCus = new Customer();
    public static void main(String[] args) {
//        Customer nhanVien = new Customer();
//        nhanVien.input();
//        nhanVien.viewData();

//        CustomerManager manager = new CustomerManager();
//        manager.inputCustomer();
//        manager.globalCus.viewData();

        Customer test = new Customer(123,"Chung Chung",
                "25 Vũ Ngọc Phan",44,123.23);
        test.viewData();
    }

    void inputCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        int id = input.nextInt();
        input.nextLine(); // Giải phóng ký tự \n
        System.out.println("Tên: ");
        String name = input.nextLine();
        System.out.println("Tuổi: ");
        int age = input.nextInt();
        input.nextLine(); // Giải phóng ký tự \n
        System.out.println("Địa chỉ: ");
        String address = input.nextLine();
        System.out.println("Lương: ");
        double salary = input.nextDouble();
        globalCus.input(id, name, address, age, salary);
    }
}
