package theory;

/**
 * Mảng một chiều:
 * 1. Khai báo
 *      datatype[] varName;
 *      datatype[] varName = new datatype[size];
 *      datatype[] varName = {value1, value2, ...};
 * 2. Nhập xuất
 *
 * 3. Thao tác trên mảng:
 *      - Sắp xếp
 *      - Tìm kiếm
 *      - Thêm / sửa / Xóa
 */
public class MangMotChieu {
    public static void main(String[] args) {
        // Mang mot chieu
        // 1. Khai báo, khởi tạo
        int[] arrInt ; // khai báo biến mảng
        arrInt = new int[10]; // Khởi tạo

        // 2. Nhập / xuất: tenBienMang[index]
        // Nhập (gán giá trị)
        arrInt[0] = 100;
        arrInt[5] = 250;
        arrInt[9] = 999;
        // In (Xuất)
        System.out.println("arrInt[0]:" + arrInt[0]);
        System.out.println("arrInt[1]:" + arrInt[1]);
        System.out.println("arrInt[5]:" + arrInt[5]);
        // Duyet mang
        System.out.println("Danh sach phan tu:");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("\n arrInt[%d]: %d",i,arrInt[i]);
        }
        System.out.println("Danh sach phan tu:");
        for(var item : arrInt){
            System.out.printf("\n %d",item);
        }

        // Khai bao va khoi tao
        String[] names = {"Hung","Dung","Sang","Trong"};
        for(String name : names){
            System.out.printf("\n %s",name);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.printf("\n %d => %s",i, names[i]);
        }
        
        // Gan gia trij co mang arrInt voi cac gia tri  ngau nhien cos 2 chu soo
        System.out.println(Math.random());
        for (int i = 0; i < arrInt.length; i++) {
            int num = (int)(Math.random()*89) + 10 ;
            arrInt[i] = num;
        }

        System.out.println("Danh sach phan tu:");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("\n arrInt[%d]: %d",i,arrInt[i]);
        }
    }
}
