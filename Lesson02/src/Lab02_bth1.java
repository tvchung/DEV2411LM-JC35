import java.util.Scanner;

/*
Bài 1: Tạo class có tên là Person và có các thuộc tính sau đây:
private String name;
private String address;
private double salary;
+ Tạo hàm input(): nhập thông tin cho Person
+ Tạo hàm view(): hiển thị thông tin cho Person
+ Tạo hàm main() để kiểm tra chương trình
 */
public class Lab02_bth1 {
    private String name;
    private String address;
    private double salary;
    //Tạo hàm input(): nhập thông tin cho Person
    void  input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        name = sc.nextLine();
        System.out.print("Enter the address : ");
        address = sc.nextLine();
        System.out.print("Enter the salary : ");
        salary = sc.nextDouble();
    }
    void view(){
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Lab02_bth1 bth1 = new Lab02_bth1();
        bth1.input();
        bth1.view();
    }
}
