package lesson08.Lab;

import java.util.Scanner;

public class Bth01 {
    public  int showMenu(){
        System.out.println("|============= MENU =============|");
        System.out.println("1. Tính diện tích hình tròn");
        System.out.println("2. Tính diện tích hình tứ giác");
        System.out.println("3. Tính diện tích hình tam giác");
        System.out.println("Vui lòng chọn từ 1 --> 3");
        Scanner nhap = new Scanner(System.in);
        return nhap.nextInt();
    }

    public void  tinhDienTich(Shape hinh){
        hinh.inputData();
        hinh.calArea();
    }
    public static void main(String[] args) {
        Bth01 bt = new Bth01();
        int chon=0;
        do{
            chon = bt.showMenu();
            switch (chon){
                case 1: bt.tinhDienTich(new Circle());break;
                case 2: bt.tinhDienTich(new Rectangle());break;
                case 3: bt.tinhDienTich(new Tritangle());break;
                case 4:
                    System.out.println("goodbye!!!");
                    System.exit(chon);
                default:
                    System.out.println("Bạn chọn sai");
                    break;
            }

        }while(chon !=4);
    }
}
