import java.util.Scanner;

/*
Bài 8: Tìm max, min của 3 số được nhập vào từ bàn phím
 */
public class Lab01_th8 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        x = sc.nextInt();
        System.out.println("Enter the second number");
        y = sc.nextInt();
        System.out.println("Enter the third number");
        z = sc.nextInt();
        System.out.println("The sum of the two numbers is "+(x+y+z));

        int max1 = (x>y)?x:y;
        int max = max1>z?max1:z;
        System.out.println("The max number is "+max);

        int min1 = (x<y)?x:y;
        int min = min1<z?min1:z;
        System.out.println("The min number is "+min);
    }
}
