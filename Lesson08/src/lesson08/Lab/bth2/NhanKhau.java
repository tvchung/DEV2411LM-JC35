package lesson08.Lab.bth2;


import java.util.Scanner;

public class NhanKhau {
    private String hoTen;
    private String ngaySinh;
    private boolean gioiTinh;

    public String getHoTen() {
        return hoTen;
    }
    public NhanKhau() {
    }

    public NhanKhau(String hoTen, String ngaySinh, boolean gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho tên:");
        hoTen = sc.nextLine();
        System.out.println("ngày sinh");
        ngaySinh=sc.nextLine();
        System.out.println("Giới tính:");
        gioiTinh = sc.nextBoolean();
    }
    public void hienThiTT(){
        System.out.println("Họ tên:"+hoTen);
        System.out.println("Ngày sinh:"+ngaySinh);
        System.out.println("Gio tính:"+gioiTinh);
    }

    @Override
    public String toString() {
        return "NhanKhau{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}

