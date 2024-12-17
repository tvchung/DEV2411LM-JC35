package labguide;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String nxb;
    private int yearOfPublish;
    private String author;
    private String numOfPages;
    private float price;

    public void nhapDuLieu(){
        System.out.println("Nhap du lieu");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten sach");
        bookName = sc.nextLine();
        System.out.print("\n Nha xuat ban:");
        nxb = sc.nextLine();
        System.out.print("\n nam xuat ban:");
        yearOfPublish = sc.nextInt();
        sc.nextLine();
        System.out.print("Tac gia:");
        author = sc.nextLine();
        System.out.print("\n So trang:");
        numOfPages = sc.nextLine();
        System.out.print("\n Gia:");
        price = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", nxb='" + nxb + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", author='" + author + '\'' +
                ", numOfPages='" + numOfPages + '\'' +
                ", price=" + price +
                '}';
    }
}
