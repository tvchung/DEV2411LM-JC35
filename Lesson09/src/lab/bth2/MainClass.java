package lab.bth2;

import java.util.Scanner;

public class MainClass {
    public void nhapDuLieu(){
        NhapLieu nhap = new NhapLieu();
        System.out.println("Nhap so nguyen:");
        System.out.println("Gia tri:"+nhap.inputInt());

        System.out.println("Nhap chuoi:");
        System.out.println("Gia tri:"+nhap.inputString());

        System.out.println("Nhap so thuc:");
        System.out.println("Gia tri:"+nhap.inputDouble());
    }


    private class NhapLieu{
        public  String inputString(){
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
        public int inputInt(){
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        }
        public double inputDouble(){
            Scanner sc = new Scanner(System.in);
            return sc.nextDouble();
        }
    }

    // test
    public static void main(String[] args) {
        MainClass obj = new MainClass();
        obj.nhapDuLieu();
    }

}
