package thuchanh;

import java.util.Scanner;

/**
 *
 * @author Chung Trịnh
 */
public class Customer {
    // field:
    int id;
    String name;
    String address;
    int age;
    double salary;

    //Constructor
    public  Customer(){

    }
    public  Customer(int id, String name, String address, int age, double salary){
        this.id=id;
        this.name=name;
        this.address=address;
        this.age=age;
        this.salary = salary;
    }


    // Method:
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
    }
    void input(int id, String name, String address, int age, double salary){
        this.id = id;
        this.name=name;
        this.address = address;
        this.age=age;
        this.salary = salary;
    }
    // Hiển thị dữ liệu
    void viewData(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Total:"+ calSalary(50));
        System.out.println("Total:"+ calSalary(1.2f));
    }

    // Tính lương
    double calSalary(int bonus){
        return salary+salary*((double)bonus/100);
    }
    double calSalary(double bonus){
        return salary+bonus;
    }

    public static void main(String[] args) {
        // tạo đối tượng
        Customer c = new Customer();
        c.input();
        c.viewData();
    }

}
