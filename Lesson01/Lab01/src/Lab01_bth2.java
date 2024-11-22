import java.util.Scanner;

public class Lab01_bth2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Devmaster");

        // lớp Scanner
        Scanner input = new Scanner(System.in);
        // Khai bao bien
        String tenCuaBan;
        System.out.println("Nhập tên cua ban:");
        // Nhap du lieu tu ban phim
        tenCuaBan = input.nextLine();

        // Hien thi du lieu tu bien
        System.out.println("Tên của bạn:"+tenCuaBan);
    }
}
