import java.util.Scanner;

/*
Bài 9 (nâng cao): Giải phương trình bậc nhất: ax + b = 0.

 */
public class Lab01_th9 {
    public static void main(String[] args) {
        float a,b;
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextFloat();
        System.out.print("Enter b: ");
        b = sc.nextFloat();
        // Giai phuong trinh
        if(a==0){
            if(b==0){
                System.out.println("Pt vo so nghiem");
            }else {
                System.out.println("Pt vo  nghiem");
            }
        }else{
            x=-b/a;
            System.out.println("Pt co nghiem x="+x);
        }
    }
}
