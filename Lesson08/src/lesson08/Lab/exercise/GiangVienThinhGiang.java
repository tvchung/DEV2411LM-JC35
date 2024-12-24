package lesson08.Lab.exercise;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private String cqLamViec;

    public GiangVienThinhGiang() {}
    public GiangVienThinhGiang(String cq) {
        this.cqLamViec = cq;
    }

    public GiangVienThinhGiang(String hoTen, String email, String diaChi, String dienThoai, int soGioGiang, String cqLamViec) {
        super(hoTen, email, diaChi, dienThoai, soGioGiang);
        this.cqLamViec = cqLamViec;
    }
    public void nhapThongTin(){
        Scanner scanner=new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap co quan ctac:");
        cqLamViec = scanner.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.print("Co quan:"+cqLamViec);
    }
}
