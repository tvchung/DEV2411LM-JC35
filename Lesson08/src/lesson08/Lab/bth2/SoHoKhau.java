package lesson08.Lab.bth2;

public class SoHoKhau {
    private int soHoKhau;
    public  HoKhau[] arrThanhVien;
    public SoHoKhau() {}
    public SoHoKhau(int soHoKhau) {
        this.soHoKhau = soHoKhau;
        arrThanhVien = new HoKhau[soHoKhau];
    }

    public void nhapDuLieu(){
        for (int i = 0; i < arrThanhVien.length; i++) {
            System.out.println("Nhân khâủ thứ :" + i);
            arrThanhVien[i] = new HoKhau();
            arrThanhVien[i].nhapTT();
        }
    }

    public void hienThiDuLieu(){
        for (int i = 0; i < arrThanhVien.length; i++) {
            System.out.println("Thành viên thứ: "+i);
            arrThanhVien[i].hienThiTT();
        }
    }

    public void showThanhVien(){
        for (int i = 0; i < arrThanhVien.length; i++) {
            System.out.println("Thành viên thứ: "+i);
            System.out.println(arrThanhVien[i].toString());
        }
    }
}
