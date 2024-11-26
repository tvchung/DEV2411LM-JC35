import java.util.Scanner;

/*
Bài 2: Tạo class XeMay có các thuộc tính sau:
String ten
String nhaSanXuat
Int soLuongBanhXe
Co 2 method
void nhapThongTin()
void hienThiThongTin()
Trong ham main goi cac method : nhapThongTin(), hienThiThongTin()
 */
public class Lab02_bth2 {
    String ten;
    String nhaSanXuat;
    int soLuongBanhXe;
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap nha San: ");
        nhaSanXuat = sc.nextLine();
        System.out.print("So lượng xe:");
        soLuongBanhXe = sc.nextInt();
    }
    void hienThiThong(){
        System.out.println("Tên:"+ten);
        System.out.println("Nha San:"+nhaSanXuat);
        System.out.println("Số lượng xe:"+soLuongBanhXe);
    }

    public static void main(String[] args) {
        Lab02_bth2 b = new Lab02_bth2();
        b.nhapThongTin();
        b.hienThiThong();
    }
}
