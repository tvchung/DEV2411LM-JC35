import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // khai báo biến
        int a, b=100;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        a=sc.nextInt();

        int c=a+b;
        System.out.println("\nThe sum is: " + c);

        System.out.printf("\n %d + %d = %d\n",a,b,c);

        b++;
        System.out.println("\nThe difference is: " + b); // 101

        System.out.printf("\nThe product is: %d",++b); //102

        System.out.printf("\nThe product is: %d",b++); //102



    }
}
