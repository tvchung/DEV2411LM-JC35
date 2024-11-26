import java.util.Scanner;

/*
Bài thực hành 3: Viết một chương trình giải phương trình bậc nhất (ax + b = c).
Bước 1: Tạo một class có tên là PhuongTrinhB1.
Bước 2: Khai báo biến số a, b và c
Bước 3: Viết hàm nhapDuLieu để thực hiện nhập.
Bước 4: Viết hàm giaiPhuongTrinhB1 để thực hiện giải.
Bước 5: Viết hàm main() và kiểm thử mã giải phương trình bậc nhất của bạn.
 */
public class PhuongTrinhB1 {
    float a,b;
    float x;

    // Ham nhap
    void  nhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a:");
        a = sc.nextFloat();
        System.out.print("Nhap he so b:");
        b = sc.nextFloat();
    }
    // Ham giai phuong trinh bac 1
    void giaiPhuongTrinh(){
        if(a!=0){
            x=-b/a;
            System.out.printf("Phuong trỉnh %.1fx + %.1f = 0 co nghiem x=%.1f",a,b,x);
        }else{
            if(b==0){
                System.out.printf("Phuong trỉnh %.1fx + %.1f = 0 co nghiem vo so nghiem",a,b);
            }else{
                System.out.printf("Phuong trỉnh %.1fx + %.1f = 0 co nghiem vo nghiem",a,b);
            }
        }
    }
    public static void main(String[] args) {

        PhuongTrinhB1 p = new PhuongTrinhB1();
        p.nhapDuLieu();
        p.giaiPhuongTrinh();

    }
}
