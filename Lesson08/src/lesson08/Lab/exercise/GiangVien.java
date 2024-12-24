package lesson08.Lab.exercise;

import java.util.Scanner;

public class GiangVien {
    private String hoTen;
    private String email;
    private String diaChi;
    private String dienThoai;
    private int soGioGiang;
    public GiangVien() {}

    public GiangVien(String hoTen, String email, String diaChi, String dienThoai, int soGioGiang) {
        this.hoTen = hoTen;
        this.email = email;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.soGioGiang = soGioGiang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten:");
        hoTen = sc.nextLine();
        //...
    }
    public void hienThiThongTin(){
        System.out.println("========Giang vien:");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Dien thoai: " + dienThoai);
        System.out.println("So gio giang: " + soGioGiang);
    }
}
