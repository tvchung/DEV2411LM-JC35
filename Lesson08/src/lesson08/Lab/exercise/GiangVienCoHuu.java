package lesson08.Lab.exercise;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
    private final int soGioQuyDinh=40;
    private float luongThoaThua;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(String hoTen, String email, String diaChi, String dienThoai, int soGioGiang, float luongThoaThua) {
        super(hoTen, email, diaChi, dienThoai, soGioGiang);
        this.luongThoaThua = luongThoaThua;
    }

    public void nhapThongTin(){
        Scanner scanner=new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap luong thoa thuan:");
        luongThoaThua = scanner.nextFloat();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Gio dinh muc:"+soGioQuyDinh);
        System.out.print("luong thoa thuan:"+luongThoaThua);
    }

}
