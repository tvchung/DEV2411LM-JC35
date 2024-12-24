package theory;

class  NhanVien{
    String name;
    static int count;


}

/**
 * name: NhanVienMainClass
 */
public class bth_2 {
    public static void main(String[] args) {
        NhanVien[] nv = new NhanVien[3];

        // Nhân viên 1
        nv[0] = new NhanVien();
        nv[0].name="Lâm Viết Đạt";
        nv[0].count++;

        // Nhân viên 2
        nv[1] = new NhanVien();
        nv[1].name="Mạc Thanh Hùng";
        nv[1].count++;

        // Nhân viên 3
        nv[2] = new NhanVien();
        nv[2].name="Ngô Phương Anh";
        nv[2].count++;

        System.out.println("Danh sachs");
        for (NhanVien item : nv){
            System.out.println(item.name + "---" + item.count);
        }
    }
}
