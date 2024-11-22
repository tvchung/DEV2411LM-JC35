import java.util.Scanner;

/*
Bài 3: Nhập 1 số nguyên n và một số thực m từ bàn phím và hiển thị giá trị vừa
nhập ra màn hình.
 */
public class Lab01_th3 {
    public static void main(String[] args) {
        int n;
        float m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.print("Enter m: ");
        m = sc.nextFloat();

        System.out.printf("\n Số n=%d; m=%.2f", n, m );

    }
}
