import java.util.Scanner;

/*
Bài 6: Nhập 2 số nguyên n1, m1 ;
2 số thực n2, m2 từ bàn phím.
Tính tổng của 2 số nguyên, tổng của 2 số thực,
tính tổng của n1+n2 và hiển thị các kết quả ra màn hình.
 */
public class Lab01_th6 {
    public static void main(String[] args) {
        int n1,m1;
        double n2,m2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        n1 = sc.nextInt();

        System.out.print("Enter m1: ");
        m1 = sc.nextInt();

        System.out.print("Enter n2: ");
        n2 = sc.nextDouble();
        System.out.print("Enter m2: ");
        m2 = sc.nextDouble();

        // Tính
        int tong2SoNguyen = n1+m1;
        double tong2SoThuc = n2+m2;
        double tongN1N2 = n1+n2;

        System.out.println("n1: "+n1);
        System.out.println("m1: "+m1);
        System.out.println("n2: "+n2);
        System.out.println("m2: "+m2);
        System.out.println("tong2SoNguyen: "+tong2SoNguyen);
        System.out.println("tong2SoThuc: "+tong2SoThuc);
        System.out.println("tongN1N2: "+tongN1N2);

    }
}
