package baitap;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HoaDonBanhMy {
    String maHoaDon;
    Date ngayHoaDon;
    String tenKhachHang;
    String diaChiKH;
    int soLuong;
    double giaBanh;
    double khuyenMai;
    double tienHang;
    double tongThanhToan;
    // Method:
    void tinhTienKMai(){
        tienHang = soLuong*giaBanh;
        if(soLuong>=100){
            khuyenMai = tienHang*0.2;
        }else if(soLuong>=10){
            khuyenMai = soLuong*giaBanh*0.1;
        }
        tongThanhToan = tienHang-khuyenMai;
    }

    // Nhập
    void nhap(HoaDonBanhMy obj){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã hóa đơn:");
        obj.maHoaDon=sc.nextLine();
        System.out.print("Ngày hóa đơn");
        String input = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);  // Prevents invalid dates like 31/02/2024
        try {
            obj.ngayHoaDon = dateFormat.parse(input);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.print("Tên khách hàng:");
        obj.tenKhachHang = sc.nextLine();
        System.out.println("Địa chỉ:");
        obj.diaChiKH=sc.nextLine();
        System.out.println("Số lượng:");
        obj.soLuong=sc.nextInt();
        System.out.println("Giá:");
        obj.giaBanh = sc.nextDouble();
    }
    void in(HoaDonBanhMy obj){
        System.out.println("Mã:" + obj.maHoaDon);
        System.out.println("Ngày:"+obj.ngayHoaDon);
        System.out.println("Tên:"+obj.tenKhachHang);
        System.out.println("Địa chỉ:"+obj.diaChiKH);
        System.out.println("Số lượng:"+obj.soLuong);
        System.out.println("Giá bánh:"+obj.giaBanh);
        tinhTienKMai();
        System.out.println("Tổng tiền:"+obj.tienHang);
        System.out.println("KM:"+obj.khuyenMai);
        System.out.println("Thanh toán:"+obj.tongThanhToan);
    }
}
