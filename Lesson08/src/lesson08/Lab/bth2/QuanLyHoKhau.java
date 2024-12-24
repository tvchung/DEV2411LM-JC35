package lesson08.Lab.bth2;

import java.util.Scanner;

public class QuanLyHoKhau {
    private SoHoKhau[] arrSoHoKhau;
    public int showMenu(){
        System.out.println("|============Menu============|");
        System.out.println("1. Khai báo sổ hộ khẩu");
        System.out.println("2. Danh sách sổ hộ khẩu");
        System.out.println("3. Tìm người");
        System.out.println("Vui lòng nhập từ 1--> 3");
        Scanner nhap = new Scanner(System.in);
        return nhap.nextInt();
    }
    public  void khaiBaoSHK(){
        System.out.println("[Khai báo sổ ho khau]");
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số SHK");
        int soHKau = nhap.nextInt();
        arrSoHoKhau = new SoHoKhau[soHKau];
        for (int i = 0; i < soHKau; i++) {
            System.out.println("So SHK thứ : " + i);
            System.out.println("Nhập số nhân khẩu:");
            int nk = nhap.nextInt();
            arrSoHoKhau[i] = new SoHoKhau(nk);
            arrSoHoKhau[i].nhapDuLieu();
        }
    }

    public  void  danhSachSHK(){
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            System.out.println("Danh sách HK thứ:" +i);
            arrSoHoKhau[i].hienThiDuLieu();
        }
    }

    //timNguoi
    public void timNguoi(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap người cần tim:");
        String tim = nhap.nextLine();
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            for (int j = 0; j < arrSoHoKhau[i].arrThanhVien.length ; j++) {
                if(arrSoHoKhau[i].arrThanhVien[j].getHoTen() == tim){
                    arrSoHoKhau[i].arrThanhVien[j].hienThiTT();
                }
            }
        }
    }
    public static void main(String[] args) {
        int chon=0;
        QuanLyHoKhau quanLyHoKhau = new QuanLyHoKhau();
        do{
            chon=quanLyHoKhau.showMenu();
            switch (chon){
                case 1:quanLyHoKhau.khaiBaoSHK();break;
                case 2:quanLyHoKhau.danhSachSHK();break;
                case 3:quanLyHoKhau.timNguoi();break;
                case 4:
                    System.out.println("Goodbye!!!");
                    System.exit(0);
                    default:
                        System.out.println("Chọn sai!");
                        break;
            }
        }while (chon!=4);
    }
}
