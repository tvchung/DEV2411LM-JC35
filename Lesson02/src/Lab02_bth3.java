import java.io.StringReader;
import java.util.Scanner;

/*
Bài 3: Viết chương trình nhập thông tin của sinh viên với các thông tin cần lưu trữ là
tên, mã sinh viên, điểm lý thuyết Java, điểm thực hành Java và hiển thị xếp loại.
➢ Nếu Lý thuyết dưới 4 hiển thị "Thi lại lý thuyết".
➢ Nếu Thực hành dưới 4 hiển thị "Thi lại thực hành".
➢ Nếu điểm trung bình LT, TH dưới 4 thì hiển thị "Sinh viên phải học lại".
➢ Nếu điểm trung bình LT, TH từ 4 đến 7 thì hiển thị "Sinh viên đạt môn Java".
➢ Nếu điểm trung bình LT, TH trên 7 thì hiển thị "Sinh viên xuất sắc môn Java".
 */
public class Lab02_bth3 {
    private String ten;
    private String ma;
    private  float diemLyThuyetJava;
    private float diemThucHanhJava;

    void  nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên:");
        ten = sc.nextLine();
        System.out.print("Nhập mã:");
        ma = sc.nextLine();
        System.out.print("Điểm lý thuyết java:");
        diemLyThuyetJava = sc.nextFloat();
        System.out.print("Điểm thực hành java:");
        diemThucHanhJava = sc.nextFloat();
    }
    void  xepLoai(){
        System.out.println("Tên:"+ten);
        System.out.println("Ma:"+ma);
        if(diemLyThuyetJava < 4) System.out.println("Thi lại lý thuyết java");
        if(diemThucHanhJava < 4) System.out.println("Thi lại thực hành java");
        float dtb = (diemLyThuyetJava+diemThucHanhJava)/2;
        if(dtb <4){
            System.out.println("Học lại java");
        }else if(dtb <= 7){
            System.out.println("Sinh viên đạt môn Java");
        }else{
            System.out.println("Sinh viên xuất sắc môn Java");
        }
    }

    public static void main(String[] args) {
        Lab02_bth3 btn3 = new Lab02_bth3();
        btn3.nhapThongTin();
        btn3.xepLoai();
    }
}
