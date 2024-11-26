/*
String name; // Tên sinh viên
String address; // Địa chỉ thường trú
int soLanThi; // Số lần thi
float diemJava; // Điểm thi môn Java
double lePhiThi; // Lệ phí đóng thi lại
char gioiTinh; // Giới tính: Nam = M; Nữ = F

Viết hàm nhapThongTin() để nhập dữ liệu. Tạo hàm main(), khởi tạo 1 đối tượng
SinhVien, nhập và in dữ liệu ra màn hình.
*/

import java.util.Scanner;

public class SinhVien {
    String name;
    String address;
    int soLanThi;
    float diemJava;
    float lePhiThi;
    char gioiTinh;

    void  nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhâp name:");
        name=sc.nextLine();
        System.out.print("Nhâp address:");
        address=sc.nextLine();

//        sc.nextLine();
        System.out.print("Nhâp so lan thi:");
        soLanThi=sc.nextInt();
        System.out.print("Nhap diem Java:");
        diemJava=sc.nextFloat();
        System.out.print("Nhap le phi thi:");
        lePhiThi=sc.nextFloat();
        System.out.print("Gioi tinh");
        gioiTinh=sc.next().charAt(0);

    }

    public static void main(String[] args) {
        // khơi tạo
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        // In ra màn hình
        System.out.println("Name:"+sv.name);
        System.out.println("Address:"+sv.address);
        System.out.println("SoLanThi:"+sv.soLanThi);
        System.out.println("DiemJava:"+sv.diemJava);
        System.out.println("LePhiThi:"+sv.lePhiThi);
        System.out.println("GioiTinh:"+sv.gioiTinh);
    }

}
