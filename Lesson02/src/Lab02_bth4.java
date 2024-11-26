import java.util.Scanner;

/*
Bài 4: Giải phương trình bậc 2: (bài này sinh viên chủ động tìm hiểu lớp Math qua
hướng dẫn cơ bản của giảng viên, mục tiêu là hiểu và biết sử dụng 1 số hàm để tính
toán như tính căn, tính mũ, làm tròn...v...v....)
 */
public class Lab02_bth4 {

    // hàm giai phuong trinh bac 1
    void giaiPhuongTrinhB1(float a, float b){
        if(a==0){
            if(b==0){
                System.out.printf("\n Pt: %.1f.x + %.1f = 0 => Có vô số nghiệm",a,b);
            }else{
                System.out.printf("\n Pt: %.1f.x + %.1f = 0 => Có vô nghiệm",a,b);
            }
        }else {
            float x=-b/a;
            System.out.printf("\n Pt: %.1f.x + %.1f = 0 => Cónghiệm x = %.1f",a,b,x);
        }
    }

    // Hàm giải phương trình bậc 2
    void giaiPhuongTrinhB2(float a, float b, float c){
        if(a==0){
            // Giải phương trình bậc 1
            giaiPhuongTrinhB1(b,c);
        }else{
            float delta=b*b-4*a*c;
            if(delta<0){
                System.out.printf("\n PT: %.1f. x^2 + %.1f.x + %.1f => Vô nghiệm",a,b,c);
            }else if(delta==0){
                float x=-b/(2*a);
                System.out.printf("\n PT: %.1f. x^2 + %.1f.x + %.1f => có nghiệm kép x = %.1f",a,b,c,x);
            }else{
                float x1=(-b - (float)Math.sqrt(delta))/(2*a);
                float x2=(-b + (float)Math.sqrt(delta))/(2*a);
                System.out.printf("\n PT: %.1f. x^2 + %.1f.x + %.1f => có 2 nghiệm",a,b,c);
                System.out.printf("\n x1 = %.1f",x1);
                System.out.printf("\n x2 = %.1f",x2);
            }
        }
    }

    // test
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.printf("a=");
        a = sc.nextFloat();
        System.out.printf("b=");
        b = sc.nextFloat();
        System.out.printf("c=");
        c = sc.nextFloat();

        Lab02_bth4 bth4 = new Lab02_bth4();
        bth4.giaiPhuongTrinhB2(a,b,c);
    }
}
