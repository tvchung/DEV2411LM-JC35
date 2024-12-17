package labguide;

import java.util.Scanner;

public class BaiThucHanh1 {
    public static void main(String[] args) {
        String[] arrSinhVien = new String[3];

        System.out.println("Nhập sinh viên");
        for (int i = 0; i < arrSinhVien.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap sinh vien thu " + i);
            arrSinhVien[i] = sc.nextLine();
        }

        // In
        for(var sinhVien: arrSinhVien) {
            System.out.println(sinhVien);
        }

    }
}
