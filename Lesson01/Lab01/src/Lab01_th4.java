import java.util.Scanner;

/*
Bài 4: Nhập 1 số nguyên n, một số thực n, một xâu ký tự từ bàn phím và hiển thị
giá trị vừa nhập ra màn hình.
 */
public class Lab01_th4 {
    public static void main(String[] args) {
        int n;
        float m;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        System.out.print("Enter m : ");
        m = sc.nextFloat();

        // Chuyển sang nhập chuỗi, loại bỏ ký tự enter khỏi bộ đêm
        str = sc.nextLine();
        System.out.println("Enter str : ");
        str = sc.nextLine();

        System.out.println("n="+n);
        System.out.println("m="+m);
        System.out.println("str="+str);
    }
}
