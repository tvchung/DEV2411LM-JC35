package labguide;

import java.util.ArrayList;
import java.util.Collections;

public class BaiThucHanh03 {
    ArrayList<String> lstMonHoc = new ArrayList<>();
    public void  test(){
        lstMonHoc.add("Java");
        lstMonHoc.add("Python");
        lstMonHoc.add("C#");
        lstMonHoc.add("C++");
        lstMonHoc.add("SQL");
        lstMonHoc.add("PHP");

        // In danh sách
        System.out.println("Danh sách chưa sắp");
        for (int i = 0; i < lstMonHoc.size(); i++) {
            System.out.println(lstMonHoc.get(i));
        }
        // Sắp xếp
        Collections.sort(lstMonHoc);
        System.out.println("Danh sách sắp");
        for (int i = 0; i < lstMonHoc.size(); i++) {
            System.out.println(lstMonHoc.get(i));
        }

        Collections.sort(lstMonHoc, Collections.reverseOrder());
        System.out.println("Danh sách sắp");
        for (int i = 0; i < lstMonHoc.size(); i++) {
            System.out.println(lstMonHoc.get(i));
        }

        Collections.sort(lstMonHoc, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Danh sách sắp tang");
        for (int i = 0; i < lstMonHoc.size(); i++) {
            System.out.println(lstMonHoc.get(i));
        }
        Collections.sort(lstMonHoc, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Danh sách sắp giam");
        for (int i = 0; i < lstMonHoc.size(); i++) {
            System.out.println(lstMonHoc.get(i));
        }
    }
    public static void main(String[] args) {
        BaiThucHanh03 bt = new BaiThucHanh03();
        bt.test();
    }
}
