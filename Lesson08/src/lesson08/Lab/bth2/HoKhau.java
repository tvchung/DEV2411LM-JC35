package lesson08.Lab.bth2;

import java.util.Scanner;

public class HoKhau extends NhanKhau{
    private String diaChiHienNay;
    private String noiCongTac;
    public HoKhau() {}

    public HoKhau(String hoTen, String ngaySinh, boolean gioiTinh, String diaChiHienNay, String noiCongTac) {
        super(hoTen, ngaySinh, gioiTinh);
        this.diaChiHienNay = diaChiHienNay;
        this.noiCongTac = noiCongTac;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.println("Địa chỉ hien nay");
        diaChiHienNay = sc.nextLine();
        System.out.println("Cong tác:");
        noiCongTac = sc.nextLine();
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT();
        System.out.println("Địa chỉ:"+diaChiHienNay);
        System.out.println("Công tác:"+noiCongTac);
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "HoKhau{" +
                "diaChiHienNay='" + diaChiHienNay + '\'' +
                ", noiCongTac='" + noiCongTac + '\'' +
                '}';
        return str;
    }

}
