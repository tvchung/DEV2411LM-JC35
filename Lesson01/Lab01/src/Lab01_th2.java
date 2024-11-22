import java.util.Scanner;

//Bài 2: Nhập 1 số nguyên n từ bàn phím và hiển thị giá trị vừa nhập ra màn hình.
public class Lab01_th2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.println("n="+n);
    }
}
