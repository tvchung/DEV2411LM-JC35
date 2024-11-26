import java.util.Scanner;

/*
Bài thực hành 1: Viết một chương trình dự báo thời tiết theo tục ngữ: Chuồn chuồn
bay thấp thì mưa, bay cao thì nắng, bay vừa thì râm.
 */
public class DuBaoThoiTiet {
    int status;

    void  nhapLieu(){
        System.out.println("Chương trình dự báo thời tiết Chuồn chuồn");
        System.out.println("1. Bay thấp");
        System.out.println("2. Bay cao");
        System.out.println("3. Bay vừa");
        System.out.println("4. Say rượu rồi!");
        System.out.println("Mời nhập từ 1 --> 4");
        Scanner input = new Scanner(System.in);
        status = input.nextInt();
        System.out.println("Cảm ơn đã nhập");
    }
    void  hienThiDuLieu(){
        switch(status){
            case 1:
                System.out.println("Dự báo, Mưa, khi ra khỏi nhà nhớ mang áo mưa"); break;
            case 2:
                System.out.println("2. Bay cao..."); break;
            case 3:
                System.out.println("3. Bay vua..."); break;
            case 4:
                System.out.println("4. Say rượu rồi!"); break;
        }
    }

    public static void main(String[] args) {
        DuBaoThoiTiet dtb = new DuBaoThoiTiet();
        dtb.nhapLieu();
        dtb.hienThiDuLieu();
    }
}
