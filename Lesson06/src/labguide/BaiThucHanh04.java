package labguide;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiThucHanh04 {
    ArrayList<Book> lstBook = new ArrayList<>();

    public void nhapDuLieu(){
        System.out.println("So sach muon nhap");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap du lieu cuon sach "+i);
            Book b = new Book();
            b.nhapDuLieu();
            lstBook.add(b);
        }
    }
    public void hienThiDanhSach(){
        System.out.println("So sach muon hien "+ lstBook.size());
        for (int i = 0; i < lstBook.size(); i++) {
            System.out.println(lstBook.get(i).toString());
        }
    }

    public void sapXep(){

    }
    public int showMenu(){
        System.out.println("Menu");
        System.out.println("1. Nhập dữ liệu");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Xóa");
        System.out.println("4. Thoát");
        System.out.println("Vui lòng nhập từ 1 -> 4");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void main(String[] args) {
        BaiThucHanh04 bth4 = new BaiThucHanh04();
        int chon;
        do{
            chon = bth4.showMenu();
            switch (chon){
                case 1:
                    bth4.nhapDuLieu();
                    break;
                case 2:
                    bth4.hienThiDanhSach();
                    break;
                case 3:
                    bth4.sapXep();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban chon sai");
                    break;
            }
        }while (true);
    }
}
