package Lab;

import java.io.StringReader;

/*
Bài thực hành 3: Viết một class tên là SinhVien để nhập thông tin cơ bản (private)
của sinh viên gồm:
int rollNo;
String name;
String address;
float mark;

Viết các hàm get-set cho các thuộc tính trên. Viết 4 contructor cho class này (mặc
định và có tham số) lần lượt như sau:

1. Mặc định
2. rollNo + name
3. rollNo + name + address
4. rollNo + name + address + mark

Các contructor cần viết java-doc. Tạo class BaiThucHanh03 có hàm main() để kiểm
thử.
 */
public class SinhVien {
    // field
    private int rollNo;
    private String name;
    private String address;
    private float mark;
    // Constructor

    public SinhVien() {}

    /**
     *
     * @param rollNo
     * @param name
     */
    public SinhVien(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    /**
     *
     * @param rollNo
     * @param name
     * @param address
     */
    public SinhVien(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    /**
     *
     * @param rollNo
     * @param name
     * @param address
     * @param mark
     */
    public SinhVien(int rollNo, String name, String address, float mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.mark = mark;
    }

    // attribute

    /**
     *
     * @return
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     *
     * @param rollNo
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mark=" + mark +
                '}';
    }

    // test
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        System.out.println(sv.toString());
        sv = new SinhVien(123,"Chung Chung");
        System.out.println(sv.toString());
        sv = new SinhVien(123,"Chung Chung","123.45");
        System.out.println(sv.toString());
        sv = new SinhVien(123,"Chung Chung","123",12);
        System.out.println(sv.toString());
    }
}
