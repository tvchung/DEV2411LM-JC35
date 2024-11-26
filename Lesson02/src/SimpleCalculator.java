import java.util.Scanner;

/*
Bài thực hành 2: Viết một chương trình máy tính đơn giản thực hiện các phép toán
như: cộng, trừ, nhân, chia.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        // Khai báo
        int soA, soB;
        float ketQua=0.0f;
        String phepTinh;

        //Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter so A: ");
        soA = sc.nextInt();
        System.out.print("Enter so B: ");
        soB=sc.nextInt();
        System.out.print("Phep tinh");
        phepTinh = sc.nextLine();

        // Thực hiện tính toán
        switch (phepTinh){
            case "+":
                ketQua = soA+soB;
                break;

            case "-":
                ketQua=soA-soB;
                break;
            case "*":
                ketQua=soA*soB;
                break;
            case "/":
                ketQua=(float) soA/soB;
                break;
            case "%":
                ketQua=soA%soB;
                break;

        }
        System.out.println("Enter ket qua: " + ketQua);
    }
}
