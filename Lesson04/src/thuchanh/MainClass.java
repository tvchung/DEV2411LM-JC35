package thuchanh;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Customer cust_1 = new Customer();
        Customer cust_2 = new Customer();

        MainClass main = new MainClass();
        System.out.println("\n Nhap dữ liệu nhân viên 1");
        main.inputCustomerData(cust_1);
        System.out.println("\n Nhap dữ liệu nhân viên 2");
        main.inputCustomerData(cust_2);

        main.viewData(cust_1);
        main.viewData(cust_2);
        // Thưởng cho nhân viên 1 số tiền 15% lương cơ bản
        System.out.printf("\nTiền lương nhân viên 1: %.1f",
                cust_1.calSalary(15));
        // Thưởng cho nhân viên 2 số tiền 690.000đ
        System.out.printf("\nTiền lương nhân viên 2: %.0f",
                cust_2.calSalary(690000f));
    }

    // Hàm inputCustomeData

    void  inputCustomerData(Customer nv){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID:");
        nv.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name:");
        nv.name = sc.nextLine();
        System.out.print("Address:");
        nv.address = sc.nextLine();
        System.out.print("Age:");
        nv.age = sc.nextInt();
        System.out.print("Salary:");
        nv.salary = sc.nextDouble();
    }

    void  viewData(Customer nv){
        System.out.println("Customer{" + "id=" + nv.id
                + ", name=" + nv.name
                + ", address=" + nv.address
                + ", age=" + nv.age
                + ", salary=" + nv.salary + '}');
    }
}
