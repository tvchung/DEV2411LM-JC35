import java.util.Scanner;

/*
Bài 5: Nhập 2 số nguyên n, m từ bàn phím
    và hiển thị kết quả là tổng của 2 số này.
 */
public class Lab01_th5 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        System.out.print("Enter m : ");
        m = sc.nextInt();

        System.out.printf("%d + %d = %d", n, m, m+n);
    }
}
