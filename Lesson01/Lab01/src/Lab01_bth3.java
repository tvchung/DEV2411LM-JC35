import java.util.Scanner;

public class Lab01_bth3 {
    public static void main(String[] args) {
        System.out.println("Bài thực hành số 3");
        // Khai bao bien
        String tenSinhVien;
        int tuoi;
        float diemLyThuyet;
        float diemThucHanh;

        // Nhap
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten:");
        tenSinhVien = input.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = input.nextInt();
        System.out.print("Nhap diem ly thuyet:");
        diemLyThuyet = input.nextFloat();
        System.out.print("Nhap diem thuc hanh:");
        diemThucHanh = input.nextFloat();

        // Tinh trung binh
        float diemTrungBinh=(diemLyThuyet+diemThucHanh)/2;

        // In
        System.out.println("\n Xin chao "+tenSinhVien+" tuoi cua ban:"+tuoi);
        System.out.println("Lý thuyết:"+diemLyThuyet);
        System.out.println("Thưực hành:"+diemThucHanh);
        System.out.println("Trung binh:"+diemTrungBinh);

    }
}
